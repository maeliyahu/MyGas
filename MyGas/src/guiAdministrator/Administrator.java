package guiAdministrator;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Administrator extends JPanel {
	final JPanel Administrator;
	private JPanel panelback;
	/**
	 * Create the panel.
	 */
	public Administrator(JPanel panelback) {
		Administrator = new JPanel();
		this.panelback=panelback;
		String[] options={"Choose an Option", "Send response","Watch Quarterly Reports" };
		Administrator.setBackground(Color.DARK_GRAY);
		//frame.getContentPane().add(Administrator, "name_12054748619064");
		Administrator.setLayout(null);
		
		JLabel lblAdministratorWindow = new JLabel("Administrator Window");
		lblAdministratorWindow.setForeground(new Color(255, 255, 204));
		lblAdministratorWindow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdministratorWindow.setBounds(10, 11, 238, 23);
		Administrator.add(lblAdministratorWindow);
		
		JButton btnBack_1 = new JButton("Back");
	
		btnBack_1.setBackground(new Color(255, 255, 204));

		btnBack_1.setBounds(10, 466, 89, 23);
		Administrator.add(btnBack_1);
		
		JComboBox comboBox = new JComboBox(options);
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(474, 13, 253, 24);
		Administrator.add(comboBox);
		
		JButton button = new JButton("Go");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(737, 13, 53, 24);
		Administrator.add(button);
		Administrator.setVisible(false);
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrator.setVisible(false);
				backpanel();
			}
		});
	}
	public void backpanel(){
		this.panelback.setVisible(true);
	}

}
