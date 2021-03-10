package lab3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Lab3p1 {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JLabel lblText;
	private JTextField tf3;
	private JTextField tf4;
	private JLabel lblNewLabel;
	private JLabel lblText_1;
	private JTextField tf5;
	private JTextField tf6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab3p1 window = new Lab3p1();
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
	public Lab3p1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				tf2.setText(tf1.getText());
			}
		});
		tf1.setBounds(85, 47, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		
		tf2.setBounds(85, 145, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel Textbox1 = new JLabel("Text1");
		Textbox1.setBounds(29, 50, 46, 14);
		frame.getContentPane().add(Textbox1);
		
		lblText = new JLabel("Text2");
		lblText.setBounds(29, 148, 46, 14);
		frame.getContentPane().add(lblText);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tf2.setText("Hello");
			}
		});
		btnNewButton.setBounds(183, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tf3 = new JTextField();
		tf3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				tf4.setText("Focus Gained");
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				tf4.setText("Focus Lost");
				
			}
		});
		
		tf3.setBounds(299, 47, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(299, 145, 86, 20);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		lblNewLabel = new JLabel("Text4");
		lblNewLabel.setBounds(220, 148, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblText_1 = new JLabel("Text3");
		lblText_1.setBounds(220, 50, 46, 14);
		frame.getContentPane().add(lblText_1);
		
		tf5 = new JTextField();
		tf5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				tf5.setEnabled(false);
				tf6.setEnabled(true);
			}		
		});
		
		tf5.setBounds(61, 295, 86, 20);
		frame.getContentPane().add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				tf6.setEnabled(false);
				tf5.setEnabled(true);
			}		
		});
		
		
		tf6.setBounds(61, 396, 86, 20);
		frame.getContentPane().add(tf6);
		tf6.setColumns(10);
	}
}