package MyPackage;

import java.awt.*;

import java.awt.event.*;
import java.sql.PreparedStatement;
import java.util.regex.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SignUp extends JFrame implements ActionListener {

	JButton b2, b1;
	JTextField t1, t2, t3;
	static JTextField t5;
	String e_mail;

	SignUp() {

		super("Sign Up Page");
		// creating frame layout
		setBounds(150, 100, 1200, 550);
		setLayout(null);

		// creating panel
		JPanel p = new JPanel();

		p.setBounds(250, 0, 650, 650);
		p.setBackground(Color.cyan);
		p.setLayout(null);

		JLabel l = new JLabel("WELCOME @KONKAN TOURISM");

		l.setBounds(160, 45, 450, 50);
		l.setFont(new Font("SAN SERIF", Font.BOLD, 20));
		l.setForeground(Color.RED);

		p.add(l);

		JLabel l2 = new JLabel("USER ID :");

		l2.setBounds(150, 75, 300, 100);
		l2.setFont(new Font("SERIA", Font.BOLD, 15));
		l2.setForeground(Color.YELLOW);

		p.add(l2);

		JLabel l3 = new JLabel("USERNAME :");

		l3.setBounds(150, 123, 300, 100);
		l3.setFont(new Font("SERIA", Font.BOLD, 15));
		l3.setForeground(Color.yellow);

		p.add(l3);

		JLabel l4 = new JLabel("PASSWORD :");

		l4.setBounds(150, 175, 300, 100);
		l4.setFont(new Font("SERIA", Font.BOLD, 15));
		l4.setForeground(Color.yellow);

		p.add(l4);

		JLabel l5 = new JLabel("Email :");

		l5.setBounds(150, 225, 300, 100);
		l5.setFont(new Font("SERIA", Font.BOLD, 15));
		l5.setForeground(Color.yellow);

		p.add(l5);

		t1 = new JTextField("", 10);

		t1.setBounds(255, 115, 200, 20);
		t1.setBorder(BorderFactory.createEmptyBorder());

		p.add(t1);

		t2 = new JTextField("", 20);

		t2.setBounds(255, 163, 200, 20);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p.add(t2);

		t3 = new JTextField("", 20);

		t3.setBounds(255, 215, 200, 20);
		t3.setBorder(BorderFactory.createEmptyBorder());
		p.add(t3);

		t5 = new JTextField("", 20);

		t5.setBounds(255, 266, 200, 20);
		t5.setBorder(BorderFactory.createEmptyBorder());
		p.add(t5);

		b2 = new JButton("CREATE");

		b2.setBounds(280, 385, 88, 20);
		b2.addActionListener(this);
		p.add(b2);

		b1 = new JButton("BACK");

		b1.setBounds(100, 448, 81, 18);
		b1.addActionListener(this);

		p.add(b1);

		JCheckBox c1 = new JCheckBox("Save Password");

		c1.setBounds(500, 454, 120, 15);
		c1.setBackground(Color.white);
		p.add(c1);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("KOKAN.png"));
		// image @Devbaug beach_Malvan ...

		Image i2 = i1.getImage().getScaledInstance(650, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);

		// JLabel t = new JLabel("KONKAN TOURISM");

		JLabel image = new JLabel(i3);

		image.setBounds(0, 0, 650, 650);
		p.add(image);

		add(p);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b2) {

			String userId = t1.getText();
			String userName = t2.getText();
			String pass = t3.getText();
			e_mail = t5.getText();

			if (isValidEmail(e_mail)) {

				try {

					Connec c = new Connec();

					PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?)");

					ps.setString(1, userId);
					ps.setString(2, userName);
					ps.setString(3, pass);
					ps.setString(4, e_mail);

					int count = ps.executeUpdate();

					if (count > 0) {

						JOptionPane.showMessageDialog(null, "Account created Succesfully");

						setVisible(false);
						new LogIn();

					}
				} catch (Exception e) {

					e.printStackTrace();
					System.out.println(e);
				}

				new MesX();
			}

			else {

				JOptionPane.showMessageDialog(null, "Enter valid email...!");
			}

		} else {

			setVisible(false);
			new LogIn();
		}

	}

	public static boolean isValidEmail(String e_mail) {

		String emailRegex = "^[A-Za-z0-9+_.-]+@(.+\\.)+(com|in|net|org)$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(e_mail);
		return matcher.matches();
	}

	public static String getMail() {

		String em;
		em = t5.getText();
		return em;
	}

	public static void main(String[] args) {

		new SignUp();
	}

}
