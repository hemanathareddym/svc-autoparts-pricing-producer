# Spring Boot + Kafka + Schema Registry - Tutorial
![alt text](docs/SchemaRegistry.jpg)
## What is Schema Registry?

According to [Confluent.io](https://docs.confluent.io/current/schema-registry/docs/index.html) : The Schema Registry stores a versioned history of all schemas and allows for the evolution of schemas according to the configured compatibility settings and expanded Avro support.

## Why do we need a Schema Registry?

Simply put, we want to avoid garbage-in-garbage-out scenarios. Schema Registry enables message producers to comply to a JSON schema and avoid producers from pushing message that are bad in to topics. This saves a lot of headache for down-stream consumer. Schema Registry is a critical component in enforcing data governance in a messaging platform. 

## What is Avro?

According to [Avro.Apache.org](https://avro.apache.org/docs/current/) : Apache Avro™ is a data serialization system.

Avro provides:

 - Rich data structures.
 - A compact, fast, binary data format.
 - A container file, to store persistent data.
 - Remote procedure call (RPC).
 - Simple integration with dynamic languages. Code generation is not required to read or write data files nor to use or implement RPC protocols. Code generation as an optional optimization, only worth implementing for statically typed languages.

## Getting Started

In our sample application we will build a Spring Boot microservice that produces messages and uses Avro to serialize and push them into Kafka.
For this tutorial we will be using the open source components of confluent platform. All of our microservices and infrastructure components will be dockerized and run using docker-compose.  


### Generate classes from Avro schema files

Once we define the schema, we then generate the Java source code using the maven plugin.

The following command in maven lifecycle phase will do the trick and put the generated classes in our outputDirectory: 

spring-kafka-registry\target\generated\avro\

```
mvn generate-sources
```

The generated source code comes in very handy to process messages in our application.
###Kafka notes
Start zookeeper:
zookeeper-server-start.bat C:\Work\parts\kafka_2.12-2.7.0\config\zookeeper.properties

Start Kafka:
kafka-server-start.bat ../../etc/kafka/server.properties

Create topic:
kafka-topics.bat --create --topic staged-assignment -zookeeper localhost:2181 --replication-factor 1 --partitions 1

List topics:
kafka-topics.bat --list --zookeeper localhost:2181

View kafka messages:
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic pricing-message-avro --from-beginning


In Confluent:
zookeeper-server-start.bat C:\Work\parts\softwares\confluent-6.1.0\etc\kafka\zookeeper.properties

kafka-server-start.bat C:\Work\parts\softwares\confluent-6.1.0\etc\kafka\server.properties



schema-registry-start.bat D:\Softwares\confluent-5.2.2-2.12\confluent-5.2.2\etc\schema-registry\schema-registry.properties

kafka-console-producer.bat –broker-list localhost:9092 –topic text.test

kafka-console-consumer.bat –topic text.test –from-beginning –bootstrap-server localhost:9092

###Spring Boot Application

Now let's see how this is done.
Open the main application class defined in the source file SpringKafkaRegistryApplication.java from following location:

spring-kafka-registry\src\main\java\com\sunilvb\demo

Notice that we properties that are defined to ensure we are able to interact with the Kafka and Schema Registry instances  
```
...
Properties properties = new Properties();
// Kafka Properties
properties.setProperty("bootstrap.servers", bootstrap);
properties.setProperty("acks", "all");
properties.setProperty("retries", "10");
// Avro properties
properties.setProperty("key.serializer", StringSerializer.class.getName());
properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
properties.setProperty("schema.registry.url", registry);
...
```
In addition to the bootstrap server and the schema registry url, we are also setting the serializer classes for key and value properties.

The KafkaAvroSerializer class is responsible for serializing the message in to Avro format. 

After setting all the needed properties we then create an instance of the KafkaProducer. 

We then build the Order object using the generated class and send it off to the Kafka topic.

The setter methods in the generated Order class come in very handy. 
```
...
Producer<String, Order> producer = new KafkaProducer<String, Order>(properties);

Order order = Order.newBuilder()
		.setOrderId("OId234")
		.setCustomerId("CId432")
		.setSupplierId("SId543")
		.setItems(4)
		.setFirstName("Sunil")
		.setLastName("V")
		.setPrice(178f)
		.setWeight(75f)
		.build();

ProducerRecord<String, Order> producerRecord = new ProducerRecord<String, Order>(topic, order);


producer.send(producerRecord, new Callback() {
	@Override
	public void onCompletion(RecordMetadata metadata, Exception exception) {
		if (exception == null) {
			logger.info(metadata); 
		} else {
			logger.error(exception.getMessage());
		}
	}
});

producer.flush();
producer.close();
...
``` 
		

### Package the Spring Boot jar and create the docker image

To compile and package the jar file and create a docker image, run the following commands shown below:

```
mvn package

mv target/*.jar app.jar
 
docker build -t spring-kafka-registry .
```
