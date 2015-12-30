package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class setting extends JPanel {
	final JPanel set;
	private JPanel panelback;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public setting(JPanel panelback) {
		set = new JPanel();
		this.panelback=panelback;
		setLayout(null);

		set.setBackground(Color.DARK_GRAY);
		//frame.getContentPane().add(set, "name_12054733026394");
		set.setLayout(null);
		
		JLabel lblsetWindow = new JLabel("Setting Window");
		lblsetWindow.setForeground(new Color(255, 255, 204));
		lblsetWindow.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblsetWindow.setBounds(10, 11, 170, 24);
		set.add(lblsetWindow);
		
		JButton btnBack = new JButton("Back");
	

		btnBack.setBackground(new Color(255, 255, 204));

		btnBack.setBounds(10, 466, 89, 23);
		set.add(btnBack);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(136, 104, 267, 26);
		set.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 136, 267, 26);
		set.add(textField_1);
		
		JLabel lblServerIp = new JLabel("Server IP:");
		lblServerIp.setForeground(new Color(255, 255, 204));
		lblServerIp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblServerIp.setBackground(new Color(255, 255, 204));
		lblServerIp.setBounds(25, 106, 101, 24);
		set.add(lblServerIp);
		
		JLabel lblPortNumber = new JLabel("Port Number:");
		lblPortNumber.setForeground(new Color(255, 255, 204));
		lblPortNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPortNumber.setBackground(new Color(255, 255, 204));
		lblPortNumber.setBounds(25, 137, 101, 25);
		set.add(lblPortNumber);
		
		JButton button = new JButton("OK");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(413, 104, 96, 58);
		set.add(button);
		
		
		Image server=new ImageIcon(this.getClass().getResource("/server.png")).getImage();
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(server));
		lblNewLabel.setBounds(578, 33, 153, 129);
		set.add(lblNewLabel);
		
		JLabel lblLoginsetting = new JLabel("Login/Setting");
		lblLoginsetting.setForeground(new Color(255, 255, 204));
		lblLoginsetting.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoginsetting.setBounds(10, 33, 299, 24);
		set.add(lblLoginsetting);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set.setVisible(false);
				backpanel();
			}
		});
	}
	public void backpanel(){
		this.panelback.setVisible(true);
	}
}
