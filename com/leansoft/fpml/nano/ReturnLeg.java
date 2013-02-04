// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type describing the return leg of a return type swap.
 */
@RootElement(name = "returnLeg", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class ReturnLeg extends ReturnSwapLegUnderlyer implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private ReturnLegValuation rateOfReturn;
	
	@Element
	private ReturnSwapNotional notional;
	
	@Element
	private ReturnSwapAmount amount;
	
	@Element(name = "return")
	private Return _return;
	
	@Element
	private NotionalAdjustmentEnum notionalAdjustments;
	
	@Element
	private FxFeature fxFeature;
	
    
	/**
     * public getter
     *
     * Element named "valuation" in versions prior to FpML 4.2 Second Working Draft. Specifies the terms of the initial price of the return type swap and of the subsequent valuations of the underlyer.
     *
     * @returns com.leansoft.fpml.nano.ReturnLegValuation
	 */
	public ReturnLegValuation getRateOfReturn() {
	    return this.rateOfReturn;
	}
	
	/**
	 * public setter
	 *
     * Element named "valuation" in versions prior to FpML 4.2 Second Working Draft. Specifies the terms of the initial price of the return type swap and of the subsequent valuations of the underlyer.
     *
     * @param com.leansoft.fpml.nano.ReturnLegValuation
	 */
	public void setRateOfReturn(ReturnLegValuation rateOfReturn) {
	    this.rateOfReturn = rateOfReturn;
	}
	/**
     * public getter
     *
     * Specifies the notional of a return type swap. When used in the equity leg, the definition will typically combine the actual amount (using the notional component defined by the FpML industry group) and the determination method. When used in the interest leg, the definition will typically point to the definition of the equity leg.
     *
     * @returns com.leansoft.fpml.nano.ReturnSwapNotional
	 */
	public ReturnSwapNotional getNotional() {
	    return this.notional;
	}
	
	/**
	 * public setter
	 *
     * Specifies the notional of a return type swap. When used in the equity leg, the definition will typically combine the actual amount (using the notional component defined by the FpML industry group) and the determination method. When used in the interest leg, the definition will typically point to the definition of the equity leg.
     *
     * @param com.leansoft.fpml.nano.ReturnSwapNotional
	 */
	public void setNotional(ReturnSwapNotional notional) {
	    this.notional = notional;
	}
	/**
     * public getter
     *
     * Element named "equityAmount" in versions prior to FpML 4.2 Second Working Draft. Specifies, in relation to each Payment Date, the amount to which the Payment Date relates. For equity swaps this element is equivalent to the Equity Amount term as defined in the ISDA 2002 Equity Derivatives Definitions.
     *
     * @returns com.leansoft.fpml.nano.ReturnSwapAmount
	 */
	public ReturnSwapAmount getAmount() {
	    return this.amount;
	}
	
	/**
	 * public setter
	 *
     * Element named "equityAmount" in versions prior to FpML 4.2 Second Working Draft. Specifies, in relation to each Payment Date, the amount to which the Payment Date relates. For equity swaps this element is equivalent to the Equity Amount term as defined in the ISDA 2002 Equity Derivatives Definitions.
     *
     * @param com.leansoft.fpml.nano.ReturnSwapAmount
	 */
	public void setAmount(ReturnSwapAmount amount) {
	    this.amount = amount;
	}
	/**
     * public getter
     *
     * Specifies the conditions under which dividend affecting the underlyer will be paid to the receiver of the amounts.
     *
     * @returns com.leansoft.fpml.nano.Return
	 */
	public Return get_return() {
	    return this._return;
	}
	
	/**
	 * public setter
	 *
     * Specifies the conditions under which dividend affecting the underlyer will be paid to the receiver of the amounts.
     *
     * @param com.leansoft.fpml.nano.Return
	 */
	public void set_return(Return _return) {
	    this._return = _return;
	}
	/**
     * public getter
     *
     * Specifies the conditions that govern the adjustment to the number of units of the equity swap.
     *
     * @returns com.leansoft.fpml.nano.NotionalAdjustmentEnum
	 */
	public NotionalAdjustmentEnum getNotionalAdjustments() {
	    return this.notionalAdjustments;
	}
	
	/**
	 * public setter
	 *
     * Specifies the conditions that govern the adjustment to the number of units of the equity swap.
     *
     * @param com.leansoft.fpml.nano.NotionalAdjustmentEnum
	 */
	public void setNotionalAdjustments(NotionalAdjustmentEnum notionalAdjustments) {
	    this.notionalAdjustments = notionalAdjustments;
	}
	/**
     * public getter
     *
     * A quanto or composite FX feature.
     *
     * @returns com.leansoft.fpml.nano.FxFeature
	 */
	public FxFeature getFxFeature() {
	    return this.fxFeature;
	}
	
	/**
	 * public setter
	 *
     * A quanto or composite FX feature.
     *
     * @param com.leansoft.fpml.nano.FxFeature
	 */
	public void setFxFeature(FxFeature fxFeature) {
	    this.fxFeature = fxFeature;
	}

}