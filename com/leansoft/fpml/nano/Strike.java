// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * A type describing a single cap or floor rate.
 */
public class Strike implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigDecimal strikeRate;
	
	@Element
	private IdentifiedPayerReceiver buyer;
	
	@Element
	private IdentifiedPayerReceiver seller;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The rate for a cap or floor.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getStrikeRate() {
	    return this.strikeRate;
	}
	
	/**
	 * public setter
	 *
     * The rate for a cap or floor.
     *
     * @param java.math.BigDecimal
	 */
	public void setStrikeRate(BigDecimal strikeRate) {
	    this.strikeRate = strikeRate;
	}
	/**
     * public getter
     *
     * The buyer of the option
     *
     * @returns com.leansoft.fpml.nano.IdentifiedPayerReceiver
	 */
	public IdentifiedPayerReceiver getBuyer() {
	    return this.buyer;
	}
	
	/**
	 * public setter
	 *
     * The buyer of the option
     *
     * @param com.leansoft.fpml.nano.IdentifiedPayerReceiver
	 */
	public void setBuyer(IdentifiedPayerReceiver buyer) {
	    this.buyer = buyer;
	}
	/**
     * public getter
     *
     * The party that has sold.
     *
     * @returns com.leansoft.fpml.nano.IdentifiedPayerReceiver
	 */
	public IdentifiedPayerReceiver getSeller() {
	    return this.seller;
	}
	
	/**
	 * public setter
	 *
     * The party that has sold.
     *
     * @param com.leansoft.fpml.nano.IdentifiedPayerReceiver
	 */
	public void setSeller(IdentifiedPayerReceiver seller) {
	    this.seller = seller;
	}
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