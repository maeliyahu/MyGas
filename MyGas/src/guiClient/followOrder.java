package guiClient;
import gui.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class followOrder extends formPanel {

	public followOrder(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Follow Order Window");
		path.setText("Login/Client window/Follow Order Window");


		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(399, 154, 121, 25);
		add(comboBox);
		
		JLabel orderNum = new JLabel("Choose order Number:");
		orderNum.setFont(new Font("Tahoma", Font.BOLD, 14));
		orderNum.setForeground(new Color(255, 255, 204));
		orderNum.setBounds(229, 152, 191, 25);
		add(orderNum);
		
		


	}
}
