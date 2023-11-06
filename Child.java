import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Child {

    private String childName;
    private ChildGender childGender;
    private LocalDate childBirthYear;
    private LocalDate childDeathYear;
    private String relationship;
    private List<Person> children;

     public Child(String childName, ChildGender childGender, LocalDate childBirthYear, LocalDate childDeathYear, String relationship) {
        this.childName = childName;
        this.childGender = childGender;
        this.childBirthYear = childBirthYear;
        this.childDeathYear = childDeathYear;
        this.relationship = relationship;
        this.children = new ArrayList<>();
    }
    

    public void addChildren(Person child) {
        children.add(child);
    }

     public String getChildName() {
        return childName;
    }

    public ChildGender getChildGender() {
        return childGender;
    }

    public LocalDate getChildBirthYear() {
        return childBirthYear;
    }

    public LocalDate getChildDeathYear() {
        return childDeathYear;
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
