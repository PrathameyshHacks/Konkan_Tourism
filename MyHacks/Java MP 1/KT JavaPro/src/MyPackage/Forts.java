package MyPackage;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Forts extends JFrame implements ActionListener, KeyListener {

	JTextArea txt5;
	JLabel t1;
	JButton bt, b2;
	JScrollPane sp;
	JButton b1, b2x, b3, b4, b5;

	Forts() {

		super("Forts");
		this.setExtendedState(MAXIMIZED_BOTH);

		JPanel p1 = new JPanel();

		p1.setBackground(Color.WHITE);
		p1.setLayout(new GridLayout(1, 10, 0, 50));

		b2 = new JButton();

		sp = new JScrollPane(p1);

		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(250, 0, 1000, 750);

		JPanel p2 = new JPanel();

		p2.setLayout(null);
		p2.setBackground(new Color(255, 113, 195));
		p2.setPreferredSize(getMaximumSize());
		p2.add(sp);
		p2.add(b2);

		JPanel p3 = new JPanel();

		p3.setBounds(250, 750, 1000, 50);
		p3.setBackground(new Color(106, 88, 249));
		p3.setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		gc.insets = new Insets(10, 0, 20, 0);
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.ipadx = 10;
		b1 = new JButton("Sindhudurg");
		b1.addActionListener(this);
		p3.add(b1, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.ipadx = 30;
		b2x = new JButton("Janjira");
		b2x.addActionListener(this);
		p3.add(b2x, gc);

		gc.gridx = 2;
		gc.gridy = 0;
		b3 = new JButton("Vijaydurg");
		b3.addActionListener(this);
		p3.add(b3, gc);

		gc.gridx = 3;
		gc.gridy = 0;
		b4 = new JButton("Kulaba");
		b4.addActionListener(this);
		p3.add(b4, gc);

		gc.gridx = 4;
		gc.gridy = 0;
		b5 = new JButton("Rangana");
		b5.addActionListener(this);
		p3.add(b5, gc);

		p2.add(p3);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Sindh2.png"));
		Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image0 = new JLabel(i3);

		p1.add(image0);

		JTextArea txt1 = new JTextArea("\n\t\tSindhudurg fort\n"
				+ "\n            Sindhudurg Fort is a historic sea fort located on an islet in the"
				+ "\n            Arabian Sea, near the Konkan region of Maharashtra. It was"
				+ "\n            commissioned by Chhatrapati Shivaji Maharaj and constructed"
				+ "\n            between 1664 and 1667. The fort features massive walls, some"
				+ "\n            as high as 30 feet, designed to withstand the waves and tides"
				+ "\n            of the sea. It covers an area of 48 acres & includes 42 bastions."
				+ "\n            The main entrance is cleverly concealed, making it difficult for"
				+ "\n            enemies to locate .The fort offers stunning views of the Arabian"
				+ "\n            Sea and the surrounding coastline. It remains a popular tourist"
				+ "\n            destination, attracting history enthusiasts and travelers alike."
				+ "\n            The ferry boats are daily available to visit fort from Nov to May."

		);

		txt1.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt1.setEditable(false);

		p1.add(txt1);

		ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("murud5.PNG"));
		Image a2 = a1.getImage().getScaledInstance(470, 600, Image.SCALE_DEFAULT);
		ImageIcon a3 = new ImageIcon(a2);
		JLabel image1 = new JLabel(a3);
		p1.add(image1);

		JTextArea txt2 = new JTextArea("\n\t\tMurud Janjira fort\n"
				+ "\n            Janjira fort also known as Murud-Janjira is formidable sea fort"
				+ "\n            located on an oval-shaped rock off the Arabian Sea coast near"
				+ "\n            Murud in the Raigad district of Maharashtra. Built in the late 15th"
				+ "\n            century by local fishermen and later fortified by Malik Ambar. "
				+ "\n            Despite numerous attempts by the Marathas, Mughals and"
				+ "\n            Portuguese it was never conquered. The fort features 26 intact"
				+ "\n            bastions and several cannons of native and European make."
				+ "\n            It also houses freshwater ponds a temple & quarters for officers."
				+ "\n            The fort’s architecture and strategic location make it a marvel"
				+ "\n            of engineering. Accessible by boats from rajapuri jetty Janjira"
				+ "\n            Fort remains a popular tourist destination."

		);

		txt2.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt2.setEditable(false);

		p1.add(txt2);

		ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("vij1.PNG"));
		Image b2 = b1.getImage().getScaledInstance(600, 330, Image.SCALE_DEFAULT);
		ImageIcon b3 = new ImageIcon(b2);
		JLabel image2 = new JLabel(b3);
		p1.add(image2);

		JTextArea txt3 = new JTextArea("\n\t\tVijaydurg fort\n"
				+ "\n            Vijaydurg fort is located in the Sindhudurg dist of Maharashtra"
				+ "\n            is one of the oldest and strongest forts on the western coast."
				+ "\n            Originally built by Raja Bhoja of the Shilahar dynasty between"
				+ "\n            1193 & 1205 it was later expanded and fortified by Chhatrapati"
				+ "\n            Shivaji Maharaj in 17th century. Its also known as the Eastern"
				+ "\n            Gibraltar was strategically important due to its location & the"
				+ "\n            natural protection provided by the surrounding Arabian Sea on"
				+ "\n            3 sides. The fort name Vijaydurg translates to Fort of Victory"
				+ "\n            reflecting its historical significance. Vijaydurg Fort served as"
				+ "\n            a crucial naval base for Maratha Empire allowing their warships"
				+ "\n            to remain hidden in the nearby creek. Today its stands as a"
				+ "\n            protected monument & proof of Maratha naval powers.");

		txt3.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt3.setEditable(false);

		p1.add(txt3);

		ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("SindhuDurg.png"));
		Image c2 = c1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
		ImageIcon c3 = new ImageIcon(c2);
		JLabel image3 = new JLabel(c3);
		p1.add(image3);

		JTextArea txt4 = new JTextArea("\n\t\tKulaba fort\n"
				+ "\n            Kulaba Fort also known as Kolaba Fort is a historic military"
				+ "\n            fortification located in Alibag, Maharashtra. It was built by"
				+ "\n            Chhatrapati Shivaji Maharaj in 1652 to serve as a key naval"
				+ "\n            base for the Maratha Empire. The fort is situated about 1-2"
				+ "\n            kilometers from the Alibag shore & can be accessed by foot"
				+ "\n            during low tide or by boat during high tide. The fort features"
				+ "\n            impressive stone walls, bastions & two main entrances one "
				+ "\n            facing the sea and the other towards Alibag. Despite being"
				+ "\n            surrounded by seawater the fort has freshwater wells within"
				+ "\n            its premises. Its strategic location & historical significance"
				+ "\n            make it a must visit site for history enthusiasts & travelers."
				+ "\n            ");

		txt4.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt4.setEditable(false);

		p1.add(txt4);

		ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("ragadv.PNG"));
		Image d2 = d1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
		ImageIcon d3 = new ImageIcon(d2);
		JLabel image4 = new JLabel(d3);
		p1.add(image4);

		JTextArea txt5 = new JTextArea("\n\t\tRangana fort\n"
				+ "\n            Rangana Fort also known as Prasiddhagad is a historic fort"
				+ "\n            located in the Kudal taluka of Sindhudurg district Maharashtra."
				+ "\n            Built by Raja Bhoj of the Shilahar dynasty in the 12th century"
				+ "\n            the fort stands at an elevation of 2,227 feet (679 meters) in"
				+ "\n            the Sahyadri mountain range. It played a significant role in"
				+ "\n            Maratha history especially during the reign of Chhatrapati"
				+ "\n            Shivaji Maharaj. The fort features two main gates a large lake"
				+ "\n            & a temple dedicated to the goddess Ranganai. Surrounded by"
				+ "\n            dense forests, it offers a challenging yet rewarding trek for"
				+ "\n            adventure enthusiasts. Rangana fort was strategically important"
				+ "\n            due to its location providing panoramic views of surrounding"
				+ "\n            valleys and hills.");

		txt5.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt5.setEditable(false);

		p1.add(txt5);

		bt = new JButton("Home");

		bt.setBounds(0, 0, 90, 20);
		bt.addActionListener(this);
		p2.add(bt);

		this.addKeyListener(this);

		this.addWindowFocusListener(new WindowAdapter() {
			@Override
			public void windowGainedFocus(WindowEvent e) {

				sp.getHorizontalScrollBar().setValue(0); // Reset to the top
			}
		});

		this.setFocusable(true);
		this.requestFocusInWindow();

		this.setContentPane(p2);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Forts();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bt) {

			setVisible(false);
			new HomePage();
		}

		else if (e.getSource() == b1) {

			sp.getHorizontalScrollBar().setValue(0);
			requestFocusInWindow();
		}

		else if (e.getSource() == b2x) {

			sp.getHorizontalScrollBar().setValue(2000);
			requestFocusInWindow();
		}

		else if (e.getSource() == b3) {

			sp.getHorizontalScrollBar().setValue(4000);
			requestFocusInWindow();
		}

		else if (e.getSource() == b4) {

			sp.getHorizontalScrollBar().setValue(5990);
			requestFocusInWindow();
		}

		else if (e.getSource() == b5) {

			sp.getHorizontalScrollBar().setValue(7980);
			requestFocusInWindow();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

			int i = sp.getHorizontalScrollBar().getValue();
			sp.getHorizontalScrollBar().setUnitIncrement(50);
			sp.getHorizontalScrollBar().setValue(i + sp.getHorizontalScrollBar().getUnitIncrement(1));

		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

			int i = sp.getHorizontalScrollBar().getValue();
			sp.getHorizontalScrollBar().setUnitIncrement(50);
			sp.getHorizontalScrollBar().setValue(i - sp.getHorizontalScrollBar().getUnitIncrement(1));

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
