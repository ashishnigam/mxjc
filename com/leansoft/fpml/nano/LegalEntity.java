// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type defining a legal entity.
 */
@RootElement(name = "excludedReferenceEntity", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class LegalEntity implements Serializable {

    private static final long serialVersionUID = -1L;

	@Attribute  
	private String id;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getId() {
	    return this.id;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setId(String id) {
	    this.id = id;
	}

}