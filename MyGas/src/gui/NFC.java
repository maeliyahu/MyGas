package gui;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import controllers.NFCController;

public class NFC extends FormPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblPleaseWaitUntil;
	private JLabel lblNfcNumber;
	private JLabel lblUantity;
	private Image nfc;
	private JLabel lblYouCanReturn;
	/**
	 * Create the panel.
	 */
	public NFC(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("NFC Simulation Window");
		path.setText("Login/NFC Simulation Window");
		

		
		
		JButton button = new JButton("OK");

		button.setBackground(new Color(255, 255, 204));
		button.setBounds(147, 176, 267, 44);
		add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(147, 107, 267, 26);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 139, 267, 26);
		add(textField_1);
		
		lblNfcNumber = new JLabel("NFC Number:");
		lblNfcNumber.setForeground(new Color(255, 255, 204));
		lblNfcNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNfcNumber.setBackground(new Color(255, 255, 204));
		lblNfcNumber.setBounds(33, 109, 104, 23);
		add(lblNfcNumber);
		
		lblUantity = new JLabel("Fuel Quantity:");
		lblUantity.setForeground(new Color(255, 255, 204));
		lblUantity.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUantity.setBackground(new Color(255, 255, 204));
		lblUantity.setBounds(33, 140, 104, 25);
		add(lblUantity);
		
		
		nfc=new ImageIcon(this.getClass().getResource("/nfc.png")).getImage();
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(nfc));
		label.setBounds(264, 0, 40, 50);
		add(label);
		
		lblPleaseWaitUntil = new JLabel("Please wait until finish fueling...");
		lblPleaseWaitUntil.setForeground(new Color(255, 255, 204));
		lblPleaseWaitUntil.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPleaseWaitUntil.setBackground(new Color(255, 255, 204));
		lblPleaseWaitUntil.setBounds(287, 280, 295, 25);
		add(lblPleaseWaitUntil);
		lblPleaseWaitUntil.setVisible(false);
		
		lblYouCanReturn = new JLabel("You can return the pump now");
		lblYouCanReturn.setForeground(new Color(255, 255, 204));
		lblYouCanReturn.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYouCanReturn.setBackground(new Color(255, 255, 204));
		lblYouCanReturn.setBounds(287, 318, 295, 25);
		add(lblYouCanReturn);
		lblYouCanReturn.setVisible(false);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText();
				try
				{
					textField.setForeground(Color.BLACK);
					int inputNum = Integer.parseInt(input);
			
					
				}
				catch(NumberFormatException e1)
				{
					textField.setText("Error");
					textField.setForeground(Color.RED);
				}
				String input2 = textField_1.getText();
				try
				{
					textField_1.setForeground(Color.BLACK);
					int inputNum = Integer.parseInt(input);
					if( inputNum <=0)
						throw new NumberFormatException();
					//add if to check in DB 
					ArrayList<String> toController=new ArrayList<String>();
					toController.add(input);
					toController.add(input2);
					lblPleaseWaitUntil.setVisible(true);
					//add if to check in DB 
					NFCController.fuelingFromNFC(toController, owner);
					//lblPleaseWaitUntil.setVisible(false);
					//lblYouCanReturn.setVisible(true);
				}
				catch(NumberFormatException e1)
				{
					textField_1.setText("Error");
					textField_1.setForeground(Color.RED);
				}
				
			}
		});

	}
	
	
	public void displayAnswer(ArrayList<String> resultset) {}
}
