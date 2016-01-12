package guiStationManager;

import gui.*;
import guiClient.FollowOrder;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class StationManager extends FormPanel {
	private JButton btnDeterminingTheThreshold;
	private JButton btnApproveFuelOrder;
	private JButton btnProduceQuarterlyReports;
	private Image clientPic;
	private JLabel clientIcon;
	
	/**
	 * this method create the Station manager window panel
	 * @param frame - the main frame (we have only one frame)
	 * @param panelback - the previous panel , back panel will return to this panel
	 */
	public StationManager(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Station Manager Window");
		path.setText("Login/Station Manager Window");
		btnBack.setText("Logout");
		
		btnDeterminingTheThreshold = new JButton("Determining the threshold");
	
		btnDeterminingTheThreshold.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDeterminingTheThreshold.setBackground(new Color(255, 255, 204));
		btnDeterminingTheThreshold.setBounds(253, 101, 245, 41);
		add(btnDeterminingTheThreshold);
		
		btnApproveFuelOrder = new JButton("Approve fuel order");
		
		btnApproveFuelOrder.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnApproveFuelOrder.setBackground(new Color(255, 255, 204));
		btnApproveFuelOrder.setBounds(253, 155, 245, 41);
		add(btnApproveFuelOrder);
		
		btnProduceQuarterlyReports = new JButton("Produce Quarterly Reports");

		btnProduceQuarterlyReports.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProduceQuarterlyReports.setBackground(new Color(255, 255, 204));
		btnProduceQuarterlyReports.setBounds(253, 206, 245, 41);
		add(btnProduceQuarterlyReports);
		JLabel name = new JLabel("");
		name.setBounds(80, 38, 46, 14);
		add(name);
		
		clientPic=new ImageIcon(this.getClass().getResource("/client.png")).getImage();
		clientIcon = new JLabel();
		clientIcon.setIcon(new ImageIcon(clientPic));
		clientIcon.setBounds(662, 372, 128, 128);
		add(clientIcon); 
		/*"Choose an Option"
		 *  "Insert fuel stock"
		 *  "Determining the threshold level for receiving alert"
		 *  "Approve fuel order","Produce Quarterly Reports" */

		
		
		//******* All listeners *******/ 
		btnDeterminingTheThreshold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeterminingThreshold DetermingThreshold=new DeterminingThreshold(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(DetermingThreshold);
				DetermingThreshold.setVisible(true);
			}
		});
		
		btnApproveFuelOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApproveFuelOrder approveFuelOrder=new ApproveFuelOrder(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(approveFuelOrder);
				approveFuelOrder.setVisible(true);
			}
		});
		
		btnProduceQuarterlyReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProduceQuarterlyReports produceQuarterlyReports=new ProduceQuarterlyReports(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(produceQuarterlyReports);
				produceQuarterlyReports.setVisible(true);
			}
		});
	}

}
