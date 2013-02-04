// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type defining a content model that is backwards compatible with older FpML releases and which can be used to contain sets of data without expressing any processing intention.
 */
@RootElement(name = "dataDocument", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class DataDocument extends Document implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<Validation> validation;
	
	@Element
	private List<Trade> trade;
	
	@Element
	private List<Portfolio> portfolio;
	
	@Element
	private List<Party> party;
	
    
	/**
	 * public getter
	 *
     * @returns java.util.List<com.leansoft.fpml.nano.Validation>
	 */
	public List<Validation> getValidation() {
	    return this.validation;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<com.leansoft.fpml.nano.Validation>
	 */
	public void setValidation(List<Validation> validation) {
	    this.validation = validation;
	}
	/**
     * public getter
     *
     * The root element in an FpML trade document.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.Trade>
	 */
	public List<Trade> getTrade() {
	    return this.trade;
	}
	
	/**
	 * public setter
	 *
     * The root element in an FpML trade document.
     *
     * @param java.util.List<com.leansoft.fpml.nano.Trade>
	 */
	public void setTrade(List<Trade> trade) {
	    this.trade = trade;
	}
	/**
     * public getter
     *
     * An arbitary grouping of trade references (and possibly other portfolios).
     *
     * @returns java.util.List<com.leansoft.fpml.nano.Portfolio>
	 */
	public List<Portfolio> getPortfolio() {
	    return this.portfolio;
	}
	
	/**
	 * public setter
	 *
     * An arbitary grouping of trade references (and possibly other portfolios).
     *
     * @param java.util.List<com.leansoft.fpml.nano.Portfolio>
	 */
	public void setPortfolio(List<Portfolio> portfolio) {
	    this.portfolio = portfolio;
	}
	/**
     * public getter
     *
     * Parties can perform multiple roles in a trade lifecycle. For example, the principal parties obligated to make payments from time to time during the term of the trade, but may include other parties involved in, or incidental to, the trade, such as parties acting in the role of novation transferor/transferee, broker, calculation agent, etc. In FpML roles are defined in multiple places within a document.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public List<Party> getParty() {
	    return this.party;
	}
	
	/**
	 * public setter
	 *
     * Parties can perform multiple roles in a trade lifecycle. For example, the principal parties obligated to make payments from time to time during the term of the trade, but may include other parties involved in, or incidental to, the trade, such as parties acting in the role of novation transferor/transferee, broker, calculation agent, etc. In FpML roles are defined in multiple places within a document.
     *
     * @param java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public void setParty(List<Party> party) {
	    this.party = party;
	}

}