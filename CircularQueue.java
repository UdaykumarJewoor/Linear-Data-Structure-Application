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
import javax.swing.SwingConstants;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField Element;
	private JTextField display;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 751, 495);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		heading.setForeground(new Color(255, 0, 0));
		heading.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		heading.setBounds(190, 10, 379, 24);
		contentPane.add(heading);
		
		JLabel lblEnterAnElement = new JLabel("ENTER CIRCULAR QUEUE SIZE");
		lblEnterAnElement.setForeground(new Color(0, 128, 0));
		lblEnterAnElement.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEnterAnElement.setBounds(10, 85, 235, 31);
		contentPane.add(lblEnterAnElement);
		
		length = new JTextField();
		length.setBounds(280, 85, 235, 31);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE CIRCULAR QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
                    //Creating Circular Queue
				
				size=Integer.valueOf(length.getText());
				cq=new int[size];
				String messege="Circular Queue of size"+" "+size+" "+"Created";
				JOptionPane.showMessageDialog(contentPane, messege);
			}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(contentPane, "Please enter valid Circular Queue size");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Unicode MS", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(248, 153, 306, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblEnterAnElement_2 = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAnElement_2.setForeground(new Color(255, 0, 255));
		lblEnterAnElement_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEnterAnElement_2.setBounds(10, 237, 179, 43);
		contentPane.add(lblEnterAnElement_2);
		
		Element = new JTextField();
		Element.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Element.setColumns(10);
		Element.setBounds(248, 237, 156, 31);
		contentPane.add(Element);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try
				{
                  //Insertion Code for CircularQueue
				
				int elem;
				  
				  if(count==size)
				  {
					  JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
				  }
				  else
				  {
					  elem=Integer.valueOf(Element.getText());
					  r=(r+1)%size;
					  cq[r]=elem;
					  count++;
					  String messege="Element inserted at"+" "+cq[r];
					  JOptionPane.showMessageDialog(contentPane, messege);
					  Element.setText("");
				  }
			}
				catch (Exception e2) 
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
				}
				}
		});
		btnInsert.setForeground(new Color(255, 128, 64));
		btnInsert.setFont(new Font("Arial Unicode MS", Font.PLAIN, 16));
		btnInsert.setBounds(451, 237, 156, 31);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try
				{
				//Deletion Code for Circular Queue
					
				 if(count==0)
				  {
					 JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				  }
				  else
				  {
					  String messege="Element got Deleted"+" "+cq[f];
					  JOptionPane.showMessageDialog(contentPane, messege);
					  f=(f+1)%size;
					  count--;
				  }
			}
				catch (Exception e3)
				{
					 JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				}
		});
		btnDelete.setForeground(new Color(255, 128, 64));
		btnDelete.setFont(new Font("Arial Unicode MS", Font.PLAIN, 16));
		btnDelete.setBounds(292, 297, 179, 31);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					
					
					
				//Displaying Code for CircularQueue
					
				int f1=f;
				String msg="";
				  if(count==0)
				  {
					  JOptionPane.showMessageDialog(contentPane, "Displaying Not Possible");
				  }
				  else
				  {
						  for(int i=1;i<=count;i++)
						  {
							  msg=msg+" "+cq[f1];
							  f1=(f1+1)%size;
						  }
						  display.setText(msg);
					  }
			}
				catch (Exception e4) 
				{
					 JOptionPane.showMessageDialog(contentPane, "Displaying Not Possible");
				}
				}
		});
		btnDisplay.setForeground(new Color(0, 0, 255));
		btnDisplay.setFont(new Font("Baskerville Old Face", Font.PLAIN, 19));
		btnDisplay.setBounds(48, 353, 156, 31);
		contentPane.add(btnDisplay);
		
		display = new JTextField();
		display.setColumns(10);
		display.setBounds(264, 354, 385, 31);
		contentPane.add(display);
		
		JButton home4 = new JButton("HOME");
		home4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Home().setVisible(true);
			}
		});
		home4.setForeground(new Color(0, 0, 255));
		home4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		home4.setBounds(618, 415, 109, 33);
		contentPane.add(home4);
	}
}