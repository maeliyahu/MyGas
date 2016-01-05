package gui;

import guiStationManager.*;
import guiAdministrator.*;
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
import java.util.ArrayList;


public class Login {
	
	public JFrame frame;
	private JTextField Idnumber;
	private JTextField Passwrd;
	private JPanel panel;
	private JComboBox TypeOfPerson;
	private JLabel loginlabel;
	private JButton ok;
	private JLabel lblIdNumber;
	private JButton FastFuel;
	private Image speed;
	private JLabel lblPassword;
	private JLabel EmptyField;
	private ArrayList <String> login;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		//frame.getContentPane().add(tr);
		String[] login= { "Client", "Marketing Employee", "Marketing Manager","Administrator","Station Manager"  };
		frame = new JFrame("My Fuel");
		frame.setBounds(100, 100, 830, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setResizable(false);
		
		/*##### first Window #####*/
		panel = new JPanel();
		panel.setBackground(Color.darkGray);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setVisible(true);
		
		TypeOfPerson = new JComboBox(login);
		TypeOfPerson.setBackground(new Color(255, 255, 204));
		TypeOfPerson.setBounds(263, 116, 267, 20);
		panel.add(TypeOfPerson);
		
		loginlabel = new JLabel("Login");
		loginlabel.setBackground(new Color(255, 255, 204));
		loginlabel.setForeground(new Color(255, 255, 204));
		loginlabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		loginlabel.setBounds(10, 9, 71, 26);
		panel.add(loginlabel);	
	
		ok = new JButton("OK");
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
		
		lblIdNumber = new JLabel("Id number:");
		lblIdNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdNumber.setBackground(new Color(255, 255, 204));
		lblIdNumber.setForeground(new Color(255, 255, 204));
		lblIdNumber.setBounds(169, 54, 84, 20);
		panel.add(lblIdNumber);
		
		FastFuel = new JButton("Fast Fuelling");

		speed=new ImageIcon(this.getClass().getResource("/speed.png")).getImage();
		FastFuel.setIcon( new ImageIcon(speed));
		FastFuel.setBackground(new Color(255, 255, 204));
		FastFuel.setFont(new Font("Tahoma", Font.BOLD, 17));
		FastFuel.setForeground(Color.BLACK);
		FastFuel.setBounds(263, 311, 267, 91);
		panel.add(FastFuel);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 204));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBackground(new Color(255, 255, 204));
		lblPassword.setBounds(169, 85, 84, 20);
		panel.add(lblPassword);
		
		EmptyField = new JLabel();		
		EmptyField.setText("Empty Field or Inncorrect Password");
		EmptyField.setForeground(new Color(255, 255, 204));
		EmptyField.setBounds(227, 200, 267, 20);
		/*##### first Window #####*/
		
		
		

		
		
		

		
		
		/*##### Setting Window #####*/
		final Setting set=new Setting(frame,panel);
		frame.getContentPane().add(set);
		JButton btSetting = new JButton("Setting");
		btSetting.setBackground(new Color(255, 255, 204));
		btSetting.setBounds(725, 15, 89, 23);
		panel.add(btSetting);
		/*##### Setting Window #####*/	
		
		
		/*##### marketing Manager Window #####*/
		final MarketingMng marketMng=new MarketingMng(frame,panel);
		frame.getContentPane().add(marketMng);	
		/*##### marketing Manager Window #####*/
		
		/*##### NFC window #####*/
		final NFC nfc=new NFC(frame,panel);
		frame.getContentPane().add(nfc);	
		/*##### NFC window #####*/		
		
		

		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//login=searchUserInDB(Idnumber.getText())   

					if(Idnumber.getText().equals("")){

						panel.add(EmptyField);
						panel.setVisible(false);
						panel.setVisible(true);
						
						
					}
					else 
					{
						String input = Idnumber.getText();
						try
						{
							Idnumber.setForeground(Color.BLACK);
							int inputNum = Integer.parseInt(input);
							
							//add if to check in DB 
							
						}
						catch(NumberFormatException e1)
						{
							Idnumber.setText("Error");
							Idnumber.setForeground(Color.RED);
						}
						
					}
					
					
				/*##### Client Window #####*/
				 if(TypeOfPerson.getSelectedItem().toString().equals("Client")){
					/*##### over here  we need to put the client gui
					 * Check here the id client in client table*/

						final Client cl=new Client(frame,panel);
						addPanel(cl);
						//add if to check in DB 
					 if(Passwrd.getText().equals("1234")){
						 panel.setVisible(false);
						 panel.remove(EmptyField);
						 //Client.setVisible(false);
						 cl.setVisible(true);
					 }
				}
				/*##### Client Window #####*/	 
				 
				 
				/*##### Employee Window #####*/
				if(TypeOfPerson.getSelectedItem().toString().equals("Marketing Employee")){
					final MarkeingEmloyee mrkEmp=new MarkeingEmloyee(frame,panel);
					frame.getContentPane().add(mrkEmp);
					panel.setVisible(false);
					panel.remove(EmptyField);
					mrkEmp.setVisible(true);
				}
				/*##### Employee Window #####*/
				
				
				/*##### Employee Window #####*/
				if(TypeOfPerson.getSelectedItem().toString().equals("Marketing Manager")){
					final MarketingMng mrkMng=new MarketingMng(frame,panel);
					frame.getContentPane().add(mrkMng);
					panel.setVisible(false);
					panel.remove(EmptyField);
					mrkMng.setVisible(true);
				}
				/*##### Employee Window #####*/
				
				
				/*##### Administrator Window #####*/
				if(TypeOfPerson.getSelectedItem().toString().equals("Administrator")){
					final Administrator admin=new Administrator(frame,panel);
					frame.getContentPane().add(admin);
					panel.setVisible(false);
					panel.remove(EmptyField);
					admin.setVisible(true);
				}
				/*##### Administrator Window #####*/
				
				
				/*##### Station Manager Window #####*/
				if(TypeOfPerson.getSelectedItem().toString().equals("Station Manager")){
					final StationManager stationMng=new StationManager(frame,panel);
					frame.getContentPane().add(stationMng);
					panel.setVisible(false);
					panel.remove(EmptyField);
					stationMng.setVisible(true);
				}
				/*##### Station Manager Window #####*/
				
				
			}
		});
		
		btSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel.remove(EmptyField);
				set.setVisible(true);
				
			}
		});
		

		
		FastFuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				nfc.setVisible(true);
			}
		});

	}
	/**
	 * This method adding a panel to the frame
	 * @param toAdd - the pannel to add
	 */
	public void addPanel(JPanel toAdd){
		frame.getContentPane().add(toAdd);	
	}
}
