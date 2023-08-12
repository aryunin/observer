package other;

import person.Person;
import person.PersonCreator;
import person.PersonCreatorImpl;
import person.PersonData;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// PersonCreator observable proxy
public class ObservablePersonCreator implements PersonCreator {
    private final PersonCreator personCreator;
    private final PropertyChangeSupport support;

    public ObservablePersonCreator() {
        this.personCreator = new PersonCreatorImpl();
        this.support = new PropertyChangeSupport(this);
    }

    public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    @Override
    public Person create(PersonData data) {
        Person createdPerson = personCreator.create(data);
        support.firePropertyChange("person", null, createdPerson);
        return createdPerson;
    }
}
