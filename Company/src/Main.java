
import company.*;

import java.util.ArrayList;
import java.util.List;

import static company.Company.displayEmployees;
import static company.Company.findCompanyByName;


public class Main {
    public static void main(String[] args) {

List<Company> companies = new ArrayList<>();

        Company company1 = new Company("Hella");
        Company company2 = new Company("Endava");
        Company company3 = new Company("Continental");
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);


        Address address1 = new Address(" Main St", "CityA");
        Address address2 = new Address(" Elm St", "CityA");
        Address address3 = new Address(" Main St", "CityB");
        Address address4 = new Address(" Elm St", "CityC");
        Address address5 = new Address(" Main St", "CityA");
        Address address6 = new Address(" Elm St", "CityA");


        Employee employee1 = new Employee("John", 30, 101, address1, "Software Engineer");
        Employee employee2 = new Employee("Alice", 26, 102, address2, "Java Developer ");
        Employee employee3 = new Employee("Ane", 31, 101, address3, "Software Engineer");
        Employee employee4 = new Employee("Marta", 29, 102, address4, "Java Developer");
        Employee employee5 = new Employee("Julia", 30, 101, address5, "Software Engineer");
        Employee employee6 = new Employee("Alin", 20, 102, address6, "Java Developer ");

        company1.addEmployee(employee1);
        company1.addEmployee(employee3);
        company2.addEmployee(employee2);
        company1.addEmployee(employee5);
        company1.addEmployee(employee4);
        company3.addEmployee(employee6);


        employee1.moveToCompany(company2);





        displayEmployees( company1);
        displayEmployees( company2);
        displayEmployees( company3);

        Company foundCompany = findCompanyByName(companies, "Hella");
        if (foundCompany != null) {
            System.out.println("Company " + foundCompany.getName() + " was found");
        } else {
            System.out.println("Company wasn't found!");
        }

    }
}
