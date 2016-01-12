package guiAdministrator;

import java.awt.Color;

import gui.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import controllers.AdministratorController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.ListSelectionModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SendResponse extends FormPanel{
	private JTable table;
	private JLabel lblRequestNumber;
	private JLabel lblPlanName;
	private JLabel lblDiscount;
	private JLabel lblDiscount_1;
	private JLabel lblDiscount_2;
	private JButton btnApproveChoosenRequest;
	private JButton btnRejectChoosenRequest;
	private JLabel lblTheRespons;
	
	
	/**
	 * Create the panel.
	 */
	public SendResponse(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Send response");
		path.setText("Login/Administrator Window/Send Response");
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblTheRespons.setVisible(false);
			}
		});
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), null, null, null, null},
				{new Integer(2), null, null, null, null},
				{new Integer(3), null, null, null, null},
				{new Integer(4), null, null, null, null},
				{new Integer(5), null, null, null, null},
				{new Integer(6), null, null, null, null},
				{new Integer(7), null, null, null, null},
				{new Integer(8), null, null, null, null},
				{new Integer(9), null, null, null, null},
				{new Integer(10), null, null, null, null},
			},
			new String[] {
				"Request Number", "Plan Name", "1# Discount", "2# Discount", "3# Discount"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(114);
		table.getColumnModel().getColumn(0).setMinWidth(41);
		table.getColumnModel().getColumn(2).setPreferredWidth(93);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(94);
		table.getColumnModel().getColumn(4).setPreferredWidth(87);
		table.setBackground(new Color(255, 255, 204));
		table.setBounds(157, 129, 571, 160);
		
		//table.setc
		add(table);
		
		lblRequestNumber = new JLabel("Request Number");
		lblRequestNumber.setForeground(new Color(255, 255, 204));
		lblRequestNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRequestNumber.setBounds(157, 101, 136, 27);
		add(lblRequestNumber);
		
		lblPlanName = new JLabel("Plan Name");
		lblPlanName.setForeground(new Color(255, 255, 204));
		lblPlanName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlanName.setBounds(294, 101, 89, 27);
		add(lblPlanName);
		
		lblDiscount = new JLabel("1# Discount");
		lblDiscount.setForeground(new Color(255, 255, 204));
		lblDiscount.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiscount.setBounds(392, 101, 105, 27);
		add(lblDiscount);
		
		lblDiscount_1 = new JLabel("2# Discount");
		lblDiscount_1.setForeground(new Color(255, 255, 204));
		lblDiscount_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiscount_1.setBounds(508, 101, 105, 27);
		add(lblDiscount_1);
		
		lblDiscount_2 = new JLabel("3# Discount");
		lblDiscount_2.setForeground(new Color(255, 255, 204));
		lblDiscount_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiscount_2.setBounds(624, 101, 104, 27);
		add(lblDiscount_2);
		
		btnApproveChoosenRequest = new JButton("Approve chosen request");
	
		btnApproveChoosenRequest.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnApproveChoosenRequest.setBackground(new Color(255, 255, 204));
		btnApproveChoosenRequest.setBounds(157, 339, 240, 40);
		add(btnApproveChoosenRequest);
		
		btnRejectChoosenRequest = new JButton("Reject chosen request");
		
		btnRejectChoosenRequest.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRejectChoosenRequest.setBackground(new Color(255, 255, 204));
		btnRejectChoosenRequest.setBounds(485, 339, 240, 40);
		add(btnRejectChoosenRequest);
		
		lblTheRespons = new JLabel("The response sent successfully");
		lblTheRespons.setForeground(new Color(255, 255, 204));
		lblTheRespons.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTheRespons.setBounds(317, 408, 296, 27);
		add(lblTheRespons);
		lblTheRespons.setVisible(false);
		
	
		btnApproveChoosenRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//System.out.println("approve");
				int chosenRow =table.getSelectedRow();
				if(chosenRow != -1)
				{
					//System.out.println(chosenRow);
					int reqNum = (int) table.getValueAt(chosenRow, 0);
					System.out.println(reqNum);
					ArrayList<String> toController= new ArrayList<String>();
					//toController.add(0,""); //for method name
					toController.add(String.valueOf(reqNum)); // request number
					toController.add("true"); // request number
					AdministratorController.SendRequestRespond(toController, owner);
					((DefaultTableModel)table.getModel()).removeRow(chosenRow);
					lblTheRespons.setVisible(true);
				}
				
			} // end approve action
		});
		
		btnRejectChoosenRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("reject");
				int chosenRow =table.getSelectedRow();
				if(chosenRow != -1)
				{
					//System.out.println(chosenRow);
					int reqNum = (int) table.getValueAt(chosenRow, 0);
					//System.out.println(reqNum);
					ArrayList<String> toController= new ArrayList<String>();
					//toController.add(0,""); //for method name
					toController.add(String.valueOf(reqNum)); // request number
					toController.add("false"); // respond
					AdministratorController.SendRequestRespond(toController, owner);
					((DefaultTableModel)table.getModel()).removeRow(chosenRow);
					lblTheRespons.setVisible(true);
				}
				
			} //and reject action
		}); 

	}// end constructor
	
	public void displayAnswer(ArrayList<String> resultset) {}
}
