package com.rcraker5.rydgecraker.finalprojectpackage;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ContactForm extends JFrame {
	
	private static final long	serialVersionUID	= 3984868217398180985L;
	
	private JTextField			fname				= new JTextField(20);
	private JTextField			lname				= new JTextField(20);
	private JTextField			bdate				= new JTextField(20);
	private JTextField			email				= new JTextField(20);
	private JTextField			phone				= new JTextField(20);
	
	private static JLabel		FNAME_LABEL			= new JLabel("First Name: ");
	private static JLabel		LNAME_LABEL			= new JLabel("Last Name: ");
	private static JLabel		BIRTH_DATE_LABEL	= new JLabel("Birth Date: ");
	private static JLabel		EMAIL_LABEL			= new JLabel("Email: ");
	private static JLabel		PHONE_LABEL			= new JLabel("PHONE: ");
	
	private static JPanel		FNAME_PANEL			= new JPanel();
	private static JPanel		LNAME_PANEL			= new JPanel();
	private static JPanel		BDATE_PANEL			= new JPanel();
	private static JPanel		EMAIL_PANEL			= new JPanel();
	private static JPanel		PHONE_PANEL			= new JPanel();
	private static JPanel		BUTTON_PANEL		= new JPanel();
	
	
	private JButton				ADD_CUSTOMER		= new JButton("Add Customer");
	
	
	public ContactForm() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(6, 1));
		
		FNAME_PANEL.add(FNAME_LABEL);
		FNAME_PANEL.add(fname);
		
		LNAME_PANEL.add(LNAME_LABEL);
		LNAME_PANEL.add(lname);
		
		BDATE_PANEL.add(BIRTH_DATE_LABEL);
		BDATE_PANEL.add(bdate);
		
		EMAIL_PANEL.add(EMAIL_LABEL);
		EMAIL_PANEL.add(email);
		
		PHONE_PANEL.add(PHONE_LABEL);
		PHONE_PANEL.add(phone);
		
		
		ADD_CUSTOMER.addActionListener(new AddContactListener());
		
		BUTTON_PANEL.add(ADD_CUSTOMER);
		
		add(FNAME_PANEL);
		add(LNAME_PANEL);
		add(BDATE_PANEL);
		add(EMAIL_PANEL);
		add(PHONE_PANEL);
		add(BUTTON_PANEL);
		
		setVisible(true);
		setPreferredSize(new Dimension(350, 300));
		pack();
		setLocationRelativeTo(null);
	}
	
	private class AddContactListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Contact con = new Contact(fname.getText(), lname.getText(), bdate.getText(), email.getText(), phone.getText());
			CustomerContact.displayContact(con);
		}
		
	}
	
}
