// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * The amount of detail provided in the valuation set, e.g. is market environment data provided, are risk definitions provided, etc.
 */
public class ValuationSetDetail implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String valuationSetDetailScheme;
	
    
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
	public String getValuationSetDetailScheme() {
	    return this.valuationSetDetailScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setValuationSetDetailScheme(String valuationSetDetailScheme) {
	    this.valuationSetDetailScheme = valuationSetDetailScheme;
	}

}