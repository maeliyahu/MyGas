package controllers;

import gui.FormPanel;

import java.util.ArrayList;

import javax.swing.JPanel;

public class MarketingEmployeeController extends FormController {
	static private Long campaginID=(long) 0;
	
	
	/**
	 * this method send request to add a client to DB
	 * @param resultset - the client details id,name, etc...
	 *  @param dis the panel who called this method
	 */
	static public void addClient(ArrayList<String> resultset, JPanel dis)
	{
		set(dis);
		
		//method name
		resultset.add(0, "addClientToDB");
		System.out.println(resultset);
		//sent to client
		
	}
	/**
	 * this method send request to update a client details in DB
	 * @param resultset - the client details id,name, etc...
	 *  @param dis the panel who called this method
	 */
	static public void updateClientDetails(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "updateClient");
		System.out.println(resultset);
		//sent to client
	}
	/**
	 * this method send request to calculate and save the customer rating in DB
	 *  @param dis the panel who called this method
	 */
	static public void produceCustomerRatingInDB(JPanel dis)
	{
		set(dis);
		ArrayList<String> resultset = new ArrayList<String>();
		//method name
		resultset.add(0, "calcRating");
		System.out.println(resultset);
		//sent to client
	}
	/**
	 * this method send request to define a campaign pattern and save the customer rating in DB
	 * @param resultset - the campaign pattern details id, etc...
	 *  @param dis the panel who called this method
	 */
	static public void defineCampaginPattern(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		campaginID++;
		//method name
		resultset.add(0, "insertCampingPattenToDB");
		resultset.add(1, campaginID.toString());
		System.out.println(resultset);
		//sent to client
	}
	
}
