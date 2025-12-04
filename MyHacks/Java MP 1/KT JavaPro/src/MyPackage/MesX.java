package MyPackage;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class MesX {
    static String uname = "t220144@famt.ac.in";
    static String pass = "se_it_02";

    MesX() {
        SendEm("Welcome to konkan tourism", "Thanks for creating account !");
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
            mesg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(SignUp.getMail()));
            mesg.setSubject(sub);
            mesg.setText(msg);
            Transport.send(mesg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MesX();
    }
}
