package guimarketingMng;

import gui.*;
import guiClient.FollowOrder;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
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

public class MarketingMng extends FormPanel {

	/**
	 * Create the panel.
	 */
	public MarketingMng(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Marketing Manager");
		path.setText("Login/Marketing Manager");
		btnBack.setText("Logout");
		
		JButton btnPlanesPriceChange = new JButton("Planes Price Change Request");

		btnPlanesPriceChange.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPlanesPriceChange.setBackground(new Color(255, 255, 204));
		btnPlanesPriceChange.setBounds(223, 111, 308, 41);
		add(btnPlanesPriceChange);
		
		JButton btnActivateCampaignPattern = new JButton("Activate Campaign Pattern");

		btnActivateCampaignPattern.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnActivateCampaignPattern.setBackground(new Color(255, 255, 204));
		btnActivateCampaignPattern.setBounds(223, 215, 308, 41);
		add(btnActivateCampaignPattern);
		
		JButton btnUpdatePlanesPrice = new JButton("Update Planes Price");

		btnUpdatePlanesPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdatePlanesPrice.setBackground(new Color(255, 255, 204));
		btnUpdatePlanesPrice.setBounds(223, 163, 308, 41);
		add(btnUpdatePlanesPrice);
		
		JButton btnCharacterizationReport = new JButton("Characterization Report");

		btnCharacterizationReport.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCharacterizationReport.setBackground(new Color(255, 255, 204));
		btnCharacterizationReport.setBounds(223, 318, 308, 41);
		add(btnCharacterizationReport);
		
		JButton btnRespondReportOf = new JButton("Respond Report Of Marketing Campaign");

		btnRespondReportOf.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRespondReportOf.setBackground(new Color(255, 255, 204));
		btnRespondReportOf.setBounds(223, 267, 308, 40);
		add(btnRespondReportOf);
		
		JLabel name = new JLabel("");
		name.setBounds(80, 38, 46, 14);
		add(name);
		
		Image clientPic=new ImageIcon(this.getClass().getResource("/client.png")).getImage();
		JLabel clientIcon = new JLabel();
		clientIcon.setIcon(new ImageIcon(clientPic));
		clientIcon.setBounds(662, 372, 128, 128);
		add(clientIcon);
		btnPlanesPriceChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlanesPriceChangeRequest request=new PlanesPriceChangeRequest(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(request);
				request.setVisible(true);
			}
		});
		btnUpdatePlanesPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdatePlanesPrice update=new UpdatePlanesPrice(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(update);
				update.setVisible(true);
			}
		});
		btnActivateCampaignPattern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActivateCampaignPattern active=new ActivateCampaignPattern(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(active);
				active.setVisible(true);
			}
		});
		btnCharacterizationReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CharacterizationReport charact=new CharacterizationReport(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(charact);
				charact.setVisible(true);
			}
		});
		btnRespondReportOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RespondReportOfMarketingCampaign respond=new RespondReportOfMarketingCampaign(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(respond);
				respond.setVisible(true);
			}
		});
	}
	public void displayAnswer(ArrayList<String> resultset) {}
}
