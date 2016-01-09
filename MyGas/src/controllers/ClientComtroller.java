package controllers;

import java.util.ArrayList;

import gui.*;

import javax.swing.JPanel;

public class ClientComtroller extends FormController  {

	
	/**
	 * this method request from DB the client's orders
	 * @param resultset - the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void FollowOrder(ArrayList<String> resultset ,JPanel dis){
		set(dis);
		resultset.add(0, "name of mathod");
		//sent to client
	}
	
	/**
	 * By this method we save the client order in DB for tracking and approve.
	 * @param resultset- the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void OrderFuel(ArrayList<String> resultset ,JPanel dis){
		set(dis);
		resultset.add(0, "name of mathod");
		System.out.println(resultset);		
		/*Test only*/
		ArrayList<String> toClient=new ArrayList<String>();
		toClient.add("Good");
		returnToGui(toClient);
		/*Test only*/

	}

	

}
