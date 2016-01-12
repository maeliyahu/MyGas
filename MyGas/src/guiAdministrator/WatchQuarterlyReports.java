package guiAdministrator;

import gui.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JLabel;

public class WatchQuarterlyReports extends FormPanel {
	private JButton btnIncomesReport;
	private JButton btnPurchasReport;
	private JButton btnInventoryReport;
	private JLabel lblIncomesReport;
	private JLabel lblPurchasReport;
	

	/**
	 * Create the panel.
	 */
	public WatchQuarterlyReports(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Watch Quarterly Reports Window");
		path.setText("Login/Administrator Window/Watch Quarterly Reports");
		
		btnIncomesReport = new JButton("Incomes report");
		
		btnIncomesReport.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnIncomesReport.setBackground(new Color(255, 255, 204));
		btnIncomesReport.setBounds(265, 149, 240, 40);
		add(btnIncomesReport);
		
		btnPurchasReport = new JButton("Purchase report");
	
		btnPurchasReport.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPurchasReport.setBackground(new Color(255, 255, 204));
		btnPurchasReport.setBounds(265, 215, 240, 40);
		add(btnPurchasReport);
		
		btnInventoryReport = new JButton("Inventory report");

		btnInventoryReport.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnInventoryReport.setBackground(new Color(255, 255, 204));
		btnInventoryReport.setBounds(265, 284, 240, 40);
		add(btnInventoryReport);
		
	
		

		btnIncomesReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncomesReport incomesReport= new IncomesReport(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(incomesReport);
				incomesReport.setVisible(true);
				
			}
		});
		
		btnPurchasReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PurchasReport purchasReport= new PurchasReport(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(purchasReport);
				purchasReport.setVisible(true);
			}
		});
		
		btnInventoryReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryReport inventoryReport= new InventoryReport(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(inventoryReport);
				inventoryReport.setVisible(true);
			}
		});
	}
	public void displayAnswer(ArrayList<String> resultset) {}
}
