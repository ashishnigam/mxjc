// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type describing the principal exchange features of the equity swap.
 */
public class PrincipalExchangeFeatures implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PrincipalExchanges principalExchanges;
	
	@Element
	private List<PrincipalExchangeDescriptions> principalExchangeDescriptions;
	
    
	/**
     * public getter
     *
     * The true/false flags indicating whether initial, intermediate or final exchanges of principal should occur.
     *
     * @returns com.leansoft.fpml.nano.PrincipalExchanges
	 */
	public PrincipalExchanges getPrincipalExchanges() {
	    return this.principalExchanges;
	}
	
	/**
	 * public setter
	 *
     * The true/false flags indicating whether initial, intermediate or final exchanges of principal should occur.
     *
     * @param com.leansoft.fpml.nano.PrincipalExchanges
	 */
	public void setPrincipalExchanges(PrincipalExchanges principalExchanges) {
	    this.principalExchanges = principalExchanges;
	}
	/**
     * public getter
     *
     * Specifies each of the characteristics of the principal exchange cashflows, in terms of paying/receiving counterparties, amounts and dates.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PrincipalExchangeDescriptions>
	 */
	public List<PrincipalExchangeDescriptions> getPrincipalExchangeDescriptions() {
	    return this.principalExchangeDescriptions;
	}
	
	/**
	 * public setter
	 *
     * Specifies each of the characteristics of the principal exchange cashflows, in terms of paying/receiving counterparties, amounts and dates.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PrincipalExchangeDescriptions>
	 */
	public void setPrincipalExchangeDescriptions(List<PrincipalExchangeDescriptions> principalExchangeDescriptions) {
	    this.principalExchangeDescriptions = principalExchangeDescriptions;
	}

}