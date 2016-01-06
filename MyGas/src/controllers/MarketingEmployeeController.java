package controllers;

import java.util.ArrayList;

public class MarketingEmployeeController {
	
	
	
	/**
	 * this method send request to add a client to DB
	 * @param resultset - the client details id,name, etc...
	 */
	static public void addClient(ArrayList<String> resultset)
	{
		//method name
		resultset.add(0, "addClientToDB ");
		//sent to client
	}
	/**
	 * this method send request to update a client details in DB
	 * @param resultset - the client details id,name, etc...
	 */
	static public void updateClientDetails(ArrayList<String> resultset)
	{
		//method name
		resultset.add(0, "updateClient ");
		//sent to client
	}
	/**
	 * this method send request to calculate and save the customer rating in DB
	 */
	static public void produceCustomerRatingInDB()
	{
		ArrayList<String> resultset = new ArrayList<String>();
		//method name
		resultset.add(0, "calcRating");
		//sent to client
	}
	
}
