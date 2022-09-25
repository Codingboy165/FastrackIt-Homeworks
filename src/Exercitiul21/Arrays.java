package Exercitiul21;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        printDoubles(array,20);
    }

    public static void printDoubles(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == a){
                    System.out.println(String.format("%d + %d = %d ",array[i],array[j],a));
                }
            }
        }
    }

}
