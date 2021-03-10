package lab3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Lab4 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab4 window = new Lab4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lab4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 744, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(263, 40, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(263, 109, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btn1 = new JButton("ADD");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c=0;
				
				c=a+b;
				result.setText(String.valueOf(c));
			}
		});
		btn1.setBounds(235, 162, 89, 23);
		frame.getContentPane().add(btn1);
		
		result = new JTextField();
		result.setBounds(263, 219, 86, 20);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("number1");
		lblNewLabel.setBounds(123, 43, 70, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("number2");
		lblNewLabel_1.setBounds(123, 112, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("add button");
		lblNewLabel_3.setBounds(123, 166, 90, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("result");
		lblNewLabel_2.setBounds(123, 222, 90, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(362, 162, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
