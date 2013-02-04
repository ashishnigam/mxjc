// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A matrix of volatilities with dimension 0-3.
 */
@RootElement(name = "volatilityMatrixValuation", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class VolatilityMatrix extends PricingStructureValuation implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private MultiDimensionalPricingData dataPoints;
	
	@Element
	private List<ParametricAdjustment> adjustment;
	
    
	/**
     * public getter
     *
     * The raw volatility matrix data, expressed as a multi-dimensional array.
     *
     * @returns com.leansoft.fpml.nano.MultiDimensionalPricingData
	 */
	public MultiDimensionalPricingData getDataPoints() {
	    return this.dataPoints;
	}
	
	/**
	 * public setter
	 *
     * The raw volatility matrix data, expressed as a multi-dimensional array.
     *
     * @param com.leansoft.fpml.nano.MultiDimensionalPricingData
	 */
	public void setDataPoints(MultiDimensionalPricingData dataPoints) {
	    this.dataPoints = dataPoints;
	}
	/**
     * public getter
     *
     * An adjustment factor, such as for vol smile/skew.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.ParametricAdjustment>
	 */
	public List<ParametricAdjustment> getAdjustment() {
	    return this.adjustment;
	}
	
	/**
	 * public setter
	 *
     * An adjustment factor, such as for vol smile/skew.
     *
     * @param java.util.List<com.leansoft.fpml.nano.ParametricAdjustment>
	 */
	public void setAdjustment(List<ParametricAdjustment> adjustment) {
	    this.adjustment = adjustment;
	}

}