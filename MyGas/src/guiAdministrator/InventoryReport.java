package guiAdministrator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import gui.FormPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

import com.toedter.components.JSpinField;

import controllers.AdministratorController;

public class InventoryReport extends FormPanel {
	private JTable table;
	private JSpinField quarterSpin;
	private JLabel lblYear;
	private JSpinField yearSpin;
	private JLabel lblQuarter;
	private JButton btnShow;

	/**
	 * Create the panel.
	 */
	public InventoryReport(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Inventory Report");
		path.setText("Login/Administrator Window/Watch Quarterly Reports/Inventory Report");
		
		lblYear = new JLabel("Year:");
		lblYear.setForeground(new Color(255, 255, 204));
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYear.setBackground(new Color(255, 255, 204));
		lblYear.setBounds(35, 87, 84, 20);
		add(lblYear);
		
		yearSpin = new JSpinField();
		yearSpin.setMinimum(2014);
		yearSpin.setMaximum(2015);
		yearSpin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		yearSpin.setBounds(84, 87, 61, 22);
		add(yearSpin);
		
		lblQuarter = new JLabel("Quarter:");
		lblQuarter.setForeground(new Color(255, 255, 204));
		lblQuarter.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuarter.setBackground(new Color(255, 255, 204));
		lblQuarter.setBounds(166, 87, 84, 20);
		add(lblQuarter);
		
		quarterSpin = new JSpinField();
		quarterSpin.setMinimum(1);
		quarterSpin.setMaximum(3);
		quarterSpin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		quarterSpin.setBounds(239, 87, 61, 22);
		add(quarterSpin);
		
		table = new JTable();
		table.setBounds(64, 175, 688, 252);
		add(table);
		table.setVisible(false);
		
		btnShow = new JButton("Show report");
	
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnShow.setBackground(new Color(255, 255, 204));
		btnShow.setBounds(330, 86, 126, 24);
		add(btnShow);
		
		
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int year=yearSpin.getValue();
				int quarter = quarterSpin.getValue();
				ArrayList<String> toController = new ArrayList<String>();
				//toController.add(0,"");
				toController.add(String.valueOf(year));
				toController.add(String.valueOf(quarter));

				AdministratorController.SendRequestInventoryReport(toController, owner);
				//get from DB the report
				table.setVisible(true);
			}
		});
		
	}
	public void displayAnswer(ArrayList<String> resultset) {}
}
