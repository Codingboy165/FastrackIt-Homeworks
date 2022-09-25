import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumInt(arrays));
        System.out.println(oddNumbersInTheString(arrays));
        greaterNumber(arrays, 4);
        donatii2(200, 400);
        stringMethod("Prima.A doua.A treia.A patra");
    }

    public static int sumInt(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int oddNumbersInTheString(int[] array) {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                odd++;
            }
        }
        return odd;
    }


    public static void greaterNumber(int[] array, int a) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                System.out.println(array[i]);
            }
        }
    }

    public static void donatii(int a) {
        Random random = new Random();
        int x = random.nextInt(50);
        while (x < a) {
            System.out.println(x);
            x = x + random.nextInt(50);
        }
        if (x > a) {
            System.out.println("yeeeeeey the donation we wanted is " + a + "$ and we got " + x + "");
        }
    }

    public static void donatii2(int a, int b) {
        Random random = new Random();
        int x = random.nextInt(50);
        while (x < a) {
            System.out.println(x);
            x = x + random.nextInt(50);
        }
        if (x > a) {
            System.out.println("yeeeeeey the donation we wanted is " + a + "$ and we got " + x + "");
        }
        while (x < b) {
            System.out.println(x);
            x = x + random.nextInt(50);
        }
        System.out.println("OKEY WE REACHED THE MAX LIMIT THANK YOU FOR YOUR SUPPORT");
    }

    public static void stringMethod(String s) {
        String[] split = s.split("[.]");
        for (String name : split) {
            System.out.println(name.trim()+".");
        }
    }

}