package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormPanel extends JPanel  {
	public JPanel owner;
	protected JPanel panelback;
	protected JFrame framel;
	protected JLabel title;
	protected JLabel path;
	protected JButton btnBack;
	
	/**
	 * Create the panel.
	 */
	public FormPanel(JFrame frame,JPanel panelback) {
		owner=this;
		this.panelback=panelback;
		this.framel=frame;
		setLayout(null);
		setBounds(0, 25, 800, 500);
		
		
		btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setBounds(10, 466, 89, 23);
		add(btnBack);
		
		setBackground(Color.DARK_GRAY);
		//frame.getContentPane().add(Client, "name_12054733026394");
		setLayout(null);
		
		title = new JLabel("");
		title.setForeground(new Color(255, 255, 204));
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setBounds(10, 11, 460, 24);
		add(title);
		
		path = new JLabel("");
		path.setForeground(new Color(255, 255, 204));
		path.setFont(new Font("Tahoma", Font.BOLD, 14));
		path.setBounds(10, 38, 743, 24);
		add(path);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				owner.setVisible(false);
				backpanel();
				//owner=null;
				
			}
		});
		
	}
	/**
	 * return to the previous panel 
	 */
	public void backpanel(){
		this.panelback.setVisible(true);
	}
	/**
	 * this method for the inherit classes
	 * @param resultset
	 */
	public void displayAnswer(ArrayList<String> resultset) {
		////*******in to be abstract
	}
}
