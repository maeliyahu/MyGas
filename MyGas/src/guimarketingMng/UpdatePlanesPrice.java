package guimarketingMng;

import gui.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import controllers.AdministratorController;
import controllers.MarketingMngController;

public class UpdatePlanesPrice extends FormPanel {
	private JTable table;
	private JLabel lblRequestNumber;
	private JLabel lblPlanName;
	private JLabel lblDiscount;
	private JLabel lblDiscount_1;
	private JLabel lblDiscount_2;
	private JButton btUpdatePlanPrice;
	private JLabel lblTheUpdate;
	private JLabel lblApprovednotApproved;
	private JLabel lblTheRequestIs;
	
	/**
	 * Create the panel.
	 */
	public UpdatePlanesPrice(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Update Planes Price Window");
		path.setText("Login/marketing Manager/Update Planes Price");
		
		

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblTheUpdate.setVisible(false);
				lblTheRequestIs.setVisible(false);
			}
		});
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), null, null, null, null, "false"},
				{new Integer(2), null, null, null, null, "false"},
				{new Integer(3), null, null, null, null, "false"},
				{new Integer(4), null, null, null, null, "false"},
				{new Integer(5), null, null, null, null, "false"},
				{new Integer(6), null, null, null, null, "false"},
				{new Integer(7), null, null, null, null, "false"},
				{new Integer(8), null, null, null, null, "false"},
				{new Integer(9), null, null, null, null, "false"},
				{new Integer(10), null, null, null, null, "false"},
			},
			new String[] {
				"Request Number", "Plan Name", "1# Discount", "2# Discount", "3# Discount", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, String.class
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
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.setBackground(new Color(255, 255, 204));
		table.setBounds(107, 131, 664, 160);
		
		//table.setc
		add(table);
		
		lblRequestNumber = new JLabel("Request Number");
		lblRequestNumber.setForeground(new Color(255, 255, 204));
		lblRequestNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRequestNumber.setBounds(107, 103, 136, 27);
		add(lblRequestNumber);
		
		lblPlanName = new JLabel("Plan Name");
		lblPlanName.setForeground(new Color(255, 255, 204));
		lblPlanName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlanName.setBounds(242, 103, 89, 27);
		add(lblPlanName);
		
		lblDiscount = new JLabel("1# Discount");
		lblDiscount.setForeground(new Color(255, 255, 204));
		lblDiscount.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiscount.setBounds(330, 103, 105, 27);
		add(lblDiscount);
		
		lblDiscount_1 = new JLabel("2# Discount");
		lblDiscount_1.setForeground(new Color(255, 255, 204));
		lblDiscount_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiscount_1.setBounds(447, 103, 105, 27);
		add(lblDiscount_1);
		
		lblDiscount_2 = new JLabel("3# Discount");
		lblDiscount_2.setForeground(new Color(255, 255, 204));
		lblDiscount_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiscount_2.setBounds(554, 103, 104, 27);
		add(lblDiscount_2);
		
		btUpdatePlanPrice = new JButton("Update Plan Price");
	
		btUpdatePlanPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btUpdatePlanPrice.setBackground(new Color(255, 255, 204));
		btUpdatePlanPrice.setBounds(323, 328, 240, 40);
		add(btUpdatePlanPrice);
		
		lblTheUpdate = new JLabel("The update went successfully");
		lblTheUpdate.setForeground(new Color(255, 255, 204));
		lblTheUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTheUpdate.setBounds(323, 392, 246, 27);
		add(lblTheUpdate);
		
		lblApprovednotApproved = new JLabel("Approved/Not");
		lblApprovednotApproved.setForeground(new Color(255, 255, 204));
		lblApprovednotApproved.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApprovednotApproved.setBounds(664, 103, 147, 27);
		add(lblApprovednotApproved);
		
		lblTheRequestIs = new JLabel("This request is already updated");
		lblTheRequestIs.setForeground(Color.RED);
		lblTheRequestIs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTheRequestIs.setBounds(330, 297, 233, 27);
		add(lblTheRequestIs);
		lblTheRequestIs.setVisible(false);
		lblTheUpdate.setVisible(false);
		
	
		btUpdatePlanPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTheRequestIs.setVisible(false);
				int chosenRow =table.getSelectedRow();
				if(chosenRow != -1)
				{
					//System.out.println(chosenRow);
					int reqNum = (int) table.getValueAt(chosenRow, 0);
					String isTrue = (String) table.getValueAt(chosenRow, 5);
					if(isTrue.equals("true"))
						lblTheRequestIs.setVisible(true);
					else
					{
					System.out.println(reqNum);
					ArrayList<String> toController= new ArrayList<String>();
					//toController.add(0,""); //for method name
					toController.add(String.valueOf(reqNum)); // request number
					//toController.add("true"); // 
					MarketingMngController.planPriceChangeRequest(toController);
					table.setValueAt("true", chosenRow,5);
					lblTheUpdate.setVisible(true);
					}
				}
				
			} // end approve action
		});
		
	}
}
