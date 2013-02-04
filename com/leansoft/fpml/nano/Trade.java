// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type defining an FpML trade.
 */
@RootElement(name = "remainingTrade", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class Trade implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private TradeHeader tradeHeader;
	
	@Element
	private List<Payment> otherPartyPayment;
	
	@Element
	private List<PartyReference> brokerPartyReference;
	
	@Element
	private CalculationAgent calculationAgent;
	
	@Element
	private BusinessCenter calculationAgentBusinessCenter;
	
	@Element
	private Collateral collateral;
	
	@Element
	private Documentation documentation;
	
	@Element
	private GoverningLaw governingLaw;
	
	@Element
	private Allocations allocations;
	
	@Element
	private List<TradeSide> tradeSide;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The information on the trade which is not product specific, e.g. trade date.
     *
     * @returns com.leansoft.fpml.nano.TradeHeader
	 */
	public TradeHeader getTradeHeader() {
	    return this.tradeHeader;
	}
	
	/**
	 * public setter
	 *
     * The information on the trade which is not product specific, e.g. trade date.
     *
     * @param com.leansoft.fpml.nano.TradeHeader
	 */
	public void setTradeHeader(TradeHeader tradeHeader) {
	    this.tradeHeader = tradeHeader;
	}
	/**
     * public getter
     *
     * Other fees or additional payments associated with the trade, e.g. broker commissions, where one or more of the parties involved are not principal parties involved in the trade.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.Payment>
	 */
	public List<Payment> getOtherPartyPayment() {
	    return this.otherPartyPayment;
	}
	
	/**
	 * public setter
	 *
     * Other fees or additional payments associated with the trade, e.g. broker commissions, where one or more of the parties involved are not principal parties involved in the trade.
     *
     * @param java.util.List<com.leansoft.fpml.nano.Payment>
	 */
	public void setOtherPartyPayment(List<Payment> otherPartyPayment) {
	    this.otherPartyPayment = otherPartyPayment;
	}
	/**
     * public getter
     *
     * Identifies that party (or parties) that brokered this trade.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PartyReference>
	 */
	public List<PartyReference> getBrokerPartyReference() {
	    return this.brokerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * Identifies that party (or parties) that brokered this trade.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PartyReference>
	 */
	public void setBrokerPartyReference(List<PartyReference> brokerPartyReference) {
	    this.brokerPartyReference = brokerPartyReference;
	}
	/**
     * public getter
     *
     * The ISDA Calculation Agent responsible for performing duties associated with an optional early termination
     *
     * @returns com.leansoft.fpml.nano.CalculationAgent
	 */
	public CalculationAgent getCalculationAgent() {
	    return this.calculationAgent;
	}
	
	/**
	 * public setter
	 *
     * The ISDA Calculation Agent responsible for performing duties associated with an optional early termination
     *
     * @param com.leansoft.fpml.nano.CalculationAgent
	 */
	public void setCalculationAgent(CalculationAgent calculationAgent) {
	    this.calculationAgent = calculationAgent;
	}
	/**
     * public getter
     *
     * The city in which the office through which ISDA Calculation Agent is acting for purposes of the transaction is located The short-form confirm for a trade that is executed under a Sovereign or Asia Pacific Master Confirmation Agreement ( MCA ), does not need to specify the Calculation Agent. However, the confirm does need to specify the Calculation Agent City. This is due to the fact that the MCA sets the value for Calculation Agent but does not set the value for Calculation Agent City.
     *
     * @returns com.leansoft.fpml.nano.BusinessCenter
	 */
	public BusinessCenter getCalculationAgentBusinessCenter() {
	    return this.calculationAgentBusinessCenter;
	}
	
	/**
	 * public setter
	 *
     * The city in which the office through which ISDA Calculation Agent is acting for purposes of the transaction is located The short-form confirm for a trade that is executed under a Sovereign or Asia Pacific Master Confirmation Agreement ( MCA ), does not need to specify the Calculation Agent. However, the confirm does need to specify the Calculation Agent City. This is due to the fact that the MCA sets the value for Calculation Agent but does not set the value for Calculation Agent City.
     *
     * @param com.leansoft.fpml.nano.BusinessCenter
	 */
	public void setCalculationAgentBusinessCenter(BusinessCenter calculationAgentBusinessCenter) {
	    this.calculationAgentBusinessCenter = calculationAgentBusinessCenter;
	}
	/**
     * public getter
     *
     * Defines collateral obiligations of a Party
     *
     * @returns com.leansoft.fpml.nano.Collateral
	 */
	public Collateral getCollateral() {
	    return this.collateral;
	}
	
	/**
	 * public setter
	 *
     * Defines collateral obiligations of a Party
     *
     * @param com.leansoft.fpml.nano.Collateral
	 */
	public void setCollateral(Collateral collateral) {
	    this.collateral = collateral;
	}
	/**
     * public getter
     *
     * Defines the definitions that govern the document and should include the year and type of definitions referenced, along with any relevant documentation (such as master agreement) and the date it was signed.
     *
     * @returns com.leansoft.fpml.nano.Documentation
	 */
	public Documentation getDocumentation() {
	    return this.documentation;
	}
	
	/**
	 * public setter
	 *
     * Defines the definitions that govern the document and should include the year and type of definitions referenced, along with any relevant documentation (such as master agreement) and the date it was signed.
     *
     * @param com.leansoft.fpml.nano.Documentation
	 */
	public void setDocumentation(Documentation documentation) {
	    this.documentation = documentation;
	}
	/**
     * public getter
     *
     * Identification of the law governing the transaction.
     *
     * @returns com.leansoft.fpml.nano.GoverningLaw
	 */
	public GoverningLaw getGoverningLaw() {
	    return this.governingLaw;
	}
	
	/**
	 * public setter
	 *
     * Identification of the law governing the transaction.
     *
     * @param com.leansoft.fpml.nano.GoverningLaw
	 */
	public void setGoverningLaw(GoverningLaw governingLaw) {
	    this.governingLaw = governingLaw;
	}
	/**
     * public getter
     *
     * "Short-form" representation of allocations in which the key block economics are stated once within the trade structure, and the allocation data is contained in this allocations structure.
     *
     * @returns com.leansoft.fpml.nano.Allocations
	 */
	public Allocations getAllocations() {
	    return this.allocations;
	}
	
	/**
	 * public setter
	 *
     * "Short-form" representation of allocations in which the key block economics are stated once within the trade structure, and the allocation data is contained in this allocations structure.
     *
     * @param com.leansoft.fpml.nano.Allocations
	 */
	public void setAllocations(Allocations allocations) {
	    this.allocations = allocations;
	}
	/**
     * public getter
     *
     * The parties to the Trade are grouped into Trade Sides. Each Trade has as many as two sides. Each side is a buyer or receiver of each leg or stream.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.TradeSide>
	 */
	public List<TradeSide> getTradeSide() {
	    return this.tradeSide;
	}
	
	/**
	 * public setter
	 *
     * The parties to the Trade are grouped into Trade Sides. Each Trade has as many as two sides. Each side is a buyer or receiver of each leg or stream.
     *
     * @param java.util.List<com.leansoft.fpml.nano.TradeSide>
	 */
	public void setTradeSide(List<TradeSide> tradeSide) {
	    this.tradeSide = tradeSide;
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