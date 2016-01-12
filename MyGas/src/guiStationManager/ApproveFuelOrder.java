package guiStationManager;
import gui.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Event;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import controllers.StationMngController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ApproveFuelOrder extends FormPanel {
	private JTable table;
	private JButton btnApprove;

	/**
	 * this method create the "Approve Fuel Order" option panel(belong to station manager).
	 * @param frame - the main frame (we have only one frame).
	 * @param panelback - the previous panel , back panel will return to this panel.
	 */
	public ApproveFuelOrder(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Approve Fuel Order");
		path.setText("Login/Station Manager Window/Approve Fuel Order");
		
		StationMngController.RequestOrders(new ArrayList<String>(), owner);
		String[] columnNames = {"id",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		Object[][] data = {
			    {"123", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"158", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"1911", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"19187", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"11818", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		
		table = new JTable(data,columnNames);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(52, 89, 725, 252);
		
		add(table);
		
		btnApprove = new JButton("Approve");
		btnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnApprove.setBackground(new Color(255, 255, 204));
		btnApprove.setBounds(52, 370, 725, 45);
		add(btnApprove);
		
		
		
	}
}
