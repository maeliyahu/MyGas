package controllers;

import gui.*;
import java.util.ArrayList;

import javax.swing.JPanel;

public  class FormController {
	protected static JPanel display;
	protected static  FormController owner;
	

	/**
	 * this method show the return values from DB on specific panel
	 * @param toGui- the values to show on panel
	 */
	 static public  void returnToGui(ArrayList<String> toGui){
		FormPanel toShow=(FormPanel)display;
		toShow.displayAnswer(toGui);
	}
	
	/**
	 * this method update who is the panel for showing return values from DB
	 * @param dis-in this panel we show the results from DB
	 */
	static public void set(JPanel dis){
		display=dis;
	}
}
