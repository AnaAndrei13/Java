package company;

public class Employee extends Person {

    final String jobTitle;
    private Company company;


    public Employee(String name, int age, int CNP, Address address, String jobTitle) {
        super( name, CNP, address, age);
        this.jobTitle = jobTitle;
    }

    //Move employee to another company
    public void moveToCompany(Company newCompany) {
        if (company != null) {
            company.removeEmployee(this);
        }
        company = newCompany;
        newCompany.addEmployee(this);
    }



    public String getJobTitle(){
        return jobTitle;
    }
}
