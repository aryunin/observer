package person;

public final class PersonData {
    private final String name;
    private final String email;

    public PersonData(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
