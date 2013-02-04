// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * As per ISDA 2002 Definitions.
 */
public class Barrier implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private TriggerEvent barrierCap;
	
	@Element
	private TriggerEvent barrierFloor;
	
    
	/**
     * public getter
     *
     * A trigger level approached from beneath.
     *
     * @returns com.leansoft.fpml.nano.TriggerEvent
	 */
	public TriggerEvent getBarrierCap() {
	    return this.barrierCap;
	}
	
	/**
	 * public setter
	 *
     * A trigger level approached from beneath.
     *
     * @param com.leansoft.fpml.nano.TriggerEvent
	 */
	public void setBarrierCap(TriggerEvent barrierCap) {
	    this.barrierCap = barrierCap;
	}
	/**
     * public getter
     *
     * A trigger level approached from above.
     *
     * @returns com.leansoft.fpml.nano.TriggerEvent
	 */
	public TriggerEvent getBarrierFloor() {
	    return this.barrierFloor;
	}
	
	/**
	 * public setter
	 *
     * A trigger level approached from above.
     *
     * @param com.leansoft.fpml.nano.TriggerEvent
	 */
	public void setBarrierFloor(TriggerEvent barrierFloor) {
	    this.barrierFloor = barrierFloor;
	}

}