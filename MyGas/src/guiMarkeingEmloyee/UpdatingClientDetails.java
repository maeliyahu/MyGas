package guiMarkeingEmloyee;

import gui.*;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import com.toedter.components.JSpinField;

import controllers.MarketingEmployeeController;

import javax.swing.JCheckBox;
import javax.swing.JTree;

public class UpdatingClientDetails extends FormPanel {
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
	private JLabel lblFuelCompany;
	private JButton btnDone;
	protected ArrayList <String> toController;
	private JSpinField mounthSpin;
	private JSpinField yearSpin;
	private JLabel label_1;
	private JLabel label_2;
	private JComboBox typeComboBox;
	private JComboBox accessPlanComboBox;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxDelek;
	private JCheckBox chckbxSonol;
	private JCheckBox chckbxAlonit;
	private JComboBox chckbxPlanType;
	
	/**
	 * this method create the Updating Client Details panel
	 * @param frame - the main window frame that containing the panels
	 * @param panelback - the previous panel
	 */
	public UpdatingClientDetails(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Updating Client Details");
		path.setText("Login/Marketing Employee window/Updating Client Details");
		
		textField_0 = new JTextField();
		textField_0.setBounds(139, 91, 226, 24);
		add(textField_0);
		textField_0.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 121, 226, 24);
		add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 181, 226, 24);
		add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(139, 241, 226, 24);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(139, 271, 226, 24);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(539, 91, 217, 24);
		add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(539, 151, 217, 24);
		add(textField_9);
		
		label = new JLabel("Id number:");
		label.setForeground(new Color(255, 255, 204));
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBackground(new Color(255, 255, 204));
		label.setBounds(23, 92, 84, 20);
		add(label);
		
		lblName = new JLabel("Name:");
		lblName.setForeground(new Color(255, 255, 204));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBackground(new Color(255, 255, 204));
		lblName.setBounds(23, 122, 84, 20);
		add(lblName);
		
		lblPlanTypeId = new JLabel("Plan Type:");
		lblPlanTypeId.setForeground(new Color(255, 255, 204));
		lblPlanTypeId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlanTypeId.setBackground(new Color(255, 255, 204));
		lblPlanTypeId.setBounds(23, 152, 106, 24);
		add(lblPlanTypeId);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 204));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBackground(new Color(255, 255, 204));
		lblPassword.setBounds(23, 182, 84, 20);
		add(lblPassword);
		
		lblType = new JLabel("type:");
		lblType.setForeground(new Color(255, 255, 204));
		lblType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblType.setBackground(new Color(255, 255, 204));
		lblType.setBounds(23, 212, 84, 20);
		add(lblType);
		
		typeComboBox = new JComboBox();
		typeComboBox.setBackground(new Color(255, 255, 204));
		typeComboBox.setBounds(139, 212, 226, 23);
		typeComboBox.addItem("Private Client");
		typeComboBox.addItem("Company Client");
		add(typeComboBox);
		
		
		lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(255, 255, 204));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBackground(new Color(255, 255, 204));
		lblEmail.setBounds(23, 242, 84, 20);
		add(lblEmail);
		
		lblVechileAmount = new JLabel("Vechile Amount:");
		lblVechileAmount.setForeground(new Color(255, 255, 204));
		lblVechileAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVechileAmount.setBackground(new Color(255, 255, 204));
		lblVechileAmount.setBounds(23, 271, 106, 24);
		add(lblVechileAmount);
		
		lblCreditCardNumber = new JLabel("Credit Card Number:");
		lblCreditCardNumber.setForeground(new Color(255, 255, 204));
		lblCreditCardNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardNumber.setBackground(new Color(255, 255, 204));
		lblCreditCardNumber.setBounds(398, 91, 131, 24);
		add(lblCreditCardNumber);
		
		lblCreditCardValid = new JLabel("Credit Card Valid:");
		lblCreditCardValid.setForeground(new Color(255, 255, 204));
		lblCreditCardValid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardValid.setBackground(new Color(255, 255, 204));
		lblCreditCardValid.setBounds(398, 122, 131, 24);
		add(lblCreditCardValid);
		
		lblCreditCardCvv = new JLabel("Credit card cvv:");
		lblCreditCardCvv.setForeground(new Color(255, 255, 204));
		lblCreditCardCvv.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreditCardCvv.setBackground(new Color(255, 255, 204));
		lblCreditCardCvv.setBounds(398, 152, 131, 20);
		add(lblCreditCardCvv);
		
		lblAc = new JLabel("Access plan:");
		lblAc.setForeground(new Color(255, 255, 204));
		lblAc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAc.setBackground(new Color(255, 255, 204));
		lblAc.setBounds(398, 182, 84, 20);
		add(lblAc);
		
		lblFuelCompany = new JLabel("Fuel companies :");
		lblFuelCompany.setForeground(new Color(255, 255, 204));
		lblFuelCompany.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFuelCompany.setBackground(new Color(255, 255, 204));
		lblFuelCompany.setBounds(398, 212, 131, 24);
		add(lblFuelCompany);
		
		btnDone = new JButton("Done");

		btnDone.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDone.setBackground(new Color(255, 255, 204));
		btnDone.setBounds(23, 319, 730, 41);
		add(btnDone);
		
		
		
		mounthSpin = new JSpinField();
		mounthSpin.setBackground(new Color(255, 255, 204));
		mounthSpin.setMinimum(1);
		mounthSpin.setMaximum(12);
		mounthSpin.setBounds(603, 121, 43, 22);
		//mounthSpin.setValue(5); //we need to change it to the date from DB
		add(mounthSpin);
		
		yearSpin = new JSpinField();
		yearSpin.setBackground(new Color(255, 255, 204));
		yearSpin.setMinimum(16);
		yearSpin.setMaximum(26);
		yearSpin.setBounds(713, 121, 43, 22);
		//yearSpin.setValue(5); //we need to change it to the date from DB
		add(yearSpin);
		
		label_1 = new JLabel("Month:");
		label_1.setForeground(new Color(255, 255, 204));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBackground(new Color(255, 255, 204));
		label_1.setBounds(539, 122, 60, 20);
		add(label_1);
		
		label_2 = new JLabel("Year:");
		label_2.setForeground(new Color(255, 255, 204));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBackground(new Color(255, 255, 204));
		label_2.setBounds(658, 122, 43, 20);
		add(label_2);
		
		accessPlanComboBox = new JComboBox();
		accessPlanComboBox.setBackground(new Color(255, 255, 204));
		accessPlanComboBox.setBounds(539, 182, 214, 23);
		accessPlanComboBox.addItem("Exclusive");
		accessPlanComboBox.addItem("Multi");
		//accessPlanComboBox.setSelectedItem("Multi");; //we need to change it to the date from DB

		add(accessPlanComboBox);
		
		chckbxNewCheckBox = new JCheckBox("Paz");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 204));
		chckbxNewCheckBox.setBounds(539, 229, 89, 24);
		//chckbxNewCheckBox.setSelected(true); need to add from DB
		add(chckbxNewCheckBox);
		
		chckbxDelek = new JCheckBox("Delek");
		chckbxDelek.setBackground(new Color(255, 255, 204));
		chckbxDelek.setBounds(655, 229, 98, 25);
		//setSelected(true); need to add from DB
		add(chckbxDelek);
		
		chckbxSonol = new JCheckBox("Sonol");
		chckbxSonol.setBackground(new Color(255, 255, 204));
		chckbxSonol.setBounds(539, 270, 89, 25);
		//setSelected(true); need to add from DB
		add(chckbxSonol);
		
		chckbxAlonit = new JCheckBox("Alonit");
		chckbxAlonit.setBackground(new Color(255, 255, 204));
		chckbxAlonit.setBounds(655, 270, 98, 25);
		// setSelected(true); need to add from DB
		add(chckbxAlonit);
		
		chckbxPlanType = new JComboBox();
		chckbxPlanType.setBackground(new Color(255, 255, 204));
		chckbxPlanType.setBounds(138, 151, 227, 23);
		chckbxPlanType.addItem("Occasionally fueling");
		chckbxPlanType.addItem("Mounthly subscription 1 vehicle");
		chckbxPlanType.addItem("Mounthly subscription several vehicles");
		chckbxPlanType.addItem("Full mounthly subscription");
		//chckbxPlanType.setSelectedItem("Full mounthly subscription"); //get from DB 
		add(chckbxPlanType);
		
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toController=new ArrayList<String>();
				boolean flag=true;
				String valid = null;
				//ID number
				String input = textField_0.getText();
				try
				{
					textField_0.setForeground(Color.BLACK);
					int inputNum = Integer.parseInt(input);
					
					//add if to check in DB 
					
				}
				catch(NumberFormatException e1)
				{
					textField_0.setText("Error");
					textField_0.setForeground(Color.RED);
					flag=false;
				}
				
				// Vechile amount
				input = textField_6.getText();
				try
				{
					textField_6.setForeground(Color.BLACK);
					int inputNum = Integer.parseInt(input);
					if( inputNum<=0 )
						throw new NumberFormatException();
					// limit the cars?
					
				}
				catch(NumberFormatException e1)
				{
					textField_6.setText("Error");
					textField_6.setForeground(Color.RED);
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
					
					//checking
					System.out.println(mount+" "+year);
					
					
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
				//valid card
				int mount= mounthSpin.getValue();
				int year= yearSpin.getValue();
				valid=String.valueOf(mount);
				valid=valid.concat("/");
				valid=valid.concat(String.valueOf(year));
				
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
					MarketingEmployeeController.updateClientDetails(toController, owner);
					
				} //end if
			}// end action
		});
		
		



	}
}
