// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type defining a compounding rate. The compounding interest can either point back to the interest calculation node on the Interest Leg, or be defined specifically.
 */
public class CompoundingRate implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private InterestCalculationReference interestLegRate;
	
	@Element
	private InterestAccrualsMethod specificRate;
	
    
	/**
     * public getter
     *
     * Reference to the interest calculation node on the Interest Leg.
     *
     * @returns com.leansoft.fpml.nano.InterestCalculationReference
	 */
	public InterestCalculationReference getInterestLegRate() {
	    return this.interestLegRate;
	}
	
	/**
	 * public setter
	 *
     * Reference to the interest calculation node on the Interest Leg.
     *
     * @param com.leansoft.fpml.nano.InterestCalculationReference
	 */
	public void setInterestLegRate(InterestCalculationReference interestLegRate) {
	    this.interestLegRate = interestLegRate;
	}
	/**
     * public getter
     *
     * Defines a specific rate.
     *
     * @returns com.leansoft.fpml.nano.InterestAccrualsMethod
	 */
	public InterestAccrualsMethod getSpecificRate() {
	    return this.specificRate;
	}
	
	/**
	 * public setter
	 *
     * Defines a specific rate.
     *
     * @param com.leansoft.fpml.nano.InterestAccrualsMethod
	 */
	public void setSpecificRate(InterestAccrualsMethod specificRate) {
	    this.specificRate = specificRate;
	}

}