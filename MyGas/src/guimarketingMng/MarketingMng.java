package guimarketingMng;

import gui.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class MarketingMng extends FormPanel {

	/**
	 * Create the panel.
	 */
	public MarketingMng(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Marketing Manager Window");
		path.setText("Login/marketing Manager Window");
		btnBack.setText("Logout");
		
		
   /*"Choose an Option"
    *  "Update maximum fuel price"
    *  "Planes Price change request" 
    *  "Update planes price"
    *   "Activate campaign pattern"
    *   "Produce a respond report of marketing campaign"
    *   "Produce a period customer characterization report"*/

		

	}

}