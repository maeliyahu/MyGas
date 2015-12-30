package guimarketingMng;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class marketingMng extends JPanel {
	public JPanel owner;
	private JPanel panelback;
	private JFrame framel;
	/**
	 * Create the panel.
	 */
	public marketingMng(JFrame frame,JPanel panelback) {
		owner=this;
		this.framel=frame;
		this.panelback=panelback;
		String[] options={"Choose an Option", "Update maximum fuel price","Planes Price change request" ,"Update planes price"
				, "Activate campaign  pattern","Produce a respond report of marketing campaign","Produce a period customer characterization report" };
		setBackground(Color.DARK_GRAY);
		//frame.getContentPane().add(marketingMng, "name_12054748619064");
		setLayout(null);
		
		JLabel lblmarketingMngWindow = new JLabel("marketing Manager Window");
		lblmarketingMngWindow.setForeground(new Color(255, 255, 204));
		lblmarketingMngWindow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblmarketingMngWindow.setBounds(10, 11, 272, 26);
		add(lblmarketingMngWindow);
		
		JButton btnBack_1 = new JButton("Back");
	
		btnBack_1.setBackground(new Color(255, 255, 204));

		btnBack_1.setBounds(10, 466, 89, 23);
		add(btnBack_1);
		
		JComboBox comboBox = new JComboBox(options);
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(408, 16, 319, 23);
		add(comboBox);
		
		JButton button = new JButton("Go");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(737, 15, 53, 24);
		add(button);
		setVisible(false);
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
