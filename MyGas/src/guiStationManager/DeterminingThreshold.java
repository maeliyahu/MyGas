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
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class DeterminingThreshold extends FormPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public DeterminingThreshold(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Determining The Threshold");
		path.setText("Login/Station Manager Window/Determining The Threshold");
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(375, 179, 157, 24);
		add(textField);
		
		JLabel lblInsertThreshold = new JLabel("Insert Threshold:");
		lblInsertThreshold.setForeground(new Color(255, 255, 204));
		lblInsertThreshold.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInsertThreshold.setBounds(227, 177, 136, 27);
		add(lblInsertThreshold);
		
		JButton button = new JButton("Done");
	
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(227, 231, 305, 45);
		add(button);
		
		String[] fuelType={"gasoline","motor","diesel","home"};
		JComboBox comboBox = new JComboBox(fuelType);
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(375, 143, 157, 25);
		add(comboBox);
		
		JLabel lblFuelType = new JLabel("Fuel Type");
		lblFuelType.setForeground(new Color(255, 255, 204));
		lblFuelType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFuelType.setBounds(227, 139, 136, 27);
		add(lblFuelType);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean flag=true;
				String input = textField.getText();
				try
				{
					textField.setForeground(Color.BLACK);
					int inputNum = Integer.parseInt(input);
					if(inputNum<=0 )
						throw new NumberFormatException();
					
				}
				catch(NumberFormatException e1)
				{
					textField.setText("Error");
					textField.setForeground(Color.RED);
					flag=false;
				}
				if(flag){
					ArrayList<String> toController=new ArrayList<String>();
					toController.add("");
					toController.add(comboBox.getSelectedItem().toString());
					toController.add(textField.getText());
					System.out.println(toController);
				}
			}
		});
	}
}
