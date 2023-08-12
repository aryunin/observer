import other.EmailSenderPersonCreatorListener;
import other.ObservablePersonCreator;
import person.PersonData;

public class Main {
    public static void main(String[] args) {
        // создаем фабрику Person
        var personCreator = new ObservablePersonCreator();

        // подписываем один раз на фабрику все необходимые Listener-ы
        var emailSender = new EmailSenderPersonCreatorListener();
        personCreator.addListener(emailSender);

        // в другой части кода получаем необходимые вызовы Listener-ов при создании Person в фабрике
        personCreator.create(new PersonData("Artem", "im.aryunin@gmail.com"));
    }
}
