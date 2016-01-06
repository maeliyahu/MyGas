package guiMarkeingEmloyee;

import gui.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import controllers.MarketingEmployeeController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ProduceCustomerRating extends FormPanel {

	/**
	 * this method create the Produce Customer Rating panel
	 * @param frame - the main window frame that containing the panels
	 * @param panelback - the previous panel
	 */
	public ProduceCustomerRating(JFrame frame,JPanel panelback) {
		super(frame,panelback);
		title.setText("Produce Customer Data Rating");
		path.setText("Login/Marketing Employee Window/Produce Customer Data Rating");
		
		JButton btnProduceCustomerData = new JButton("Produce Rating");
		btnProduceCustomerData.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnProduceCustomerData.setBounds(272, 210, 259, 48);
		add(btnProduceCustomerData);

		
		btnProduceCustomerData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarketingEmployeeController.produceCustomerRatingInDB();
			}
		});
	}
}
