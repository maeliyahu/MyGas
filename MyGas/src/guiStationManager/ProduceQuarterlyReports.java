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

public class ProduceQuarterlyReports extends FormPanel {

	/**
	 * Create the panel.
	 */
	public ProduceQuarterlyReports(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Produce Quarterly Reports");
		path.setText("Login/Station Manager Window/Produce Quarterly Reports");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(403, 168, 157, 25);
		add(comboBox);
		
		JLabel lblChooseQuarterly = new JLabel("Choose Period:");
		lblChooseQuarterly.setForeground(new Color(255, 255, 204));
		lblChooseQuarterly.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseQuarterly.setBounds(255, 167, 191, 25);
		add(lblChooseQuarterly);
		
		JButton button = new JButton("Done");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(255, 225, 305, 45);
		add(button);
	
	}

}
