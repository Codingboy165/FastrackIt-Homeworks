package Exercitiul14;

public class Student {

    private static double sumGrades;
    private static int numberOfStudents;
    private final double grade;
    private final String name;

    public Student(double grade, String name) {
        this.grade = grade;
        this.name = name;
        sumGrades += grade;
        numberOfStudents++;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public static double avarageGrade() {
        return (double) sumGrades / numberOfStudents;
    }

}
