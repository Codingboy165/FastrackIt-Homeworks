public class Person {
    String name;
    int age;
    boolean married;

    public Person(String name, int age, boolean married) {
        System.out.println("Starting to build a person:");
        this.name = name;
        this.age = age;
        this.married = married;
        System.out.println();
    }

    public String getName() {
        return String.format("This is my name: %s", this.name);
    }

    public String getAge() {
        return String.format("This is my age: %d", this.age);
    }

    public String isMarried() {
        if (age >= 18 ) {
            if (this.married) {
                return ("I am married yes");
            } else return ("I am not married");
        } else return("I am not married. I am just a child ");
    }
}
