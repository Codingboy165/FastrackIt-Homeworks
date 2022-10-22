package ClassExercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class IntTools extends Exception {
    private int aNumber;

    public IntTools(int aNumber) throws IOException {
        this.aNumber = aNumber;
    }

    public int digitSum() {
        int clone = aNumber;
        int result = 0;
        while (clone > 0) {
            int m = clone % 10;
            result += m;
            clone = clone / 10;
        }
        return result;
    }

    public int lastDigit() {
        return aNumber % 10;
    }

    //    digitAt(int) : returns the digit at position x - if position is invalid, throw exception
    public Object digitAt(int position) throws IOException {
        int howManyDigits = 0;
        int clone = aNumber;
        int theDigitIsExist = -1;
        int result = 0;
        BufferedWriter writer = new BufferedWriter(new FileWriter("errors.txt"));

        while (clone > 0) {
            clone = clone / 10;
            howManyDigits++;
        }

        int iNeedSomethingForTheFor = howManyDigits;
        for (int i = 0; i <= iNeedSomethingForTheFor; i++) {
            if (position == i) {
                theDigitIsExist = position;
            }
        }

        if (theDigitIsExist < 0) {
            RuntimeException r = new RuntimeException("The position doesn't exist");
            writer.write(r.getMessage());
            writer.newLine();
            writer.write(Arrays.toString(r.getStackTrace()));
            writer.close();
            return r.getMessage();
        }


        int howFarIsFromTheEnd = howManyDigits - theDigitIsExist;
        clone = aNumber;

        if (howFarIsFromTheEnd == 0) {
            return result = clone % 10;
        }

        while (howFarIsFromTheEnd > 0) {
            result = clone / 10;
            clone = clone / 10;
            howFarIsFromTheEnd--;
        }
        return result % 10;
    }
}

