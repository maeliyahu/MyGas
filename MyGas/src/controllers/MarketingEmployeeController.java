package controllers;

import gui.FormPanel;

import java.util.ArrayList;

import javax.swing.JPanel;

public class MarketingEmployeeController {
	static private Long campaginID=(long) 0;
	private static JPanel display;
	
	/**
	 * this method send request to add a client to DB
	 * @param resultset - the client details id,name, etc...
	 */
	static public void addClient(ArrayList<String> resultset, JPanel dis)
	{
		display=dis;
		FormPanel t =(FormPanel) display;
		
		//method name
		resultset.add(0, "addClientToDB");
		System.out.println(resultset);
		//sent to client
		
	}
	/**
	 * this method send request to update a client details in DB
	 * @param resultset - the client details id,name, etc...
	 */
	static public void updateClientDetails(ArrayList<String> resultset)
	{
		//method name
		resultset.add(0, "updateClient");
		System.out.println(resultset);
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
		System.out.println(resultset);
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
		System.out.println(resultset);
		//sent to client
	}
	
}
