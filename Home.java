package com.project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtOrderlyInsertionAnd;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField txtOrderlyInsertionAnd_1;
	private JTextField textField_3;
	private JTextField txtSpecialVersionOf;
	private JTextField txtALinearData;
	private JTextField txtEnhancedVersionOf;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtRandomInsertionAnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 702);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Headiing = new JLabel("CHOOSE A DATA STRUCTURE");
		Headiing.setHorizontalAlignment(SwingConstants.CENTER);
		Headiing.setForeground(new Color(255, 0, 0));
		Headiing.setFont(new Font("Baskerville Old Face", Font.PLAIN, 28));
		Headiing.setBounds(313, 23, 532, 40);
		contentPane.add(Headiing);
		
		JButton arr = new JButton("ARRAYS");
		arr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//PLACE ARRAY WINDOW OPENING CODE HERE
				
				new Array().setVisible(true);
			}
		});
		arr.setForeground(new Color(0, 0, 255));
		arr.setFont(new Font("Arial", Font.PLAIN, 16));
		arr.setBounds(52, 98, 160, 43);
		contentPane.add(arr);
		
		JButton Stack = new JButton("STACK");
		Stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Place Window Opening Code Here
				new Stack().setVisible(true);
			}
		});
		Stack.setForeground(new Color(0, 0, 255));
		Stack.setFont(new Font("Arial", Font.PLAIN, 16));
		Stack.setBounds(905, 178, 173, 43);
		contentPane.add(Stack);
		
		JButton Queue = new JButton("QUEUE");
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place window Opening Code here
				new Queue().setVisible(true);
			}
		});
		Queue.setForeground(new Color(0, 0, 255));
		Queue.setFont(new Font("Arial", Font.PLAIN, 16));
		Queue.setBounds(905, 276, 173, 40);
		contentPane.add(Queue);
		
		JButton Circularqueue = new JButton("CIRCULARQUEUE");
		Circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place window Opening Code here
				new CircularQueue().setVisible(true);
			}
		});
		Circularqueue.setForeground(new Color(0, 0, 255));
		Circularqueue.setFont(new Font("Arial", Font.PLAIN, 16));
		Circularqueue.setBounds(904, 356, 173, 43);
		contentPane.add(Circularqueue);
		
		JButton Linkedlist = new JButton("SINGLY LINKED LIST");
		Linkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place window Opening Code here
			    new SinglyLinkedList().setVisible(true);
			}
		});
		Linkedlist.setForeground(new Color(0, 0, 255));
		Linkedlist.setFont(new Font("Arial", Font.PLAIN, 16));
		Linkedlist.setBounds(43, 476, 202, 43);
		contentPane.add(Linkedlist);
		
		JButton btnDoublylinkedlst = new JButton("DOUBLY LINKED LST");
		btnDoublylinkedlst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place window Opening Code here
				new DoublyLinkedList().setVisible(true);
			}
		});
		btnDoublylinkedlst.setForeground(new Color(0, 0, 255));
		btnDoublylinkedlst.setFont(new Font("Arial", Font.PLAIN, 16));
		btnDoublylinkedlst.setBounds(43, 567, 202, 43);
		contentPane.add(btnDoublylinkedlst);
		
		textField = new JTextField();
		textField.setBounds(217, 120, 112, 6);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtOrderlyInsertionAnd = new JTextField();
		txtOrderlyInsertionAnd.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		txtOrderlyInsertionAnd.setHorizontalAlignment(SwingConstants.LEFT);
		txtOrderlyInsertionAnd.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		txtOrderlyInsertionAnd.setText("ORDERLY INSERTION AND DELETION OF ELEMENTS IN FORMAT OF FIRST IN LAST OUT");
		txtOrderlyInsertionAnd.setBounds(161, 178, 678, 43);
		contentPane.add(txtOrderlyInsertionAnd);
		txtOrderlyInsertionAnd.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(839, 198, 56, 6);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(839, 290, 56, 6);
		contentPane.add(textField_1);
		
		txtOrderlyInsertionAnd_1 = new JTextField();
		txtOrderlyInsertionAnd_1.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		txtOrderlyInsertionAnd_1.setText("ORDERLY INSERTION AND DELETION OF ELEMENTS IN FORMAT OF FIRST IN FIRST OUT");
		txtOrderlyInsertionAnd_1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOrderlyInsertionAnd_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		txtOrderlyInsertionAnd_1.setColumns(10);
		txtOrderlyInsertionAnd_1.setBounds(161, 262, 678, 43);
		contentPane.add(txtOrderlyInsertionAnd_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(838, 379, 56, 6);
		contentPane.add(textField_3);
		
		txtSpecialVersionOf = new JTextField();
		txtSpecialVersionOf.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		txtSpecialVersionOf.setText("SPECIAL VERSION OF QUEUE");
		txtSpecialVersionOf.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSpecialVersionOf.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		txtSpecialVersionOf.setColumns(10);
		txtSpecialVersionOf.setBounds(180, 356, 659, 43);
		contentPane.add(txtSpecialVersionOf);
		
		txtALinearData = new JTextField();
		txtALinearData.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		txtALinearData.setText("A LINEAR DATA STRUCTURE, IN WHICH THE ELEMENTS ARE NOT STORED AT CONTIGUOUS MEMORY LOCATIONS");
		txtALinearData.setHorizontalAlignment(SwingConstants.CENTER);
		txtALinearData.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
		txtALinearData.setColumns(10);
		txtALinearData.setBounds(348, 476, 730, 43);
		contentPane.add(txtALinearData);
		
		txtEnhancedVersionOf = new JTextField();
		txtEnhancedVersionOf.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		txtEnhancedVersionOf.setText("ENHANCED VERSION OF SINGLY LINKED LIST");
		txtEnhancedVersionOf.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnhancedVersionOf.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		txtEnhancedVersionOf.setColumns(10);
		txtEnhancedVersionOf.setBounds(348, 567, 659, 43);
		contentPane.add(txtEnhancedVersionOf);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(257, 499, 81, 6);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(255, 587, 83, 6);
		contentPane.add(textField_7);
		
		txtRandomInsertionAnd = new JTextField();
		txtRandomInsertionAnd.setText("RANDOM INSERTION AND RANDOM DELETION OF ELEMENTS ");
		txtRandomInsertionAnd.setHorizontalAlignment(SwingConstants.LEFT);
		txtRandomInsertionAnd.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		txtRandomInsertionAnd.setColumns(10);
		txtRandomInsertionAnd.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		txtRandomInsertionAnd.setBounds(333, 98, 659, 43);
		contentPane.add(txtRandomInsertionAnd);
	}
}