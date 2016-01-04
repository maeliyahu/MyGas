package guiAdministrator;

import gui.*;
import guiClient.followOrder;

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

public class Administrator extends formPanel {
	
	private JButton btnSendRes;
	private JButton btnWatchQ;
	private JLabel name;
	private Image clientPic;
	private JLabel clientIcon;
	/**
	 * Create the panel.
	 */
	public Administrator(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Administrator Window");
		path.setText("Login/Administrator");
		btnBack.setText("Logout");
		
		btnSendRes= new JButton("Send response");
		btnSendRes.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSendRes.setBackground(new Color(255, 255, 204));
		btnSendRes.setBounds(303, 114, 240, 40);
		add(btnSendRes);
		
		btnWatchQ = new JButton("Watch Quarterly Reports");
		btnWatchQ.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnWatchQ.setBackground(new Color(255, 255, 204));
		btnWatchQ.setBounds(303, 165, 240, 40);
		add(btnWatchQ);
		
		name = new JLabel("");
		name.setBounds(80, 38, 46, 14);
		add(name);
		
		clientPic=new ImageIcon(this.getClass().getResource("/client.png")).getImage();
		clientIcon = new JLabel();
		clientIcon.setIcon(new ImageIcon(clientPic));
		clientIcon.setBounds(662, 372, 128, 128);
		add(clientIcon);

		/*"Choose an Option"
		 * "Send response"
		 * "Watch Quarterly Reports" */

		btnSendRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sendResponse send=new sendResponse(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(send);
				send.setVisible(true);
			}
		});
		
		btnWatchQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				watchQuarterlyReports watch=new watchQuarterlyReports(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(watch);
				watch.setVisible(true);
			}
		});
		
	}
}
