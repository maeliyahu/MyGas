package controllers;

import java.util.ArrayList;

import javax.swing.JPanel;

public class MarketingMngController extends FormController {

	/**
	 * this method send request to change plan price 
	 * @param resultset - the change plan price request details plan name, new discount
	 *  @param dis the panel who called this method
	 */
	static public void planPriceChangeRequest(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "PlanesPriceChangeRequest"); //need to add method in DB
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * This method get the plan price requested from DB
	 * @return the plan price requests list
	 *  @param dis the panel who called this method
	 */
	static public ArrayList<String> getPlanPriceChangeRequests(JPanel dis)
	{
		set(dis);
		ArrayList<String> reqList = new ArrayList<String>();
		//add  getChangePriceRequests method
		return reqList;
		
	}
	/**
	 * This method update the plan price in DB
	 * @param resultset - the plan price details plan name, new discount etc...
	 *  @param dis the panel who called this method
	 */
	static public void updatePlanPrice(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "approveChangePriceRequests"); // ??? is this the method?
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * This method update the campaign pattern in DB to activate
	 * @param resultset the campaign pattern number
	 *  @param dis the panel who called this method
	 */
	static public void activateCampingPatten(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "activateCampingPatten"); // 
		System.out.println(resultset);
		//sent to client
	}
	/**
	 * This method create a marketing campaign report in DB
	 * @param resultset - the marketing campaign ID
	 *  @param dis the panel who called this method
	 */
	static public void marketingCampaignReport(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "campaignReport");
		System.out.println(resultset);
		//sent to client
	}
	
	static public void createCharacterizationReport(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		String type=resultset.get(0);
		switch(type)
		{
			case("Incomes report"):
				resultset.add(0, "produceIncomeQReport");
			break;
			case("Purchase report"):
				resultset.add(0, "producePurchasesQReport");
			break;
			case("Inventory report"):
				resultset.add(0, "produceInventoryQReport");
			break;
		}
		System.out.println(resultset);
		//sent to client
	}
}
