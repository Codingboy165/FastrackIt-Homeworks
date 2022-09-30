package Exercitiul13;

import java.util.LinkedList;
import java.util.List;

public class Company {
    private List<Person> employees;
    Person noManagerInCompany = new Person(null,0,"The company dont ha a manager");

    public Company(List<Person> employees) {
        this.employees = employees;
    }

    public void managerChoice(Person person){
        if (person.isManager() && this.hasManager()){
            System.out.println("The company has alredy a manager");
        }else employees.add(person);
    }

    private boolean hasManager(){
        for (Person p: employees){
            if(p.getPosition().equals("manager")){
                return true;
            }
        }
        return false;
    }

    public Person managerGetter(){
        for (Person p : employees){
            if(p.getPosition().equals("Manager")){
                return p;
            }
        }
        return noManagerInCompany;
    }

    public void add(Person person){
        if (person!=null){
            employees.add(person);
        }
    }

    public List<Person> getPersons(String profession){
        return new LinkedList<>(employees);
        }
}
