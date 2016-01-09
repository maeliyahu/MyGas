package guimarketingMng;

import java.awt.Color;
import java.awt.Font;

import gui.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import controllers.MarketingMngController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlanesPriceChangeRequest extends FormPanel {
	private JComboBox chckbxPlanType;
	private JLabel lblPlanTypeId;
	private JTextField discountText;
	private JButton btnSendRequest;
	private JLabel lblInsertNewDiscount;
	private JLabel lblTheRequestSent;
	/**
	 * Create the panel.
	 */
	public PlanesPriceChangeRequest(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Planes Price Change Request Window");
		path.setText("Login/marketing Manager/Planes Price Change Request");
		
		
		lblPlanTypeId = new JLabel("Choose Plan Type:");
		lblPlanTypeId.setForeground(new Color(255, 255, 204));
		lblPlanTypeId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlanTypeId.setBackground(new Color(255, 255, 204));
		lblPlanTypeId.setBounds(217, 152, 124, 24);
		add(lblPlanTypeId);
		
		
		chckbxPlanType = new JComboBox();

		chckbxPlanType.setBackground(new Color(255, 255, 204));
		chckbxPlanType.setBounds(346, 153, 227, 23);
		chckbxPlanType.addItem("Occasionally fueling"); //only 1 car
		chckbxPlanType.addItem("Mounthly subscription 1 vehicle");//only 1 car
		chckbxPlanType.addItem("Mounthly subscription several vehicles");
		chckbxPlanType.addItem("Full mounthly subscription"); //only 1 car
		add(chckbxPlanType);
		
		lblInsertNewDiscount = new JLabel("Insert New Discount:");
		lblInsertNewDiscount.setForeground(new Color(255, 255, 204));
		lblInsertNewDiscount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInsertNewDiscount.setBackground(new Color(255, 255, 204));
		lblInsertNewDiscount.setBounds(217, 198, 145, 24);
		add(lblInsertNewDiscount);
		
		discountText = new JTextField();
		
		discountText.setBounds(367, 199, 206, 22);
		add(discountText);
		discountText.setColumns(10);
		
		btnSendRequest = new JButton("Send Request");
		btnSendRequest.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSendRequest.setBackground(new Color(255, 255, 204));
		btnSendRequest.setBounds(300, 258, 170, 41);
		add(btnSendRequest);
		
		lblTheRequestSent = new JLabel("The request sent successfully");
		lblTheRequestSent.setForeground(new Color(255, 255, 204));
		lblTheRequestSent.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTheRequestSent.setBounds(281, 342, 239, 27);
		add(lblTheRequestSent);
		lblTheRequestSent.setVisible(false);
		
		btnSendRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 discountText.setForeground(Color.BLACK);
				 String plan=chckbxPlanType.getSelectedItem().toString();
				 String discount = discountText.getText();
				 try{
					 int dis=Integer.parseInt(discount);
					 if(dis<0 || dis>100)
						 throw new NumberFormatException ();
					 ArrayList<String> toController = new ArrayList<String>();
					 toController.add(plan);
					 toController.add(discount);
					 MarketingMngController.planPriceChangeRequest(toController);
					 lblTheRequestSent.setVisible(true);
					 
				 }
				 catch(NumberFormatException e1)
				 {
					 discountText.setText("Error");
					 discountText.setForeground(Color.RED);
				 }
				
			}
		});
		chckbxPlanType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTheRequestSent.setVisible(false);
			}
		});
		discountText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				lblTheRequestSent.setVisible(false);
			}
		});
	

	} // end constructor
}
