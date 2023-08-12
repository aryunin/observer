package person;

public class PersonCreator {
    public Person create(PersonData data) {
        System.out.println("Creating person " + data.getName());
        var p = new Person();
        p.setName(data.getName());
        p.setEmail(data.getEmail());
        return p;
    }
}
