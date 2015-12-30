package guiStationManager;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class stationManager extends JPanel {
	public JPanel stationManager;
	private JPanel panelback;
	/**
	 * Create the panel.
	 */
	public stationManager(JPanel panelback) {
		stationManager = new JPanel();
		this.panelback=panelback;
		String[] options={"Choose an Option", "Insert fuel stock","Determining the threshold level for receiving alert"
				,"Approve fuel order","Produce Quarterly Reports"};
		stationManager.setBackground(Color.DARK_GRAY);
		//frame.getContentPane().add(stationManager, "name_12054748619064");
		stationManager.setLayout(null);
		
		JLabel lblstationManagerWindow = new JLabel("Station Manager Window");
		lblstationManagerWindow.setForeground(new Color(255, 255, 204));
		lblstationManagerWindow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblstationManagerWindow.setBounds(10, 11, 238, 23);
		stationManager.add(lblstationManagerWindow);
		
		JButton btnBack_1 = new JButton("Back");
	
		btnBack_1.setBackground(new Color(255, 255, 204));

		btnBack_1.setBounds(10, 466, 89, 23);
		stationManager.add(btnBack_1);
		
		JComboBox comboBox = new JComboBox(options);
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(474, 13, 253, 24);
		stationManager.add(comboBox);
		
		JButton button = new JButton("Go");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(737, 13, 53, 24);
		stationManager.add(button);
		stationManager.setVisible(false);
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stationManager.setVisible(false);
				backpanel();
			}
		});
	}
	public void backpanel(){
		this.panelback.setVisible(true);
	}

}
