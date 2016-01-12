package controllers;

import java.util.ArrayList;

import javax.swing.JPanel;

public class StationMngController extends FormController {
	public final static int id = 7;
	/**
	 * this method send to DB the required quarterly date report
	 * @param resultset - the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void ProduceQuarterlyReports(ArrayList<String> resultset, JPanel dis){
		set(dis);
		resultset.add(0, "produceQuarterlyReports");
		System.out.println(resultset);
		//call to "send Massage to server" in client class
	}
	/**
	 * this method determining the Threshold of specific gas type
	 * @param resultset - the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void DeterminingThreshold(ArrayList<String> resultset, JPanel dis){
		set(dis);
		resultset.add(0, "setFuelTreshold");
		System.out.println(resultset);
		//call to "send Massage to server" in client class
	}
	
	/**
	 * this method request the fuel orders details
	 * @param resultset - the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void RequestOrders(ArrayList<String> resultset, JPanel dis){
		set(dis);
		resultset.add(0, "getOrderDetails");
		System.out.println(resultset);
		//call to "send Massage to server" in client class		
	}
	
	/**
	 * ??t
	 * @param resultset - the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void ApproveFuelOrder(ArrayList<String> resultset, JPanel dis){
		set(dis);
		resultset.add(0, "the method");
		System.out.println(resultset);
		//call to "send Massage to server" in client class
	}
	

}
