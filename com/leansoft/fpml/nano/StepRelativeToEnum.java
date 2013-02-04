// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The specification of whether a percentage rate change, used to calculate a change in notional outstanding, is expressed as a percentage of the initial notional amount or the previously outstanding notional amount.
 */
public enum StepRelativeToEnum {

    /**
     * Change in notional to be applied is calculated by multiplying the percentage rate by the initial notional amount.
     */
    INITIAL("Initial"),
  

    /**
     * Change in notional to be applied is calculated by multiplying the percentage rate by the previously outstanding notional amount.
     */
    PREVIOUS("Previous");
  
  
    private final String value;
  
    StepRelativeToEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static StepRelativeToEnum fromValue(String v) {
        if (v != null) {
            for (StepRelativeToEnum c: StepRelativeToEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}