// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * A type defining the adjusted dates associated with a mandatory early termination provision.
 */
public class MandatoryEarlyTerminationAdjustedDates implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Date adjustedEarlyTerminationDate;
	
	@Element
	private Date adjustedCashSettlementValuationDate;
	
	@Element
	private Date adjustedCashSettlementPaymentDate;
	
    
	/**
     * public getter
     *
     * The early termination date that is applicable if an early termination provision is exercised. This date should already be adjusted for any applicable business day convention.
     *
     * @returns java.util.Date
	 */
	public Date getAdjustedEarlyTerminationDate() {
	    return this.adjustedEarlyTerminationDate;
	}
	
	/**
	 * public setter
	 *
     * The early termination date that is applicable if an early termination provision is exercised. This date should already be adjusted for any applicable business day convention.
     *
     * @param java.util.Date
	 */
	public void setAdjustedEarlyTerminationDate(Date adjustedEarlyTerminationDate) {
	    this.adjustedEarlyTerminationDate = adjustedEarlyTerminationDate;
	}
	/**
     * public getter
     *
     * The date by which the cash settlement amount must be agreed. This date should already be adjusted for any applicable business day convention.
     *
     * @returns java.util.Date
	 */
	public Date getAdjustedCashSettlementValuationDate() {
	    return this.adjustedCashSettlementValuationDate;
	}
	
	/**
	 * public setter
	 *
     * The date by which the cash settlement amount must be agreed. This date should already be adjusted for any applicable business day convention.
     *
     * @param java.util.Date
	 */
	public void setAdjustedCashSettlementValuationDate(Date adjustedCashSettlementValuationDate) {
	    this.adjustedCashSettlementValuationDate = adjustedCashSettlementValuationDate;
	}
	/**
     * public getter
     *
     * The date on which the cash settlement amount is paid. This date should already be adjusted for any applicable business dat convention.
     *
     * @returns java.util.Date
	 */
	public Date getAdjustedCashSettlementPaymentDate() {
	    return this.adjustedCashSettlementPaymentDate;
	}
	
	/**
	 * public setter
	 *
     * The date on which the cash settlement amount is paid. This date should already be adjusted for any applicable business dat convention.
     *
     * @param java.util.Date
	 */
	public void setAdjustedCashSettlementPaymentDate(Date adjustedCashSettlementPaymentDate) {
	    this.adjustedCashSettlementPaymentDate = adjustedCashSettlementPaymentDate;
	}

}