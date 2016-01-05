package guimarketingMng;

import gui.*;
import guiClient.FollowOrder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class MarketingMng extends FormPanel {

	/**
	 * Create the panel.
	 */
	public MarketingMng(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Marketing Manager Window");
		path.setText("Login/marketing Manager Window");
		btnBack.setText("Logout");
		
		JButton btnPlanesPriceChange = new JButton("Planes Price Change Request");

		btnPlanesPriceChange.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPlanesPriceChange.setBackground(new Color(255, 255, 204));
		btnPlanesPriceChange.setBounds(225, 145, 291, 41);
		add(btnPlanesPriceChange);
		
		JButton btnUpdateMaximumFuel = new JButton("Update Maximum Fuel Price");

		btnUpdateMaximumFuel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdateMaximumFuel.setBackground(new Color(255, 255, 204));
		btnUpdateMaximumFuel.setBounds(225, 94, 291, 41);
		add(btnUpdateMaximumFuel);
		
		JButton btnActivateCampaignPattern = new JButton("Activate Campaign Pattern");

		btnActivateCampaignPattern.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnActivateCampaignPattern.setBackground(new Color(255, 255, 204));
		btnActivateCampaignPattern.setBounds(225, 249, 291, 41);
		add(btnActivateCampaignPattern);
		
		JButton btnUpdatePlanesPrice = new JButton("Update Planes Price");

		btnUpdatePlanesPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdatePlanesPrice.setBackground(new Color(255, 255, 204));
		btnUpdatePlanesPrice.setBounds(225, 197, 291, 41);
		add(btnUpdatePlanesPrice);
		
		JButton btnCharacterizationReport = new JButton("Characterization Report");

		btnCharacterizationReport.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCharacterizationReport.setBackground(new Color(255, 255, 204));
		btnCharacterizationReport.setBounds(225, 352, 291, 41);
		add(btnCharacterizationReport);
		
		JButton btnRespondReportOf = new JButton("Respond Report Of Marketing Campaign");

		btnRespondReportOf.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRespondReportOf.setBackground(new Color(255, 255, 204));
		btnRespondReportOf.setBounds(225, 301, 291, 40);
		add(btnRespondReportOf);
		
		
   /*"Choose an Option"
    *  "Update maximum fuel price"
    *  "Planes Price change request" 
    *  "Update planes price"
    *   "Activate campaign pattern"
    *   "Produce a respond report of marketing campaign"
    *   "Produce a period customer characterization report"*/
		btnUpdateMaximumFuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateMaximumFuelPrice update=new UpdateMaximumFuelPrice(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(update);
				update.setVisible(true);
			}
		});
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

}
