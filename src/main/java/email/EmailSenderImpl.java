package email;

import person.Person;

public class EmailSenderImpl implements EmailSender {
    @Override
    public void sendTo(Person p) {
        System.out.println("Sending email to " + p.getEmail());
    }
}
