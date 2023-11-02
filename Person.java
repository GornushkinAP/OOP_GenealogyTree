import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private int birthYear;
    private int deathYear;
    private String relationship;
    private List<Person> children;

    public Person(String firstName, String lastName, String middleName, String gender, int birthYear, String relationship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.relationship = relationship;
        this.children = new ArrayList<>();
    }

    public void addChildren(Person child) {
        children.add(child);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public String getRelationship() {
        return relationship;
    }

    public List<Person> getChildren() {
        return children;
    }
    
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
