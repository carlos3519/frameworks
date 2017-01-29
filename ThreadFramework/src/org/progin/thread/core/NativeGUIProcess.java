package org.progin.thread.core;

import javax.swing.JPanel;

public abstract class NativeGUIProcess extends JPanel implements Process {

	private String processId ;
	private long timeStart , timeEnd;
	private long timeElapsed = -1;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	@Override
	public void run() {
		
		timeStart = System.currentTimeMillis();
		runProcess ();
		timeEnd = System.currentTimeMillis();
		
		timeElapsed = timeEnd - timeStart;
		
	}
	
	public long getTimeElapsed() {
		return timeElapsed;
	}
	
	
	public abstract void runProcess ();
	

}
