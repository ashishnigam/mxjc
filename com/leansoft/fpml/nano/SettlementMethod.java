// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class SettlementMethod implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String settlementMethodScheme;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getSettlementMethodScheme() {
	    return this.settlementMethodScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setSettlementMethodScheme(String settlementMethodScheme) {
	    this.settlementMethodScheme = settlementMethodScheme;
	}

}