/**
 * 
 */
package com.taobao.top.analysis.node.event;


/**
 * @author fangweng
 * @Email fangweng@taobao.com
 * 2011-11-28
 *
 */
public class SlaveNodeEvent implements INodeEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2299360116837673453L;
	
	SlaveEventCode eventCode;
	
	String sequence;

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public SlaveEventCode getEventCode() {
		return eventCode;
	}

	public void setEventCode(SlaveEventCode eventCode) {
		this.eventCode = eventCode;
	}	


}