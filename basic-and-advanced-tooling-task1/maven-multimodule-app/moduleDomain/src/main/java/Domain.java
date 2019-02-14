import entity.Employee;

public class Domain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setId(1L);
        System.out.println(employee);
    }
}
