package ExercitiulMain;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    BufferedWriter writer = new BufferedWriter((new FileWriter("files/output.txt")));
    private final Classroom classroom;

    public ReportGenerator(List<StudentGrade> grades) throws IOException {
        classroom = new Classroom(grades);
    }

    public void generateReport() throws IOException {
        writer.write("Persoana cu cea mai mare notă e: " + classroom.getMaxGrade().grade() + ", si nota ei e: " + classroom.getMaxGrade().fullName());
        writer.newLine();
        writer.write("Nota medie e: " + classroom.getAverageGrade());
        writer.newLine();
        writer.write("Persoana cu cea mai mică notă e: " + classroom.getWorstGrade().fullName() + " si nota ei e: " + classroom.getWorstGrade().grade());
        writer.close();
    }

}
