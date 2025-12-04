package MyPackage;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Del extends JFrame implements ActionListener {

	JButton b1, b2, b0, bk;

	static String user_id = LogIn.us();

	Del() {

		super("Delete Account");
		this.setBounds(350, 150, 800, 500);

		JPanel p1 = new JPanel();

		p1.setLayout(null);
		p1.setBackground(new Color(200, 250, 200));

		JLabel l = new JLabel("Delete your account....?");

		l.setBounds(240, 100, 350, 100);
		l.setFont(new Font("", Font.PLAIN, 28));
		p1.add(l);

		b2 = new JButton();
		p1.add(b2);

		b1 = new JButton("YES");

		b1.setBounds(330, 230, 100, 20);
		b1.addActionListener(this);
		p1.add(b1);

		b0 = new JButton("NO");

		b0.setBounds(330, 290, 100, 20);
		b0.addActionListener(this);
		p1.add(b0);

		bk = new JButton("<<");

		bk.setBounds(0, 0, 80, 20);
		bk.addActionListener(this);
		p1.add(bk);

		this.setContentPane(p1);
		this.setResizable(false);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Del();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {

			try {

				String query = "delete from user where u_id ='" + user_id + "'";

				Connec c = new Connec();

				int count = c.s.executeUpdate(query);

				if (count > 0) {

					JOptionPane.showMessageDialog(null, "Account deleted succesfully", "del",
							JOptionPane.ERROR_MESSAGE);

				} else {

					JOptionPane.showMessageDialog(null, "Error Occured !");
				}

			} catch (Exception ex) {

				ex.printStackTrace();
			}

			setVisible(false);
			new Intro();
		} else if (e.getSource() == bk) {

			setVisible(false);
			new HomePage();

		} else if (e.getSource() == b0) {

			setVisible(false);
			new HomePage();

		}

	}

}
