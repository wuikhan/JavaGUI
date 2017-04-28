import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class orderForm {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private final ButtonGroup rdSelect = new ButtonGroup();
	private final ButtonGroup rdChooseFillings = new ButtonGroup();
	JLabel orderSelect = new JLabel("");
	JLabel orderFilling = new JLabel("");

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
	
	class RadioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton btn = (JRadioButton)e.getSource();
			orderSelect.setText(btn.getText());
		}

	}
	
	class RadioListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton btn2 = (JRadioButton)e.getSource();
			orderFilling.setText(btn2.getText());
			
		}
		
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
		frame.setBounds(100, 100, 485, 369);
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
		rdSelect.add(rdbtnBurrito);
		rdbtnBurrito.setBounds(83, 61, 70, 23);
		frame.getContentPane().add(rdbtnBurrito);
		
		JRadioButton rdbtnBowl = new JRadioButton("Bowl");
		rdSelect.add(rdbtnBowl);
		rdbtnBowl.setBounds(155, 61, 61, 23);
		frame.getContentPane().add(rdbtnBowl);
		
		JLabel lblEntree = new JLabel("Choose Fillings :");
		lblEntree.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEntree.setBounds(22, 97, 104, 14);
		frame.getContentPane().add(lblEntree);
		
		JRadioButton rdbtnChicken = new JRadioButton("Chicken");
		rdChooseFillings.add(rdbtnChicken);
		rdbtnChicken.setBounds(132, 93, 76, 23);
		frame.getContentPane().add(rdbtnChicken);
		
		JRadioButton rdbtnBeef = new JRadioButton("Beef");
		rdChooseFillings.add(rdbtnBeef);
		rdbtnBeef.setBounds(226, 93, 54, 23);
		frame.getContentPane().add(rdbtnBeef);
		
		JRadioButton rdbtnPork = new JRadioButton("Pork");
		rdChooseFillings.add(rdbtnPork);
		rdbtnPork.setBounds(282, 93, 54, 23);
		frame.getContentPane().add(rdbtnPork);
		
		JRadioButton rdbtnVeggie = new JRadioButton("Veggie");
		rdChooseFillings.add(rdbtnVeggie);
		rdbtnVeggie.setBounds(338, 93, 86, 23);
		frame.getContentPane().add(rdbtnVeggie);
		
		JLabel lblToppings = new JLabel("Toppings:");
		lblToppings.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblToppings.setBounds(22, 134, 70, 14);
		frame.getContentPane().add(lblToppings);
		
		
		JLabel topOnion = new JLabel("");
		topOnion.setBorder(new LineBorder(new Color(0, 0, 0)));
		topOnion.setBackground(Color.WHITE);
		topOnion.setBounds(217, 195, 86, 20);
		frame.getContentPane().add(topOnion);
		
		JCheckBox chckbxOnions = new JCheckBox("Onions");
		chckbxOnions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtOnion = (chckbxOnions.isSelected()) ? "Onions" : "No Onions";
				topOnion.setText(txtOnion);
			}
		});
		chckbxOnions.setBounds(85, 130, 70, 23);
		frame.getContentPane().add(chckbxOnions);
		
		
		JLabel topRedChiliSauce = new JLabel("");
		topRedChiliSauce.setBorder(new LineBorder(new Color(0, 0, 0)));
		topRedChiliSauce.setBackground(Color.WHITE);
		topRedChiliSauce.setBounds(318, 195, 141, 20);
		frame.getContentPane().add(topRedChiliSauce);
		
		JCheckBox chckbxRedChilliSauce = new JCheckBox("Red Chilli Sauce");
		chckbxRedChilliSauce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtRedChilliSauce = (chckbxRedChilliSauce.isSelected()) ? "Red Chilli Sauce" : " No - Red Chilli Sauce";
				topRedChiliSauce.setText(txtRedChilliSauce);
				
			}
		});
		chckbxRedChilliSauce.setBounds(154, 130, 125, 23);
		frame.getContentPane().add(chckbxRedChilliSauce);
		
		
		JLabel topSourCream = new JLabel("");
		topSourCream.setBorder(new LineBorder(new Color(0, 0, 0)));
		topSourCream.setBackground(Color.WHITE);
		topSourCream.setBounds(22, 226, 86, 20);
		frame.getContentPane().add(topSourCream);
		
		
		JCheckBox chckbxSourCream = new JCheckBox("Sour Cream");
		chckbxSourCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtSourCream = (chckbxSourCream.isSelected()) ? "Sour Cream" : "No-Sour Cream";
				topSourCream.setText(txtSourCream);
			}
		});
		chckbxSourCream.setBounds(292, 130, 97, 23);
		frame.getContentPane().add(chckbxSourCream);
		orderSelect.setBorder(new LineBorder(new Color(0, 0, 0)));
		orderSelect.setBackground(Color.WHITE);
		
		orderSelect.setBounds(22, 195, 86, 20);
		frame.getContentPane().add(orderSelect);
		RadioListener listener = new RadioListener();
		rdbtnBurrito.addActionListener(listener);
		rdbtnBowl.addActionListener(listener);
		
		JLabel thankYou = new JLabel("");
		thankYou.setBorder(new LineBorder(new Color(0, 0, 0)));
		thankYou.setBackground(Color.WHITE);
		thankYou.setBounds(22, 257, 367, 20);
		frame.getContentPane().add(thankYou);
		
		
		JButton btnSubmitOrder = new JButton("Submit Order");
		btnSubmitOrder.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				
				String fName = txtFirstName.getText();
				String lName = txtLastName.getText();
				
				thankYou.setText("Thank you "+ fName +" " +lName +" your order is in queue ");
	
				
			}
		});
		btnSubmitOrder.setBounds(22, 296, 132, 23);
		frame.getContentPane().add(btnSubmitOrder);
		orderFilling.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
		orderFilling.setBackground(Color.WHITE);
		orderFilling.setBounds(122, 195, 86, 20);
		frame.getContentPane().add(orderFilling);
		
		JButton btnExit = new JButton("Close");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(170, 296, 110, 23);
		frame.getContentPane().add(btnExit);
		
		
		
		RadioListener1 listener1 = new RadioListener1();
		rdbtnChicken.addActionListener(listener1);
		rdbtnBeef.addActionListener(listener1);
		rdbtnPork.addActionListener(listener1);
		rdbtnVeggie.addActionListener(listener1);
		
		
	}
}
