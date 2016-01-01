package guiStationManager;

import gui.*;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class stationManager extends formPanel {

	/**
	 * Create the panel.
	 */
	public stationManager(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Station Manager Window");
		path.setText("Login/Station Manager Window");
		
		/*"Choose an Option"
		 *  "Insert fuel stock"
		 *  "Determining the threshold level for receiving alert"
		 *  "Approve fuel order","Produce Quarterly Reports" */

		
		
	}

}
