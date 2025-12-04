package MyPackage;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Tours extends JFrame implements ActionListener{
	
	JButton bt,b2;
	JScrollPane sp;
	
	
	Tours(){
		
		this.setExtendedState(MAXIMIZED_BOTH);
		
		JPanel p1 = new JPanel();
		
			p1.setBackground(Color.WHITE);
			p1.setLayout(new GridLayout(10,1));
			
			
		b2 = new JButton();
		
		sp = new JScrollPane(p1);
		
			sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sp.setBounds(250,0,1000,800);
//          sp.getVerticalScrollBar().setValue(0);
            sp.getVerticalScrollBar();
			
            
            sp.getVerticalScrollBar().setValue(-250);
	
			
		JPanel p2 = new JPanel();
			
			p2.setLayout(null);			
			p2.setBackground(new Color(0,180,200));		
			p2.setPreferredSize(getMaximumSize());		
			p2.add(sp);		p2.add(b2);
			
			
		
		

			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("amboli.PNG"));
			
			Image i2 = i1.getImage().getScaledInstance(625,450,Image.SCALE_DEFAULT );
			ImageIcon i3 = new ImageIcon(i2);
									
			JLabel image = new JLabel(i3);			
			p1.add(image);
		
	
			
			JTextArea txt1 = new JTextArea("	      Sindhudurg fort\n"
					+ "\n            Sindhudurg fort is the historic fort"
					+ "\n            built by Chhatrapati Shivaji Maharaj"
					+ "\n            in the 16th centuary near malvan port ."
					+ "\n            it is just 5 km long from malvan city"
					+ "\n            it is situated in arabian sea .the ferry"
					+ "\n            boats are daily available to go on fort");
			
				txt1.setFont(new Font("SAN SERIF",Font.PLAIN,42));
				txt1.setEditable(false);
		
				p1.add(txt1);

		
			
			ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("marle.PNG"));
			
			Image a2 = a1.getImage().getScaledInstance(800,437,Image.SCALE_DEFAULT );
			ImageIcon a3 = new ImageIcon(a2);
							
			JLabel image1 = new JLabel(a3);
			p1.add(image1);	
		
	
			JTextArea txt2 = new JTextArea("\n\t        Janjira fort\n"
					+ "\n            Janjira fort is the sea fort built in 12th"
					+ "\n            centuary by yadav dynasty .it is "
					+ "\n            situated near Murud village of Raigad"
					+ "\n            district .it is surrounded by water from "
					+ "\n            all sides .the ferry boats are available "
					+ "\n            to visit fort. it is most famous for its "
					+ "\n            canon the great 'Kalalbangadi'."
					+ "\n             ");
			
				txt2.setFont(new Font("SAN SERIF",Font.PLAIN,42));
				txt2.setEditable(false);
		
			p1.add(txt2);
		

			
			ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("mayem.PNG"));			
			Image b2 = b1.getImage().getScaledInstance(471,580,Image.SCALE_DEFAULT );
			ImageIcon b3 = new ImageIcon(b2);		
			JLabel image2 = new JLabel(b3);			
			p1.add(image2);


			JTextArea txt3 = new JTextArea("\n\n\t        Vijaydurg Fort\n"
					+ "\n            Vijaydurg fort is a sea fort situated near"
					+ "\n            devgad city in Sindhudurg district . "
					+ "\n            It is surrounded by water from 3 sides"
					+ "\n            we can go to fort by road .It was the"
					+ "\n            first kingdom of maratha aarmar. it is"
					+ "\n            25 km long from Devgad city ."
					+ "\n            ");
			
				txt3.setFont(new Font("SAN SERIF",Font.PLAIN,42));
				txt3.setEditable(false);
		
			p1.add(txt3);
		
			
			
			ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("savt.PNG"));			
			Image c2 = c1.getImage().getScaledInstance(730,400,Image.SCALE_DEFAULT );
			ImageIcon c3 = new ImageIcon(c2);		
			JLabel image3 = new JLabel(c3);			
			p1.add(image3);

			

			JTextArea txt4 = new JTextArea("\n\n\t          Kulaba fort\n"
					+ "\n            Kulaba fort is north konkan sea fort .it "
					+ "\n            is situated in arabian sea near Alibaug city ."
					+ "\n            it is much near from Mumbai city .It is "
					+ "\n            famous for the historical canons present "
					+ "\n            on it.");
			
				txt4.setFont(new Font("SAN SERIF",Font.PLAIN,42));
				txt4.setEditable(false);
		
			p1.add(txt4);

			
			
			ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("kavl.jpg"));			
			Image d2 = d1.getImage().getScaledInstance(594,590,Image.SCALE_DEFAULT );
			ImageIcon d3 = new ImageIcon(d2);		
			JLabel image4 = new JLabel(d3);			
			p1.add(image4);

			
			
			JTextArea txt5 = new JTextArea("\n\n\t          Rangana fort\n"
					+ "\n            Rangana fort is most famous fort for ,"
					+ "\n            thriller trekking in Sindhudurg district "
					+ "\n            it is situated in Sahyadri mountain "
					+ "\n            range near Narur village of Kudal . "
					+ "\n            it is nearly 22 km long from Kudal city"
					+ "\n            it is situated at higher heights people"
					+ "\n            reach fort by climbing it");
			
				txt5.setFont(new Font("SAN SERIF",Font.PLAIN,42));
				txt5.setEditable(false);
		
			p1.add(txt5);
	
			
		bt = new JButton("Home");
			
			bt.setBounds(0,0,90, 20);
			bt.addActionListener(this);
			p2.add(bt);
		
			
			
		
		this.setContentPane(p2);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Tours();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==bt) {
			
			setVisible(false);
			new HomePage();
			
		}
		
	}

}
