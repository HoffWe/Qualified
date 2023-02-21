import java.util.List;

public class Division {
    private Integer id;
    private String name;
    private Employee manager;
    private List<Employee> employees;

    public Division(Integer id, String name, Employee manager, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.employees = employees;
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

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
