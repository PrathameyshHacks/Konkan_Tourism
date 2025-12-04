package MyPackage;

import java.awt.*;

import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class LogIn extends JFrame implements ActionListener {

	JButton b1;
	JLabel l2, l3, footer;
	static JTextField tx;
	JTextField t2;
	JButton b2, forget;

	static String userInput;
	String user_id, pass_word;

	LogIn() {

		super("Login Page");

		setSize(810, 550);
		setLocation(350, 150);
		setLayout(null);

		// Creating a Login_Page..
		JPanel p = new JPanel();

		p.setBounds(170, 50, 450, 400);
		p.setBackground(new Color(93, 226, 231));
		p.setToolTipText("A Project by Team Claws");
		p.setLayout(null);
		add(p);

		JLabel l = new JLabel("WELCOME @KONKAN TOURISM");

		// l.setToolTipText("A Project by Team Claws");
		l.setBounds(110, 50, 450, 50);
		l.setFont(new Font("SAN SERIF", Font.BOLD, 14));
		l.setForeground(Color.RED);
		p.add(l);

		footer = new JLabel("Default ID & Password is : 505");

		footer.setBounds(115, 320, 500, 50);
		footer.setFont(new Font("SAN SERIF", Font.BOLD, 15));
		p.add(footer);

		l2 = new JLabel("USERID :");

		l2.setBounds(80, 90, 300, 100);
		p.add(l2);

		l3 = new JLabel("PASSWORD :");

		l3.setBounds(80, 150, 300, 100);
		p.add(l3);

		tx = new JTextField("", 10);

		tx.setBounds(160, 130, 200, 20);
		tx.setBorder(BorderFactory.createEmptyBorder());
		tx.addActionListener(this);
		p.add(tx);

		t2 = new JPasswordField("", 20);

		t2.setBounds(160, 190, 200, 20);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p.add(t2);

		b1 = new JButton("SUBMIT");

		b1.setBounds(50, 270, 88, 20);
		b1.addActionListener(this);
		p.add(b1);

		b2 = new JButton("SIGN UP");

		b2.setBounds(180, 270, 88, 20);
		b2.addActionListener(this);
		p.add(b2);

		forget = new JButton("Forget Password");

		forget.setBounds(300, 270, 130, 20);
		forget.addActionListener(this);
		p.add(forget);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b1) {

			user_id = tx.getText();
			pass_word = t2.getText();

			// default user id & pass Authenctication...
			if (user_id.equals("505") && pass_word.equals("505")) {

				this.setVisible(false);
				new HomePage();

			} else {

				try {

					String query = "select * from user where u_id ='" + user_id + "' AND pass ='" + pass_word + "'";

					Connec c = new Connec();
					ResultSet rs = c.s.executeQuery(query);

					if (rs.next()) {

						setVisible(false);
						new HomePage();
					} else {

						LogIn.Show();
					}

				} catch (Exception e) {

				}

			}

		} else if (ae.getSource() == forget) {

			userInput = JOptionPane.showInputDialog(null, "Enter your Email we will send you code !", "Forget Password",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(userInput);
			new CodeMail();
			this.setVisible(false);
			new PassMail();
		} else {

			setVisible(false);
			new SignUp();
		}

	}

	public static void Show() {

		JOptionPane.showMessageDialog(null, "Check your ID & Password !", "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public static String forget() {

		return userInput;

	}

	public static void main(String args[]) {

		new LogIn();
	}

	// us method is used for retrieving user_id to all over program //

	public static String us() {

		String latest;
		latest = null;
		latest = tx.getText();
		return latest;

	}

}
