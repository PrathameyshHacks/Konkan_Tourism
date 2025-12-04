package MyPackage;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import MyPackage.LogIn.*;

@SuppressWarnings({ "serial", "unused" })
public class MyAcc extends JFrame implements ActionListener {

	JPanel p1, p2, p3;
	static JScrollPane sp;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4;

	JButton b0, b1, b2, b3, bk;

	String nui, nun, nps;

	static String user_id = LogIn.us();

	String query = "select * from user where u_id ='" + user_id + "'";

	String user_name, passwd;

	MyAcc() {

		super("My Account");
		Connec c = new Connec();
		try {

			String user_id = LogIn.us();
			String query = "select * from user where u_id ='" + user_id + "'";

			ResultSet rs = c.s.executeQuery(query);

			while (rs.next()) {

				user_name = rs.getString("u_name");
				passwd = rs.getString("pass");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		this.setBounds(350, 150, 800, 500);

		t4 = new JTextField();

		p2 = new JPanel();

		p2.setBackground(new Color(200, 250, 200));
		p2.setLayout(null);
		add(p2);

		p2.add(t4);

		JLabel l2 = new JLabel("USER  ID       :");

		l2.setBounds(200, 125, 300, 20);
		l2.setFont(new Font("SERIA", Font.BOLD, 18));

		p2.add(l2);

		JLabel l3 = new JLabel("USERNAME  :");

		l3.setBounds(200, 195, 300, 20);
		l3.setFont(new Font("SERIA", Font.BOLD, 18));

		p2.add(l3);

		JLabel l4 = new JLabel("PASSWORD  :");

		l4.setBounds(200, 265, 300, 20);
		l4.setFont(new Font("SERIA", Font.BOLD, 18));

		p2.add(l4);

		t1 = new JTextField("hi");

		t1.setBounds(335, 125, 220, 20);
		t1.setBorder(BorderFactory.createEmptyBorder());
		t1.setText(LogIn.us());
		t1.setEditable(false);

		p2.add(t1);

		t2 = new JTextField("45", 20);

		t2.setBounds(335, 195, 220, 20);
		t2.setBorder(BorderFactory.createEmptyBorder());
		t2.setText(user_name);
		t2.setEditable(false);
		p2.add(t2);

		t3 = new JTextField("ghjd", 20);

		t3.setBounds(335, 265, 220, 20);
		t3.setBorder(BorderFactory.createEmptyBorder());
		t3.setText(passwd);
		t3.setEditable(false);
		p2.add(t3);

		JLabel l7 = new JLabel("My Account");

		l7.setBounds(285, 25, 350, 80);
		l7.setFont(new Font("", Font.BOLD, 36));

		p2.add(l7);

		b1 = new JButton("Log Out");

		b1.setBounds(200, 338, 80, 20);
		b1.addActionListener(this);
		p2.add(b1);

		b0 = new JButton("Update");

		b0.setBounds(340, 338, 80, 20);
		b0.addActionListener(this);
		p2.add(b0);

		b3 = new JButton("Save");

		b3.setBounds(480, 338, 80, 20);
		b3.addActionListener(this);
		p2.add(b3);

		bk = new JButton("<<");

		bk.setBounds(0, 0, 80, 20);
		bk.addActionListener(this);
		p2.add(bk);

		this.setContentPane(p2);
		this.setResizable(false);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new MyAcc();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {

			t1.setText("");
			t2.setText("");
			t3.setText("");
			setVisible(false);
			new Intro();
		} else if (e.getSource() == b2) {

			setVisible(false);
			new HomePage();

		} else if (e.getSource() == bk) {

			setVisible(false);
			new HomePage();

		} else if (e.getSource() == b0) {

			t1.setEditable(true);
			t1.setText("");
			t2.setEditable(true);
			t2.setText("");
			t3.setEditable(true);
			t3.setText("");

		} else if (e.getSource() == b3) {

			String user_id = LogIn.us();

			nui = t1.getText();
			t1.setEditable(false);
			nun = t2.getText();
			t2.setEditable(false);
			nps = t3.getText();
			t3.setEditable(false);

			try {

				String query = "update user set u_name='" + nun + "',u_id='" + nui + "',pass='" + nps
						+ "' where u_id ='" + user_id + "'";

				Connec c = new Connec();

				int count = c.s.executeUpdate(query);

				if (count > 0) {

					JOptionPane.showMessageDialog(null, "Changes Saved Succesfully");
				} else {

					JOptionPane.showMessageDialog(null, "Error Occured !");
				}

			} catch (Exception ex) {

				ex.printStackTrace();
			}

		} else {

		}

	}

}
