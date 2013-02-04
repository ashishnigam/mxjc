// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A generic yield curve object, which can be valued in a variety of ways.
 */
@RootElement(name = "yieldCurve", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class YieldCurve extends PricingStructure implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private String algorithm;
	
	@Element
	private ForecastRateIndex forecastRateIndex;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getAlgorithm() {
	    return this.algorithm;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setAlgorithm(String algorithm) {
	    this.algorithm = algorithm;
	}
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.ForecastRateIndex
	 */
	public ForecastRateIndex getForecastRateIndex() {
	    return this.forecastRateIndex;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.ForecastRateIndex
	 */
	public void setForecastRateIndex(ForecastRateIndex forecastRateIndex) {
	    this.forecastRateIndex = forecastRateIndex;
	}

}