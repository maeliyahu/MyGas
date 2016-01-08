package controllers;

import java.util.ArrayList;

public class AdministratorController {
	
	
	/**
	 * this method send request to define a campaign pattern and save the customer rating in DB
	 * @param resultset - the campaign pattern details id, approved or rejected etc...
	 */
	static public void SendRequestRespond(ArrayList<String> resultset)
	{
		
		//method name
		resultset.add(0, "approveChangePriceRequests");
		//sent to client
	}

}
