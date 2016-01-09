package guimarketingMng;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import gui.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import controllers.AdministratorController;
import controllers.MarketingMngController;

public class ActivateCampaignPattern extends FormPanel {
	private JTable table;
	private JLabel lblID;
	private JLabel lblStartDate;
	private JLabel lblEndDate;
	private JLabel lblStartHour;
	private JLabel lblEndHour;
	private JButton btUpdatePlanPrice;
	private JLabel lblTheUpdate;
	private JLabel lbldiscount;
	/**
	 * Create the panel.
	 */
	public ActivateCampaignPattern(JFrame frame,JPanel panelback ) {
		super(frame,panelback);
		title.setText("Activate Campaign Pattern Window");
		path.setText("Login/marketing Manager/Activate Campaign Pattern");
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblTheUpdate.setVisible(false);
	
			}
		});
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), null, null, null, null, null},
				{new Integer(2), null, null, null, null, null},
				{new Integer(3), null, null, null, null, null},
				{new Integer(4), null, null, null, null, null},
				{new Integer(5), null, null, null, null, null},
				{new Integer(6), null, null, null, null, null},
				{new Integer(7), null, null, null, null, null},
				{new Integer(8), null, null, null, null, null},
				{new Integer(9), null, null, null, null, null},
				{new Integer(10), null, null, null, null, null},
			},
			new String[] {
				"ID", "Start Date", "End Date", "Start Hour", "End Hour", "Discount"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(77);
		table.getColumnModel().getColumn(0).setMinWidth(41);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(99);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.setBackground(new Color(255, 255, 204));
		table.setBounds(107, 131, 664, 160);
		
		//table.setc
		add(table);
		
		lblID = new JLabel("ID");
		lblID.setForeground(new Color(255, 255, 204));
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(114, 103, 129, 27);
		add(lblID);
		
		lblStartDate = new JLabel("Start Date");
		lblStartDate.setForeground(new Color(255, 255, 204));
		lblStartDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStartDate.setBounds(206, 103, 89, 27);
		add(lblStartDate);
		
		lblEndDate = new JLabel("End Date");
		lblEndDate.setForeground(new Color(255, 255, 204));
		lblEndDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndDate.setBounds(323, 103, 105, 27);
		add(lblEndDate);
		
		lblStartHour = new JLabel("Start Hour");
		lblStartHour.setForeground(new Color(255, 255, 204));
		lblStartHour.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStartHour.setBounds(431, 103, 111, 27);
		add(lblStartHour);
		
		lblEndHour = new JLabel("End Hour");
		lblEndHour.setForeground(new Color(255, 255, 204));
		lblEndHour.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndHour.setBounds(547, 103, 111, 27);
		add(lblEndHour);
		
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
		
		lbldiscount = new JLabel("Discount %");
		lbldiscount.setForeground(new Color(255, 255, 204));
		lbldiscount.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbldiscount.setBounds(664, 103, 147, 27);
		add(lbldiscount);
		lblTheUpdate.setVisible(false);
		
	
		btUpdatePlanPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int chosenRow =table.getSelectedRow();
				if(chosenRow != -1)
				{
					//System.out.println(chosenRow);
					int reqNum = (int) table.getValueAt(chosenRow, 0);
					
					System.out.println(reqNum);
					ArrayList<String> toController= new ArrayList<String>();
					//toController.add(0,""); //for method name
					toController.add(String.valueOf(reqNum)); // campaign number

					MarketingMngController.activateCampingPatten(toController, owner);
					((DefaultTableModel)table.getModel()).removeRow(chosenRow);
					lblTheUpdate.setVisible(true);

				}
				
			} // end approve action
		});
	}

}
