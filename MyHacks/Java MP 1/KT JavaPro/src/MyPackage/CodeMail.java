package MyPackage;

import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

import java.util.Properties;
import java.util.Random;

public class CodeMail {
    static String uname = "t220144@famt.ac.in";
    static String pass = "se_it_02";
    static int code;

    CodeMail() {

        Random random = new Random();
        code = 10000 + random.nextInt(90000);
        System.out.println("Random 5-Digit Number: " + code);

        SendEm("Forget Password", "Your OTP code for login is : " + code);
    }

    public static void SendEm(String sub, String msg) {
        Properties pr = new Properties();
        pr.put("mail.smtp.auth", "true");
        pr.put("mail.smtp.starttls.enable", "true");
        pr.put("mail.smtp.host", "smtp.gmail.com");
        pr.put("mail.smtp.port", "587");
        pr.put("mail.smtp.ssl.protocols", "TLSv1.2"); // Specify TLS version

        Session sn = Session.getInstance(pr, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(uname, pass);
            }
        });

        try {
            Message mesg = new MimeMessage(sn);
            mesg.setFrom(new InternetAddress(uname));
            mesg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(LogIn.userInput));
            mesg.setSubject(sub);
            mesg.setText(msg);
            Transport.send(mesg);
            System.out.println("Email sent successfully.");
            JOptionPane.showMessageDialog(null, "Code sent succesfully !", "Code sent",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter valid mail !", "Error Occured", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new CodeMail();
    }

    public static int getCode() {

        return code;
    }
}
