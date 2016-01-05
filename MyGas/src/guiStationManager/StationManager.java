package guiStationManager;

import gui.*;
import guiClient.FollowOrder;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class StationManager extends FormPanel {

	/**
	 * Create the panel.
	 */
	public StationManager(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Station Manager Window");
		path.setText("Login/Station Manager Window");
		btnBack.setText("Logout");
		
		JButton btnInsertFuelType = new JButton("Insert fuel type");
	
		btnInsertFuelType.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnInsertFuelType.setBackground(new Color(255, 255, 204));
		btnInsertFuelType.setBounds(260, 139, 245, 41);
		add(btnInsertFuelType);
		
		JButton btnDeterminingTheThreshold = new JButton("Determining the threshold");
		btnDeterminingTheThreshold.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDeterminingTheThreshold.setBackground(new Color(255, 255, 204));
		btnDeterminingTheThreshold.setBounds(260, 190, 245, 41);
		add(btnDeterminingTheThreshold);
		
		JButton btnApproveFuelOrder = new JButton("Approve fuel order");
		btnApproveFuelOrder.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnApproveFuelOrder.setBackground(new Color(255, 255, 204));
		btnApproveFuelOrder.setBounds(260, 244, 245, 41);
		add(btnApproveFuelOrder);
		
		JButton btnProduceQuarterlyReports = new JButton("Produce Quarterly Reports");
		btnProduceQuarterlyReports.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProduceQuarterlyReports.setBackground(new Color(255, 255, 204));
		btnProduceQuarterlyReports.setBounds(260, 295, 245, 41);
		add(btnProduceQuarterlyReports);
		
		/*"Choose an Option"
		 *  "Insert fuel stock"
		 *  "Determining the threshold level for receiving alert"
		 *  "Approve fuel order","Produce Quarterly Reports" */
		btnInsertFuelType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InsetFuelStock insert=new InsetFuelStock(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(insert);
				insert.setVisible(true);
			}
		});
		
		
	}

}