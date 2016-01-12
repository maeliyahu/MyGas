package controllers;

import java.util.ArrayList;

import javax.swing.JPanel;

public class NFCController extends FormController  {
	public final static int id = 6;

	/**
	 * This method insert to DB the "sale" from NFC
	 * @param resultset - the NFC details, and quantity
	 * @param dis the panel who called this method
	 */
	public static void fuelingFromNFC (ArrayList<String> resultset,JPanel dis){
		set(dis);
		resultset.add(0, "name of mathod");
		System.out.println(resultset);
		
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
