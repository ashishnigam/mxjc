// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The list of oneOff fee types associated with a facility.
 */
public enum OneOffFeeTypeEnum {

    /**
     * Calculated as a percentage of the unutilized portion of the facility.
     */
    ASSIGNMENT_FEE("AssignmentFee"),
  

    /**
     * Calculated as the cost of breaking financing on a loan contract which is repaid early.
     */
    BREAKAGE_FEE("BreakageFee");
  
  
    private final String value;
  
    OneOffFeeTypeEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static OneOffFeeTypeEnum fromValue(String v) {
        if (v != null) {
            for (OneOffFeeTypeEnum c: OneOffFeeTypeEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}