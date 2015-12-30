package guiClient;
import gui.*;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class orderFuel extends formPanel {

	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public orderFuel(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Order Window");
		path.setText("Login/Client window/Order Window");
		
		
		
		String[] types={"Regular","Urgent"};
				
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setBounds(701, 12, 89, 23);
		add(btnBack);
		
		JComboBox comboBox = new JComboBox(types);
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(341, 157, 121, 25);
		add(comboBox);
		
		JLabel type = new JLabel("Type:");
		type.setForeground(new Color(255, 255, 204));
		type.setFont(new Font("Tahoma", Font.BOLD, 14));
		type.setBounds(266, 158, 80, 24);
		add(type);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(341, 122, 121, 24);
		add(textField);
		textField.setColumns(10);
		
		JLabel btQuantity = new JLabel("Quantity:");
		btQuantity.setForeground(new Color(255, 255, 204));
		btQuantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		btQuantity.setBounds(266, 120, 65, 27);
		add(btQuantity);
		
		JButton done = new JButton("Done");
		done.setBackground(new Color(255, 255, 204));
		done.setBounds(266, 193, 196, 45);
		add(done);
		

		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				owner.setVisible(false);
				backpanel();
			}
		});
	}

}
