package view;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Java1234InterFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java1234InterFrm frame = new Java1234InterFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Java1234InterFrm() {
		getContentPane().setBackground(Color.RED);
		getContentPane().setForeground(Color.BLACK);
		setIconifiable(true);
		setClosable(true);
		try {
			setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("\u5173\u4E8Ejava1234");
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Java1234InterFrm.class.getResource("/images/java1234.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(119, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(105))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(93)
					.addComponent(lblNewLabel)
					.addContainerGap(103, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
