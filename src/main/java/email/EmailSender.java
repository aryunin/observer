package email;

import person.Person;

public interface EmailSender {
    void sendTo(Person p);
}
