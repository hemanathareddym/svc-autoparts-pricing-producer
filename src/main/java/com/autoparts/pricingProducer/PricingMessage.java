/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.autoparts.pricingProducer;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PricingMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4032895866805042390L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PricingMessage\",\"namespace\":\"com.autoparts.pricingProducer\",\"fields\":[{\"name\":\"account_number\",\"type\":\"int\",\"doc\":\"CAN - Customer account number\"},{\"name\":\"ct_id\",\"type\":\"string\",\"doc\":\"customer type id\"},{\"name\":\"pt_id\",\"type\":\"string\",\"doc\":\"Pricing type id\"},{\"name\":\"rtlPromo\",\"type\":\"float\",\"doc\":\"Retail promo flag\"},{\"name\":\"proPromo\",\"type\":\"float\",\"doc\":\"Pro promo flag\"},{\"name\":\"hierarchy_id\",\"type\":\"boolean\",\"doc\":\"Customer/Pricing hierarchy node id\",\"default\":true}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PricingMessage> ENCODER =
      new BinaryMessageEncoder<PricingMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PricingMessage> DECODER =
      new BinaryMessageDecoder<PricingMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PricingMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PricingMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PricingMessage>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PricingMessage to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PricingMessage from a ByteBuffer. */
  public static PricingMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** CAN - Customer account number */
  @Deprecated public int account_number;
  /** customer type id */
  @Deprecated public CharSequence ct_id;
  /** Pricing type id */
  @Deprecated public CharSequence pt_id;
  /** Retail promo flag */
  @Deprecated public float rtlPromo;
  /** Pro promo flag */
  @Deprecated public float proPromo;
  /** Customer/Pricing hierarchy node id */
  @Deprecated public boolean hierarchy_id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PricingMessage() {}

  /**
   * All-args constructor.
   * @param account_number CAN - Customer account number
   * @param ct_id customer type id
   * @param pt_id Pricing type id
   * @param rtlPromo Retail promo flag
   * @param proPromo Pro promo flag
   * @param hierarchy_id Customer/Pricing hierarchy node id
   */
  public PricingMessage(Integer account_number, CharSequence ct_id, CharSequence pt_id, Float rtlPromo, Float proPromo, Boolean hierarchy_id) {
    this.account_number = account_number;
    this.ct_id = ct_id;
    this.pt_id = pt_id;
    this.rtlPromo = rtlPromo;
    this.proPromo = proPromo;
    this.hierarchy_id = hierarchy_id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return account_number;
    case 1: return ct_id;
    case 2: return pt_id;
    case 3: return rtlPromo;
    case 4: return proPromo;
    case 5: return hierarchy_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: account_number = (Integer)value$; break;
    case 1: ct_id = (CharSequence)value$; break;
    case 2: pt_id = (CharSequence)value$; break;
    case 3: rtlPromo = (Float)value$; break;
    case 4: proPromo = (Float)value$; break;
    case 5: hierarchy_id = (Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'account_number' field.
   * @return CAN - Customer account number
   */
  public Integer getAccountNumber() {
    return account_number;
  }

  /**
   * Sets the value of the 'account_number' field.
   * CAN - Customer account number
   * @param value the value to set.
   */
  public void setAccountNumber(Integer value) {
    this.account_number = value;
  }

  /**
   * Gets the value of the 'ct_id' field.
   * @return customer type id
   */
  public CharSequence getCtId() {
    return ct_id;
  }

  /**
   * Sets the value of the 'ct_id' field.
   * customer type id
   * @param value the value to set.
   */
  public void setCtId(CharSequence value) {
    this.ct_id = value;
  }

  /**
   * Gets the value of the 'pt_id' field.
   * @return Pricing type id
   */
  public CharSequence getPtId() {
    return pt_id;
  }

  /**
   * Sets the value of the 'pt_id' field.
   * Pricing type id
   * @param value the value to set.
   */
  public void setPtId(CharSequence value) {
    this.pt_id = value;
  }

  /**
   * Gets the value of the 'rtlPromo' field.
   * @return Retail promo flag
   */
  public Float getRtlPromo() {
    return rtlPromo;
  }

  /**
   * Sets the value of the 'rtlPromo' field.
   * Retail promo flag
   * @param value the value to set.
   */
  public void setRtlPromo(Float value) {
    this.rtlPromo = value;
  }

  /**
   * Gets the value of the 'proPromo' field.
   * @return Pro promo flag
   */
  public Float getProPromo() {
    return proPromo;
  }

  /**
   * Sets the value of the 'proPromo' field.
   * Pro promo flag
   * @param value the value to set.
   */
  public void setProPromo(Float value) {
    this.proPromo = value;
  }

  /**
   * Gets the value of the 'hierarchy_id' field.
   * @return Customer/Pricing hierarchy node id
   */
  public Boolean getHierarchyId() {
    return hierarchy_id;
  }

  /**
   * Sets the value of the 'hierarchy_id' field.
   * Customer/Pricing hierarchy node id
   * @param value the value to set.
   */
  public void setHierarchyId(Boolean value) {
    this.hierarchy_id = value;
  }

  /**
   * Creates a new PricingMessage RecordBuilder.
   * @return A new PricingMessage RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new PricingMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PricingMessage RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new PricingMessage RecordBuilder by copying an existing PricingMessage instance.
   * @param other The existing instance to copy.
   * @return A new PricingMessage RecordBuilder
   */
  public static Builder newBuilder(PricingMessage other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for PricingMessage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PricingMessage>
    implements org.apache.avro.data.RecordBuilder<PricingMessage> {

    /** CAN - Customer account number */
    private int account_number;
    /** customer type id */
    private CharSequence ct_id;
    /** Pricing type id */
    private CharSequence pt_id;
    /** Retail promo flag */
    private float rtlPromo;
    /** Pro promo flag */
    private float proPromo;
    /** Customer/Pricing hierarchy node id */
    private boolean hierarchy_id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.account_number)) {
        this.account_number = data().deepCopy(fields()[0].schema(), other.account_number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ct_id)) {
        this.ct_id = data().deepCopy(fields()[1].schema(), other.ct_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pt_id)) {
        this.pt_id = data().deepCopy(fields()[2].schema(), other.pt_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.rtlPromo)) {
        this.rtlPromo = data().deepCopy(fields()[3].schema(), other.rtlPromo);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.proPromo)) {
        this.proPromo = data().deepCopy(fields()[4].schema(), other.proPromo);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.hierarchy_id)) {
        this.hierarchy_id = data().deepCopy(fields()[5].schema(), other.hierarchy_id);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PricingMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(PricingMessage other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.account_number)) {
        this.account_number = data().deepCopy(fields()[0].schema(), other.account_number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ct_id)) {
        this.ct_id = data().deepCopy(fields()[1].schema(), other.ct_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pt_id)) {
        this.pt_id = data().deepCopy(fields()[2].schema(), other.pt_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.rtlPromo)) {
        this.rtlPromo = data().deepCopy(fields()[3].schema(), other.rtlPromo);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.proPromo)) {
        this.proPromo = data().deepCopy(fields()[4].schema(), other.proPromo);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.hierarchy_id)) {
        this.hierarchy_id = data().deepCopy(fields()[5].schema(), other.hierarchy_id);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'account_number' field.
      * CAN - Customer account number
      * @return The value.
      */
    public Integer getAccountNumber() {
      return account_number;
    }

    /**
      * Sets the value of the 'account_number' field.
      * CAN - Customer account number
      * @param value The value of 'account_number'.
      * @return This builder.
      */
    public Builder setAccountNumber(int value) {
      validate(fields()[0], value);
      this.account_number = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'account_number' field has been set.
      * CAN - Customer account number
      * @return True if the 'account_number' field has been set, false otherwise.
      */
    public boolean hasAccountNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'account_number' field.
      * CAN - Customer account number
      * @return This builder.
      */
    public Builder clearAccountNumber() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ct_id' field.
      * customer type id
      * @return The value.
      */
    public CharSequence getCtId() {
      return ct_id;
    }

    /**
      * Sets the value of the 'ct_id' field.
      * customer type id
      * @param value The value of 'ct_id'.
      * @return This builder.
      */
    public Builder setCtId(CharSequence value) {
      validate(fields()[1], value);
      this.ct_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ct_id' field has been set.
      * customer type id
      * @return True if the 'ct_id' field has been set, false otherwise.
      */
    public boolean hasCtId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ct_id' field.
      * customer type id
      * @return This builder.
      */
    public Builder clearCtId() {
      ct_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'pt_id' field.
      * Pricing type id
      * @return The value.
      */
    public CharSequence getPtId() {
      return pt_id;
    }

    /**
      * Sets the value of the 'pt_id' field.
      * Pricing type id
      * @param value The value of 'pt_id'.
      * @return This builder.
      */
    public Builder setPtId(CharSequence value) {
      validate(fields()[2], value);
      this.pt_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'pt_id' field has been set.
      * Pricing type id
      * @return True if the 'pt_id' field has been set, false otherwise.
      */
    public boolean hasPtId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'pt_id' field.
      * Pricing type id
      * @return This builder.
      */
    public Builder clearPtId() {
      pt_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'rtlPromo' field.
      * Retail promo flag
      * @return The value.
      */
    public Float getRtlPromo() {
      return rtlPromo;
    }

    /**
      * Sets the value of the 'rtlPromo' field.
      * Retail promo flag
      * @param value The value of 'rtlPromo'.
      * @return This builder.
      */
    public Builder setRtlPromo(float value) {
      validate(fields()[3], value);
      this.rtlPromo = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'rtlPromo' field has been set.
      * Retail promo flag
      * @return True if the 'rtlPromo' field has been set, false otherwise.
      */
    public boolean hasRtlPromo() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'rtlPromo' field.
      * Retail promo flag
      * @return This builder.
      */
    public Builder clearRtlPromo() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'proPromo' field.
      * Pro promo flag
      * @return The value.
      */
    public Float getProPromo() {
      return proPromo;
    }

    /**
      * Sets the value of the 'proPromo' field.
      * Pro promo flag
      * @param value The value of 'proPromo'.
      * @return This builder.
      */
    public Builder setProPromo(float value) {
      validate(fields()[4], value);
      this.proPromo = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'proPromo' field has been set.
      * Pro promo flag
      * @return True if the 'proPromo' field has been set, false otherwise.
      */
    public boolean hasProPromo() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'proPromo' field.
      * Pro promo flag
      * @return This builder.
      */
    public Builder clearProPromo() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'hierarchy_id' field.
      * Customer/Pricing hierarchy node id
      * @return The value.
      */
    public Boolean getHierarchyId() {
      return hierarchy_id;
    }

    /**
      * Sets the value of the 'hierarchy_id' field.
      * Customer/Pricing hierarchy node id
      * @param value The value of 'hierarchy_id'.
      * @return This builder.
      */
    public Builder setHierarchyId(boolean value) {
      validate(fields()[5], value);
      this.hierarchy_id = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'hierarchy_id' field has been set.
      * Customer/Pricing hierarchy node id
      * @return True if the 'hierarchy_id' field has been set, false otherwise.
      */
    public boolean hasHierarchyId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'hierarchy_id' field.
      * Customer/Pricing hierarchy node id
      * @return This builder.
      */
    public Builder clearHierarchyId() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PricingMessage build() {
      try {
        PricingMessage record = new PricingMessage();
        record.account_number = fieldSetFlags()[0] ? this.account_number : (Integer) defaultValue(fields()[0]);
        record.ct_id = fieldSetFlags()[1] ? this.ct_id : (CharSequence) defaultValue(fields()[1]);
        record.pt_id = fieldSetFlags()[2] ? this.pt_id : (CharSequence) defaultValue(fields()[2]);
        record.rtlPromo = fieldSetFlags()[3] ? this.rtlPromo : (Float) defaultValue(fields()[3]);
        record.proPromo = fieldSetFlags()[4] ? this.proPromo : (Float) defaultValue(fields()[4]);
        record.hierarchy_id = fieldSetFlags()[5] ? this.hierarchy_id : (Boolean) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PricingMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<PricingMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PricingMessage>
    READER$ = (org.apache.avro.io.DatumReader<PricingMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
