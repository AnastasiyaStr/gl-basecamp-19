package entity;

public class Employee {

    private Long id;
    private String FirstName;
    private String LastName;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
