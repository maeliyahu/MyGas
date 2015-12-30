package guiClient;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class orderFuel extends JPanel {
	private JPanel owner;
	private JPanel panelback;
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public orderFuel(JPanel panelback) {
		owner=this;
		this.panelback=panelback;
		setBackground(Color.DARK_GRAY);
		this.setBounds(0, 0, 800, 500);
		setLayout(null);
		String[] types={"Regular","Urgent"};
		JLabel orderWin = new JLabel("Order Window");
		orderWin.setForeground(new Color(255, 255, 204));
		orderWin.setFont(new Font("Tahoma", Font.BOLD, 20));
		orderWin.setBounds(10, 11, 170, 24);
		add(orderWin);
		
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
	public void backpanel(){
		this.panelback.setVisible(true);
	}
}
