package MyPackage;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class ScrollBar extends JFrame implements ActionListener, KeyListener {

	JButton bt, b2, pre, next;
	JScrollPane sp;

	public ScrollBar() {

		// Gallery
		super("Gallery");
		this.setExtendedState(MAXIMIZED_BOTH);

		JPanel p1 = new JPanel();

		p1.setBackground(Color.WHITE);
		p1.setLayout(new GridLayout(1, 25, 90, 50));

		b2 = new JButton();

		sp = new JScrollPane(p1);

		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setBounds(300, 0, 900, 795);

		JPanel p2 = new JPanel();

		p2.setLayout(null);
		p2.setBackground(new Color(255, 113, 195));
		p2.setPreferredSize(getMaximumSize());
		p2.add(sp);
		p2.add(b2);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("KOKAN.png"));
		Image i2 = i1.getImage().getScaledInstance(780, 550, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image0 = new JLabel(i3);

		ImageIcon n1 = new ImageIcon(ClassLoader.getSystemResource("mayem.PNG"));
		Image n2 = n1.getImage().getScaledInstance(500, 585, Image.SCALE_DEFAULT);
		ImageIcon n3 = new ImageIcon(n2);
		JLabel image13 = new JLabel(n3);

		ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("Gall1.jpg"));
		Image a2 = a1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon a3 = new ImageIcon(a2);
		JLabel image1 = new JLabel(a3);
		p1.add(image1);
		p1.add(image13);
		p1.add(image0);

		ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("Haran.jpg"));
		Image b2 = b1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
		ImageIcon b3 = new ImageIcon(b2);
		JLabel image2 = new JLabel(b3);
		p1.add(image2);

		ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("dapoli.jpg"));
		Image c2 = c1.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
		ImageIcon c3 = new ImageIcon(c2);
		JLabel image3 = new JLabel(c3);
		p1.add(image3);

		ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("AliBRam.png"));
		Image d2 = d1.getImage().getScaledInstance(500, 700, Image.SCALE_DEFAULT);
		ImageIcon d3 = new ImageIcon(d2);
		JLabel image4 = new JLabel(d3);
		p1.add(image4);

		ImageIcon e1 = new ImageIcon(ClassLoader.getSystemResource("Amboli.jpg"));
		Image e2 = e1.getImage().getScaledInstance(550, 420, Image.SCALE_DEFAULT);
		ImageIcon e3 = new ImageIcon(e2);
		JLabel image5 = new JLabel(e3);
		p1.add(image5);

		ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("Dashavtaar.jpg"));
		Image f2 = f1.getImage().getScaledInstance(600, 450, Image.SCALE_DEFAULT);
		ImageIcon f3 = new ImageIcon(f2);
		JLabel image6 = new JLabel(f3);
		p1.add(image6);

		ImageIcon g1 = new ImageIcon(ClassLoader.getSystemResource("BeachMe.jpg"));
		Image g2 = g1.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
		ImageIcon g3 = new ImageIcon(g2);
		JLabel image7 = new JLabel(g3);
		p1.add(image7);

		ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("kavl.jpg"));
		Image h2 = h1.getImage().getScaledInstance(550, 600, Image.SCALE_DEFAULT);
		ImageIcon h3 = new ImageIcon(h2);
		JLabel image8 = new JLabel(h3);
		p1.add(image8);

		ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("kudal.jpg"));
		Image j2 = j1.getImage().getScaledInstance(550, 400, Image.SCALE_DEFAULT);
		ImageIcon j3 = new ImageIcon(j2);
		JLabel image9 = new JLabel(j3);
		p1.add(image9);

		ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("Narakasur.jpeg"));
		Image k2 = k1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
		ImageIcon k3 = new ImageIcon(k2);
		JLabel image10 = new JLabel(k3);
		p1.add(image10);

		ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("Visarjan.jpg"));
		Image l2 = l1.getImage().getScaledInstance(600, 710, Image.SCALE_DEFAULT);
		ImageIcon l3 = new ImageIcon(l2);
		JLabel image11 = new JLabel(l3);
		p1.add(image11);

		ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("kr.jpg"));
		Image m2 = m1.getImage().getScaledInstance(500, 700, Image.SCALE_DEFAULT);
		ImageIcon m3 = new ImageIcon(m2);
		JLabel image12 = new JLabel(m3);
		p1.add(image12);

		ImageIcon o1 = new ImageIcon(ClassLoader.getSystemResource("ratna.jpg"));
		Image o2 = o1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
		ImageIcon o3 = new ImageIcon(o2);
		JLabel image14 = new JLabel(o3);
		p1.add(image14);

		ImageIcon q1 = new ImageIcon(ClassLoader.getSystemResource("narad.jpg"));
		Image q2 = q1.getImage().getScaledInstance(600, 650, Image.SCALE_DEFAULT);
		ImageIcon q3 = new ImageIcon(q2);
		JLabel image15 = new JLabel(q3);
		p1.add(image15);

		ImageIcon r1 = new ImageIcon(ClassLoader.getSystemResource("mii.jpg"));
		Image r2 = r1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
		ImageIcon r3 = new ImageIcon(r2);
		JLabel image16 = new JLabel(r3);
		p1.add(image16);

		bt = new JButton("Home");

		bt.setBounds(0, 0, 90, 20);
		bt.addActionListener(this);
		p2.add(bt);

		pre = new JButton("PRE");

		pre.setBounds(150, 400, 100, 30);
		pre.addActionListener(this);
		p2.add(pre);

		next = new JButton("NEXT");

		next.setBounds(1250, 400, 100, 30);
		next.addActionListener(this);
		p2.add(next);

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

		new ScrollBar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bt) {

			setVisible(false);
			new HomePage();

		}
		if (e.getSource() == pre) {

			sp.getHorizontalScrollBar().setValue(sp.getHorizontalScrollBar().getValue() - 880);
			requestFocusInWindow();
		}
		if (e.getSource() == next) {

			sp.getHorizontalScrollBar().setValue(sp.getHorizontalScrollBar().getValue() + 880);
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

		// sp.getVerticalScrollBar().setValue(100);
		// System.out.println("Enter key pressed");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}