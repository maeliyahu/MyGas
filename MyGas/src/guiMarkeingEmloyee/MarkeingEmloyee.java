package guiMarkeingEmloyee;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class MarkeingEmloyee extends JPanel {
	public JPanel Employee;
	private JPanel panelback;
	/**
	 * Create the panel.
	 */
	public MarkeingEmloyee(JPanel panelback) {
		Employee = new JPanel();
		this.panelback=panelback;
		String[] options={"Choose an Option", "Updating client details","Client registration" ,"Produce customer data rating", "Campaign pattern defining" };
		Employee.setBackground(Color.DARK_GRAY);
		//frame.getContentPane().add(Employee, "name_12054748619064");
		Employee.setLayout(null);
		
		JLabel lblEmployeeWindow = new JLabel("Employee Window");
		lblEmployeeWindow.setForeground(new Color(255, 255, 204));
		lblEmployeeWindow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmployeeWindow.setBounds(10, 11, 170, 24);
		Employee.add(lblEmployeeWindow);
		
		JButton btnBack_1 = new JButton("Back");
	
		btnBack_1.setBackground(new Color(255, 255, 204));

		btnBack_1.setBounds(10, 466, 89, 23);
		Employee.add(btnBack_1);
		
		JComboBox comboBox = new JComboBox(options);
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(474, 14, 253, 24);
		Employee.add(comboBox);
		
		JButton button = new JButton("Go");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(737, 14, 53, 24);
		Employee.add(button);
		Employee.setVisible(false);
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee.setVisible(false);
				backpanel();
			}
		});
	}
	public void backpanel(){
		this.panelback.setVisible(true);
	}
}
