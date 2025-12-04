package MyPackage;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;

import javax.swing.*;

public class BookHots extends JFrame implements ActionListener{
	
	
		JComboBox<String> c1,c2,c3;

	 	JButton b0,b1,b2;	JTextField t,date;	static JLabel image;
	
		String []s1 = {"Alibaug","Mahad","Chiplun","Dapoli","Malvan"};	
		String []s2 = {"AC","Non/AC"}; 		
		String []s3 = {"Hotel Pride","Konkan Dreams","Malvan Heritage","Konark Residencies","Hotel Blue Bird","River view point"};


		BookHots (){

		super("Book a trip");			
		this.setExtendedState(MAXIMIZED_BOTH);

		JPanel p1 = new JPanel();
		
			p1.setLayout(new FlowLayout());
			p1.setBackground(new Color(240,0,180));
	
		JPanel p2 = new JPanel();
			
			p2.setBounds(270,50,1000,700);
			p2.setLayout(null);
			add(p2);
			
			add(p1);	
			
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Goa.jpg"));
			
		Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT );
		ImageIcon i3 = new ImageIcon(i2);
			
		image = new JLabel(i3);
			
		image.setBounds(0,0,1000,700);
			
		p2.add(image);
			
		JLabel l1 = new JLabel("Book My Trip");
		
			l1.setBounds(320,100,350,50);
			l1.setForeground(Color.WHITE);
			l1.setFont(new Font("",Font.BOLD,52));
			
		image.add(l1);
		
		JLabel l2 = new JLabel("select city    :");
		
			l2.setBounds(250,200,350,50);
			l2.setForeground(Color.white);
			l2.setFont(new Font("",Font.PLAIN,30));
		
		image.add(l2);
			
		
		JLabel l0 = new JLabel("Enter date   :");
		
			l0.setBounds(250,270,400,50);
			l0.setForeground(Color.white);
			l0.setFont(new Font("",Font.PLAIN,30));

		image.add(l0);	

		JLabel l4 = new JLabel("select hotel  :");
		
			l4.setBounds(250,340,400,50);
			l4.setForeground(Color.WHITE);
			l4.setFont(new Font("",Font.PLAIN,30));
			
		image.add(l4);
			
		
		
		c1 = new JComboBox<String>(s1);
		
			c1.setBounds(490,215,200,28);
			c1.setFont(new Font("",Font.PLAIN,18));
			c1.addActionListener(this);
		
		image.add(c1);
		
			
		c2 = new JComboBox<String>(s2);
		
		c2.setBounds(490,285,200,28);
		c2.setFont(new Font("",Font.PLAIN,18));
		c2.addActionListener(this);

//		image.add(c2);
		

		date = new JTextField();
		
		date.setBounds(490,285,200,28);
		image.add(date);	

		c3 = new JComboBox<String>(s3);
		
		c3.setBounds(490,355,200,28);
		c3.setFont(new Font("",Font.PLAIN,18));
		c3.addActionListener(this);
		
		image.add(c3);
		

	
			
		t = new JTextField();
		
			t.setBounds(490,425,200,25);
			t.setBorder(BorderFactory.createEtchedBorder());

//		image.add(t);
		
		b1 = new JButton("Home");
		
		b1.setBounds(200,550,100, 25);
		b1.setFont(new Font("",Font.PLAIN,18));
		b1.addActionListener(this);
		image.add(b1);

		
		b0 = new JButton("Show");
		
		b0.setBounds(450,550,100, 25);
		b0.setFont(new Font("",Font.PLAIN,18));
		b0.addActionListener(this);
      	
		image.add(b0);
    		
    	
		b2 = new JButton("Book");
		
		b2.setBounds(700,550,100, 25);
		b2.setFont(new Font("",Font.PLAIN,18));
		b2.addActionListener(this);
      	
		image.add(b2);


		this.setVisible(true);
	}
		
		
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String city,s1,s2,s3,s4,s5;
		
		city = (String)c1.getSelectedItem();
		
		
		if(ae.getSource()==b1) {
			
				
				setVisible (false);
				new HomePage();
		}
					
	
		if(ae.getSource()== b0) {			
			
			s1 ="Sahyadri";s2 ="MoonLight";s3="Annapurna";s4="Hotel Aradhya";s5="Hotel Blue Bird";
			
					
			if(city == "Chiplun") {
				
				c3.removeAllItems();
				
				c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);
			
							
			}
			
			else if(city == "Mahad") {
				
			s1="Saisha Palace";s2="North Fort";s3="Mahad view point";s4="Hotel Pearl";	
			
			c3.removeAllItems();
			
				c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);
				
								
			}
			
			else if(city == "Alibaug") {
				
				s1="Queens Palace";s2="Vickys Guest House";s3="Hotel blue bird";s4="Kanishk Villas";s5="Coastal Bayy";	
				
				c3.removeAllItems();
				
					c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);	c3.addItem(s5);				
			
			}
			
			
			else if(city == "Dapoli") {
				
				s1="Hotel Suvarnadurg";s2="Nakshtra tower";s3="Dapoli center";s4="Spian suits";s5="Larannya palace";	
				
				c3.removeAllItems();
				
					c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);	c3.addItem(s5);				
			
			}
			
			else if(city == "Malvan") {
				
				s1="Konkan Dreams";s2="Hotel Pride";s3="Shatataraka Homestay";s4="Hotel River view point";s5="Malvan Heritage";	
				
				c3.removeAllItems();
				
					c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);	c3.addItem(s5);				
			
			}

			
		}
		if (ae.getSource()==b2) {
			
			String user_id = LogIn.us();
		    String ct = (String) c1.getSelectedItem();
			String dat = date.getText();
			String hot = (String) c3.getSelectedItem();
			
			try {
				
				Connec c = new Connec();
				
				PreparedStatement ps = c.prepareStatement("insert into hotels values(?,?,?,?)");
				
				ps.setString(1,user_id);
				ps.setString(2,ct);
				ps.setString(3,dat);
				ps.setString(4,hot);
				
				int count = ps.executeUpdate();
				
				if(count > 0) {
					
					JOptionPane.showMessageDialog(null,"Hotel Booked Succesfully");
					
					setVisible (false);
					new HomePage();
					
				}
				
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
				System.out.println(e);
			}
		}
				
	}
		
			
		
		
	

	
	public static void main(String[] args) {
		
		new BookHots();
	}



	
}
