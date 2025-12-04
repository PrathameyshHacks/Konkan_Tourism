package MyPackage;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Adventures extends JFrame implements ActionListener, KeyListener {

	JButton bt, b2;
	JScrollPane sp;
	JButton bsc;

	Adventures() {

		super("Adventures");

		this.setExtendedState(MAXIMIZED_BOTH);

		JPanel p1 = new JPanel();

		p1.setBackground(Color.WHITE);
		p1.setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		gc.insets = new Insets(50, 0, 50, 50);
		gc.fill = GridBagConstraints.VERTICAL;

		sp = new JScrollPane(p1);

		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setBounds(250, 0, 1000, 800);

		JPanel p2 = new JPanel();

		p2.setLayout(null);
		p2.setBackground(new Color(0, 180, 200));
		p2.setPreferredSize(getMaximumSize());
		p2.add(sp);
		b2 = new JButton();
		p2.add(b2);

		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 20;

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("devzip.PNG"));
		Image i2 = i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		p1.add(image, gc);

		gc.gridx = 0;
		gc.gridy = 1;

		JTextArea txt0 = new JTextArea("	         Devgad Beach\n"
				+ "\n       To experience a thrilling adventure at Flying Konkan"
				+ "\n       Devgad Beach Zipline .Maharashtra's longest and"
				+ "\n       India's first ever on coast Zipline having the huge"
				+ "\n       length of 1,885 feet and height of 280 feet.\n"
				+ "\n       To visit Devgad beach, you can follow these steps :"
				+ "\n       1. By Road: Drive to Devgad Beach, which is located"
				+ "\n                         in the Sindhudurg district of Maharashtra."
				+ "\n       2. By Train: Take a train to Kankavli railway stations ."
				+ "\n                         from there, you can take auto-rickshaw .");

		txt0.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt0.setEditable(false);
		p1.add(txt0, gc);

		gc.gridx = 0;
		gc.gridy = 2;

		ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("niv.PNG"));
		Image a2 = a1.getImage().getScaledInstance(371, 417, Image.SCALE_DEFAULT);
		ImageIcon a3 = new ImageIcon(a2);
		JLabel image1 = new JLabel(a3);
		p1.add(image1, gc);

		gc.gridx = 0;
		gc.gridy = 3;

		JTextArea txt1 = new JTextArea("	             Nivati Rocks\n"
				+ "\n       Nivati Rocks are also known as Golden Rocks, this is a"
				+ "\n       stunning geological formation located near Nivati Beach"
				+ "\n       in Maharashtra. The area is surrounded by the sea and"
				+ "\n       is a popular spot for tourists who often visit by boat .\n"
				+ "\n       To visit Nivati Rocks, you can follow these steps :"
				+ "\n       1. By Road: Drive to Nivati Beach, which is located"
				+ "\n                         in the Sindhudurg district of Maharashtra."
				+ "\n       2. By Train: Take a train to Kudal railway stations ."
				+ "\n                         from there, you can take auto-rickshaw .");

		txt1.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt1.setEditable(false);
		p1.add(txt1, gc);

		gc.gridx = 0;
		gc.gridy = 4;

		ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("para.jpg"));
		Image b2 = b1.getImage().getScaledInstance(800, 450, Image.SCALE_DEFAULT);
		ImageIcon b3 = new ImageIcon(b2);
		JLabel image2 = new JLabel(b3);
		p1.add(image2, gc);

		gc.gridx = 0;
		gc.gridy = 5;

		JTextArea txt3 = new JTextArea("\n\n\t     Paragliding in Malvan\n"
				+ "\n       Paragliding in Malvan offers an exhilarating experience"
				+ "\n       with stunning views of the Arabian Sea and coastline. "
				+ "\n       This adventure sport is popular among tourists seeking "
				+ "\n       a thrilling activity amidst the serene beaches.\n"
				+ "\n       To visit Nivati Rocks, you can follow these steps :"
				+ "\n       1. By Road: Drive to Malvan Beach, which is located"
				+ "\n                         in the Sindhudurg district of Maharashtra."
				+ "\n       2. By Train: Take a train to Kudal railway stations ."
				+ "\n                         from there, you can take auto-rickshaw .");

		txt3.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt3.setEditable(false);
		p1.add(txt3, gc);

		gc.gridx = 0;
		gc.gridy = 6;
		gc.ipadx = 70;

		ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("scuba.PNG"));
		Image c2 = c1.getImage().getScaledInstance(830, 450, Image.SCALE_DEFAULT);
		ImageIcon c3 = new ImageIcon(c2);
		JLabel image3 = new JLabel(c3);
		p1.add(image3, gc);

		gc.gridx = 0;
		gc.gridy = 7;

		JTextArea txt4 = new JTextArea("\n\n\t            Scuba Diving in Malvan\n"
				+ "\n       Scuba diving in Malvan offers an exhilarating experience with"
				+ "\n       it clear water and vibrant marine life. Located in Sindhudurg"
				+ "\n       district of Maharashtra, Divers can explore depths of 20 feet"
				+ "\n       witnessing stunning corals & aquatic species .The activity is"
				+ "\n       safe for both beginners and non-swimmers, with experienced "
				+ "\n       instructors providing necessary training .\n"
				+ "\n       To visit Malvan , you can follow these steps :"
				+ "\n       1. By Road: Drive to Malvan Beach, which is located"
				+ "\n                         in the Sindhudurg district of Maharashtra."
				+ "\n       2. By Train: Take a train to Kudal railway stations ."
				+ "\n                         from there, you can take auto-rickshaw .");

		txt4.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt4.setEditable(false);
		p1.add(txt4, gc);

		gc.gridx = 0;
		gc.gridy = 8;
		gc.ipadx = 20;

		ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("ragadv.PNG"));
		Image d2 = d1.getImage().getScaledInstance(594, 590, Image.SCALE_DEFAULT);
		ImageIcon d3 = new ImageIcon(d2);
		JLabel image4 = new JLabel(d3);
		p1.add(image4, gc);

		gc.gridx = 0;
		gc.gridy = 9;

		JTextArea txt5 = new JTextArea("\n\n\t          Rangana fort trekking\n"
				+ "\n       Rangana Fort, located in Kudal, Sindhudurg, offers thrilling"
				+ "\n       trekking experience. The fort, standing at an altitude of"
				+ "\n       2600 feet, was built during the Shilahar Bhoj’s reign and"
				+ "\n       later captured by Chhatrapati Shivaji Maharaj in 1659 . "
				+ "\n       Trekkers can enjoy scenic view and explore historical sites"
				+ "\n       like the Rangnai Devi Temple and a freshwater lake within"
				+ "\n       fort . The trek is moderately challenging, making it much"
				+ "\n       suitable for adventure enthusiasts. The fort’s rich history"
				+ "\n       and natural beauty make it popular destination for trekkers\n"
				+ "\n       To visit Rangana Fort, you can follow these steps :"
				+ "\n       1. By Road: Drive to Rangana Village, which is located"
				+ "\n                         in the Sindhudurg district of Maharashtra."
				+ "\n       2. By Train: Take a train to Kudal railway stations ."
				+ "\n                         from there, you can take auto-rickshaw .				");

		txt5.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt5.setEditable(false);
		p1.add(txt5, gc);

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

		new Adventures();
	}

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
