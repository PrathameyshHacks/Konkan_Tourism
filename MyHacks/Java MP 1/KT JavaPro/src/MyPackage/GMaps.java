package MyPackage;

import java.awt.Desktop;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.*;

public class GMaps extends JFrame implements ActionListener {

    JPanel p2;
    JTextField t1;
    JButton b1;
    static String locate;

    GMaps() {

        super("View map");
        this.setBounds(350, 150, 800, 400);

        p2 = new JPanel();

        p2.setBackground(new Color(227, 154, 255));
        p2.setLayout(null);
        add(p2);

        JLabel l2 = new JLabel("Enter Location   : ");

        l2.setBounds(200, 100, 300, 20);
        l2.setFont(new Font("SERIA", Font.BOLD, 18));
        p2.add(l2);

        t1 = new JTextField("");

        t1.setBounds(365, 100, 220, 20);
        t1.setBorder(BorderFactory.createEmptyBorder());

        p2.add(t1);

        b1 = new JButton("View Location");

        b1.setBounds(340, 180, 120, 25);
        b1.addActionListener(this);
        p2.add(b1);

        this.setResizable(false);
        this.setVisible(true);

    }

    public static void search() {

        // Define the URL for Google Maps
        String url = "https://www.google.co.in/maps/place/" + locate;

        // Try to open the URL in the default browser
        try {

            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {

            System.out.println("Error opening Google Maps: " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        new GMaps();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            locate = t1.getText();
            search();
        }

    }

}
