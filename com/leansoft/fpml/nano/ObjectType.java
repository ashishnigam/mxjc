// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

@RootElement(name = "Object", namespace = "http://www.w3.org/2000/09/xmldsig#")
public class ObjectType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Attribute(name = "Id")
	private String id;
	
	@Attribute(name = "MimeType")
	private String mimeType;
	
	@Attribute(name = "Encoding")
	private String encoding;
	
    
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
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getMimeType() {
	    return this.mimeType;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setMimeType(String mimeType) {
	    this.mimeType = mimeType;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getEncoding() {
	    return this.encoding;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setEncoding(String encoding) {
	    this.encoding = encoding;
	}

}