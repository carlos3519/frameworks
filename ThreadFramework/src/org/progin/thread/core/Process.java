package org.progin.thread.core;

public interface Process extends Runnable{

	

	public String getProcessId() ;

	public void setProcessId(String processId) ;

	public long getTimeElapsed() ;
	
	public abstract void runProcess ();
}
