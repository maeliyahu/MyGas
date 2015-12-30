package guiClient;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class followOrder extends JPanel {
	private JPanel panelback;
	private JPanel owner;
	/**
	 * Create the panel.
	 */
	public followOrder(JPanel panelback) {
		owner=this;
		this.panelback=panelback;
		setBackground(Color.DARK_GRAY);
		this.setBounds(0, 0, 800, 500);
		setLayout(null);
		
		JLabel orderWin = new JLabel("Follow Order Window");
		orderWin.setForeground(new Color(255, 255, 204));
		orderWin.setFont(new Font("Tahoma", Font.BOLD, 20));
		orderWin.setBounds(10, 11, 233, 25);
		add(orderWin);
		
		JButton button = new JButton("Back");

		button.setBackground(new Color(255, 255, 204));
		button.setBounds(701, 13, 89, 23);
		add(button);
		
		JLabel lblMenuclientWindow = new JLabel("Login/Client window/Follow Order Window");
		lblMenuclientWindow.setForeground(new Color(255, 255, 204));
		lblMenuclientWindow.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMenuclientWindow.setBounds(10, 38, 299, 24);
		add(lblMenuclientWindow);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(399, 154, 121, 25);
		add(comboBox);
		
		JLabel orderNum = new JLabel("Choose order Number:");
		orderNum.setFont(new Font("Tahoma", Font.BOLD, 14));
		orderNum.setForeground(new Color(255, 255, 204));
		orderNum.setBounds(229, 152, 191, 25);
		add(orderNum);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			owner.setVisible(false);
			backpanel();
			}
			
		});

	}
	public void backpanel(){
		this.panelback.setVisible(true);
	}
}
