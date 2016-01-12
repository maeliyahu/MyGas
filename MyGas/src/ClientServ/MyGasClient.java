// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package ClientServ;

import ocsfClient.*;
import controllers.*;
import gui.DisplayAble;

import java.io.*;
import java.util.ArrayList;


/**
 * This class overrides some of the methods defined in the abstract
 * superclass in order to give more functionality to the client.
 */
public class MyGasClient extends AbstractClient
{
	//**** need to change*/
	
	
	public static FormController control;
	public static int flag;
  //Instance variables **********************************************
	
  /**
   * The interface type variable.  It allows the implementation of 
   * the display method in the client.
   */


  

  
  //Constructors ****************************************************
  
  public MyGasClient(String host, int port, FormController control ,int flag) throws IOException 
  {
    super(host, port); //Call the superclass constructor
    MyGasClient.flag=flag;
    this.control= control;
    openConnection();
	System.out.println(host+" "+port);
  }

  public void setControl(FormController control)
  {
	  this.control=control;
  }
  
  //Instance methods ************************************************
    
  /**
   * This method handles all data that comes in from the server.
   *
   * @param msg The message from the server.
   */
  public void handleMessageFromServer(Object msg) 
  {
	 System.out.println((ArrayList<String>)msg);
	 if (flag==LoginController.id ){
		 System.out.println("here");
		 LoginController logincontrol=(LoginController)control;
		 logincontrol.displayAnswer((ArrayList<String>)msg);
	 }
	 
  }

  /**
   * This method handles all data coming from the Controllers            
   *
   * @param message The message from the Controllers.    
   */
  public void handleMessageFromControllers(ArrayList<String> str) //the first element in array list will be the idMethod
  {
    try
    {
    	sendToServer(str);
    }
    catch(IOException e)
    {
      System.out.println("Could not send message to server.  Terminating client.");
      quit();
    }
  }
  
  /**
   * This method terminates the client.
   */
  public void quit()
  {
    try
    {
      closeConnection();
    }
    catch(IOException e) {}
    System.exit(0);
  }
  public void setflag(int flag){
	  this.flag=flag;
  }
}
//End of MyGasClient class
