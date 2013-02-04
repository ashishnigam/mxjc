// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type defining the specification of settlement terms, occuring when the settlement currency is different to the notional currency of the trade.
 */
public class SettlementProvision implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Currency settlementCurrency;
	
	@Element
	private NonDeliverableSettlement nonDeliverableSettlement;
	
    
	/**
     * public getter
     *
     * The currency that stream settles in (to support swaps that settle in a currency different from the notional currency).
     *
     * @returns com.leansoft.fpml.nano.Currency
	 */
	public Currency getSettlementCurrency() {
	    return this.settlementCurrency;
	}
	
	/**
	 * public setter
	 *
     * The currency that stream settles in (to support swaps that settle in a currency different from the notional currency).
     *
     * @param com.leansoft.fpml.nano.Currency
	 */
	public void setSettlementCurrency(Currency settlementCurrency) {
	    this.settlementCurrency = settlementCurrency;
	}
	/**
     * public getter
     *
     * The specification of the non-deliverable settlement provision.
     *
     * @returns com.leansoft.fpml.nano.NonDeliverableSettlement
	 */
	public NonDeliverableSettlement getNonDeliverableSettlement() {
	    return this.nonDeliverableSettlement;
	}
	
	/**
	 * public setter
	 *
     * The specification of the non-deliverable settlement provision.
     *
     * @param com.leansoft.fpml.nano.NonDeliverableSettlement
	 */
	public void setNonDeliverableSettlement(NonDeliverableSettlement nonDeliverableSettlement) {
	    this.nonDeliverableSettlement = nonDeliverableSettlement;
	}

}