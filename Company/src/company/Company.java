package company;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Company {
    final String name;
    final List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    // Add an employee to the company
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }


    public  static Company findCompanyByName(List<Company> companies, String companyName) {
        for (Company company : companies) {
            if (company.getName().equalsIgnoreCase(companyName)) {
                return company;

            }
        }
        return null;
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    public static void displayEmployees(Company company) {
        out.println("\n" + "Company employees " + company.getName() + ":");
        List<Employee> employees = company.getEmployee();
        for (Employee employee : employees) {
            out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", CNP: " + employee.getCNP() + ", Function: " + employee.getJobTitle());
        }
        out.println();
    }
}
