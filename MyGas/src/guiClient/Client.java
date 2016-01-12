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
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.ImageIcon;

import controllers.ClientComtroller;

public class Client extends FormPanel {
	private JLabel name;
	private Image clientPic;
	private JLabel clientIcon;
	private JButton btnFollowOrder;
	private JButton btnOrderFuel;
/*684 x 442 ******/
	/**
	 * this method create the client window panel
	 * @param frame - the main frame (we have only one frame)
	 * @param panelback - the previous panel , back panel will return to this panel
	 */
	public Client(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Client Window");
		path.setText("Login/Client window");
		btnBack.setText("Logout");
		

		name = new JLabel("");
		name.setBounds(80, 38, 46, 14);
		add(name);
		
		clientPic=new ImageIcon(this.getClass().getResource("/client.png")).getImage();
		clientIcon = new JLabel();
		clientIcon.setIcon(new ImageIcon(clientPic));
		clientIcon.setBounds(662, 372, 128, 128);
		add(clientIcon);
		
		btnFollowOrder = new JButton("Follow Order");
		btnFollowOrder.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFollowOrder.setBackground(new Color(255, 255, 204));
		btnFollowOrder.setBounds(322, 150, 170, 41);
		add(btnFollowOrder);
		
		btnOrderFuel = new JButton("Order Fuel");
		btnOrderFuel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOrderFuel.setBackground(new Color(255, 255, 204));
		btnOrderFuel.setBounds(322, 201, 170, 41);
		add(btnOrderFuel);
		setVisible(false);


		btnFollowOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FollowOrder fo=new FollowOrder(null,owner);
				owner.setVisible(false);
				framel.getContentPane().add(fo);
				fo.setVisible(true);
			}
		});
		
		btnOrderFuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderFuel order=new OrderFuel(null, owner);

				owner.setVisible(false);
				framel.remove(owner);
				framel.getContentPane().add(order);
				order.setVisible(true);
	            framel.invalidate();
	            framel.validate();
			}
		});
	}
	

}
