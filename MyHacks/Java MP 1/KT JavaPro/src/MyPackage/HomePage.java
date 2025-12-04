package MyPackage;

import java.awt.*;

import java.awt.event.*;
//import java.sql.*;

import javax.swing.*;

public class HomePage extends JFrame implements ActionListener, AdjustmentListener {

	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12, b13, b14;

	MyAcc ac;

	HomePage() {

		super("Dashboard");

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("dapoli.jpg"));

		Image i2 = i1.getImage().getScaledInstance(1320, 660, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);

		JLabel image = new JLabel(i3);

		image.setBounds(120, 140, 1580, 660);

		add(image);

		JPanel p1 = new JPanel();

		p1.setBounds(0, 0, 1580, 40);
		p1.setLayout(null);
		p1.setBackground(new Color(1, 236, 52));
		p1.setVisible(true);
		add(p1);

		JLabel slider = new JLabel("Welcome to Konkan Tourism . . .     ");

		slider.setBounds(400, 10, 350, 20);
		slider.setFont(new Font("ITALIC", Font.BOLD, 18));

		p1.add(slider);

		JLabel slider1 = new JLabel("Welcome to Konkan Tourism . . .     ");

		slider1.setBounds(400, 10, 350, 20);
		slider1.setFont(new Font("ITALIC", Font.BOLD, 18));

		p1.add(slider1);

		JLabel slider2 = new JLabel("Welcome to Konkan Tourism . . .");

		slider2.setBounds(400, 10, 350, 20);
		slider2.setFont(new Font("ITALIC", Font.BOLD, 18));

		p1.add(slider2);

		// Create and start multiple threads

		new Thread(new Runnable() {
			int x = 0;

			@Override
			public void run() {
				while (true) {
					for (x = 0; x <= 400; x++) {
						slider.setLocation(x, 10);
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			int x = 0;

			@Override
			public void run() {
				while (true) {
					for (x = 400; x <= 800; x++) {
						slider1.setLocation(x, 10);
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			int x = 0;

			@Override
			public void run() {
				while (true) {
					for (x = 800; x <= 1200; x++) {
						slider2.setLocation(x, 10);
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}).start();

		JPanel p2 = new JPanel();

		p2.setBounds(0, 40, 1580, 100);
		p2.setLayout(null);
		p2.setBackground(new Color(180, 255, 247));
		add(p2);

		ImageIcon lo1 = new ImageIcon(ClassLoader.getSystemResource("DashLog.png"));

		Image lo2 = lo1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon lo3 = new ImageIcon(lo2);

		JLabel image1 = new JLabel(lo3);

		image1.setBounds(50, 20, 50, 50);

		p2.add(image1);

		JPanel p3 = new JPanel();

		p3.setBounds(0, 140, 250, 920);
		p3.setLayout(null);
		p3.setBackground(new Color(1, 169, 236));
		add(p3);

		b2 = new JButton();

		p1.add(b2);

		JLabel l = new JLabel("KONKAN TOURISM ...");

		l.setBounds(590, 25, 450, 50);
		l.setFont(new Font("ITALIC", Font.BOLD, 36));
		l.setForeground(Color.RED);

		p2.add(l);

		b1 = new JButton("Home");

		b1.setLayout(null);
		b1.setBounds(0, 0, 250, 50);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(1, 169, 236));
		b1.setFont(new Font("Italic", Font.LAYOUT_LEFT_TO_RIGHT, 20));
		p3.add(b1);

		b3 = new JButton("Beaches");

		b3.setLayout(new GridLayout());
		b3.setBounds(0, 50, 250, 50);
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(1, 169, 236));
		b3.addActionListener(this);
		b3.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		p3.add(b3);

		b4 = new JButton("Temples");

		b4.setLayout(new GridLayout());
		b4.setBounds(0, 100, 250, 50);
		b4.setForeground(Color.WHITE);
		b4.setBackground(new Color(1, 169, 236));
		b4.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b4.addActionListener(this);
		p3.add(b4);

		b5 = new JButton("Forts");

		b5.setLayout(new GridLayout());
		b5.setBounds(0, 150, 250, 50);
		b5.setForeground(Color.WHITE);
		b5.setBackground(new Color(1, 169, 236));
		b5.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b5.addActionListener(this);
		p3.add(b5);

		b6 = new JButton("Adventures");

		b6.setLayout(new GridLayout());
		b6.setBounds(0, 200, 250, 50);
		b6.setForeground(Color.WHITE);
		b6.setBackground(new Color(1, 169, 236));
		b6.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b6.addActionListener(this);
		p3.add(b6);

		b7 = new JButton("Festivals");

		b7.setLayout(new GridLayout());
		b7.setBounds(0, 250, 250, 50);
		b7.setForeground(Color.WHITE);
		b7.setBackground(new Color(1, 169, 236));
		b7.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b7.addActionListener(this);
		p3.add(b7);

		b8 = new JButton("View on Map");

		b8.setLayout(new GridLayout());
		b8.setBounds(0, 300, 250, 50);
		b8.setForeground(Color.WHITE);
		b8.setBackground(new Color(1, 169, 236));
		b8.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b8.addActionListener(this);
		p3.add(b8);

		b9 = new JButton("My Trips");

		b9.setLayout(new GridLayout());
		b9.setBounds(0, 350, 250, 50);
		b9.setForeground(Color.WHITE);
		b9.setBackground(new Color(1, 169, 236));
		b9.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b9.addActionListener(this);
		p3.add(b9);

		b10 = new JButton("Book Hotels");

		b10.setLayout(new GridLayout());
		b10.setBounds(0, 400, 250, 50);
		b10.setForeground(Color.WHITE);
		b10.setBackground(new Color(1, 169, 236));
		b10.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b10.addActionListener(this);
		p3.add(b10);

		b11 = new JButton("Gallery");

		b11.setLayout(new GridLayout());
		b11.setBounds(0, 450, 250, 50);
		b11.setForeground(Color.WHITE);
		b11.setBackground(new Color(1, 169, 236));
		b11.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b11.addActionListener(this);
		p3.add(b11);

		b12 = new JButton("Contact us");

		b12.setLayout(new GridLayout());
		b12.setBounds(0, 500, 250, 50);
		b12.setForeground(Color.WHITE);
		b12.setBackground(new Color(1, 169, 236));
		b12.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b12.addActionListener(this);
		p3.add(b12);

		b13 = new JButton("Delete Account");

		b13.setLayout(new GridLayout());
		b13.setBounds(0, 550, 250, 50);
		b13.setForeground(Color.WHITE);
		b13.setBackground(new Color(1, 169, 236));
		b13.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		b13.addActionListener(this);
		p3.add(b13);

		b14 = new JButton("My Account");

		b14.setLayout(new GridLayout());
		b14.setBounds(0, 600, 250, 50);
		b14.setForeground(Color.WHITE);
		b14.addActionListener(this);
		b14.setBackground(new Color(1, 169, 236));
		b14.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		p3.add(b14);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b1) {

			setVisible(false);
			new HomePage();

		} else if (ae.getSource() == b3) {

			setVisible(false);
			new Beaches();
		}

		else if (ae.getSource() == b4) {

			setVisible(false);
			new Temples();
		}

		else if (ae.getSource() == b5) {

			setVisible(false);
			new Forts();
		}

		else if (ae.getSource() == b6) {

			setVisible(false);
			new Adventures();
		}

		else if (ae.getSource() == b7) {

			setVisible(false);
			new Festivals();
		}

		else if (ae.getSource() == b8) {

			new GMaps();
		}

		else if (ae.getSource() == b9) {

			new MyTrips();
		}

		else if (ae.getSource() == b10) {

			setVisible(false);
			new BookHots();
		}

		else if (ae.getSource() == b11) {

			setVisible(false);
			new ScrollBar();
		}

		else if (ae.getSource() == b12) {

			new Contact();
		}

		else if (ae.getSource() == b13) {

			new Del();
			setVisible(false);
		}

		else if (ae.getSource() == b14) {

			setVisible(false);
			ac = new MyAcc();

		}

	}

	public static void main(String args[]) {

		new HomePage();

	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {

	}
}
