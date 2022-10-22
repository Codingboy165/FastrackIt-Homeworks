package ClassExercises;

public class BirthYearCalculator extends Exception {
    public void calculateBirthYear(int yourAge){
        int birthDay= 2022- yourAge;
        if (yourAge<0){
            throw new RuntimeException("Age "+yourAge+" is invalid.");
        }else{
            System.out.println("Your birthday is " + birthDay + ".");
        }
    }
}
