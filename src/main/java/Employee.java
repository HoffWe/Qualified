public class Employee {
    private Integer id;
    private String name;
    private Integer salary;
    private EmployeeRole role;

    public Employee(Integer id, String name, Integer salary, EmployeeRole role){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }
}