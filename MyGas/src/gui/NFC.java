package gui;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class NFC extends JPanel {
	final JPanel NFC;
	private JPanel panelback;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public NFC(JPanel panelback) {
		NFC = new JPanel();
		this.panelback=panelback;
		String[] options={"Choose an Option", "Insert fuel stock","Determining the threshold level for receiving alert"
				,"Approve fuel order","Produce Quarterly Reports"};
		NFC.setBackground(Color.DARK_GRAY);
		//frame.getContentPane().add(NFC, "name_12054748619064");
		NFC.setLayout(null);
		
		JLabel lblNFCWindow = new JLabel("NFC Simulation Window");
		lblNFCWindow.setForeground(new Color(255, 255, 204));
		lblNFCWindow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNFCWindow.setBounds(10, 11, 238, 23);
		NFC.add(lblNFCWindow);
		
		JButton btnBack_1 = new JButton("Back");
	
		btnBack_1.setBackground(new Color(255, 255, 204));

		btnBack_1.setBounds(10, 466, 89, 23);
		NFC.add(btnBack_1);
		
		JButton button = new JButton("OK");
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(147, 176, 267, 44);
		NFC.add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(147, 107, 267, 26);
		NFC.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 139, 267, 26);
		NFC.add(textField_1);
		
		JLabel lblNfcNumber = new JLabel("NFC Number:");
		lblNfcNumber.setForeground(new Color(255, 255, 204));
		lblNfcNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNfcNumber.setBackground(new Color(255, 255, 204));
		lblNfcNumber.setBounds(33, 109, 104, 23);
		NFC.add(lblNfcNumber);
		
		JLabel lblUantity = new JLabel("Fuel Quantity:");
		lblUantity.setForeground(new Color(255, 255, 204));
		lblUantity.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUantity.setBackground(new Color(255, 255, 204));
		lblUantity.setBounds(33, 140, 104, 25);
		NFC.add(lblUantity);
		
		
		Image nfc=new ImageIcon(this.getClass().getResource("/nfc.png")).getImage();
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(nfc));
		label.setBounds(239, 11, 40, 23);
		NFC.add(label);
		NFC.setVisible(false);
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NFC.setVisible(false);
				backpanel();
			}
		});
	}
	public void backpanel(){
		this.panelback.setVisible(true);
	}
}
