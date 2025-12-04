package MyPackage;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Temples extends JFrame implements ActionListener, KeyListener {

	JButton bt, b2, bsc;
	JScrollPane sp;

	Temples() {

		super("Temples");

		this.setExtendedState(MAXIMIZED_BOTH);

		JPanel p1 = new JPanel();

		p1.setBackground(Color.WHITE);
		p1.setLayout(new GridLayout(10, 1));

		b2 = new JButton();

		sp = new JScrollPane(p1);

		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setBounds(250, 0, 1000, 800);

		JPanel p2 = new JPanel();

		p2.setLayout(null);
		p2.setBackground(new Color(0, 180, 200));
		p2.setPreferredSize(getMaximumSize());
		p2.add(sp);
		p2.add(b2);

		ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("kunko1.PNG"));
		Image a2 = a1.getImage().getScaledInstance(780, 590, Image.SCALE_DEFAULT);
		ImageIcon a3 = new ImageIcon(a2);
		JLabel image1 = new JLabel(a3);
		p1.add(image1);

		JTextArea txt1 = new JTextArea("\t               Kunkeshwar Temple\n"
				+ "\n          Kunkeshwar Temple is located in the Sindhudurg district of"
				+ "\n          Maharashtra is a old Shiva temple known as Konkan Kashi."
				+ "\n          This 11th-century Shiv temple is situated right on the beach"
				+ "\n          offering stunning views of the Arabian Sea. The temple is"
				+ "\n          famous for its unique Konkani-style architecture and it is a"
				+ "\n          major pilgrimage site. The temple is especially vibrant"
				+ "\n          during the annual Mahashivaratri festival.\n"
				+ "\n\t        How to visit Kunkeshwar Temple :"
				+ "\n          1. By Road: Drive to Devgad City, which is located in the"
				+ "\n                             Sindhudurg district of Maharashtra."
				+ "\n          2. By Train: Take a train to Kankawali railway station from"
				+ "\n                             there you can take auto-rickshaw .");

		txt1.setFont(new Font("SAN SERIF", Font.PLAIN, 30));
		txt1.setEditable(false);

		p1.add(txt1);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AliBRam.png"));
		Image i2 = i1.getImage().getScaledInstance(650, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image0 = new JLabel(i3);
		p1.add(image0);

		JTextArea txt2 = new JTextArea("\n\t         Rameshwar Mandir Alibaug\n"
				+ "\n            Rameshwar Mandir located in Chaul near Alibaug is an"
				+ "\n            ancient temple dedicated to Lord Shiva .The temple is"
				+ "\n            renowned for its three sacred tanks parjanya kund, agni"
				+ "\n            Kund and Vayu Kund representing the rain, fire, and air."
				+ "\n            The temple’s architecture includes a sabhamandap and"
				+ "\n            a sanctum sanctorum with a 7.62-meter high dome."
				+ "\n            This serene and spiritual site attracts many devotees"
				+ "\n            and tourists alike.\n"
				+ "\n\t          How to visit Rameshwar Temple :"
				+ "\n            1. By Road: Drive to Chaul village which is located in"
				+ "\n                                Alibaug district of Maharashtra."
				+ "\n            2. By Train: Take a train to Panvel railway station from"
				+ "\n                                there you can take auto-rickshaw .");

		txt2.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt2.setEditable(false);

		p1.add(txt2);

		ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("GanPule.png"));
		Image b2 = b1.getImage().getScaledInstance(856, 600, Image.SCALE_DEFAULT);
		ImageIcon b3 = new ImageIcon(b2);
		JLabel image2 = new JLabel(b3);
		p1.add(image2);

		JTextArea txt3 = new JTextArea("\t         Ganesh Temple Ganpatipule\n"
				+ "\n            Ganpatipule Temple located in the Ratnagiri district is a"
				+ "\n            revered Hindu temple dedicated to Lord Ganesha. The"
				+ "\n            temple is situated on the picturesque shores of Arabian "
				+ "\n            sea. the temple is surrounded by lush green hills making"
				+ "\n            it a serene & scenic pilgrimage site. The temple tranquil"
				+ "\n            environment & spiritual significance make it a must-visit"
				+ "\n            destination in the Konkan region .\n"
				+ "\n\t       How to visit Ganpatipule Temple "
				+ "\n            1. By Road: Drive to Ganpatipule beach located in the"
				+ "\n                                Ratnagiri district of Maharashtra."
				+ "\n            2. By Train: Take a train to Ratnagiri railway station"
				+ "\n                                from there you can take auto-rickshaw .");

		txt3.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt3.setEditable(false);

		p1.add(txt3);

		ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("AngN.png"));
		Image c2 = c1.getImage().getScaledInstance(630, 720, Image.SCALE_DEFAULT);
		ImageIcon c3 = new ImageIcon(c2);
		JLabel image3 = new JLabel(c3);
		p1.add(image3);

		JTextArea txt4 = new JTextArea("\n\n\t              Anganewadi Temple\n"
				+ "\n            Anganewadi Temple also known as Bharadi Devi temple"
				+ "\n            is a prominent shrine in the konkan region of Maharashtra"
				+ "\n            Located in the village of Masure near Malvan. the temple"
				+ "\n            is famous for its active deity believed to be fulfill devotee's"
				+ "\n            wishes. The temple's annual fair held in February attracts"
				+ "\n            thousands of visitors and is a major event in the region.\n"
				+ "\n\t       How to visit Anganewadi Temple "
				+ "\n            1. By Road: Drive to Masure village which is located in"
				+ "\n                                Sindhudurg district of Maharashtra."
				+ "\n            2. By Train: Take a train to Kudal railway station and"
				+ "\n                                from there you can take auto-rickshaw .");

		txt4.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt4.setEditable(false);

		p1.add(txt4);

		ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("Vetoba.png"));
		Image d2 = d1.getImage().getScaledInstance(900, 650, Image.SCALE_DEFAULT);
		ImageIcon d3 = new ImageIcon(d2);
		JLabel image4 = new JLabel(d3);
		p1.add(image4);

		JTextArea txt5 = new JTextArea("\n\n\t               Vetoba Temple Aravali\n"
				+ "\n            Vetoba Temple is located in Aravali village of Sindhudurg"
				+ "\n            district is dedicated to Shri Dev Vetoba the deity believed"
				+ "\n            to protect the village. The temple features a magnificent"
				+ "\n            idol of Vetoba made from five metals standing over nine"
				+ "\n            feet tall. Devotees offer leather footwear known as chapal"
				+ "\n            to Vetoba, believing he wears them while patrolling the"
				+ "\n            village to ward off evil.\n"
				+ "\n\t            How to visit Vetoba Temple "
				+ "\n            1. By Road: Drive to Aravali village which is located in"
				+ "\n                                Sindhudurg district of Maharashtra."
				+ "\n            2. By Train: Take a train to Kudal railway station and"
				+ "\n                                from there you can take auto-rickshaw .\n");

		txt5.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt5.setEditable(false);

		p1.add(txt5);

		bt = new JButton("Home");

		bt.setBounds(0, 0, 90, 20);
		bt.addActionListener(this);
		p2.add(bt);

		bsc = new JButton("Top");

		bsc.setBounds(0, 772, 90, 20);
		bsc.addActionListener(this);
		p2.add(bsc);

		this.addKeyListener(this);

		setFocusable(true);
		this.requestFocusInWindow();

		this.addWindowFocusListener(new WindowAdapter() {
			@Override
			public void windowGainedFocus(WindowEvent e) {

				sp.getVerticalScrollBar().setValue(0); // Reset to the top
			}
		});

		this.setContentPane(p2);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Temples();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bt) {

			setVisible(false);
			new HomePage();

		}
		if (e.getSource() == bsc) {

			sp.getViewport().setViewPosition(new Point(0, 0));
			requestFocusInWindow();
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			int i = sp.getVerticalScrollBar().getValue();
			sp.getVerticalScrollBar().setUnitIncrement(100);
			sp.getVerticalScrollBar().setValue(i + sp.getVerticalScrollBar().getUnitIncrement(1));

		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {

			int i = sp.getVerticalScrollBar().getValue();
			sp.getVerticalScrollBar().setUnitIncrement(100);
			sp.getVerticalScrollBar().setValue(i - sp.getVerticalScrollBar().getUnitIncrement(-1));

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		// sp.getVerticalScrollBar().setValue(100);
		// System.out.println("Enter key pressed");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
