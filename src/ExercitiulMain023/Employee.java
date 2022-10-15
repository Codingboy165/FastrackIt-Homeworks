package ExercitiulMain023;

import java.util.Objects;

public class Employee extends Person {
    private final String company;
    private final Integer salary;

    public Employee(String name, int age, String hairColor,String company, Integer salary) {
        super(name, age, hairColor);
        this.company=company;
        this.salary=salary;
    }

    public String getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Employee) obj;
        return Objects.equals(this.company, that.company) &&
                Objects.equals(this.salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, salary);
    }

    @Override
    public String toString() {
        return "Employee with name " +
                name() + ", " +
                "with age: " + age() + ", " +
                "with hairColor: " + hairColor() +
                ", with company: " + company + ", " +
                "and with salary: " + salary ;
    }

//    private final String company;
//    private final Integer salary;
//
//
//    public Employee(String name, int age, String hairColor,String company, Integer salary) {
//        super(name, age, hairColor);
//        this.company = company;
//        this.salary = salary;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public Integer getSalary() {
//        return salary;
//    }
}

