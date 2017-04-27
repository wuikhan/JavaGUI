import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class orderForm {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderForm window = new orderForm();
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
	public orderForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(22, 11, 70, 14);
		frame.getContentPane().add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtFirstName.setBounds(96, 8, 86, 20);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(199, 11, 70, 14);
		frame.getContentPane().add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtLastName.setBounds(282, 8, 86, 20);
		frame.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblOrderForm = new JLabel("ORDER FORM");
		lblOrderForm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOrderForm.setBounds(170, 36, 94, 14);
		frame.getContentPane().add(lblOrderForm);
		
		JLabel lblSelect = new JLabel("Select :");
		lblSelect.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelect.setBounds(22, 65, 46, 14);
		frame.getContentPane().add(lblSelect);
		
		JRadioButton rdbtnBurrito = new JRadioButton("Burrito");
		buttonGroup.add(rdbtnBurrito);
		rdbtnBurrito.setBounds(83, 61, 70, 23);
		frame.getContentPane().add(rdbtnBurrito);
		
		JRadioButton rdbtnBowl = new JRadioButton("Bowl");
		buttonGroup.add(rdbtnBowl);
		rdbtnBowl.setBounds(155, 61, 61, 23);
		frame.getContentPane().add(rdbtnBowl);
		
		JLabel lblEntree = new JLabel("Entree :");
		lblEntree.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEntree.setBounds(22, 97, 46, 14);
		frame.getContentPane().add(lblEntree);
		
		JRadioButton rdbtnChicken = new JRadioButton("Chicken");
		buttonGroup_1.add(rdbtnChicken);
		rdbtnChicken.setBounds(83, 93, 76, 23);
		frame.getContentPane().add(rdbtnChicken);
		
		JRadioButton rdbtnBeef = new JRadioButton("Beef");
		buttonGroup_1.add(rdbtnBeef);
		rdbtnBeef.setBounds(155, 93, 54, 23);
		frame.getContentPane().add(rdbtnBeef);
		
		JRadioButton rdbtnPork = new JRadioButton("Pork");
		buttonGroup_1.add(rdbtnPork);
		rdbtnPork.setBounds(208, 93, 54, 23);
		frame.getContentPane().add(rdbtnPork);
		
		JRadioButton rdbtnVeggie = new JRadioButton("Veggie");
		buttonGroup_1.add(rdbtnVeggie);
		rdbtnVeggie.setBounds(264, 93, 109, 23);
		frame.getContentPane().add(rdbtnVeggie);
		
		JLabel lblToppings = new JLabel("Toppings:");
		lblToppings.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblToppings.setBounds(22, 134, 70, 14);
		frame.getContentPane().add(lblToppings);
		
		JCheckBox chckbxOnions = new JCheckBox("Onions");
		chckbxOnions.setBounds(85, 130, 70, 23);
		frame.getContentPane().add(chckbxOnions);
		
		JCheckBox chckbxRedChilliSauce = new JCheckBox("Red Chilli Sauce");
		chckbxRedChilliSauce.setBounds(154, 130, 125, 23);
		frame.getContentPane().add(chckbxRedChilliSauce);
		
		JCheckBox chckbxSourCream = new JCheckBox("Sour Cream");
		chckbxSourCream.setBounds(292, 130, 97, 23);
		frame.getContentPane().add(chckbxSourCream);
		
		JButton btnSubmitOrder = new JButton("Submit Order");
		btnSubmitOrder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnBurrito.isSelected())
					
					JOptionPane.showMessageDialog(null, "Burrito");
				else
					JOptionPane.showMessageDialog(null, "Bowl");
				
			}
		});
		btnSubmitOrder.setBounds(292, 227, 132, 23);
		frame.getContentPane().add(btnSubmitOrder);
	}
}
