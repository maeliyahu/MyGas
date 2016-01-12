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
		//send to client
	}
}
