package reg.jedi.edu;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RegistrationForm extends JFrame {
	
	private static final long	serialVersionUID	= 3984868217398180985L;
	private List<Jedi>			registrants			= new ArrayList<Jedi>();
	private Jedi				selectedJedi		= new Jedi();
	
	private JTextField			name				= new JTextField(10);
	private JTextField			jediType			= new JTextField(10);
	private JTextField			rank				= new JTextField(10);
	private JTextField			special				= new JTextField(10);
	
	private static JLabel		NAME_LABEL			= new JLabel("Name: ");
	private static JLabel		TYPE_LABEL			= new JLabel("Jedi Path: ");
	private static JLabel		RANK_LABEL			= new JLabel("Rank: ");
	private static JLabel		SPECIAL_LABEL		= new JLabel();
	
	private static JPanel		NAME_PANEL			= new JPanel();
	private static JPanel		TYPE_PANEL			= new JPanel();
	private static JPanel		RANK_PANEL			= new JPanel();
	private static JPanel		SPECIAL_PANEL		= new JPanel();
	private static JPanel		BUTTON_PANEL		= new JPanel();
	
	
	private JButton				register			= new JButton("Register");
	private JButton				assignInstructor	= new JButton("Assign Instructor");
	
	
	public RegistrationForm() {
		
		super("Jedi Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 1));
		
		NAME_PANEL.add(NAME_LABEL);
		NAME_PANEL.add(name);
		
		TYPE_PANEL.add(TYPE_LABEL);
		TYPE_PANEL.add(jediType);
		
		RANK_PANEL.add(RANK_LABEL);
		RANK_PANEL.add(rank);
		
		SPECIAL_PANEL.add(SPECIAL_LABEL);
		SPECIAL_PANEL.add(special);
		
		register.addActionListener(new RegistrationListener());
		assignInstructor.addActionListener(new InstructorListener());
		
		BUTTON_PANEL.add(register);
		BUTTON_PANEL.add(assignInstructor);
		
		jediType.addActionListener(new TypeListener());
		
		add(NAME_PANEL);
		add(RANK_PANEL);
		add(TYPE_PANEL);
		add(SPECIAL_PANEL);
		add(BUTTON_PANEL);
		
		SPECIAL_PANEL.setVisible(false);
		assignInstructor.setVisible(false);
		
		setVisible(true);
		setPreferredSize(new Dimension(350, 300));
		pack();
		setLocationRelativeTo(null);
	}
	
	private class RegistrationListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Jedi reg = new Jedi();
			
			reg.setname(name.getText());
			reg.setPath(jediType.getText());
			reg.setRank(rank.getText());
			reg.setUniqueTrait(special.getText());
			
			registrants.add(reg);
			selectedJedi = reg;
			assignInstructor.setVisible(true);
		}
		
	}
	
	private class InstructorListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (selectedJedi.getPath().equalsIgnoreCase("Guardian")) {
				if (selectedJedi.getUniqueTrait().equalsIgnoreCase("Shii-Cho")) {
					selectedJedi.setInstructor("Luke Skywalker");
				} else if (selectedJedi.getUniqueTrait().equalsIgnoreCase("Soresu")) {
					selectedJedi.setInstructor("Obi Wan Kenobi");
				} else {
					selectedJedi.setInstructor("Mace Windu");
				}
			} else if (selectedJedi.getPath().equalsIgnoreCase("Sentinel")) {
				if (selectedJedi.getUniqueTrait().equalsIgnoreCase("Temple Guardian")) {
					selectedJedi.setInstructor("Bastila Shan");
				} else {
					selectedJedi.setInstructor("Atton Rand");
				}
			} else if (selectedJedi.getPath().equalsIgnoreCase("Consular")) {
				selectedJedi.setInstructor("Yoda");
			} else {
				JOptionPane.showMessageDialog(rootPane, "ERROR: JEDI IS A SITH.");
			}
			JOptionPane.showMessageDialog(rootPane, "Your assigned Instructor is Master " + selectedJedi.getInstructor());
		}
	}
	
	private class TypeListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (jediType.getText().equalsIgnoreCase("guardian")) {
				SPECIAL_LABEL.setText("Lightsaber Form: ");
				SPECIAL_PANEL.setVisible(true);
			} else if (jediType.getText().equalsIgnoreCase("sentinel")) {
				SPECIAL_LABEL.setText("Specialization: ");
				SPECIAL_PANEL.setVisible(true);
			} else if (jediType.getText().equalsIgnoreCase("consular")) {
				SPECIAL_LABEL.setText("Force Power: ");
				SPECIAL_PANEL.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(rootPane, "Y U use wrong path?!");
				jediType.setText("");
			}
		}
	}
	
}
