package guiClient;
import gui.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Image;

import javax.swing.JTextPane;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JDesktopPane;

import java.awt.FlowLayout;

import javax.swing.JList;
import javax.swing.ImageIcon;

public class client extends formPanel {

/*684 x 442 ******/
	/**
	 * Create the panel.
	 */
	public client(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Client Window");
		path.setText("Login/Client window");
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setBounds(701, 12, 89, 23);
		add(btnBack);
		
		
		JLabel name = new JLabel("");
		name.setBounds(80, 38, 46, 14);
		add(name);
		
		Image clientPic=new ImageIcon(this.getClass().getResource("/client.png")).getImage();
		JLabel clientIcon = new JLabel();
		clientIcon.setIcon(new ImageIcon(clientPic));
		clientIcon.setBounds(662, 372, 128, 128);
		add(clientIcon);
		
		JButton btnFollowOrder = new JButton("Follow Order");
		btnFollowOrder.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFollowOrder.setBackground(new Color(255, 255, 204));

		btnFollowOrder.setBounds(322, 150, 170, 41);
		add(btnFollowOrder);
		
		JButton btnOrderFuel = new JButton("Order Fuel");

		btnOrderFuel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOrderFuel.setBackground(new Color(255, 255, 204));
		btnOrderFuel.setBounds(322, 201, 170, 41);
		add(btnOrderFuel);
		setVisible(false);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				owner.setVisible(false);
				backpanel();
				
			}
		});
		btnFollowOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				followOrder fo=new followOrder(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(fo);
				fo.setVisible(true);
			}
		});
		
		btnOrderFuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderFuel order=new orderFuel(null, owner);
				owner.setVisible(false);
				framel.getContentPane().add(order);
				order.setVisible(true);
			}
		});
	}
	

}
