package other;

import email.EmailSenderImpl;
import email.EmailSender;
import person.Person;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class EmailSenderPersonCreatorListener implements EmailSender, PropertyChangeListener {
    private final EmailSender emailSender;

    public EmailSenderPersonCreatorListener() {
        this.emailSender = new EmailSenderImpl();
    }

    @Override
    public void sendTo(Person person) {
        emailSender.sendTo(person);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        sendTo((Person) evt.getNewValue());
    }
}
