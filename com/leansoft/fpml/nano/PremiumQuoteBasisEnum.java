// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The specification of how the premium for an FX OTC option is quoted.
 */
public enum PremiumQuoteBasisEnum {

    /**
     * Premium is quoted as a percentage of the callCurrencyAmount.
     */
    PERCENTAGE_OF_CALL_CURRENCY_AMOUNT("PercentageOfCallCurrencyAmount"),
  

    /**
     * Premium is quoted as a percentage of the putCurrencyAmount.
     */
    PERCENTAGE_OF_PUT_CURRENCY_AMOUNT("PercentageOfPutCurrencyAmount"),
  

    /**
     * Premium is quoted in the call currency as a percentage of the put currency.
     */
    CALL_CURRENCY_PER_PUT_CURRENCY("CallCurrencyPerPutCurrency"),
  

    /**
     * Premium is quoted in the put currency as a percentage of the call currency.
     */
    PUT_CURRENCY_PER_CALL_CURRENCY("PutCurrencyPerCallCurrency"),
  

    /**
     * Premium is quoted as an explicit amount.
     */
    EXPLICIT("Explicit");
  
  
    private final String value;
  
    PremiumQuoteBasisEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PremiumQuoteBasisEnum fromValue(String v) {
        if (v != null) {
            for (PremiumQuoteBasisEnum c: PremiumQuoteBasisEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}