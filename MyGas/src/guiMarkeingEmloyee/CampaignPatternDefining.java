package guiMarkeingEmloyee;

import javax.swing.JFrame;
import javax.swing.JPanel;
import gui.*;
import javax.swing.JTable;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JSpinField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CampaignPatternDefining extends FormPanel {
	private JTable table;
	private JSpinField startHour;
	private JSpinField endHour;
	private JLabel lblEndHour;
	private JLabel lblStartHour;
	private JCalendar endCalendar;
	private JLabel lblEndDate;
	private JLabel lblStartDate;
	private JCalendar startCalendar;
	private JButton btnDefine;
	/**
	 * Create the panel.
	 */
	public CampaignPatternDefining(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		path.setBounds(10, 38, 743, 24);
		title.setBounds(10, 11, 460, 24);
		btnBack.setBounds(10, 466, 89, 23);
		title.setText("Campaign pattern defining");
		path.setText("Login/Marketing Employee Window/Campaign pattern defining");
		setLayout(null);
		
		lblStartDate = new JLabel("Start date:");
		lblStartDate.setBounds(46, 100, 84, 20);
		lblStartDate.setForeground(new Color(255, 255, 204));
		lblStartDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStartDate.setBackground(new Color(255, 255, 204));
		add(lblStartDate);
		
	
		
		lblEndDate = new JLabel("End date:");
		lblEndDate.setForeground(new Color(255, 255, 204));
		lblEndDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEndDate.setBackground(new Color(255, 255, 204));
		lblEndDate.setBounds(450, 100, 84, 20);
		add(lblEndDate);
		
		endCalendar = new JCalendar();
		endCalendar.setBounds(535, 104, 204, 162);
		add(endCalendar);
		
		lblStartHour = new JLabel("Start hour:");
		lblStartHour.setForeground(new Color(255, 255, 204));
		lblStartHour.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStartHour.setBackground(new Color(255, 255, 204));
		lblStartHour.setBounds(46, 317, 84, 20);
		add(lblStartHour);
		
		lblEndHour = new JLabel("End hour:");
		lblEndHour.setForeground(new Color(255, 255, 204));
		lblEndHour.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEndHour.setBackground(new Color(255, 255, 204));
		lblEndHour.setBounds(450, 317, 84, 20);
		add(lblEndHour);
		
		startHour = new JSpinField();
		startHour.setMaximum(23);
		startHour.setBounds(142, 317, 61, 22);
		add(startHour);
		
		endHour = new JSpinField();
		endHour.setMaximum(23);
		endHour.setBounds(535, 317, 61, 22);
		add(endHour);
		
		startCalendar = new JCalendar();
		startCalendar.setBounds(142, 104, 204, 162);
		add(startCalendar);
		
		btnDefine = new JButton("Define");
		btnDefine.setBackground(new Color(255, 255, 204));
		btnDefine.setBounds(44, 385, 709, 45);
		add(btnDefine);
		
		
		
	}
}
