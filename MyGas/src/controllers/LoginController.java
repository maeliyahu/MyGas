package controllers;

import gui.DisplayAble;
import gui.FormPanel;
import gui.Login;

import java.io.IOException;
import java.util.ArrayList;

import ClientServ.*;

import javax.swing.JPanel;

public class LoginController extends FormController {
	public static String password;
	public final static int id = 1;
	//**** need to change*/
	public static Login check;
	public LoginController (){
		FormController.owner=this;
	}
	static public void logintoDB(ArrayList<String> resultset ,Login dis){
		//set(dis);
		check=dis;
		password=resultset.get(1);
		resultset.add(0, "searchUserInDB");
		System.out.println(resultset);
		try{
		MyGasClient clientS=new MyGasClient("127.0.0.1",5555,(FormController)owner,id);
		clientS.setflag(id);
		clientS.handleMessageFromControllers(resultset);
		}
		catch(IOException e){}
	}
	
	
	 static public  void displayAnswer(ArrayList<String> toGui){
		 System.out.println("here");
		 check.displayAnswer(toGui);
		if(toGui.get(1).equals(password)){
		check.displayAnswer(toGui);
		}
		else{
			toGui.add(0, "null");
		}
			
	}

	
}
