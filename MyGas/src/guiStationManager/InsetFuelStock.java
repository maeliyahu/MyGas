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

public class InsetFuelStock extends FormPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public InsetFuelStock(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Inset Fuel Stock");
		path.setText("Login/Station Manager Window/Inset Fuel Stock");
	
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(385, 183, 157, 25);
		add(comboBox);
		
		JLabel lblChooseFuelType = new JLabel("Choose fuel type:");
		lblChooseFuelType.setForeground(new Color(255, 255, 204));
		lblChooseFuelType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseFuelType.setBounds(237, 182, 191, 25);
		add(lblChooseFuelType);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(385, 223, 157, 24);
		add(textField);
		
		JLabel label = new JLabel("Quantity:");
		label.setForeground(new Color(255, 255, 204));
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(237, 221, 65, 27);
		add(label);
		
		JButton button = new JButton("Done");
		
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(237, 278, 305, 45);
		add(button);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText();
				try
				{
					textField.setForeground(Color.BLACK);
					int inputNum = Integer.parseInt(input);
					if(inputNum<=0 )
						throw new NumberFormatException();
					//add if check in DB
					
				}
				catch(NumberFormatException e1)
				{
					textField.setText("Error");
					textField.setForeground(Color.RED);
				}
			}
		});
	}
}
