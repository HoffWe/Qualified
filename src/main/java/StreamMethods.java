import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    /*
    Get the employee with given ID
     */
    public static Optional<Employee> getEmployeeById(Collection<Employee> employees, Integer id){
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst();
    }

    /*
    Return the total amount of money required to pay all given employees
     */
    public static Integer getTotalSalaryBudget(Collection<Employee> employees){

        return employees.stream().map(Employee::getSalary).reduce(0 , Integer::sum);

    }

    /*
    Get the best earning employee
     */
    public static Optional<Employee> getBestEarningEmployee(Collection<Employee> employees){
        return employees.stream().max(Comparator.comparingInt((Employee::getSalary)));
    }

    /*
    Get names of all employees of given role
     */
    public static Stream<String> getNamesOfEmployeesOfRole(Collection<Employee> employees, EmployeeRole role){
         return employees.stream().filter(employee -> employee.getRole().equals(role)).map(Employee::getName);

    }

    /*
    Get the average value of salaries of all employees of given role
     */
    public static Double getAverageSalaryOfRole(Collection<Employee> employees, EmployeeRole role){
        return employees.stream().filter(employee -> employee.getRole().equals(role)).mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    /*
    Get the role that has the least employees
     */
    public static Optional<EmployeeRole> getRoleWithLeastEmployees(Collection<Employee> employees){
        return employees.stream().map(Employee::getRole)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    /*
    Get the division with the greatest pay gap between its manager and employees
    Pay Gap formula: Manager_Salary - Average_Employees_Salary
     */
    public static Optional<Division> getDivisionWithGreatestManagerEmployeePayGap(Collection<Division> divisions){
        return null;
    }

    /*
    Get the best earning employee of given role out of all divisions
     */
    public static Optional<Employee> getBestEarningEmployeeOfRole(Collection<Division> divisions, EmployeeRole role){
        return null;
    }
}