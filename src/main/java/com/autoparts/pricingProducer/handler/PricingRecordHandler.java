package com.autoparts.pricingProducer.handler;

import com.autoparts.pricingProducer.PricingMessage;
import org.apache.kafka.clients.producer.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class PricingRecordHandler {

    final static Logger logger = Logger.getLogger(PricingRecordHandler.class);
    @Value("${bootstrap.url}")
    String bootstrap;
    @Value("${registry.url}")
    String registry;

    public PricingMessage sendMsg(Properties properties, String topic){
        Producer producer = new KafkaProducer<String, PricingMessage>(properties);
        PricingMessage order = PricingMessage.newBuilder()
                .setAccountNumber(1111111111)
                .setCtId("CId432")
                .setPtId("SId543")
                .setHierarchyId(true)
                .setRtlPromo(0.2f)
                .setProPromo(0.4f)
                .build();

        ProducerRecord<String, PricingMessage> producerRecord = new ProducerRecord<String, PricingMessage>(topic, order);

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

        return order;
    }
}
