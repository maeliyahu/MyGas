package controllers;

import java.util.ArrayList;

public class MarketingMngController {

	/**
	 * this method send request to change plan price 
	 * @param resultset - the change plan price request details plan name, new discount
	 */
	static public void planPriceChangeRequest(ArrayList<String> resultset)
	{
		
		//method name
		resultset.add(0, "PlanesPriceChangeRequest"); //need to add method in DB
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * This method get the plan price requested from DB
	 * @return the [lan price requsers list
	 */
	static public ArrayList<String> getPlanPriceChangeRequests()
	{
		
		ArrayList<String> reqList = new ArrayList<String>();
		//add  getChangePriceRequests method
		return reqList;
		
	}
	
	static public void updatePlanPrice(ArrayList<String> resultset)
	{
		
		//method name
		resultset.add(0, "approveChangePriceRequests"); // ??? is this the method?
		System.out.println(resultset);
		//sent to client
	}
}
