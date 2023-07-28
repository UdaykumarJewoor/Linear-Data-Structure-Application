package com.project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField ElementA;
	private JTextField ElementB;
	private JTextField display;
	
	class Node
	{
		int data;
		Node prelink;
		Node nextlink;
	}
	
   private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 751, 495);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(160, 10, 411, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setForeground(new Color(0, 0, 255));
		lblEnterAnElement.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblEnterAnElement.setBounds(10, 87, 192, 21);
		contentPane.add(lblEnterAnElement);
		
		ElementA = new JTextField();
		ElementA.setBounds(240, 83, 168, 33);
		contentPane.add(ElementA);
		ElementA.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Insertion code at Rear End of Doubly Linked List
				
				Node temp;
		    	int elem=Integer.valueOf(ElementA.getText());
		    	String messege=elem+" Element Inserted at Rear End";
		    	JOptionPane.showMessageDialog(contentPane, messege);
		    	ElementA.setText("");  
		    	
		    	Node newnode=new Node();
		    	newnode.data=elem;
		    	newnode.prelink=null;
		    	newnode.nextlink=null;
		    	
		    	if(first==null)
		    	{
		    		first=newnode;
		    	}
		    	else
		    	{
		    	 temp = first;
		    	 while(temp.nextlink !=null)
		    	 {
		    		 temp=temp.nextlink;
		    	 }
		    	 temp.nextlink=newnode;
		    	 newnode.prelink=temp;
		    	}
			}
				catch (Exception e1) 
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
					ElementA.setText("");  
				}
				}
		});
		btnNewButton.setForeground(new Color(255, 0, 255));
		btnNewButton.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		btnNewButton.setBounds(446, 81, 153, 33);
		contentPane.add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE REAR");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Deletion code at Rear End for Doubly Linked List
					
				String msg="";
				Node temp;
		    	if(first==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
		    	}
		    	else if(first.nextlink==null)
		    	{
                   msg=msg+" "+first.data;		    		
		    		first=null;
		    	}
		    	else
		    	{
		    		temp=first;
		    		while(temp.nextlink.nextlink!=null)
		    		{
		    			temp=temp.nextlink;
		    		}
		    		String messege="Element Got Element at Rear End"+" "+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, messege);
		    		temp.nextlink=null;
		    		ElementA.setText("");
		    	}
			}
				catch (Exception e2) 
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
					ElementA.setText("");  
				}
				}
		});
		btnDelete.setForeground(Color.MAGENTA);
		btnDelete.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		btnDelete.setBounds(302, 135, 153, 33);
		contentPane.add(btnDelete);
		
		JLabel lblEnterAnElement_1 = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement_1.setForeground(Color.BLUE);
		lblEnterAnElement_1.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblEnterAnElement_1.setBounds(10, 199, 192, 21);
		contentPane.add(lblEnterAnElement_1);
		
		ElementB = new JTextField();
		ElementB.setColumns(10);
		ElementB.setBounds(240, 195, 168, 33);
		contentPane.add(ElementB);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Insertion code for Front End in Doubly Linked List
				
				int elem=Integer.valueOf(ElementB.getText());
				String messege=elem+" Element Inserted at Front End";
				JOptionPane.showMessageDialog(contentPane, messege);
				ElementB.setText("");
				
		    	Node newnode=new Node();
		        newnode.data=elem;
		        newnode.prelink=null;
		        newnode.nextlink=null;
		        
		        if(first==null)
		        {
		        	first=newnode;
		        }
		        else
		        {
		        	newnode.nextlink=first;
		        	first.prelink=newnode;
		        	first=newnode;
		        }
			}
				catch (Exception e3) 
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
					ElementB.setText("");
				}
			}
		});
		btnInsertFront.setForeground(new Color(0, 128, 0));
		btnInsertFront.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		btnInsertFront.setBounds(467, 193, 153, 33);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Deletion code for Front End at Doubly Linked List
				
				if(first==null)
		    	{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
		    	}
		    	else if(first.nextlink==null)
		    	{
		    		String messege="Element got Deleted at"+" "+first.data;
		    		JOptionPane.showMessageDialog(contentPane, messege);
		    		first=null;
		    	}
		    	else
		    	{
		    		String messege="Element got Deleted at"+" "+first.data;
		    		JOptionPane.showMessageDialog(contentPane, messege);
		    		first=first.nextlink;
		    		first.prelink=null;
		    	}
			}
				catch (Exception e4) 
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
					ElementB.setText("");
				}
			}
		});
		btnDeleteFront.setForeground(new Color(0, 128, 0));
		btnDeleteFront.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		btnDeleteFront.setBounds(302, 250, 153, 33);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplay = new JButton("DISPLAY FORWARD");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Displaying contents in Forward for Doubly Linked List
					
				String msg="";
				Node temp;
		    	if(first==null)
		    	{
		    		display.setText("");
		    		JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
		    	}
		    	else if(first.nextlink==null)
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
		    			temp=temp.nextlink;
		    		}
		    		display.setText(msg);
		    	}
			}
				catch (Exception e5) 
				{
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				  display.setText("");
				}
			}
		});
		btnDisplay.setForeground(new Color(255, 0, 0));
		btnDisplay.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		btnDisplay.setBounds(90, 310, 215, 31);
		contentPane.add(btnDisplay);
		
		display = new JTextField();
		display.setColumns(10);
		display.setBounds(58, 364, 601, 33);
		contentPane.add(display);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Displaying contents in Reverse Order in Doubly Linked List
				String msg="";
				Node temp;
		    	if(first==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
		    	}
		    	else if(first.nextlink==null)
		    	{
		    		msg=msg+" "+first.data;
		    		display.setText(msg);
		    	}
		    	else
		    	{
		    		temp=first;
		    		while(temp.nextlink!=null)
		    		{
		    			temp=temp.nextlink;
		    		}
		    		while(temp!=null)
		    		{
		    			msg=msg+" "+temp.data;
		    			temp=temp.prelink;
		    		}
		    		display.setText(msg);
		    	}
			}
		});
		btnDisplayReverse.setForeground(Color.RED);
		btnDisplayReverse.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		btnDisplayReverse.setBounds(397, 310, 202, 31);
		contentPane.add(btnDisplayReverse);
		
		JButton home6 = new JButton("HOME");
		home6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Home().setVisible(true);
			}
		});
		home6.setForeground(Color.BLUE);
		home6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		home6.setBounds(633, 411, 94, 37);
		contentPane.add(home6);
	}
}