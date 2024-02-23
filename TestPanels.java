package cse;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class TestPanels extends JFrame {

	public TestPanels() {
		JPanel p1 = new JPanel(); // create a panel for customer information
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		JLabel l1= new JLabel();
		l1.setText("welcome");
		
		JLabel l2 = new JLabel ("Name and Surname");
		l2.setLocation(10,30);
		
		JTextField t1= new JTextField(); // create a textField to take customer's name and surname
		t1.setColumns(10);
		t1.getText();
		
		JButton bt= new JButton("ok"); // create a button to take output
		bt.setBounds(100,200,300,30);
		
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("welcome to chan's restaurant "+ t1.getText());}
				// give action for button with using actionlistener method
		});
		
		
		
		JRadioButton r1 = new JRadioButton ("single",true); // create a radio button and it is already selected because value is true
		r1.setBounds(100,50,100,30);
		r1.setActionCommand("single");
		
		JRadioButton r2 = new JRadioButton ("plural");
		r2.setBounds(100,50,100,30);
		r2.setActionCommand("group");
		
		ButtonGroup bg = new ButtonGroup(); // create a button group for radio buttons
		bg.add(r2);
		bg.add(r1);
		
		JButton bt1= new JButton("chose"); // create a button to give output 
		bt1.setBounds(100,200,100,30);
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		
				 if(r1.isSelected()) {
					System.out.println(r1.getText()+" selected");
				}
				 if(r2.isSelected()) {
						System.out.println(r2.getText()+" selected");
				}
				// give action for button with using actionlistener method	 
				 }
					
			});
		
		
		
		JPanel p2 = new JPanel(new GridLayout(6,2)); // create panel 2 to show main menu on the window
		JLabel lb = new JLabel("choose for main food", JLabel.LEFT);
		lb.setForeground(Color.RED);
		lb.setBounds(50,50,80,250);
		JCheckBox ch1 = new JCheckBox("Hamburger"); // create the checkbox 
		JCheckBox ch2 = new JCheckBox("Pizza");
		JCheckBox ch3 = new JCheckBox("Pasta");
		JCheckBox ch4 = new JCheckBox("Soup");
		JCheckBox ch5 = new JCheckBox("Steak");
		
		// give action for checkboxs with using actionlistener method
		ch1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hamburger selected");
				
				Hamburger firstfood = new Hamburger(); // create an object from Hamburger class
				
				byte fiyat = 40;
				int hesap = firstfood.number()*fiyat;
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				firstfood.serviceTime(); // call the method with using object
				
				firstfood.warning(); // call the method with using object
				
				
			}
			
		});
		
		ch2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pizza selected");
				
                Pizza secondfood = new Pizza();
				
				short fiyat = 50;
				int hesap = secondfood.number()*fiyat;
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				secondfood.serviceTime(); // call the method with using object
				
				secondfood.warning(); // call the method with using object
				
				
			}
			
		});
		
		ch3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pasta selected");
				
				    Pasta thirdfood = new Pasta();
					
					int fiyat = 30;
					int hesap = thirdfood.number()*fiyat;
					
					System.out.println(" you are going to pay " + hesap + "$");
					System.out.println();
					
					thirdfood.serviceTime(); // call the method with using object
					
					thirdfood.warning(); // call the method with using object
			}
			
		});
		
		ch4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Soup selected");
				
			    Soup fourthfood = new Soup();
				
				int fiyat = 15;
				int hesap = fourthfood.number()*fiyat;
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				fourthfood.serviceTime(); // call the method with using object
				
				fourthfood.warning(); // call the method with using object
				 
			}
			
		});
		
		ch5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Steak selected");
				
			    Steak fifthfood = new Steak();
				
				int fiyat = 30;
				int hesap = fifthfood.number()*fiyat;
				
				getPrize(fifthfood, hesap);
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				
				
				fifthfood.serviceTime(); // call the method with using object
				
				fifthfood.warning(); // call the method with using object
				
			}

			private void getPrize(Steak fifthfood, int hesap) {
				System.out.println("Congratulations, you have chosen the award-winning beverage, you have won a special discount.");
				int NewHesap = hesap-10;
				int temp = hesap;
				hesap = NewHesap;
				NewHesap = temp;
			}
			
		});
		
		
		
		
		JPanel p3 = new JPanel(new GridLayout(6,6)); // create panel 3 to show beverages menu on the window
		JLabel lb1 = new JLabel("choose your drinks", JLabel.LEFT);
		lb1.setForeground(Color.RED);
		lb.setBounds(50,50,10,250);
		JCheckBox chb1 = new JCheckBox("ColdBeverages"); // create the checkbox 
		JCheckBox chb2 = new JCheckBox("HotTeaMenu");
		JCheckBox chb3 = new JCheckBox("HotCoffeeMenu");
		JCheckBox chb4 = new JCheckBox("SpeacialDrinks");
		JCheckBox chb5 = new JCheckBox("IcedDrinks");
		
		// give action for checkboxs with using actionlistener method
		chb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ColdBeverages selected");
				
				ColdBeverages firstbeverage = new ColdBeverages();
				getPrize(firstbeverage);
				int fiyat = 10;
				int hesap = firstbeverage.number()*fiyat;
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				firstbeverage.serviceTime(); // call the method with using object
				
				firstbeverage.warning(); // call the method with using object
				
			}
			
		});
		
		chb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("HotTeaMenu selected");
				
				HotTeaMenu secondbeverage = new HotTeaMenu();
				
				int fiyat = 20;
				int hesap = secondbeverage.number()*fiyat;
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				secondbeverage.serviceTime(); // call the method with using object
				
				secondbeverage.warning(); // call the method with using object
				
			}
			
		});
		
		chb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("HotCoffeeMenu selected");
				
				HotCoffeeMenu thirdbeverage = new HotCoffeeMenu();
				
				int fiyat = 30;
				int hesap = thirdbeverage.number()*fiyat;
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				thirdbeverage.serviceTime(); // call the method with using object
				
				thirdbeverage.warning(); // call the method with using object
				
			}
			
		});
		
		chb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("SpeacialDrinks selected");
				

				SpeacialDrinks fourthbeverage = new SpeacialDrinks();
				
				int fiyat = 30;
				int hesap = fourthbeverage.number()*fiyat;
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				fourthbeverage.serviceTime(); // call the method with using object
				
				fourthbeverage.warning(); // call the method with using object
			}
			
		});
		
		chb5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("IcedDrinks selected");

				IcedDrinks fifthbeverage = new IcedDrinks();
				
				int fiyat = 25;
				int hesap = fifthbeverage.number()*fiyat;
				
				System.out.println(" you are going to pay " + hesap + "$");
				System.out.println();
				
				fifthbeverage.serviceTime(); // call the method with using object
				
				fifthbeverage.warning(); // call the method with using object
			}
			
		});
		
		
		
		JPanel p4 = new JPanel(new GridLayout(6,6)); // create panel 4 and ask some questions seeing customer satisfaction
		JLabel lb2 = new JLabel("satisfaction test", JLabel.LEFT);
		lb2.setForeground(Color.GREEN);
		lb.setBounds(50,50,10,250);
		String[] cevap = {"like", "not bad", "dislike"}; // create an array for choice
		
		JRadioButton rm1 = new JRadioButton(cevap[0], true); // create a radio button and it is alsready selected because value is true
		rm1.setBounds(100,50,100,30);
		rm1.setActionCommand("Thank you for choosing us");
		
		JRadioButton rm2 = new JRadioButton(cevap[1]);
		rm2.setBounds(100,100,100,30);
		rm2.setActionCommand("We continue to evolve");
		
		JRadioButton rm3 = new JRadioButton(cevap[2]);
		rm3.setBounds(100,150,100,30);
		rm3.setActionCommand("We welcome your complaints and suggestions.");
		
		ButtonGroup bgm = new ButtonGroup();// below codes allow only one group to be selected and create a button group for each button
		bgm.add(rm1);;
		bgm.add(rm2);
		bgm.add(rm3);
		
		JButton btm= new JButton("send"); // create a button 
		btm.setBounds(100,100,30,30);
		btm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(bgm.getSelection().getActionCommand());
				}
			// give the action for button
			});
		
		
		
		JPanel p5 = new JPanel(new FlowLayout()); // create panel 5 to confirm order
		
		JLabel lb3 = new JLabel("confirm", JLabel.LEFT);
		lb3.setForeground(Color.BLUE);
		lb3.setBounds(50,50,100,250);
		
		JButton b1 = new JButton("confirm the order");
		b1.setBounds(200,200,100,80);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date simdikiZaman = new Date();
				System.out.println(simdikiZaman.toString() + " order is taken "); // show the current time for taken order
				System.out.println("Enjoy with your meal :)");
				
			}
			
		});
	
		
	
	// add all these things to panel 1 
		p1.add(l1);
		p1.add(l2);
		p1.add(t1);
		p1.add(bt);
		p1.add(r1);
		p1.add(r2);
		p1.add(bt1);
		
	// add all these things to panel 2 
		p2.add(lb);
		p2.add(ch1);
		p2.add(ch2);
		p2.add(ch3);
		p2.add(ch4);
		p2.add(ch5);
	
	// add all these things to panel 3 	
		p3.add(lb1);
		p3.add(chb1);
		p3.add(chb2);
		p3.add(chb3);
		p3.add(chb4);
		p3.add(chb5);
	
	// add all these things to panel 4 	
		p4.add(lb2);
		p4.add(rm1);
		p4.add(rm2);
		p4.add(rm3);
		p4.add(btm);
		
	// add all these things to panel 5 	
		p5.add(lb3);
		p5.add(b1);
		
		add(p1, BorderLayout.NORTH); // place the panel 1 
		add(p4,BorderLayout.SOUTH); // place the panel 4
		setLayout(new GridLayout(3,2)); // set gridlayout for panel 2, 3 and 5
		//add(p2,BorderLayout.WEST);
		add(p2);
		add(p3);
		add(p5);
		
	}
	
	private void getPrize(ColdBeverages a) {
		System.out.println("Congratulations, you have chosen the award-winning beverage, you have won a cookies from us ");
		
		
	}

	public static void main (String [] args) {
		TestPanels frame = new TestPanels(); // create an object from TestPanel class
		frame.setTitle("chann"); // set the tittle for window
		frame.setSize(800,400); // set the size for window
		frame.setLocationRelativeTo(null); // center
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button
		frame.setVisible(true); // may appear
	}
	
}
 