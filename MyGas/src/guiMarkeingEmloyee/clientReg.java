package guiMarkeingEmloyee;

import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.*;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class clientReg extends formPanel {
	private JTextField textField_0;
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
	private JLabel label;
	private JLabel lblName;
	private JLabel lblPlanTypeId;
	private JLabel lblPassword;
	private JLabel lblType;
	private JLabel lblEmail;
	private JLabel lblVechileAmount;
	private JLabel lblCreditCardNumber;
	private JLabel lblCreditCardValid;
	private JLabel lblCreditCardCvv;
	private JLabel lblAc;
	private JLabel lblFuelCompany;
	private JLabel lblFuelCompany_1;
	private JLabel lblFuelCompany_2;
	private JButton btnDone;
	protected ArrayList <String> login=new ArrayList();

	/**
	 * Create the panel.
	 */
	public clientReg(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Client registration");
		path.setText("Login/Marketing Employee window/Client registration");
		
		textField_0 = new JTextField();
		textField_0.setBounds(167, 91, 170, 24);
		add(textField_0);
		textField_0.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(167, 121, 170, 24);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 151, 170, 24);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(167, 181, 170, 24);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(167, 211, 170, 24);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(167, 241, 170, 24);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(167, 271, 170, 24);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(583, 91, 170, 24);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(583, 121, 170, 24);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(583, 151, 170, 24);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(583, 181, 170, 24);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(583, 211, 170, 24);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(583, 241, 170, 24);
		add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(583, 271, 170, 24);
		add(textField_13);
		
		label = new JLabel("Id number:");
		label.setForeground(new Color(255, 255, 204));
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBackground(new Color(255, 255, 204));
		label.setBounds(51, 92, 84, 20);
		add(label);
		
		lblName = new JLabel("Name:");
		lblName.setForeground(new Color(255, 255, 204));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBackground(new Color(255, 255, 204));
		lblName.setBounds(51, 122, 84, 20);
		add(lblName);
		
		lblPlanTypeId = new JLabel("Plan Type ID:");
		lblPlanTypeId.setForeground(new Color(255, 255, 204));
		lblPlanTypeId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlanTypeId.setBackground(new Color(255, 255, 204));
		lblPlanTypeId.setBounds(51, 152, 106, 24);
		add(lblPlanTypeId);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 204));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBackground(new Color(255, 255, 204));
		lblPassword.setBounds(51, 182, 84, 20);
		add(lblPassword);
		
		lblType = new JLabel("type:");
		lblType.setForeground(new Color(255, 255, 204));
		lblType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblType.setBackground(new Color(255, 255, 204));
		lblType.setBounds(51, 212, 84, 20);
		add(lblType);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(255, 255, 204));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBackground(new Color(255, 255, 204));
		lblEmail.setBounds(51, 242, 84, 20);
		add(lblEmail);
		
		lblVechileAmount = new JLabel("Vechile Amount:");
		lblVechileAmount.setForeground(new Color(255, 255, 204));
		lblVechileAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVechileAmount.setBackground(new Color(255, 255, 204));
		lblVechileAmount.setBounds(51, 271, 106, 24);
		add(lblVechileAmount);
		
		lblCreditCardNumber = new JLabel("Credit Card Number:");
		lblCreditCardNumber.setForeground(new Color(255, 255, 204));
		lblCreditCardNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardNumber.setBackground(new Color(255, 255, 204));
		lblCreditCardNumber.setBounds(442, 91, 131, 24);
		add(lblCreditCardNumber);
		
		lblCreditCardValid = new JLabel("Credit Card Valid:");
		lblCreditCardValid.setForeground(new Color(255, 255, 204));
		lblCreditCardValid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardValid.setBackground(new Color(255, 255, 204));
		lblCreditCardValid.setBounds(442, 122, 131, 24);
		add(lblCreditCardValid);
		
		lblCreditCardCvv = new JLabel("Credit card cvv:");
		lblCreditCardCvv.setForeground(new Color(255, 255, 204));
		lblCreditCardCvv.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardCvv.setBackground(new Color(255, 255, 204));
		lblCreditCardCvv.setBounds(442, 152, 131, 20);
		add(lblCreditCardCvv);
		
		lblAc = new JLabel("Access plan:");
		lblAc.setForeground(new Color(255, 255, 204));
		lblAc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAc.setBackground(new Color(255, 255, 204));
		lblAc.setBounds(442, 182, 84, 20);
		add(lblAc);
		
		lblFuelCompany = new JLabel("Fuel company 1 :");
		lblFuelCompany.setForeground(new Color(255, 255, 204));
		lblFuelCompany.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFuelCompany.setBackground(new Color(255, 255, 204));
		lblFuelCompany.setBounds(442, 212, 131, 24);
		add(lblFuelCompany);
		
		lblFuelCompany_1 = new JLabel("Fuel company 2 :");
		lblFuelCompany_1.setForeground(new Color(255, 255, 204));
		lblFuelCompany_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFuelCompany_1.setBackground(new Color(255, 255, 204));
		lblFuelCompany_1.setBounds(442, 242, 117, 24);
		add(lblFuelCompany_1);
		
		lblFuelCompany_2 = new JLabel("Fuel company 3 :");
		lblFuelCompany_2.setForeground(new Color(255, 255, 204));
		lblFuelCompany_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFuelCompany_2.setBackground(new Color(255, 255, 204));
		lblFuelCompany_2.setBounds(442, 272, 117, 23);
		add(lblFuelCompany_2);
		
		btnDone = new JButton("Done");

		btnDone.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDone.setBackground(new Color(255, 255, 204));
		btnDone.setBounds(51, 320, 702, 41);
		add(btnDone);
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.add(textField_0.getText());
				login.add(textField_1.getText());
				login.add(textField_2.getText());
				login.add(textField_3.getText());
				login.add(textField_4.getText());
				login.add(textField_5.getText());
				login.add(textField_6.getText());
				login.add(textField_7.getText());
				login.add(textField_8.getText());
				login.add(textField_9.getText());
				login.add(textField_10.getText());
				login.add(textField_11.getText());
				login.add(textField_12.getText());
				login.add(textField_13.getText());
				for(int i=0;i<login.size();i++)
					System.out.print(" " + login.get(i));
				
				
			}
		});

	}
}
