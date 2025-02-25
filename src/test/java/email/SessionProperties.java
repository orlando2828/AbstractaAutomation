package email;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

import static email.CredencialesEmail.PASS_EMAIL;
import static email.CredencialesEmail.USER_EMAIL;

public class SessionProperties {
    private Properties props = new Properties();
    private Session session;
    public SessionProperties(){
        this.props.put("mail.smtp.auth", true);
        this.props.put("mail.smtp.starttls.enable", true);
        this.props.put("mail.smtp.host", "smtp.gmail.com");
        this.props.put("mail.smtp.port", "587");

        this.session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(USER_EMAIL, PASS_EMAIL);
                    }
                });
    }
    public Session getSession(){
        return session;
    }
}
