package guiMarkeingEmloyee;

import gui.*;
import guiClient.FollowOrder;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MarkeingEmloyee extends FormPanel {

	/**
	 * Create the panel.
	 */
	public MarkeingEmloyee(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Marketing Employee Window");
		path.setText("Login/Marketing Employee");
		btnBack.setText("Logout");


		JButton btnUpdate = new JButton("Updating client details");

		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate.setBackground(new Color(255, 255, 204));
		btnUpdate.setBounds(282, 92, 245, 41);
		add(btnUpdate);
		
		JButton btnRegistration = new JButton("Client registration");

		btnRegistration.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistration.setBackground(new Color(255, 255, 204));
		btnRegistration.setBounds(282, 143, 245, 41);
		add(btnRegistration);
		
		JButton btnRating = new JButton("Produce customer data rating");

		btnRating.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRating.setBackground(new Color(255, 255, 204));
		btnRating.setBounds(282, 195, 245, 41);
		add(btnRating);
		
		JButton btnPattern = new JButton("Campaign pattern defining");
	
		btnPattern.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPattern.setBackground(new Color(255, 255, 204));
		btnPattern.setBounds(282, 246, 245, 41);
		add(btnPattern);
		
		JLabel label = new JLabel();
		label.setBounds(662, 361, 128, 128);
		add(label);
		setVisible(false);
		Image clientPic=new ImageIcon(this.getClass().getResource("/client.png")).getImage();
		JLabel clientIcon = new JLabel();
		clientIcon.setIcon(new ImageIcon(clientPic));
		clientIcon.setBounds(662, 372, 128, 128);
		add(clientIcon);
		
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdatingClientDetails update=new UpdatingClientDetails(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(update);
				update.setVisible(true);
			}
		});
		
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientReg register=new ClientReg(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(register);
				register.setVisible(true);
			}
		});
	
		
		btnRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProduceCustomerRating rating=new ProduceCustomerRating(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(rating);
				rating.setVisible(true);
			}
		});
		
		btnPattern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CampaignPatternDefining patternDefine=new CampaignPatternDefining(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(patternDefine);
				patternDefine.setVisible(true);
			}
		});
	}
	public void displayAnswer(ArrayList<String> resultset) {}
}
