package controllers;

import java.util.ArrayList;

import javax.swing.JPanel;

public class AdministratorController extends FormController {
	public final static int id = 3;
	public AdministratorController(){
		FormController.owner=this;
	}
	
	/**
	 * this method send request to define a campaign pattern and save the customer rating in DB
	 * @param resultset - the campaign pattern details id etc...
	 *  @param dis the panel who called this method
	 */
	static public void SendRequestRespond(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "approveChangePriceRequests");
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * this method send request to get inventory report
	 * @param resultset - the inventory report details year and quarter
	 *  @param dis the panel who called this method
	 */
	static public void SendRequestInventoryReport(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "searchInventoryQReport"); 
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * this method send request to get Income report
	 * @param resultset - the Income report details year and quarter
	 *  @param dis the panel who called this method
	 */
	static public void SendRequestIncomeReport(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "searchIncomeQReport");
		System.out.println(resultset);
		//sent to client
	}
	
	/**
	 * this method send request to get Purchase report
	 * @param resultset - the Purchase report details year and quarter
	 *  @param dis the panel who called this method
	 */
	static public void SendRequestPurchaseReport(ArrayList<String> resultset,JPanel dis)
	{
		set(dis);
		//method name
		resultset.add(0, "searchPurchaseQReport"); 
		System.out.println(resultset);
		//sent to client
	}

}
