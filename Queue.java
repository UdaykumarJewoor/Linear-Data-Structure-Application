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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField Element;
	private JTextField display;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 751, 495);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("QUEUE DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 255));
		heading.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		heading.setBounds(214, 10, 267, 24);
		contentPane.add(heading);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE :");
		lblEnterQueueSize.setForeground(new Color(255, 0, 0));
		lblEnterQueueSize.setFont(new Font("Arial", Font.BOLD, 16));
		lblEnterQueueSize.setBounds(18, 70, 163, 33);
		contentPane.add(lblEnterQueueSize);
		
		length = new JTextField();
		length.setBounds(241, 76, 194, 25);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				//Creating Queue
			    size=Integer.valueOf(length.getText());
				q=new int[size];
				String messege="Queue of Size"+" "+size+" "+"Created";
				JOptionPane.showMessageDialog(contentPane, messege);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(contentPane, "Please enter valid Queue size");
				}
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		btnNewButton.setBounds(203, 121, 278, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setForeground(new Color(0, 64, 64));
		lblEnterAnElement.setFont(new Font("Arial", Font.BOLD, 16));
		lblEnterAnElement.setBounds(10, 189, 171, 33);
		contentPane.add(lblEnterAnElement);
		
		Element = new JTextField();
		Element.setForeground(new Color(255, 0, 255));
		Element.setColumns(10);
		Element.setBounds(224, 189, 188, 33);
		contentPane.add(Element);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				//Insertion Code for Queue
				 int elem;
				  if(r==size-1)
				  {
					  JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
				      Element.setText("");
				  }
				  else
				  {
					 elem=Integer.valueOf(Element.getText());
					  ++r;
					  q[r]=elem;
					  String msg="Element Inserted at Queue is"+" "+q[r];
					  JOptionPane.showMessageDialog(contentPane,msg);
					  Element.setText("");
				  }
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
			}
		});
		btnInsert.setForeground(new Color(255, 0, 128));
		btnInsert.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		btnInsert.setBounds(462, 187, 177, 33);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Deletion code for Queue
				
				 if(r==-1 || f>r)
				  {
					 JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				  }
				  else
				  {
					  String messege="Element Deleted is"+" "+q[f];
					  JOptionPane.showMessageDialog(contentPane, messege);
					  ++f;
				  }
				}
				catch (Exception e3) 
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
			}
		});
		btnDelete.setForeground(new Color(0, 128, 64));
		btnDelete.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		btnDelete.setBounds(304, 250, 177, 33);
		contentPane.add(btnDelete);
		
		display = new JTextField();
		display.setBackground(new Color(255, 255, 255));
		display.setForeground(new Color(192, 192, 192));
		display.setColumns(10);
		display.setBounds(122, 376, 464, 33);
		contentPane.add(display);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Displaying Code for Queue
				
				String msg="";
				 if(r==-1 || f>r)
				  {
					 JOptionPane.showMessageDialog(contentPane, "Displaying Not Possible");
					 display.setText("");
				  }
				  else
				  {
					  for(int i=f;i<=r;i++)
					  {
						  msg=msg+" "+q[i];
					  }
					  display.setText(msg);
				  }
			}
				catch (Exception e3) 
				{
					JOptionPane.showMessageDialog(contentPane, "Displaying not possible");
				}
				}
		});
		btnDisplay.setForeground(new Color(0, 0, 0));
		btnDisplay.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		btnDisplay.setBounds(258, 321, 177, 32);
		contentPane.add(btnDisplay);
		
		JButton home3 = new JButton("HOME");
		home3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Home().setVisible(true);
			}
		});
		home3.setForeground(new Color(0, 0, 255));
		home3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		home3.setBounds(621, 415, 106, 33);
		contentPane.add(home3);
	
	}
}