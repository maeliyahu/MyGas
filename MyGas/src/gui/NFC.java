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

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NFC extends FormPanel {
	private JTextField textField;
	private JTextField textField_1;
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
		
		JLabel lblNfcNumber = new JLabel("NFC Number:");
		lblNfcNumber.setForeground(new Color(255, 255, 204));
		lblNfcNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNfcNumber.setBackground(new Color(255, 255, 204));
		lblNfcNumber.setBounds(33, 109, 104, 23);
		add(lblNfcNumber);
		
		JLabel lblUantity = new JLabel("Fuel Quantity:");
		lblUantity.setForeground(new Color(255, 255, 204));
		lblUantity.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUantity.setBackground(new Color(255, 255, 204));
		lblUantity.setBounds(33, 140, 104, 25);
		add(lblUantity);
		
		
		Image nfc=new ImageIcon(this.getClass().getResource("/nfc.png")).getImage();
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(nfc));
		label.setBounds(264, 0, 40, 50);
		add(label);
		setVisible(false);

	}

}
