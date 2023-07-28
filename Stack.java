package com.project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField Element;
	private JTextField display;
	private int s[];
	private int size;
	private int top=-1;
 
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 751, 495);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("STACK DATA STRUCTURE");
		Heading.setForeground(new Color(255, 0, 0));
		Heading.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		Heading.setBounds(211, 31, 251, 20);
		contentPane.add(Heading);
		
		JLabel lblEnterAStack = new JLabel("ENTER A STACK SIZE :");
		lblEnterAStack.setForeground(new Color(255, 0, 255));
		lblEnterAStack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblEnterAStack.setBounds(10, 97, 206, 21);
		contentPane.add(lblEnterAStack);
		
		sizefield = new JTextField();
		sizefield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sizefield.setBounds(267, 93, 140, 35);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton cs = new JButton("CREATE STACK");
		cs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				//Code for Creating Array
				
				 size=Integer.valueOf(sizefield.getText());
					s=new int[size];
					String messege="Stack of Size " +" "+size+" "+"Created";
					JOptionPane.showMessageDialog(contentPane, messege);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(contentPane, "Please enter valid stack size");
				}
				
				
			}
		});
		cs.setFont(new Font("Arial", Font.PLAIN, 16));
		cs.setForeground(new Color(0, 64, 0));
		cs.setBounds(221, 148, 241, 27);
		contentPane.add(cs);
		
		JLabel ee = new JLabel("ENTER AN ELEMENT");
		ee.setForeground(new Color(0, 0, 128));
		ee.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		ee.setBounds(51, 214, 206, 21);
		contentPane.add(ee);
		
		Element = new JTextField();
		Element.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Element.setColumns(10);
		Element.setBounds(267, 216, 174, 23);
		contentPane.add(Element);
		
		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Push Code
				
				int elm;
				  
				  if(top==size-1)
				  {
					  JOptionPane.showMessageDialog(contentPane, "Push Not Possible");
					  JOptionPane.showMessageDialog(contentPane, "Stack size out of bound");
					  Element.setText("");
				  }
				  else
				  {
					  elm=Integer.valueOf(Element.getText());
					  ++top;
					s[top]=elm;
					JOptionPane.showMessageDialog(contentPane, "Push is Possible");
					JOptionPane.showMessageDialog(contentPane, "Element "+ s[top]+" is pushed "+" in a stack at position "+top);
					Element.setText("");
				  }
			}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
					JOptionPane.showMessageDialog(contentPane, "Array index out of bound");
				}
			}
		});
		btnPush.setForeground(new Color(0, 0, 255));
		btnPush.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPush.setBounds(501, 212, 101, 27);
		contentPane.add(btnPush);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Pop Code
				
				 if(top==-1)
				  {
					 JOptionPane.showMessageDialog(contentPane, "Pop Not possible");
				  }
				  else
				  {
					  String messege="Element Deleted is"+" "+s[top];
					  JOptionPane.showMessageDialog(contentPane, messege);
					  --top;
				  }
			}
			catch(Exception e2)
				{
				   JOptionPane.showMessageDialog(contentPane, "Pop Not possible");
				}
			}
		});
		pop.setForeground(new Color(0, 51, 255));
		pop.setFont(new Font("Arial", Font.PLAIN, 16));
		pop.setBounds(309, 268, 98, 27);
		contentPane.add(pop);
		
		JButton d = new JButton("DISPLAY");
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Display Code
				
				String  msg="";
				 if(top==-1)
				  {
					 JOptionPane.showMessageDialog(contentPane, "Display Not possible");
				     display.setText("");
				  }
				  else
				  {
					  for(int i=top;i>=0;i--)
					  {
						msg=msg+" "+s[i];
					  }
					  display.setText(msg);
				  }
			}
				catch(Exception e3)
				{
				   JOptionPane.showMessageDialog(contentPane, "Display Not possible");
				}
			}
		});
		d.setForeground(new Color(128, 0, 255));
		d.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		d.setBounds(289, 324, 142, 35);
		contentPane.add(d);
		
		display = new JTextField();
		display.setColumns(10);
		display.setBounds(170, 383, 399, 27);
		contentPane.add(display);
		
		JButton home2 = new JButton("HOME");
		home2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Home().setVisible(true);
			}
		});
		home2.setForeground(Color.BLUE);
		home2.setFont(new Font("Arial", Font.PLAIN, 16));
		home2.setBounds(612, 421, 101, 27);
		contentPane.add(home2);
	}
}