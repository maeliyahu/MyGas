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

import controllers.StationMngController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ProduceQuarterlyReports extends FormPanel {
	private String[] quarter={"1","2","3","4"};
	private String[] year={"2015","2016"};
	private JComboBox comboBox;
	private JLabel lblChooseQuarterly;
	private JButton button;
	private JComboBox comboBox_1;
		/**
		 * this method create the "produce quarterly report" option panel(belong to station manager).
		 * @param frame - the main frame (we have only one frame).
		 * @param panelback - the previous panel , back panel will return to this panel.
		 */
	public ProduceQuarterlyReports(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Produce Quarterly Reports");
		path.setText("Login/Station Manager Window/Produce Quarterly Reports");
		
		comboBox = new JComboBox(quarter);
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(403, 168, 67, 24);
		add(comboBox);
		
		 lblChooseQuarterly = new JLabel("Choose Period:");
		lblChooseQuarterly.setForeground(new Color(255, 255, 204));
		lblChooseQuarterly.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseQuarterly.setBounds(255, 167, 124, 25);
		add(lblChooseQuarterly);
		
		button = new JButton("Done");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(255, 225, 305, 45);
		add(button);
		
		comboBox_1 = new JComboBox(year);
		comboBox_1.setBackground(new Color(255, 255, 204));
		comboBox_1.setBounds(493, 168, 67, 24);
		add(comboBox_1);
		
		
		//******* All listeners *******/ 
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> toController=new ArrayList<String>();
				toController.add(comboBox.getSelectedItem() + "" +comboBox_1.getSelectedItem());
				StationMngController.ProduceQuarterlyReports(toController, owner);
			}
		});
	
	}
	public void displayAnswer(ArrayList<String> resultset) {}
}
