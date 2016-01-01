package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class setting extends formPanel {
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public setting(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Setting Window");
		path.setText("Login/Setting Window");

		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(136, 104, 267, 26);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 136, 267, 26);
		add(textField_1);
		
		JLabel lblServerIp = new JLabel("Server IP:");
		lblServerIp.setForeground(new Color(255, 255, 204));
		lblServerIp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblServerIp.setBackground(new Color(255, 255, 204));
		lblServerIp.setBounds(25, 106, 101, 24);
		add(lblServerIp);
		
		JLabel lblPortNumber = new JLabel("Port Number:");
		lblPortNumber.setForeground(new Color(255, 255, 204));
		lblPortNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPortNumber.setBackground(new Color(255, 255, 204));
		lblPortNumber.setBounds(25, 137, 101, 25);
		add(lblPortNumber);
		
		JButton button = new JButton("OK");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(413, 104, 96, 58);
		add(button);
		
		
		Image server=new ImageIcon(this.getClass().getResource("/server.png")).getImage();
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(server));
		lblNewLabel.setBounds(578, 33, 153, 129);
		add(lblNewLabel);
		
		

	}

}
