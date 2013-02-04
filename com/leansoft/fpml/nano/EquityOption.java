// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * A type for defining equity options.
 */
@RootElement(name = "equityOption", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class EquityOption extends EquityDerivativeLongFormBase implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private EquityStrike strike;
	
	@Element
	private BigDecimal spotPrice;
	
	@Element
	private BigDecimal numberOfOptions;
	
	@Element
	private BigDecimal optionEntitlement;
	
	@Element
	private EquityPremium equityPremium;
	
    
	/**
     * public getter
     *
     * Defines whether it is a price or level at which the option has been, or will be, struck.
     *
     * @returns com.leansoft.fpml.nano.EquityStrike
	 */
	public EquityStrike getStrike() {
	    return this.strike;
	}
	
	/**
	 * public setter
	 *
     * Defines whether it is a price or level at which the option has been, or will be, struck.
     *
     * @param com.leansoft.fpml.nano.EquityStrike
	 */
	public void setStrike(EquityStrike strike) {
	    this.strike = strike;
	}
	/**
     * public getter
     *
     * The price per share, index or basket observed on the trade or effective date.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getSpotPrice() {
	    return this.spotPrice;
	}
	
	/**
	 * public setter
	 *
     * The price per share, index or basket observed on the trade or effective date.
     *
     * @param java.math.BigDecimal
	 */
	public void setSpotPrice(BigDecimal spotPrice) {
	    this.spotPrice = spotPrice;
	}
	/**
     * public getter
     *
     * The number of options comprised in the option transaction.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getNumberOfOptions() {
	    return this.numberOfOptions;
	}
	
	/**
	 * public setter
	 *
     * The number of options comprised in the option transaction.
     *
     * @param java.math.BigDecimal
	 */
	public void setNumberOfOptions(BigDecimal numberOfOptions) {
	    this.numberOfOptions = numberOfOptions;
	}
	/**
     * public getter
     *
     * The number of shares per option comprised in the option transaction.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getOptionEntitlement() {
	    return this.optionEntitlement;
	}
	
	/**
	 * public setter
	 *
     * The number of shares per option comprised in the option transaction.
     *
     * @param java.math.BigDecimal
	 */
	public void setOptionEntitlement(BigDecimal optionEntitlement) {
	    this.optionEntitlement = optionEntitlement;
	}
	/**
     * public getter
     *
     * The equity option premium payable by the buyer to the seller.
     *
     * @returns com.leansoft.fpml.nano.EquityPremium
	 */
	public EquityPremium getEquityPremium() {
	    return this.equityPremium;
	}
	
	/**
	 * public setter
	 *
     * The equity option premium payable by the buyer to the seller.
     *
     * @param com.leansoft.fpml.nano.EquityPremium
	 */
	public void setEquityPremium(EquityPremium equityPremium) {
	    this.equityPremium = equityPremium;
	}

}