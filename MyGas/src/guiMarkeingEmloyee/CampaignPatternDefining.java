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

import controllers.MarketingEmployeeController;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;


public class CampaignPatternDefining extends FormPanel {
	private JTable table;
	private JSpinField spinStartHour;
	private JSpinField spinStartYear;
	private JLabel lblStartHour;
	private JLabel lblEndDate;
	private JLabel lblStartMonth;
	private JButton btnDefine;
	private JLabel lblIllegalChoose;
	private JSpinField spinStartMonth;
	private JLabel lblStartDay;
	private JSpinField spinStartDay;
	private JLabel lblStart;
	private JLabel lblStartYear;
	private JLabel labelEndMonth;
	private JLabel labelEndHour;
	private JSpinField spinEndHour;
	private JSpinField spinEndYear;
	private JSpinField spinEndMonth;
	private JLabel labelEndDay;
	private JSpinField spinEndDay;
	private JLabel labelEndYear;
	private JTable table_1;
	private JLabel lblRatings;
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
		
		lblStartMonth = new JLabel("Month:");
		lblStartMonth.setBounds(34, 284, 102, 20);
		lblStartMonth.setForeground(new Color(255, 255, 204));
		lblStartMonth.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStartMonth.setBackground(new Color(255, 255, 204));
		add(lblStartMonth);
		
	
		
		lblEndDate = new JLabel("End:");
		lblEndDate.setForeground(new Color(255, 255, 204));
		lblEndDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEndDate.setBackground(new Color(255, 255, 204));
		lblEndDate.setBounds(34, 317, 84, 20);
		add(lblEndDate);
		
		lblStartHour = new JLabel("Hour:");
		lblStartHour.setForeground(new Color(255, 255, 204));
		lblStartHour.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStartHour.setBackground(new Color(255, 255, 204));
		lblStartHour.setBounds(456, 284, 84, 20);
		add(lblStartHour);
		
		spinStartHour = new JSpinField();
		spinStartHour.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinStartHour.setMaximum(23);
		spinStartHour.setBounds(513, 282, 61, 22);
		add(spinStartHour);
		
		spinStartYear = new JSpinField();
		spinStartYear.setMinimum(2016);
		spinStartYear.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinStartYear.setMaximum(2017);
		spinStartYear.setBounds(373, 284, 61, 22);
		add(spinStartYear);
		
		btnDefine = new JButton("Define");
		btnDefine.setBackground(new Color(255, 255, 204));
		btnDefine.setBounds(44, 385, 709, 45);
		add(btnDefine);
		
		lblIllegalChoose = new JLabel("Illegal choose. Please try again");
		lblIllegalChoose.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIllegalChoose.setForeground(Color.RED);
		lblIllegalChoose.setBounds(284, 443, 244, 35);
		add(lblIllegalChoose);
		
		spinStartMonth = new JSpinField();
		spinStartMonth.setMinimum(1);
		spinStartMonth.setMaximum(12);
		spinStartMonth.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinStartMonth.setBounds(104, 282, 61, 22);
		add(spinStartMonth);
		
		lblStartDay = new JLabel("Day:");
		lblStartDay.setForeground(new Color(255, 255, 204));
		lblStartDay.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStartDay.setBackground(new Color(255, 255, 204));
		lblStartDay.setBounds(188, 284, 61, 20);
		add(lblStartDay);
		
		spinStartDay = new JSpinField();
		spinStartDay.setMinimum(1);
		spinStartDay.setMaximum(31);
		spinStartDay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinStartDay.setBounds(237, 284, 61, 22);
		add(spinStartDay);
		
		lblStart = new JLabel("Start:");
		lblStart.setForeground(new Color(255, 255, 204));
		lblStart.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStart.setBackground(new Color(255, 255, 204));
		lblStart.setBounds(34, 251, 84, 20);
		add(lblStart);
		
		lblStartYear = new JLabel("Year:");
		lblStartYear.setForeground(new Color(255, 255, 204));
		lblStartYear.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStartYear.setBackground(new Color(255, 255, 204));
		lblStartYear.setBounds(321, 284, 102, 20);
		add(lblStartYear);
		
		labelEndMonth = new JLabel("Month:");
		labelEndMonth.setForeground(new Color(255, 255, 204));
		labelEndMonth.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelEndMonth.setBackground(new Color(255, 255, 204));
		labelEndMonth.setBounds(34, 345, 102, 20);
		add(labelEndMonth);
		
		labelEndHour = new JLabel("Hour:");
		labelEndHour.setForeground(new Color(255, 255, 204));
		labelEndHour.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelEndHour.setBackground(new Color(255, 255, 204));
		labelEndHour.setBounds(456, 345, 84, 20);
		add(labelEndHour);
		
		spinEndHour = new JSpinField();
		spinEndHour.setMaximum(23);
		spinEndHour.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinEndHour.setBounds(513, 343, 61, 22);
		add(spinEndHour);
		
		spinEndYear = new JSpinField();
		spinEndYear.setMinimum(2016);
		spinEndYear.setMaximum(2017);
		spinEndYear.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinEndYear.setBounds(373, 345, 61, 22);
		add(spinEndYear);
		
		spinEndMonth = new JSpinField();
		spinEndMonth.setMinimum(1);
		spinEndMonth.setMaximum(12);
		spinEndMonth.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinEndMonth.setBounds(104, 343, 61, 22);
		add(spinEndMonth);
		
		labelEndDay = new JLabel("Day:");
		labelEndDay.setForeground(new Color(255, 255, 204));
		labelEndDay.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelEndDay.setBackground(new Color(255, 255, 204));
		labelEndDay.setBounds(188, 345, 54, 20);
		add(labelEndDay);
		
		spinEndDay = new JSpinField();
		spinEndDay.setMinimum(1);
		spinEndDay.setMaximum(31);
		spinEndDay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinEndDay.setBounds(237, 345, 61, 22);
		add(spinEndDay);
		
		labelEndYear = new JLabel("Year:");
		labelEndYear.setForeground(new Color(255, 255, 204));
		labelEndYear.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelEndYear.setBackground(new Color(255, 255, 204));
		labelEndYear.setBounds(321, 345, 54, 20);
		add(labelEndYear);
		
		table_1 = new JTable();
		table_1.setBounds(44, 108, 725, 116);
		add(table_1);
		
		lblRatings = new JLabel("Ratings:");
		lblRatings.setForeground(new Color(255, 255, 204));
		lblRatings.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRatings.setBackground(new Color(255, 255, 204));
		lblRatings.setBounds(354, 75, 102, 20);
		add(lblRatings);
		lblIllegalChoose.setVisible(false);
		
		
		btnDefine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean flag=true;
				lblIllegalChoose.setVisible(false);
				//get start date
				
				int startDay= spinStartDay.getValue();
				int startMonth= spinStartMonth.getValue();
				int startYear= spinStartYear.getValue();
				Date startDate=new Date();
				startDate.setDate(startDay);
				startDate.setMonth(startMonth-1);
				startDate.setYear(startYear);
				 
				int endDay= spinEndDay.getValue();
				int endMonth= spinEndMonth.getValue();
				int endYear= spinEndYear.getValue();
				Date endDate=new Date();
				endDate.setDate(endDay);
				endDate.setMonth(endMonth-1);
				endDate.setYear(endYear);
				System.out.println(startDate.toString());
				
				
				//check legal date
				if( startMonth == 2 && startDay>28)
				{
					lblIllegalChoose.setVisible(true);
					flag=false;
				}
				
				if( (startMonth == 4 || startMonth == 6 ||startMonth == 9 || startMonth == 11 ) && startDay>30)
				{
					lblIllegalChoose.setVisible(true);
					flag=false;
				}
				
				if( (endMonth == 4 || endMonth == 6 ||endMonth == 9 || endMonth == 11 ) && endDay>30)
				{
					lblIllegalChoose.setVisible(true);
					flag=false;
				}
				if( endMonth == 2 && endDay>28)
				{
					lblIllegalChoose.setVisible(true);
					flag=false;
				}
				
				if(startDate.after(endDate) || spinStartHour.getValue() >= spinEndHour.getValue() )
				{
					lblIllegalChoose.setVisible(true);
					flag=false;
				}
				if(flag)
				{
					ArrayList<String> toController= new ArrayList<String>();
					toController.add(0,""); // for the method name
					toController.add(1, ""); //for the Campaign ID
					toController.add(startDate.toString());
					toController.add(endDate.toString());
					toController.add(spinStartHour.toString());
					toController.add(spinStartYear.toString());
					MarketingEmployeeController.defineCampaginPattern(toController);
				}
					
				
				
			}
		});
		
	}
}
