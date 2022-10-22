package ClassExercises;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BirthYearCalculator birthYearCalculator= new BirthYearCalculator();
        birthYearCalculator.calculateBirthYear(20);
        IntTools intTools=new IntTools(8646561);
        System.out.println(intTools.digitAt(10));

    }
}
