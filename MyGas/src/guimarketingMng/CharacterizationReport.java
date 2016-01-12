package guimarketingMng;

import gui.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import controllers.MarketingMngController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CharacterizationReport extends FormPanel {
	private JLabel lblSelectAPeriod;
	private JComboBox comboBoxQurter;
	private JComboBox comboBoxYear;
	private JButton btnProduce;
	private JComboBox comboBoxReportType;
	private JLabel lblSelectAReport;
	private JLabel lblTheReportProduced;

	
	/**
	 * Create the panel.
	 */
	public CharacterizationReport(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Characterization Report");
		path.setText("Login/marketing Manager/Characterization Report");
		
		lblSelectAPeriod = new JLabel("Select a period:");
		lblSelectAPeriod.setForeground(new Color(255, 255, 204));
		lblSelectAPeriod.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectAPeriod.setBounds(243, 157, 124, 25);
		add(lblSelectAPeriod);
		
		comboBoxQurter = new JComboBox(new Object[]{});
		comboBoxQurter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTheReportProduced.setVisible(false);
			}
		});
		comboBoxQurter.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBoxQurter.setMaximumRowCount(3);
		comboBoxQurter.setBackground(new Color(255, 255, 204));
		comboBoxQurter.setBounds(431, 158, 67, 24);
		add(comboBoxQurter);
		
		comboBoxYear = new JComboBox(new Object[]{});
		comboBoxYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTheReportProduced.setVisible(false);
			}
		});
		comboBoxYear.setModel(new DefaultComboBoxModel(new String[] {"2015", "2014", "2013"}));
		comboBoxYear.setBackground(new Color(255, 255, 204));
		comboBoxYear.setBounds(533, 158, 67, 24);
		add(comboBoxYear);
		
		btnProduce = new JButton("Produce");
	
		btnProduce.setBackground(new Color(255, 255, 204));
		btnProduce.setBounds(243, 253, 357, 45);
		add(btnProduce);
		
		//is needed??
		comboBoxReportType = new JComboBox();
		comboBoxReportType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTheReportProduced.setVisible(false);
			}
		});
		comboBoxReportType.setModel(new DefaultComboBoxModel(new String[] {"Incomes report", "Purchase report", "Inventory report"}));
		comboBoxReportType.setBackground(new Color(255, 255, 204));
		comboBoxReportType.setBounds(431, 197, 169, 23);
		add(comboBoxReportType);
		//comboBoxReportType.setVisible(false);
		//is needed??
		lblSelectAReport = new JLabel("Select a report type:");
		lblSelectAReport.setForeground(new Color(255, 255, 204));
		lblSelectAReport.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectAReport.setBounds(243, 195, 155, 25);
		add(lblSelectAReport);
		//lblSelectAReport.setVisible(false);
		
		lblTheReportProduced = new JLabel("The report produced successfully");
		lblTheReportProduced.setForeground(new Color(255, 255, 204));
		lblTheReportProduced.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTheReportProduced.setBounds(295, 336, 254, 32);
		add(lblTheReportProduced);
		lblTheReportProduced.setVisible(false);
		
		btnProduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String quertur = (String)comboBoxQurter.getSelectedItem();
			String year = (String)comboBoxYear.getSelectedItem();
			String type = (String)comboBoxReportType.getSelectedItem();
			ArrayList<String> toController = new ArrayList<String>();
			toController.add(type);
			toController.add(year);
			toController.add(quertur);
			MarketingMngController.createCharacterizationReport(toController, owner);
			lblTheReportProduced.setVisible(true);
			}
		});
	}
	public void displayAnswer(ArrayList<String> resultset) {}
}
