package controllers;

import java.util.ArrayList;

public class MarketingEmployeeController {
	static private Long campaginID=(long) 0;
	
	
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
	/**
	 * this method send request to define a campaign pattern and save the customer rating in DB
	 * @param resultset - the campaign pattern details id, etc...
	 */
	static public void defineCampaginPattern(ArrayList<String> resultset)
	{
		campaginID++;
		//method name
		resultset.add(0, "insertCampingPattenToDB");
		resultset.add(1, campaginID.toString());
		//sent to client
	}
	
}
