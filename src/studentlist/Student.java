package studentlist;

/**
 * This class represents a student vddf
 *
 * @author Paul Bonenfant
 */
public class Student {

    private String name;
    private String address;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

