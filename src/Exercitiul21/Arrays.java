package Exercitiul21;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int max = -99999;
        int max2 = -99999;
        int max3 = -99999;
        Scanner scanner = new Scanner(System.in);
//FIRST ARRAY
        System.out.print("Enter the number of elements you want to store: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
//MAX1
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum is : " + max);

//SECOND ARRAY
        System.out.print("Enter the number of elements you want to store: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n2; i++) {
            System.out.println(array2[i]);
        }
//MAX2
        for (int i = 0; i < n2; i++){
            if (array2[i] > max2) {
                max2 = array2[i];
            }
        }
        System.out.println("The maximum is : " + max2);
//THIRD ARRAY
        System.out.print("Enter the number of elements you want to store: ");
        int n3 = scanner.nextInt();
        int[] array3 = new int[n3];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n3; i++) {
            array3[i] = scanner.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n3; i++) {
            System.out.println(array3[i]);
        }
//MAX3
        for (int i = 0; i < n3; i++){
            if (array3[i] > max3) {
                max3 = array3[i];
            }
        }
        System.out.println("The maximum is : " + max3);
//CALCULATE THE MIN
        int min =0;
        if(max<max2 && max<max3){
            min=max;
        }else if(max2<max && max2<max3){
            min=max2;
        }else if (max3<max && max3<max){
            min=max3;
        }
        System.out.println("The minimumom of the 3 maximum number is "+ min);
    }
}
