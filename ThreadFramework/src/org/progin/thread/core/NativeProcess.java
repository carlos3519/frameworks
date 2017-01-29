package org.progin.thread.core;

public abstract class NativeProcess implements  Process{

	private String processId ;
	private long timeStart , timeEnd;
	private long timeElapsed = -1;

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
