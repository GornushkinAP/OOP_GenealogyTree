import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Person> people;

    public FamilyTree() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person getPerson(String firstName, String lastName) {
        for (Person person : people) {
            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPeople() {
        return people;
    }

}