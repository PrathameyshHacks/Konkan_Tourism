package MyPackage;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.*;

@SuppressWarnings("serial")
public class Contact extends JFrame implements ActionListener {

	JButton b1, b2, b0;

	Contact() {

		super("Contact Us");
		this.setBounds(350, 150, 800, 500);

		JPanel p1 = new JPanel();

		p1.setLayout(null);
		p1.setBackground(new Color(200, 250, 200));

		JLabel l = new JLabel("Contact us ..");

		l.setBounds(270, 50, 350, 100);
		l.setFont(new Font("", Font.PLAIN, 52));
		p1.add(l);

		b2 = new JButton();
		p1.add(b2);

		b1 = new JButton("Home");

		b1.setBounds(354, 355, 80, 20);
		b1.addActionListener(this);

		p1.add(b1);

		JLabel l1 = new JLabel("website : ");

		l1.setBounds(120, 180, 200, 50);
		l1.setFont(new Font("", Font.PLAIN, 20));
		p1.add(l1);

		JLabel l2 = new JLabel("https://prathameyshacharekar.github.io/konkan_tourism");

		l2.setBounds(210, 180, 500, 50);
		l2.setFont(new Font("", Font.PLAIN, 20));
		p1.add(l2);

		b0 = new JButton("Visit Website");

		b0.setBounds(340, 290, 110, 20);
		b0.addActionListener(this);
		p1.add(b0);

		this.setResizable(false);
		this.setContentPane(p1);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Contact();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {

			setVisible(false);

		}
		if (e.getSource() == b0) {

			String url = "https://prathameyshacharekar.github.io/konkan_tourism/";

			try {

				Desktop.getDesktop().browse(new URI(url));
			} catch (IOException | URISyntaxException ex) {

				System.out.println("Error opening Google Maps: " + ex.getMessage());
			}
		}

	}

}
