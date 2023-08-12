package email;

import person.Person;

public class EmailSender {
    public void sendTo(Person p) {
        System.out.println("Sending email to " + p.getEmail());
    }
}
