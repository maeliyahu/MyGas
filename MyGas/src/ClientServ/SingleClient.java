package ClientServ;

import gui.DisplayAble;

import java.io.IOException;

import controllers.FormController;
import controllers.LoginController;

public class SingleClient {
	   private static MyGasClient instance = null;
	   protected SingleClient() {
	      // Exists only to defeat instantiation.
	   }
	   public static MyGasClient getInstance(String host, int port, LoginController control) {
	      if(instance == null) {
	    	  try{
	 	         instance = new MyGasClient( host,  port,  control,0);	  
	    	  }
	    	  catch (IOException e){}
	      }
	      return instance;
	   }
}
