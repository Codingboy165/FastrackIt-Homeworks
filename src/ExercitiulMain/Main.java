package ExercitiulMain;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readFileBuffered());
        Classroom slavici = new Classroom(readFileBuffered());
        System.out.println(slavici.getGradesForDiscipline("Mathematics"));
        System.out.println(slavici.getGradesForStudent("Bennett Frieda"));
        System.out.println(slavici.getMaxGrade(null)==null ? "sorry" : slavici.getMaxGrade("Mathematics"));
        System.out.println(slavici.getMaxGrade());
        System.out.printf("%.2f%n",slavici.getAverageGrade("Mathematics"));
        System.out.println(slavici.getWorstGrade("Mathematics"));
    }

    public static List<StudentGrade> readFileBuffered() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/grades.txt"));
        String line;
        List<StudentGrade> result = new ArrayList<>();
        while((line = bufferedReader.readLine())!=null){
            result.add(personFromLine(line));
        }
        return result;
    }

    public static StudentGrade personFromLine(String line){
        String[] tokens = line.split(Pattern.quote("|"));
        return new StudentGrade(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
    }
}
