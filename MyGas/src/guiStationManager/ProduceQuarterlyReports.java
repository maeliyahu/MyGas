package guiStationManager;
import gui.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ProduceQuarterlyReports extends FormPanel {
		private String[] quarter={"1","2","3","4"};
		private String[] year={"2015","2016"};
		/**
		 * 
		 * @param frame
		 * @param panelback
		 */
	public ProduceQuarterlyReports(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Produce Quarterly Reports");
		path.setText("Login/Station Manager Window/Produce Quarterly Reports");
		
		JComboBox comboBox = new JComboBox(quarter);
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(403, 168, 67, 24);
		add(comboBox);
		
		JLabel lblChooseQuarterly = new JLabel("Choose Period:");
		lblChooseQuarterly.setForeground(new Color(255, 255, 204));
		lblChooseQuarterly.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseQuarterly.setBounds(255, 167, 124, 25);
		add(lblChooseQuarterly);
		
		JButton button = new JButton("Done");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(255, 225, 305, 45);
		add(button);
		
		JComboBox comboBox_1 = new JComboBox(year);
		comboBox_1.setBackground(new Color(255, 255, 204));
		comboBox_1.setBounds(493, 168, 67, 24);
		add(comboBox_1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> toController=new ArrayList<String>();
				toController.add("");
				toController.add(comboBox.getSelectedItem() + "" +comboBox_1.getSelectedItem());
				System.out.println(toController);
			}
		});
	
	}

}
