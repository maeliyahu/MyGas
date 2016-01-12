package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;

import ClientServ.MyGasClient;

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
		System.out.println("controller" + resultset);
		
		/*send to ClientServer8*/
		try{
		MyGasClient clientS=new MyGasClient("127.0.0.1",5555,(FormController)owner,id);
		clientS.setflag(id);
		clientS.handleMessageFromControllers(resultset);
		}
		catch(IOException e){}	
	}

	
	/**
	 * this method request the fuel orders details
	 * @param resultset - the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void RequestOrders(ArrayList<String> resultset, JPanel dis){
		set(dis);
		resultset.add(0, "getOrderDetails");
		System.out.println("controller" +resultset);
		
		/*send to ClientServer
		try{
		MyGasClient clientS=new MyGasClient("127.0.0.1",5555,(FormController)owner,id);
		clientS.setflag(id);
		clientS.handleMessageFromControllers(resultset);
		}
		catch(IOException e){}	
		/*send to ClientServer*/
	}
	
	/**
	 * ??t
	 * @param resultset - the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void ApproveFuelOrder(ArrayList<String> resultset, JPanel dis){
		set(dis);
		resultset.add(0, "the method");
		System.out.println("controller" +resultset);
		
		/*send to ClientServer
		try{
		MyGasClient clientS=new MyGasClient("127.0.0.1",5555,(FormController)owner,id);
		clientS.setflag(id);
		clientS.handleMessageFromControllers(resultset);
		}
		catch(IOException e){}	
		/*send to ClientServer*/
	}
	

}
