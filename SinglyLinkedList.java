package com.project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField ElementA;
	private JTextField ElementB;
	private JTextField display;

	class Node
	{
		int data;
		Node link;
	}
	
	Node first;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 751, 495);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		Heading.setForeground(new Color(255, 0, 0));
		Heading.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Heading.setBounds(168, 20, 402, 24);
		contentPane.add(Heading);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setForeground(new Color(0, 128, 0));
		lblEnterAnElement.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		lblEnterAnElement.setBounds(10, 71, 175, 36);
		contentPane.add(lblEnterAnElement);
		
		ElementA = new JTextField();
		ElementA.setBounds(231, 71, 167, 24);
		contentPane.add(ElementA);
		ElementA.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Insert Rear Code for Linked List
				
				Node temp;
			    int elem1=Integer.valueOf(ElementA.getText());
			    String messege=elem1+" Element Inserted at Rear end";
			    JOptionPane.showMessageDialog(contentPane, messege);
			    ElementA.setText("");
				
				Node newnode=new Node();
				newnode.data=elem1;
				newnode.link=null;
				
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
				}
			}
				catch (Exception e1) 
				{
					 JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
					 ElementA.setText("");
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(433, 72, 175, 27);
		contentPane.add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE REAR");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Delete Rear End code for Linked List
				
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.link==null)
				{
					String messege="Element Got Rear End"+" "+first.link;
					JOptionPane.showMessageDialog(contentPane, messege);
					first=null;
				}
				else
				{
					Node temp = first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					String messege="Element Got Element at Rear End"+" "+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, messege);
					temp.link=null;
					ElementA.setText("");
				}
			}
				catch (Exception e2) 
				{
					 JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
			}
		});
		btnDelete.setForeground(Color.MAGENTA);
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 15));
		btnDelete.setBounds(283, 130, 167, 27);
		contentPane.add(btnDelete);
		
		JLabel lblEnterAnElement_1 = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement_1.setForeground(new Color(0, 0, 255));
		lblEnterAnElement_1.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		lblEnterAnElement_1.setBounds(10, 200, 175, 36);
		contentPane.add(lblEnterAnElement_1);
		
		ElementB = new JTextField();
		ElementB.setColumns(10);
		ElementB.setBounds(245, 200, 167, 24);
		contentPane.add(ElementB);
		
		JButton btnInsertFront_1 = new JButton("INSERT FRONT");
		btnInsertFront_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Insertion Code at Front End of Singly Linked List
				
				int elem2=Integer.valueOf(ElementB.getText());
				String messege=elem2+" Element Inserted at Front End";
				JOptionPane.showMessageDialog(contentPane, messege);
				ElementB.setText("");
		           
		           Node newnode=new Node();
		           newnode.data=elem2;
		           newnode.link=null;
		           
		           if(first==null)
		           {
		        	   first=newnode;
		           }
		           else
		           {
		        	   newnode.link=first;
		        	   first=newnode;
		           }
			}
				catch (Exception e3) 
				{
					 JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
					 ElementA.setText("");
				}
				}
		});
		btnInsertFront_1.setForeground(new Color(64, 0, 64));
		btnInsertFront_1.setFont(new Font("Arial", Font.PLAIN, 15));
		btnInsertFront_1.setBounds(433, 197, 147, 27);
		contentPane.add(btnInsertFront_1);
		
		JButton btnInsertFront = new JButton("DELETE FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Deletion At Front Code In Singly Linked List
				
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.link==null)
				{
					first=null;
				}
				else
				{
					String messege="Element Deleted at Front End"+" "+first.data;
					JOptionPane.showMessageDialog(contentPane, messege);
					first=first.link;
				}
			}
				catch (Exception e4) 
				{
					 JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				}
		});
		btnInsertFront.setForeground(new Color(64, 0, 64));
		btnInsertFront.setFont(new Font("Arial", Font.PLAIN, 15));
		btnInsertFront.setBounds(271, 255, 180, 27);
		contentPane.add(btnInsertFront);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Displaying Contents code in Singly Linked List
				
				String msg="";
				Node  temp ;
				if(first==null)
				{
					display.setText("");
					JOptionPane.showMessageDialog(contentPane, "Displaying Not Possible");
				}
				else if(first.link==null)
				{
					msg=msg+" "+first.data;
					display.setText(msg);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
						}
					display.setText(msg);
			}
			}
				catch (Exception e5) 
				{
				 JOptionPane.showMessageDialog(contentPane, "Displaying Not Possible");
				}
			}
				});
		btnDisplay.setForeground(new Color(255, 128, 64));
		btnDisplay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnDisplay.setBounds(271, 317, 180, 27);
		contentPane.add(btnDisplay);
		
		display = new JTextField();
		display.setColumns(10);
		display.setBounds(140, 375, 417, 27);
		contentPane.add(display);
		
		JButton home5 = new JButton("HOME");
		home5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Home().setVisible(true);
			}
		});
		home5.setForeground(Color.BLUE);
		home5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		home5.setBounds(633, 411, 94, 37);
		contentPane.add(home5);
	}
}