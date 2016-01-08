package controllers;

import java.util.ArrayList;

public class AdministratorController {
	
	
	/**
	 * this method send request to define a campaign pattern and save the customer rating in DB
	 * @param resultset - the campaign pattern details id etc...
	 */
	static public void SendRequestRespond(ArrayList<String> resultset)
	{
		
		//method name
		resultset.add(0, "approveChangePriceRequests");
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * this method send request to get inventory report
	 * @param resultset - the inventory report details year and quarter
	 */
	static public void SendRequestInventoryReport(ArrayList<String> resultset)
	{
		
		//method name
		resultset.add(0, "searchInventoryQReport"); 
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * this method send request to get Income report
	 * @param resultset - the Income report details year and quarter
	 */
	static public void SendRequestIncomeReport(ArrayList<String> resultset)
	{
		
		//method name
		resultset.add(0, "searchIncomeQReport");
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * this method send request to get Purchase report
	 * @param resultset - the Purchase report details year and quarter
	 */
	static public void SendRequestPurchaseReport(ArrayList<String> resultset)
	{
		
		//method name
		resultset.add(0, "searchPurchaseQReport"); 
		System.out.println(resultset);
		//sent to client
	}

}
