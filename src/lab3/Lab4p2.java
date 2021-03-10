package lab3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.*;


public class Lab4p2 implements ActionListener{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField result;
	private JButton mult;
	private JButton div;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab4p2 window = new Lab4p2();
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
	public Lab4p2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 728, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(278, 21, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(278, 87, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton add = new JButton("ADD");
		add.setBounds(98, 149, 89, 23);
		frame.getContentPane().add(add);
		add.addActionListener(this);
		
		JButton sub = new JButton("SUB");
		sub.setBounds(221, 149, 89, 23);
		frame.getContentPane().add(sub);
		sub.addActionListener(this);
		
		mult = new JButton("MULT");
		mult.setBounds(356, 149, 89, 23);
		frame.getContentPane().add(mult);
		mult.addActionListener(this);
		
		result = new JTextField();
		result.setBounds(278, 200, 86, 20);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		div = new JButton("DIV");
		div.setBounds(474, 149, 89, 23);
		frame.getContentPane().add(div);
		div.addActionListener(this);
		
		JRadioButton male = new JRadioButton("MALE");
		buttonGroup.add(male);
		male.setBounds(265, 270, 109, 23);
		frame.getContentPane().add(male);
		male.addActionListener(this);
		
		JRadioButton female = new JRadioButton("FEMALE");
		buttonGroup.add(female);
		female.setBounds(265, 320, 109, 23);
		frame.getContentPane().add(female);
		female.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		/*
		JOptionPane.showMessageDialog(frame, "Hello");
		
		String s1 = JOptionPane.showInputDialog(frame,"How old are you ?");
		JOptionPane.showMessageDialog(frame, "age is " + s1);
		*/
		
		if(ae.getActionCommand().contentEquals("MALE"))
		{
			JOptionPane.showMessageDialog(frame, "MALE");
		}
		
		else if(ae.getActionCommand().contentEquals("FEMALE"))
		{
			JOptionPane.showMessageDialog(frame, "FEMALE");
		}
		
		
		
		
		
		
		/*
		String s1 = t1.getText();
		String s2 = t2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c=0;
		if(ae.getActionCommand().equals("ADD"))
		{
			c=a+b;
		}
		else if(ae.getActionCommand().equals("SUB"))
		{
			c=a-b;
		}
		else if(ae.getActionCommand().equals("MULT"))
		{
			c=a*b;
		}
		else if(ae.getActionCommand().equals("DIV"))
		{
			c=a/b;
		}
		result.setText(String.valueOf(c)); 
		*/
		
	}
}