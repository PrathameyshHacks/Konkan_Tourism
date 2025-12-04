package MyPackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Intro extends JFrame implements ActionListener {

	JButton B;
	JButton C;

	Intro() {
		// use only once object

		super("Konkan Tourism Application");

		setSize(1200, 600);
		setLocation(150, 100);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("KOKAN.png"));
		// image @Devbaug beach_Malvan ...

		Image i2 = i1.getImage().getScaledInstance(650, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);

		// JLabel t = new JLabel("KONKAN TOURISM");

		JLabel image = new JLabel(i3);

		JLabel l = new JLabel("WELCOME @KONKAN TOURISM", JLabel.CENTER);

		l.setBounds(300, 0, 600, 150);
		l.setBackground(Color.red);
		l.setForeground(new Color(255, 0, 0));
		l.setFont(new Font("ARIAL", Font.BOLD, 32));

		B = new JButton("CONTINUE");
		B.setBounds(520, 290, 98, 18);
		B.addActionListener(this);
		add(B);

		JLabel footer = new JLabel("A Project by Team Claws . . .");

		footer.setBounds(460, 400, 250, 50);
		footer.setForeground(new Color(250, 250, 250));
		footer.setFont(new Font("ARIAL", Font.BOLD, 18));

		add(footer);
		image.setToolTipText("A Project by Team Claws");

		add(l);
		add(image);
		// adding image i3 from i2 from i1

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == C) {

		} else {

			setVisible(false);
			new LogIn();
		}

	}

	public static void main(String[] args) {

		new Intro();

	}

}
