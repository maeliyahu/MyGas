package guiAdministrator;

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

public class Administrator extends formPanel {

	/**
	 * Create the panel.
	 */
	public Administrator(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Administrator Window");
		path.setText("Login/Administrator Window");
		

		/*"Choose an Option"
		 * "Send response"
		 * "Watch Quarterly Reports" */

		
	}
}
