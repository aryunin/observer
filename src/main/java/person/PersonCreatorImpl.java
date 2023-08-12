package person;

public class PersonCreatorImpl implements PersonCreator {
    @Override
    public Person create(PersonData data) {
        System.out.println("Creating person " + data.getName());
        var p = new Person();
        p.setName(data.getName());
        p.setEmail(data.getEmail());
        return p;
    }
}
