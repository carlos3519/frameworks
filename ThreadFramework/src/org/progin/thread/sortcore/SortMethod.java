package org.progin.thread.sortcore;

import org.progin.thread.core.NativeGUIProcess;


public abstract class SortMethod extends NativeGUIProcess{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double[] arr;
	
	public SortMethod(double [] arr) {
		this.arr = arr;
	}
	
	public void swap (int i , int j) throws Exception{
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		Thread.sleep(500);
	}
}
