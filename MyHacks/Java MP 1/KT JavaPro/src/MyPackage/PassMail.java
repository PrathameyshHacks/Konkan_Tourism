package MyPackage;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PassMail extends JFrame implements ActionListener {

    String codeEn;
    JPanel p2;
    JButton b0, b1;
    JTextField t3;
    String userIn;

    PassMail() {

        super("Forget Password");

        this.setBounds(350, 160, 800, 380);

        p2 = new JPanel();
        p2.setBackground(new Color(200, 250, 200));
        p2.setLayout(null);
        add(p2);

        JLabel l2 = new JLabel("Enter code    :");
        l2.setBounds(200, 105, 300, 20);
        l2.setFont(new Font("SERIA", Font.BOLD, 18));
        p2.add(l2);

        t3 = new JTextField();
        t3.setBounds(335, 105, 280, 20);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t3);

        b1 = new JButton("Submit");
        b1.setBounds(250, 180, 80, 20);
        b1.addActionListener(this);
        p2.add(b1);

        b0 = new JButton("Resend");
        b0.setBounds(450, 180, 90, 20);
        b0.addActionListener(this);
        p2.add(b0);

        this.setContentPane(p2);
        this.setResizable(false);
        this.setVisible(true);

    }

    public static void main(String[] args) {

        new PassMail();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            codeEn = t3.getText();
            int codeIm = CodeMail.code;
            int defId = Integer.valueOf(codeEn);

            System.out.println(defId);
            System.out.println(codeIm);

            if (defId == codeIm) {

                System.out.println("Verified...!");

                Connec c = new Connec();
                String query = "select * from user where email ='" + LogIn.userInput + "'";

                try {

                    ResultSet rs = c.s.executeQuery(query);

                    while (rs.next()) {

                        String uid = rs.getString("u_id");
                        String pas = rs.getString("pass");

                        JOptionPane.showMessageDialog(null, "Your id & password is " + uid + " & " + pas,
                                "Recover Password", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException e1) {

                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error...!");
                }
                this.setVisible(false);
                new LogIn();
            } else {

                System.out.println("Error ocurred...!");
                JOptionPane.showMessageDialog(null, "Error...!");
            }
        } else {

            int response = JOptionPane.showConfirmDialog(null, "Resend code ?", "Forget Password",
                    JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {

                userIn = JOptionPane.showInputDialog(null, "Enter your Email we will send you code !",
                        "Forget Password",
                        JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                System.out.println(userIn);
                new CodeMail();
                new PassMail();
            }
        }
    }
}