package MyPackage;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Festivals extends JFrame implements ActionListener, KeyListener {

	JButton bt, b2;
	JScrollPane sp;
	JButton b1, b2x, b3, b4, b5;

	Festivals() {

		super("Festivals");
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
		b1 = new JButton("Ganesh Chaturthi");
		b1.addActionListener(this);
		p3.add(b1, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.ipadx = 30;
		b2x = new JButton("Holi");
		b2x.addActionListener(this);
		p3.add(b2x, gc);

		gc.gridx = 2;
		gc.gridy = 0;
		b3 = new JButton("Janmashtami");
		b3.addActionListener(this);
		p3.add(b3, gc);

		gc.gridx = 3;
		gc.gridy = 0;
		b4 = new JButton("Mahashivratri");
		b4.addActionListener(this);
		p3.add(b4, gc);

		gc.gridx = 4;
		gc.gridy = 0;
		b5 = new JButton("Diwali");
		b5.addActionListener(this);
		p3.add(b5, gc);

		p2.add(p3);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Prathamesh.jpg"));
		Image i2 = i1.getImage().getScaledInstance(768, 641, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image0 = new JLabel(i3);
		p1.add(image0);

		JTextArea txt1 = new JTextArea("\n\t                 Ganesh Chaturthi\n"
				+ "\n    Ganesh chaturthi is celebrated with great enthusiasm in the Konkan"
				+ "\n    region. The festival last from 2 to 11 days with preparations starting"
				+ "\n    well in advance. Homes are cleaned and decorated to welcome"
				+ "\n    Lord Ganesha and artists create beautiful clay idols of the deity."
				+ "\n    These idols are placed in elaborately decorated pandals & homes"
				+ "\n    where families and communities gather for prayers and cultural"
				+ "\n    activities. The festival is marked by singing of devotional songs"
				+ "\n    the performance of traditional dances & offering of Lord Ganesha"
				+ "\n    favorite sweets, like modaks and laddoos. On the final day the"
				+ "\n    idols are taken out in grand processions, accompanied by music"
				+ "\n    and dancing and immersed in water bodies symbolizing the deitys"
				+ "\n    return to his celestial abode. This immersion is a poignant moment"
				+ "\n    with devotees urging Lord Ganesha to return the following year"
				+ "\n    with more blessings.");

		txt1.setFont(new Font("SAN SERIF", Font.PLAIN, 28));
		txt1.setEditable(false);

		p1.add(txt1);

		ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("Holi.jpg"));
		Image a2 = a1.getImage().getScaledInstance(639, 698, Image.SCALE_DEFAULT);
		ImageIcon a3 = new ImageIcon(a2);
		JLabel image1 = new JLabel(a3);
		p1.add(image1);

		JTextArea txt2 = new JTextArea("\n\t\t          Holi\n"
				+ "\n            Holi is known as Shimga in Konkan region celebrated with unique"
				+ "\n            traditions and great enthusiasm. The festivities begins with Holika"
				+ "\n            Dahan where a massive bonfire is lit up to symbolize the victory of"
				+ "\n            god over evil. People gather to exchange greetings and enjoy the"
				+ "\n            vibrant atmosphere. The festival also marks the arrival of spring"
				+ "\n            with locals dressing in elaborate costumes and performing folk"
				+ "\n            dances & music. A special high pitched sound is made by striking"
				+ "\n            the mouth with hands adding to the festive spirit. The cuisine is"
				+ "\n            highlight with puran poli a sweet bread being a traditional delicacy."
				+ "\n            One of the unique aspects is the lively processions where idols"
				+ "\n            of deities are carried in palanquins to each of house symbolizing"
				+ "\n            the arrival of God. This celebration is a beautiful blend of devotion"
				+ "\n            culture and joy making Holi in Konkan a truly special experience.");

		txt2.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt2.setEditable(false);

		p1.add(txt2);

		ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("Kala.jpg"));
		Image b2 = b1.getImage().getScaledInstance(930, 594, Image.SCALE_DEFAULT);
		ImageIcon b3 = new ImageIcon(b2);
		JLabel image2 = new JLabel(b3);
		p1.add(image2);

		JTextArea txt3 = new JTextArea("\n\t\t   Janmashtami\n"
				+ "\n            Janmashtami celebrating the birth of Lord Krishna is a vibrant"
				+ "\n            festival in the Konkan region. The festivities include Dahi Handi"
				+ "\n            where boys form human pyramid to break a pot filled with curd"
				+ "\n            symbolizing Krishna's playful nature. Homes and temples are"
				+ "\n            decorated and devotees fast and perform midnight prayers to"
				+ "\n            mark Krishna's birth. In Konkan traditional dishes like Amboli a"
				+ "\n            type of rice pancake & Kalya Vatanyachi Usal a black pea curry"
				+ "\n            are prepared. The community gathers for bhajans and dances "
				+ "\n            creating a joyous atmosphere. Children often dress like Krishna"
				+ "\n            and radha adding the festive spirit. the festival also emphasizes"
				+ "\n            the values of teamwork and unity as seen in the Dahi Handi"
				+ "\n            celebration. Overall janmashtami in konkan is blend of devotion"
				+ "\n            culture & fun making a memorable experience for all."

		);

		txt3.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt3.setEditable(false);

		p1.add(txt3);

		ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("Shiv.jpg"));
		Image c2 = c1.getImage().getScaledInstance(837, 589, Image.SCALE_DEFAULT);
		ImageIcon c3 = new ImageIcon(c2);
		JLabel image3 = new JLabel(c3);
		p1.add(image3);

		JTextArea txt4 = new JTextArea("\n\t\t  Mahashivratra\n"
				+ "\n            Mahashivratri the great night of shiv is celebrated with immense"
				+ "\n            devotion in the Konkan region. Temples like the Harihareshwar"
				+ "\n            and Marleshwar temple become the focal points of festivities."
				+ "\n            Devotees observe fasts and perform night-long vigils chanting"
				+ "\n            hymns and offering prayers to Lord Shankar. The Temples are"
				+ "\n            beautifully decorated and special rituals like Abhishekam are"
				+ "\n            performed. The atmosphere is filled with the sound of bells and"
				+ "\n            the chanting of the Om Namah Shivaya Many devotees also"
				+ "\n            undertake pilgrimages to these sacred site seeking blessings &"
				+ "\n            spiritual renewal. Overall Mahashivratri in Konkan is a blend of"
				+ "\n            deep spirituality and vibrant cultural expressions making it a"
				+ "\n            unique and memorable celebration.");

		txt4.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt4.setEditable(false);

		p1.add(txt4);

		ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("Diwali.jpg"));
		Image d2 = d1.getImage().getScaledInstance(900, 676, Image.SCALE_DEFAULT);
		ImageIcon d3 = new ImageIcon(d2);
		JLabel image4 = new JLabel(d3);
		p1.add(image4);

		JTextArea txt5 = new JTextArea("\n\t\t    Dipawali\n"
				+ "\n            Dipawali the festival of lights is celebrated with great enthusiasm"
				+ "\n            in the Konkan region. The festivities begin with dhanteras where"
				+ "\n            people clean and decorate their homes and buy new utensils or"
				+ "\n            jewelry. On the main day of Diwali, homes are illuminated with"
				+ "\n            Oil lamps and colorful Rangoli designs adorn the entrances."
				+ "\n            families perform lakshmi puja to seek blessing from the goddess"
				+ "\n            of wealth and prosperity. The night sky lights up with fireworks"
				+ "\n            adding to the festive spirit. Traditional sweets like Karanji and"
				+ "\n            Ladoo are prepared and shared among family and friends. The"
				+ "\n            festival also includes Bhau Beej a day dedicated to the bond"
				+ "\n            between brothers and sisters. The vibrant atmosphere and the"
				+ "\n            sense of togetherness make Diwali in Konkan a truly special"
				+ "\n            experience."

		);

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

		new Festivals();
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

			sp.getHorizontalScrollBar().setValue(2080);
			requestFocusInWindow();
		}

		else if (e.getSource() == b3) {

			sp.getHorizontalScrollBar().setValue(4100);
			requestFocusInWindow();
		}

		else if (e.getSource() == b4) {

			sp.getHorizontalScrollBar().setValue(6150);
			requestFocusInWindow();
		}

		else if (e.getSource() == b5) {

			sp.getHorizontalScrollBar().setValue(8170);
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
