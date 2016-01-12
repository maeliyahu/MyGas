package controllers;

import java.io.IOException;
import java.util.ArrayList;

import gui.*;

import javax.swing.JPanel;

import ClientServ.MyGasClient;

public class ClientComtroller extends FormController {

	public final static int id = 2;
	/**
	 * this method request from DB the client's orders
	 * @param resultset - the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void FollowOrder(ArrayList<String> resultset ,JPanel dis){
		set(dis);
		resultset.add(0, "name of mathod");

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
	 * By this method we save the client order in DB for tracking and approve.
	 * @param resultset- the number of requested order
	 * @param dis - in this panel we show the results from DB
	 */
	static public void OrderFuel(ArrayList<String> resultset ,JPanel dis){
		set(dis);
		resultset.add(0, "addHomeSaleToDB");
		System.out.println(resultset);		
		/*Test only*/
		ArrayList<String> toClient=new ArrayList<String>();
		toClient.add("Good");
		returnToGui(toClient);
		/*Test only*/
		try{
		MyGasClient clientS=new MyGasClient("127.0.0.1",5555,(FormController)owner,id);
		clientS.setflag(id);
		clientS.handleMessageFromControllers(resultset);
		}
		catch(IOException e){}

	}
	static public void RequestOrders(ArrayList<String> resultset ,JPanel dis){
		set(dis);
		resultset.add(0, "clientOrders");
		System.out.println(resultset);		
	}
	
	public void displayAnswer(ArrayList<String> toGui){
		
	}
	

}
