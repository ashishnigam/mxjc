// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * A description of how a numerical derivative is computed.
 */
public class DerivativeCalculationProcedure implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private DerivativeCalculationMethod method;
	
	@Element
	private BigDecimal perturbationAmount;
	
	@Element
	private Boolean averaged;
	
	@Element
	private PerturbationType perturbationType;
	
	@Element
	private String derivativeFormula;
	
	@Element
	private PricingStructureReference replacementMarketInput;
	
    
	/**
     * public getter
     *
     * The method by which a derivative is computed, e.g. analytic, numerical model, perturbation, etc.
     *
     * @returns com.leansoft.fpml.nano.DerivativeCalculationMethod
	 */
	public DerivativeCalculationMethod getMethod() {
	    return this.method;
	}
	
	/**
	 * public setter
	 *
     * The method by which a derivative is computed, e.g. analytic, numerical model, perturbation, etc.
     *
     * @param com.leansoft.fpml.nano.DerivativeCalculationMethod
	 */
	public void setMethod(DerivativeCalculationMethod method) {
	    this.method = method;
	}
	/**
     * public getter
     *
     * The size and direction of the perturbation used to compute the derivative, e.g. 0.0001 = 1 bp.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getPerturbationAmount() {
	    return this.perturbationAmount;
	}
	
	/**
	 * public setter
	 *
     * The size and direction of the perturbation used to compute the derivative, e.g. 0.0001 = 1 bp.
     *
     * @param java.math.BigDecimal
	 */
	public void setPerturbationAmount(BigDecimal perturbationAmount) {
	    this.perturbationAmount = perturbationAmount;
	}
	/**
     * public getter
     *
     * The value is calculated by perturbing by the perturbationAmount and then the negative of the perturbationAmount and then averaging the two values (i.e. the value is half of the difference between perturbing up and perturbing down).
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getAveraged() {
	    return this.averaged;
	}
	
	/**
	 * public setter
	 *
     * The value is calculated by perturbing by the perturbationAmount and then the negative of the perturbationAmount and then averaging the two values (i.e. the value is half of the difference between perturbing up and perturbing down).
     *
     * @param java.lang.Boolean
	 */
	public void setAveraged(Boolean averaged) {
	    this.averaged = averaged;
	}
	/**
     * public getter
     *
     * The type of perturbation, if any, used to compute the derivative (Absolute vs Relative).
     *
     * @returns com.leansoft.fpml.nano.PerturbationType
	 */
	public PerturbationType getPerturbationType() {
	    return this.perturbationType;
	}
	
	/**
	 * public setter
	 *
     * The type of perturbation, if any, used to compute the derivative (Absolute vs Relative).
     *
     * @param com.leansoft.fpml.nano.PerturbationType
	 */
	public void setPerturbationType(PerturbationType perturbationType) {
	    this.perturbationType = perturbationType;
	}
	/**
     * public getter
     *
     * The formula used to compute the derivative (perhaps could be updated to use the Formula type in EQS.).
     *
     * @returns java.lang.String
	 */
	public String getDerivativeFormula() {
	    return this.derivativeFormula;
	}
	
	/**
	 * public setter
	 *
     * The formula used to compute the derivative (perhaps could be updated to use the Formula type in EQS.).
     *
     * @param java.lang.String
	 */
	public void setDerivativeFormula(String derivativeFormula) {
	    this.derivativeFormula = derivativeFormula;
	}
	/**
     * public getter
     *
     * A reference to the replacement version of the market input, e.g. a bumped yield curve.
     *
     * @returns com.leansoft.fpml.nano.PricingStructureReference
	 */
	public PricingStructureReference getReplacementMarketInput() {
	    return this.replacementMarketInput;
	}
	
	/**
	 * public setter
	 *
     * A reference to the replacement version of the market input, e.g. a bumped yield curve.
     *
     * @param com.leansoft.fpml.nano.PricingStructureReference
	 */
	public void setReplacementMarketInput(PricingStructureReference replacementMarketInput) {
	    this.replacementMarketInput = replacementMarketInput;
	}

}