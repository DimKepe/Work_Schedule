
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class WindowInsertData {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowInsertData window = new WindowInsertData();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public WindowInsertData() {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		frame = new JFrame("Eisagwgh Ergasomenon");
		frame.setBounds(100, 100, 325, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		textField = new JTextField();
		textField.setBounds(150, 30, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(65, 30, 80, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(65, 60, 80, 14);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 60, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(65, 90, 80, 14);
		frame.getContentPane().add(lblBirthday);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 90, 86, 17);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
				
		JButton btnClear = new JButton("Clear");
		
		btnClear.setBounds(160, 150, 89, 23);
		frame.getContentPane().add(btnClear);
		
		
		JLabel lblOccupation = new JLabel("Occupation");
		lblOccupation.setBounds(65, 120, 67, 14);
		frame.getContentPane().add(lblOccupation);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Select");
		comboBox.addItem("Logistis");
		comboBox.addItem("SecurityGuard");
		comboBox.addItem("Grammateas");
		comboBox.addItem("YpefthinosMarketing");
		comboBox.addItem("Allo");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(150, 120, 91, 20);
		frame.getContentPane().add(comboBox);
		
		
		JButton btnSubmit = new JButton("Submit");
		
		btnSubmit.setBounds(65, 150, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty())||(comboBox.getSelectedItem().equals("Select")))
					JOptionPane.showMessageDialog(null, "Data Missing");
				else		
				JOptionPane.showMessageDialog(null, "Data Submitted");
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
				comboBox.setSelectedItem("Select");
				
				
			}
		});
		
	}
}
