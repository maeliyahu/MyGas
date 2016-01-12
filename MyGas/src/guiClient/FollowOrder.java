package guiClient;
import gui.*;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import controllers.ClientComtroller;

public class FollowOrder extends FormPanel {
	private JComboBox comboBox;
	private JLabel orderNum;
	/**
	 * this method create the "follow order" option panel(belong to client).
	 * @param frame - the main frame (we have only one frame).
	 * @param panelback - the previous panel , back panel will return to this panel.
	 */
	public FollowOrder(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Follow Order Window");
		path.setText("Login/Client Window/Follow Order");

		ClientComtroller.RequestOrders(new ArrayList<String>(), owner);
		String[] fuelType={"gasoline","motor","diesel","home"};
		
		
		comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(399, 154, 121, 25);
		add(comboBox);
		
		orderNum = new JLabel("Choose order Number:");
		orderNum.setFont(new Font("Tahoma", Font.BOLD, 14));
		orderNum.setForeground(new Color(255, 255, 204));
		orderNum.setBounds(229, 152, 191, 25);
		add(orderNum);
		
		


	}
}
