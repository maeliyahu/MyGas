package guiMarkeingEmloyee;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class MarkeingEmloyee extends JPanel {
	public JPanel owner;
	private JPanel panelback;
	/**
	 * Create the panel.
	 */
	public MarkeingEmloyee(JPanel panelback) {
		this.owner=this;
		this.panelback=panelback;
		String[] options={"Choose an Option", "Updating client details","Client registration" ,"Produce customer data rating", "Campaign pattern defining" };
		setBackground(Color.DARK_GRAY);
		setBounds(0, 25, 800, 500);
		//frame.getContentPane().add(Employee, "name_12054748619064");
		setLayout(null);
		
		JLabel lblEmployeeWindow = new JLabel("Employee Window");
		lblEmployeeWindow.setForeground(new Color(255, 255, 204));
		lblEmployeeWindow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmployeeWindow.setBounds(10, 11, 170, 24);
		add(lblEmployeeWindow);
		
		JButton btnBack_1 = new JButton("Back");
	
		btnBack_1.setBackground(new Color(255, 255, 204));

		btnBack_1.setBounds(10, 466, 89, 23);
		add(btnBack_1);
		
		JLabel path = new JLabel("Login/Employee window");
		path.setForeground(new Color(255, 255, 204));
		path.setFont(new Font("Tahoma", Font.BOLD, 14));
		path.setBounds(10, 30, 180, 24);
		add(path);
		
		JButton btnUpdate = new JButton("Updating client details");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate.setBackground(new Color(255, 255, 204));
		btnUpdate.setBounds(282, 92, 245, 41);
		add(btnUpdate);
		
		JButton btnRegistration = new JButton("Client registration");
		btnRegistration.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistration.setBackground(new Color(255, 255, 204));
		btnRegistration.setBounds(282, 143, 245, 41);
		add(btnRegistration);
		
		JButton btnRating = new JButton("Produce customer data rating");
		btnRating.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRating.setBackground(new Color(255, 255, 204));
		btnRating.setBounds(282, 195, 245, 41);
		add(btnRating);
		
		JButton btnPattern = new JButton("Campaign pattern defining");
		btnPattern.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPattern.setBackground(new Color(255, 255, 204));
		btnPattern.setBounds(282, 246, 245, 41);
		add(btnPattern);
		
		JLabel label = new JLabel();
		label.setBounds(662, 361, 128, 128);
		add(label);
		setVisible(false);
		Image clientPic=new ImageIcon(this.getClass().getResource("/client.png")).getImage();
		JLabel clientIcon = new JLabel();
		clientIcon.setIcon(new ImageIcon(clientPic));
		clientIcon.setBounds(662, 372, 128, 128);
		add(clientIcon);
		
		
		btnBack_1.addActionListener(new ActionListener() {
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
