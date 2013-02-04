// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The side from which perspective a value is quoted.
 */
public enum QuotationSideEnum {

    /**
     * A value "bid" by a buyer for an asset, i.e. the value a buyer is willing to pay.
     */
    BID("Bid"),
  

    /**
     * A value "asked" by a seller for an asset, i.e. the value at which a seller is willing to sell.
     */
    ASK("Ask"),
  

    /**
     * A value midway between the bid and the ask value.
     */
    MID("Mid");
  
  
    private final String value;
  
    QuotationSideEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static QuotationSideEnum fromValue(String v) {
        if (v != null) {
            for (QuotationSideEnum c: QuotationSideEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}