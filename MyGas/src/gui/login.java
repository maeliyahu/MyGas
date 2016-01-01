package gui;
import guiClient.*;
import guiMarkeingEmloyee.MarkeingEmloyee;
import guimarketingMng.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.CardLayout;

import javax.swing.JTextPane;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JDesktopPane;

import java.awt.FlowLayout;

import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

import java.awt.Image;


public class login {
	
	public JFrame frame;
	private JTextField Idnumber;
	private JTextField Passwrd;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		//frame.getContentPane().add(tr);
		String[] login= { "Client", "Employee" };
		frame = new JFrame("My Fuel");
		frame.setBounds(100, 100, 830, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setResizable(false);
		
		/*##### first Window #####*/
		final JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setVisible(true);
		
		final JComboBox TypeOfPerson = new JComboBox(login);
		TypeOfPerson.setBackground(new Color(255, 255, 204));
		TypeOfPerson.setBounds(263, 116, 267, 20);
		panel.add(TypeOfPerson);
		
		JLabel loginlabel = new JLabel("Login");
		loginlabel.setBackground(new Color(255, 255, 204));
		loginlabel.setForeground(new Color(255, 255, 204));
		loginlabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		loginlabel.setBounds(10, 9, 71, 26);
		panel.add(loginlabel);	
	
		JButton ok = new JButton("OK");
		ok.setBackground(new Color(255, 255, 204));
		ok.setBounds(263, 147, 267, 44);
		panel.add(ok);
		
		Idnumber = new JTextField();
		Idnumber.setBounds(263, 52, 267, 26);
		panel.add(Idnumber);
		Idnumber.setColumns(10);
		
		Passwrd = new JTextField();
		Passwrd.setColumns(10);
		Passwrd.setBounds(263, 84, 267, 26);
		panel.add(Passwrd);
		
		JLabel lblIdNumber = new JLabel("Id number:");
		lblIdNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdNumber.setBackground(new Color(255, 255, 204));
		lblIdNumber.setForeground(new Color(255, 255, 204));
		lblIdNumber.setBounds(169, 54, 84, 20);
		panel.add(lblIdNumber);
		
		JButton FastFuel = new JButton("Fast Fuelling");

		Image speed=new ImageIcon(this.getClass().getResource("/speed.png")).getImage();
		FastFuel.setIcon( new ImageIcon(speed));
		FastFuel.setBackground(new Color(255, 255, 204));
		FastFuel.setFont(new Font("Tahoma", Font.BOLD, 17));
		FastFuel.setForeground(Color.BLACK);
		FastFuel.setBounds(263, 311, 267, 91);
		panel.add(FastFuel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 204));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBackground(new Color(255, 255, 204));
		lblPassword.setBounds(169, 85, 84, 20);
		panel.add(lblPassword);
		
		final JLabel EmptyField = new JLabel();		
		EmptyField.setText("Empty Field or Inncorrect Password");
		EmptyField.setForeground(new Color(255, 255, 204));
		EmptyField.setBounds(227, 200, 267, 20);
		/*##### first Window #####*/
		
		
		
		/*##### Client Window #####*/
		final client cl=new client(frame,panel);
		addPanel(cl);
		/*##### Client Window #####*/
		
		
		
		/*##### Employee Window #####*/
		final MarkeingEmloyee mrkEmp=new MarkeingEmloyee(frame,panel);
		frame.getContentPane().add(mrkEmp);
		/*##### Employee Window #####*/
		
		
		/*##### Setting Window #####*/
		final setting set=new setting(frame,panel);
		frame.getContentPane().add(set);
		JButton btSetting = new JButton("Setting");
		btSetting.setBackground(new Color(255, 255, 204));
		btSetting.setBounds(725, 15, 89, 23);
		panel.add(btSetting);
		/*##### Setting Window #####*/	
		
		
		/*##### marketing Manager Window #####*/
		final marketingMng marketMng=new marketingMng(frame,panel);
		frame.getContentPane().add(marketMng);	
		/*##### marketing Manager Window #####*/
		
		/*##### NFC window #####*/
		final NFC nfc=new NFC(frame,panel);
		frame.getContentPane().add(nfc);	
		/*##### NFC window #####*/		
		
		

		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					if(Idnumber.getText().equals("")){

						panel.add(EmptyField);
						panel.setVisible(false);
						panel.setVisible(true);
						
						
					}
					
				
				 if(TypeOfPerson.getSelectedItem().toString().toString().equals("Client")){
					/*##### over here  we need to put the client gui
					 * Check here the id client in client table*/
					 if(Passwrd.getText().equals("1234")){
						 panel.setVisible(false);
						 panel.remove(EmptyField);
						 //Client.setVisible(false);
						 cl.setVisible(true);
					 }
						 
				
				}
				if(TypeOfPerson.getSelectedItem().toString().toString().equals("Employee")){
				/*####  over here  we need to put the Employee gui
				 *  Check here the id Employee in Employee  table*/
					panel.setVisible(false);
					panel.remove(EmptyField);
					mrkEmp.setVisible(true);

			}
			}
		});
		
		btSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel.remove(EmptyField);
				set.setVisible(true);
				
			}
		});
		
		/*btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				Employee.setVisible(false);
				Client.setVisible(false);
			}
		});
		
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				Employee.setVisible(false);
				Client.setVisible(false);
			}
		});*/
		
		FastFuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				nfc.setVisible(true);
			}
		});

	}
	public void addPanel(JPanel toAdd){
		frame.getContentPane().add(toAdd);	
	}
}
