package guiMarkeingEmloyee;

import gui.*;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class updatingClientDetails extends formPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Create the panel.
	 */
	
	public updatingClientDetails(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Updating client details");
		path.setText("Login/Marketing Employee Window/Updating client details");
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(167, 100, 170, 24);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(167, 130, 170, 24);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 160, 170, 24);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(167, 190, 170, 24);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(167, 220, 170, 24);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(167, 250, 170, 24);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(167, 280, 170, 24);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(583, 100, 170, 24);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(583, 130, 170, 24);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(583, 160, 170, 24);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(583, 190, 170, 24);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(583, 220, 170, 24);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(583, 250, 170, 24);
		add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(583, 280, 170, 24);
		add(textField_13);
		
		JLabel label = new JLabel("Id number:");
		label.setForeground(new Color(255, 255, 204));
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBackground(new Color(255, 255, 204));
		label.setBounds(51, 101, 84, 20);
		add(label);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setForeground(new Color(255, 255, 204));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBackground(new Color(255, 255, 204));
		label_1.setBounds(51, 131, 84, 20);
		add(label_1);
		
		JLabel label_2 = new JLabel("Plan Type ID:");
		label_2.setForeground(new Color(255, 255, 204));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBackground(new Color(255, 255, 204));
		label_2.setBounds(51, 161, 106, 24);
		add(label_2);
		
		JLabel label_3 = new JLabel("Password:");
		label_3.setForeground(new Color(255, 255, 204));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBackground(new Color(255, 255, 204));
		label_3.setBounds(51, 191, 84, 20);
		add(label_3);
		
		JLabel label_4 = new JLabel("type:");
		label_4.setForeground(new Color(255, 255, 204));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBackground(new Color(255, 255, 204));
		label_4.setBounds(51, 221, 84, 20);
		add(label_4);
		
		JLabel label_5 = new JLabel("Email:");
		label_5.setForeground(new Color(255, 255, 204));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_5.setBackground(new Color(255, 255, 204));
		label_5.setBounds(51, 251, 84, 20);
		add(label_5);
		
		JLabel label_6 = new JLabel("Vechile Amount:");
		label_6.setForeground(new Color(255, 255, 204));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_6.setBackground(new Color(255, 255, 204));
		label_6.setBounds(51, 280, 106, 24);
		add(label_6);
		
		JLabel label_7 = new JLabel("Credit Card Number:");
		label_7.setForeground(new Color(255, 255, 204));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBackground(new Color(255, 255, 204));
		label_7.setBounds(442, 100, 131, 24);
		add(label_7);
		
		JLabel label_8 = new JLabel("Credit Card Valid:");
		label_8.setForeground(new Color(255, 255, 204));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_8.setBackground(new Color(255, 255, 204));
		label_8.setBounds(442, 131, 131, 24);
		add(label_8);
		
		JLabel label_9 = new JLabel("Credit card cvv:");
		label_9.setForeground(new Color(255, 255, 204));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_9.setBackground(new Color(255, 255, 204));
		label_9.setBounds(442, 161, 131, 20);
		add(label_9);
		
		JLabel label_10 = new JLabel("Access plan:");
		label_10.setForeground(new Color(255, 255, 204));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBackground(new Color(255, 255, 204));
		label_10.setBounds(442, 191, 84, 20);
		add(label_10);
		
		JLabel label_11 = new JLabel("Fuel company 1 :");
		label_11.setForeground(new Color(255, 255, 204));
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBackground(new Color(255, 255, 204));
		label_11.setBounds(442, 221, 131, 24);
		add(label_11);
		
		JLabel label_12 = new JLabel("Fuel company 2 :");
		label_12.setForeground(new Color(255, 255, 204));
		label_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_12.setBackground(new Color(255, 255, 204));
		label_12.setBounds(442, 251, 117, 24);
		add(label_12);
		
		JLabel label_13 = new JLabel("Fuel company 3 :");
		label_13.setForeground(new Color(255, 255, 204));
		label_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_13.setBackground(new Color(255, 255, 204));
		label_13.setBounds(442, 281, 117, 23);
		add(label_13);
		
		JButton button = new JButton("Done");
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(51, 329, 702, 41);
		add(button);
		


	}

}
