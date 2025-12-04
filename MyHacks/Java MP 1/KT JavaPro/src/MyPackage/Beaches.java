package MyPackage;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Beaches extends JFrame implements ActionListener, KeyListener {

	JButton bt, b2;
	JScrollPane sp;
	JButton b1, b2x, b3, b4, b5;

	Beaches() {

		super("Beaches");
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
		b1 = new JButton("Devbaug");
		b1.addActionListener(this);
		p3.add(b1, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.ipadx = 30;
		b2x = new JButton("Alibaug");
		b2x.addActionListener(this);
		p3.add(b2x, gc);

		gc.gridx = 2;
		gc.gridy = 0;
		b3 = new JButton("Dapoli");
		b3.addActionListener(this);
		p3.add(b3, gc);

		gc.gridx = 3;
		gc.gridy = 0;
		b4 = new JButton("Guhagar");
		b4.addActionListener(this);
		p3.add(b4, gc);

		gc.gridx = 4;
		gc.gridy = 0;
		b5 = new JButton("Vengurla");
		b5.addActionListener(this);
		p3.add(b5, gc);

		p2.add(p3);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("KOKAN.png"));
		Image i2 = i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image0 = new JLabel(i3);
		p1.add(image0);

		JTextArea txt1 = new JTextArea("\n\t             Devbaug Beach\n"
				+ "\n    Devbaug Beach is located in Sindhudurg district of Maharashtra"
				+ "\n    is a serene and picturesque destination Known for its golden "
				+ "\n    sands and clear blue waters, it offers a tranquil escape from"
				+ "\n    the hustle and bustle The beach is famous for unique confluence"
				+ "\n    where the Karli River meets the Arabian Sea. Tourist can enjoy"
				+ "\n    various water sports and activities, making it a popular spot"
				+ "\n    for adventure lovers.  Additionally, the beach is less crowded"
				+ "\n    providing a peaceful environment for relaxation .\n"
				+ "\n\t      How to visit Devbaug Beach :"
				+ "\n    1. By Road: Drive to Malvan Beach, which is located in the"
				+ "\n                         Sindhudurg district of Maharashtra."
				+ "\n    2. By Train: Take a train to Kudal railway stations .from "
				+ "\n                         there, you can take auto-rickshaw .");

		txt1.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt1.setEditable(false);

		p1.add(txt1);

		ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("Dash1.jpg"));
		Image a2 = a1.getImage().getScaledInstance(900, 650, Image.SCALE_DEFAULT);
		ImageIcon a3 = new ImageIcon(a2);
		JLabel image1 = new JLabel(a3);
		p1.add(image1);

		JTextArea txt2 = new JTextArea("\n\t                Alibaug Beach\n"
				+ "\n          Alibaug beach is located along the Arabian Sea coast in"
				+ "\n          Maharashtra known for its scenic beauty and black sand ."
				+ "\n          The beach offers a stunning view of the 17th-century "
				+ "\n          Kolaba Fort which can be reached by boat or by walking"
				+ "\n          during low tides. It’s a popular spot for water sports like"
				+ "\n          jet skiing, banana boat rides, parasailing & scuba diving"
				+ "\n          The beach is also famous for its picturesque sunrises"
				+ "\n          and sunsets, making it a favorite among photographers.\n"
				+ "\n\t        How to visit Alibaug Beach :"
				+ "\n          1. By Road: Drive to Alibaug Beach, which is located in the"
				+ "\n                              Raigad district of Maharashtra."
				+ "\n          2. By Train: Take a train to Panvel railway stations .from "
				+ "\n                              there, you can take auto-rickshaw .");

		txt2.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt2.setEditable(false);

		p1.add(txt2);

		ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("Haran.jpg"));
		Image b2 = b1.getImage().getScaledInstance(856, 600, Image.SCALE_DEFAULT);
		ImageIcon b3 = new ImageIcon(b2);
		JLabel image2 = new JLabel(b3);
		p1.add(image2);

		JTextArea txt3 = new JTextArea("\n\t                      Dapoli Beach\n"
				+ "\n          Dapoli Beach, located along the Konkan coast in Maharashtra"
				+ "\n          is known for its pristine golden sands and clear blue waters ."
				+ "\n          The beach is surrounded by lush greenery & coconut groves ."
				+ "\n          Its a popular spot for water sports like parasailing, jet skiing &"
				+ "\n          dolphin watching. The pleasant climate & serene environment"
				+ "\n          make it an ideal getaway for visitors from Mumbai and Pune. "
				+ "\n          Its also famous for its fresh seafood, offering a delightful"
				+ "\n          culinary experience .\n"
				+ "\n\t            How to visit Dapoli Beach :"
				+ "\n          1. By Road: Drive to Dapoli Beach, which is located in the"
				+ "\n                              Ratnagiri district of Maharashtra."
				+ "\n          2. By Train: Take a train to Khed railway stations .from "
				+ "\n                              there, you can take auto-rickshaw .");

		txt3.setFont(new Font("SAN SERIF", Font.PLAIN, 32));
		txt3.setEditable(false);

		p1.add(txt3);

		ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("dapoli.jpg"));
		Image c2 = c1.getImage().getScaledInstance(750, 420, Image.SCALE_DEFAULT);
		ImageIcon c3 = new ImageIcon(c2);
		JLabel image3 = new JLabel(c3);
		p1.add(image3);

		JTextArea txt4 = new JTextArea("\n\t              Guhagar Beach\n"
				+ "\n        Guhagar beach is a serene & pristine destination which is"
				+ "\n        located in the Ratnagiri district of Maharashtra. It is"
				+ "\n        known for its white sand clear water & lush coconut trees."
				+ "\n        The beach is ideal for swimming sunbathing & relaxing."
				+ "\n        Visitors can also enjoy water sports and the beautiful"
				+ "\n        sunset views .\n"
				+ "\n\t          How to visit Guhagar Beach :"
				+ "\n        1. By Road: Drive to Guhagar Beach, which is located in the"
				+ "\n                            Ratnagiri district of Maharashtra."
				+ "\n        2. By Train: Take a train to Khed railway stations .from "
				+ "\n                            there, you can take auto-rickshaw .");

		txt4.setFont(new Font("SAN SERIF", Font.PLAIN, 34));
		txt4.setEditable(false);

		p1.add(txt4);

		ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("nivati1.jpg"));
		Image d2 = d1.getImage().getScaledInstance(750, 600, Image.SCALE_DEFAULT);
		ImageIcon d3 = new ImageIcon(d2);
		JLabel image4 = new JLabel(d3);
		p1.add(image4);

		JTextArea txt5 = new JTextArea("\n\t               Vengurla Beach\n"
				+ "\n       Vengurla Beach is located in the Sindhudurg district of"
				+ "\n       Maharashtra. Its a hidden gem known for natural beauty"
				+ "\n       and tranquility. The beach is surrounded by lush tropical"
				+ "\n       vegetation including coconut, cashew, and mango trees. "
				+ "\n       Visitors can enjoy delicious local seafood and explore"
				+ "\n       nearby attractions like the Vengurla Lighthouse. Its"
				+ "\n       also famous for its british time port.\n"
				+ "\n\t          How to visit Vengurla Beach :"
				+ "\n        1. By Road: Drive to Vengurla Beach, which is located in the"
				+ "\n                            Sindhudurg district of Maharashtra."
				+ "\n        2. By Train: Take a train to Kudal railway stations .from "
				+ "\n                            there, you can take auto-rickshaw .");

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

		new Beaches();
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
			sp.getHorizontalScrollBar().setUnitIncrement(100);
			sp.getHorizontalScrollBar().setValue(i + sp.getHorizontalScrollBar().getUnitIncrement(1));

		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

			int i = sp.getHorizontalScrollBar().getValue();
			sp.getHorizontalScrollBar().setUnitIncrement(100);
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
