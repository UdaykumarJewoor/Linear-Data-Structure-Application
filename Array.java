package com.project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField Element;
	private JTextField InsertPosition;
	private JTextField Delete;
	private int arr[];
	private JTextField displaybox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 751, 495);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ads = new JLabel("ARRAY DATA STRUCTURE");
		ads.setForeground(new Color(255, 0, 128));
		ads.setFont(new Font("Baskerville Old Face", Font.PLAIN, 25));
		ads.setBounds(242, 10, 314, 26);
		contentPane.add(ads);
		
		JLabel eal = new JLabel("ENTER ARRAY LENGTH :");
		eal.setForeground(new Color(255, 0, 255));
		eal.setFont(new Font("Arial", Font.PLAIN, 20));
		eal.setBounds(27, 74, 238, 24);
		contentPane.add(eal);
		
		length = new JTextField();
		length.setBounds(282, 74, 148, 23);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton cr = new JButton("CREATE ARRAY");
		cr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try 
				{
					//Code for Creating Array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String messege="Array of Length"+" "+len+" "+"Created";
				JOptionPane.showMessageDialog(contentPane, messege);
				length.setText("");
			}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(contentPane, "Negative array cannot be created");
				}
			}
		});
		cr.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		cr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		cr.setForeground(new Color(0, 0, 255));
		cr.setBounds(309, 117, 213, 32);
		contentPane.add(cr);
		
		JLabel eaie = new JLabel("ENTER AN INTEGER ELEMENT");
		eaie.setFont(new Font("Arial", Font.PLAIN, 15));
		eaie.setForeground(new Color(128, 0, 0));
		eaie.setBounds(27, 185, 226, 18);
		contentPane.add(eaie);
		
		Element = new JTextField();
		Element.setColumns(10);
		Element.setBounds(263, 186, 80, 26);
		contentPane.add(Element);
		
		JLabel p = new JLabel("POSITION");
		p.setForeground(new Color(128, 0, 0));
		p.setFont(new Font("Arial", Font.PLAIN, 15));
		p.setBounds(353, 185, 74, 18);
		contentPane.add(p);
		
		InsertPosition = new JTextField();
		InsertPosition.setColumns(10);
		InsertPosition.setBounds(453, 186, 87, 26);
		contentPane.add(InsertPosition);
		
		JButton i = new JButton("INSERT");
		i.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				//Code for Insertion
					
				int elem=Integer.valueOf(Element.getText());
				int pos=Integer.valueOf(InsertPosition.getText());
				if (pos<arr.length)
				{
					arr[pos]=elem;
					String messege="Element "+elem+" inserted at position "+pos;
					JOptionPane.showMessageDialog(contentPane, messege);
					Element.setText("");
					InsertPosition.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Give valid position");
					InsertPosition.setText("");
				}
			}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
			}
		});
		i.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		i.setBounds(577, 183, 122, 29);
		contentPane.add(i);
		
		JLabel etp = new JLabel("ENTER THE POSITION");
		etp.setForeground(new Color(64, 128, 128));
		etp.setFont(new Font("Arial", Font.PLAIN, 15));
		etp.setBounds(27, 255, 165, 18);
		contentPane.add(etp);
		
		Delete = new JTextField();
		Delete.setColumns(10);
		Delete.setBounds(221, 247, 122, 26);
		contentPane.add(Delete);
		
		JButton d = new JButton("DELETE");
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Code for Deletion
				int pos=Integer.valueOf(Delete.getText());
				if(pos<arr.length)
				{
				arr[pos]=0;
				String messege="Element Deleted at "+pos+" position";
				JOptionPane.showMessageDialog(contentPane, messege);
				Delete.setText("");
			    }
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
			}
				catch(Exception e3)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
			}
		});
		d.setForeground(new Color(0, 0, 0));
		d.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		d.setBounds(377, 248, 145, 25);
		contentPane.add(d);
		
		JButton dp = new JButton("DISPLAY");
		dp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				//Code for Displaying the Contents
				
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
				catch(Exception e4)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				}
		});
		dp.setForeground(new Color(0, 64, 128));
		dp.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		dp.setBounds(301, 304, 129, 44);
		contentPane.add(dp);
		
		displaybox = new JTextField();
		displaybox.setBounds(147, 368, 479, 37);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton home1 = new JButton("HOME");
		home1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Home().setVisible(true);
			}
		});
		home1.setForeground(new Color(0, 0, 255));
		home1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		home1.setBounds(633, 411, 94, 37);
		contentPane.add(home1);
	}
}
