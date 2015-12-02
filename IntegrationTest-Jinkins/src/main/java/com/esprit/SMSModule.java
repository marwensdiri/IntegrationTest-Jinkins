package com.esprit;


/**
 * 
 * @author marwen
 *
 */

public interface SMSModule {
	
	
	/**
	 * 
	 * @param number
	 * @param message
	 */
	void send(String number,String message);
    Boolean isReady();

}
