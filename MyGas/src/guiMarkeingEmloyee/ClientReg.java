package guiMarkeingEmloyee;
import controllers.MarketingEmployeeController;
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

import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JCalendar;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
public class ClientReg extends FormPanel {
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
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
	private JButton btnDone;
	protected ArrayList <String> toController;
	private JLabel lblM;
	private JLabel lblYear;
	private JComboBox typeComboBox;
	private JComboBox accessPlanComboBox;
	private JLabel label_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxDelek;
	private JCheckBox chckbxSonol;
	private JCheckBox chckbxAlonit;
	private JComboBox chckbxPlanType;
	

	/**
	 * this method create the Client registration panel
	 * @param frame - the main window frame that containing the panels
	 * @param panelback - the previous panel
	 */
	public ClientReg(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Client registration");
		path.setText("Login/Marketing Employee window/Client registration");
		
		//id
		textField_0 = new JTextField();
		textField_0.setBounds(145, 91, 227, 24);
		add(textField_0);
		textField_0.setColumns(10);
		
		//name
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 121, 227, 24);
		add(textField_1);
		
		//password
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(145, 181, 227, 24);
		add(textField_3);
		
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(145, 241, 227, 24);
		add(textField_5);
		
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(145, 271, 227, 24);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(536, 91, 217, 24);
		add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(536, 151, 217, 24);
		add(textField_9);
		
		label = new JLabel("Id number:");
		label.setForeground(new Color(255, 255, 204));
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBackground(new Color(255, 255, 204));
		label.setBounds(29, 92, 84, 20);
		add(label);
		
		lblName = new JLabel("Name:");
		lblName.setForeground(new Color(255, 255, 204));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBackground(new Color(255, 255, 204));
		lblName.setBounds(29, 122, 84, 20);
		add(lblName);
		
		lblPlanTypeId = new JLabel("Plan Type:");
		lblPlanTypeId.setForeground(new Color(255, 255, 204));
		lblPlanTypeId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlanTypeId.setBackground(new Color(255, 255, 204));
		lblPlanTypeId.setBounds(29, 152, 106, 24);
		add(lblPlanTypeId);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 204));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBackground(new Color(255, 255, 204));
		lblPassword.setBounds(29, 182, 84, 20);
		add(lblPassword);
		
		lblType = new JLabel("type:");
		lblType.setForeground(new Color(255, 255, 204));
		lblType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblType.setBackground(new Color(255, 255, 204));
		lblType.setBounds(29, 212, 84, 20);
		add(lblType);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(255, 255, 204));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBackground(new Color(255, 255, 204));
		lblEmail.setBounds(29, 242, 84, 20);
		add(lblEmail);
		
		lblVechileAmount = new JLabel("Vechile Amount:");
		lblVechileAmount.setForeground(new Color(255, 255, 204));
		lblVechileAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVechileAmount.setBackground(new Color(255, 255, 204));
		lblVechileAmount.setBounds(29, 271, 106, 24);
		add(lblVechileAmount);
		
		lblCreditCardNumber = new JLabel("Credit Card Number:");
		lblCreditCardNumber.setForeground(new Color(255, 255, 204));
		lblCreditCardNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardNumber.setBackground(new Color(255, 255, 204));
		lblCreditCardNumber.setBounds(395, 91, 131, 24);
		add(lblCreditCardNumber);
		
		lblCreditCardValid = new JLabel("Credit Card Valid:");
		lblCreditCardValid.setForeground(new Color(255, 255, 204));
		lblCreditCardValid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardValid.setBackground(new Color(255, 255, 204));
		lblCreditCardValid.setBounds(395, 122, 131, 24);
		add(lblCreditCardValid);
		
		lblCreditCardCvv = new JLabel("Credit card cvv:");
		lblCreditCardCvv.setForeground(new Color(255, 255, 204));
		lblCreditCardCvv.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardCvv.setBackground(new Color(255, 255, 204));
		lblCreditCardCvv.setBounds(395, 152, 131, 20);
		add(lblCreditCardCvv);
		
		lblAc = new JLabel("Access plan:");
		lblAc.setForeground(new Color(255, 255, 204));
		lblAc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAc.setBackground(new Color(255, 255, 204));
		lblAc.setBounds(395, 182, 84, 20);
		add(lblAc);
		
		btnDone = new JButton("Done");

		btnDone.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDone.setBackground(new Color(255, 255, 204));
		btnDone.setBounds(29, 319, 724, 41);
		add(btnDone);
		
		JSpinField mounthSpin = new JSpinField();
		mounthSpin.setMaximum(12);
		mounthSpin.setMinimum(1);
		mounthSpin.setBounds(600, 121, 43, 22);
		add(mounthSpin);
		
		JSpinField yearSpin = new JSpinField();
		yearSpin.setMaximum(26);
		yearSpin.setMinimum(16);
		yearSpin.setBounds(710, 121, 43, 22);
		add(yearSpin);
		
		lblM = new JLabel("Month:");
		lblM.setForeground(new Color(255, 255, 204));
		lblM.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblM.setBackground(new Color(255, 255, 204));
		lblM.setBounds(536, 122, 60, 20);
		add(lblM);
		
		lblYear = new JLabel("Year:");
		lblYear.setForeground(new Color(255, 255, 204));
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYear.setBackground(new Color(255, 255, 204));
		lblYear.setBounds(655, 122, 43, 20);
		add(lblYear);
		
		typeComboBox = new JComboBox();
		typeComboBox.setBackground(new Color(255, 255, 204));
		typeComboBox.setBounds(145, 212, 227, 23);
		typeComboBox.addItem("Private Client");
		typeComboBox.addItem("Company Client");
		add(typeComboBox);
		
		accessPlanComboBox = new JComboBox();
		accessPlanComboBox.setBackground(new Color(255, 255, 204));
		accessPlanComboBox.setBounds(536, 182, 214, 23);
		accessPlanComboBox.addItem("Exclusive");
		accessPlanComboBox.addItem("Multi");
		add(accessPlanComboBox);
		
		label_1 = new JLabel("Fuel companies :");
		label_1.setForeground(new Color(255, 255, 204));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBackground(new Color(255, 255, 204));
		label_1.setBounds(395, 213, 131, 24);
		add(label_1);
		
		chckbxNewCheckBox = new JCheckBox("Paz");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 204));
		chckbxNewCheckBox.setBounds(536, 230, 95, 24);
		add(chckbxNewCheckBox);
		
		chckbxDelek = new JCheckBox("Delek");
		chckbxDelek.setBackground(new Color(255, 255, 204));
		chckbxDelek.setBounds(658, 230, 95, 25);
		add(chckbxDelek);
		
		chckbxSonol = new JCheckBox("Sonol");
		chckbxSonol.setBackground(new Color(255, 255, 204));
		chckbxSonol.setBounds(536, 270, 95, 25);
		add(chckbxSonol);
		
		chckbxAlonit = new JCheckBox("Alonit");
		chckbxAlonit.setBackground(new Color(255, 255, 204));
		chckbxAlonit.setBounds(655, 270, 98, 25);
		add(chckbxAlonit);
		
		chckbxPlanType = new JComboBox();
		chckbxPlanType.setBackground(new Color(255, 255, 204));
		chckbxPlanType.setBounds(145, 152, 227, 23);
		chckbxPlanType.addItem("Occasionally fueling"); //only 1 car
		chckbxPlanType.addItem("Mounthly subscription 1 vehicle");//only 1 car
		chckbxPlanType.addItem("Mounthly subscription several vehicles");
		chckbxPlanType.addItem("Full mounthly subscription"); //only 1 car
		add(chckbxPlanType);
		
		
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valid = null;
				
				boolean flag=true;
				
				//ID number
				String input = textField_0.getText();
				try
				{
					textField_0.setForeground(Color.BLACK);
					int inputNum = Integer.parseInt(input);
					
				}
				catch(NumberFormatException e1)
				{
					textField_0.setText("Error");
					textField_0.setForeground(Color.RED);
					flag=false;
				}
				
			
				
				// credit card number
				input = textField_7.getText();
				try
				{
					textField_7.setForeground(Color.BLACK);
					long inputNum = Long.parseLong(input);
					
				}
				catch(NumberFormatException e1)
				{
					textField_7.setText("Error");
					textField_7.setForeground(Color.RED);
					flag=false;
				}
				
				// cvv
				input = textField_9.getText();
				try
				{
					int mount= mounthSpin.getValue();
					int year= yearSpin.getValue();
					valid=String.valueOf(mount);
					valid=valid.concat("/");
					valid=valid.concat(String.valueOf(year));
					
					//checking
					System.out.println("Valid:"+valid);
					//send to server
					
					textField_9.setForeground(Color.BLACK);
					int inputNum = Integer.parseInt(input);
					if(input.length() != 3 || inputNum<0 )
						throw new NumberFormatException();
					
				}
				catch(NumberFormatException e1)
				{
					textField_9.setText("Error");
					textField_9.setForeground(Color.RED);
					flag=false;
				}
				
				
				
				//Client type
				String typeInput = typeComboBox.getSelectedItem().toString();
				System.out.println(typeInput);
				
				//Access plan 
				String accessInput = accessPlanComboBox.getSelectedItem().toString();
				System.out.println(accessInput);
				
				//fuel companies
				int numOfSelectedCompenis=0;
				if(chckbxNewCheckBox.isSelected())
					numOfSelectedCompenis++;
				if(chckbxDelek.isSelected())
					numOfSelectedCompenis++;
				if(chckbxSonol.isSelected())
					numOfSelectedCompenis++;
				if(chckbxAlonit.isSelected())
					numOfSelectedCompenis++;
				
				// Exclusive can choose only 1 company
				if(accessInput.equals("Exclusive") && numOfSelectedCompenis>1)
				{
					System.out.println("Can't choose more then 1 company");
					flag=false;
					
				}
				
				// Multi can choose up to 3 companies
				if(accessInput.equals("Multi") && numOfSelectedCompenis>3)
				{
					System.out.println("Can't choose more then 3 companies");
					flag=false;
				}
				//sent to server the details
				
				
				// Vechile amount
				input = textField_6.getText();
				String planInput = chckbxPlanType.getSelectedItem().toString();
				if(planInput.equals("Mounthly subscription several vehicles"))
				{
					
					try
					{
						textField_6.setForeground(Color.BLACK);
						int inputNum = Integer.parseInt(input);
						if( inputNum<1 )
							throw new NumberFormatException();

					}
					catch(NumberFormatException e1)
					{
						textField_6.setText("Error");
						textField_6.setForeground(Color.RED);
						flag=false;
					}
				}
				else 
				{
					try
					{
						textField_6.setForeground(Color.BLACK);
						int inputNum = Integer.parseInt(input);
						if( inputNum!=1 )
							throw new NumberFormatException();

					}
					catch(NumberFormatException e1)
					{
						textField_6.setText("Error");
						textField_6.setForeground(Color.RED);
						flag=false;
					}
				}
				textField_5.setForeground(Color.BLACK);
				String email=textField_5.getText();
				if( !email.contains("@"))
				{
					textField_5.setText("Error");
					textField_5.setForeground(Color.RED);
					flag=false;
				}
				
				//can send to the controller
				if (flag)
				{
					toController=new ArrayList<String>();
					//method name
					//toController.add("");
					//id
					toController.add(textField_0.getText());
					//name
					toController.add(textField_1.getText());
					//plan type
					toController.add(planInput);
					//password
					toController.add(textField_3.getText());
					//type
					toController.add(typeInput);
					//email
					toController.add(email);
					// vechile amount
					toController.add(textField_6.getText());
					//credit card number 
					toController.add(textField_7.getText());
					// credit card valid 
					toController.add(valid);
					//cvv
					toController.add(textField_9.getText());
					//access plan
					toController.add(accessInput);
					
					// fuel company
					if(chckbxNewCheckBox.isSelected())
						toController.add(chckbxNewCheckBox.getText());
					if(chckbxDelek.isSelected())
						toController.add(chckbxDelek.getText());
					if(chckbxSonol.isSelected())
						toController.add(chckbxSonol.getText());
					if(chckbxAlonit.isSelected())
						toController.add(chckbxAlonit.getText());
					
					while(toController.size() < 14)
						toController.add(null);

					// cheking
					//System.out.print(toController);
					MarketingEmployeeController.addClient(toController, owner);
				}
				
			}//end action
		});

	}
}
