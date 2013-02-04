// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type describing the liens associated with a loan facility.
 */
public class Lien implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String lienScheme;
	
    
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
	public String getLienScheme() {
	    return this.lienScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setLienScheme(String lienScheme) {
	    this.lienScheme = lienScheme;
	}

}