package interviewPractice;

import java.util.Arrays;

public class SwapArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println("Before swapping:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        // Swap the arrays by using array1 as a temporary holder
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] + array2[i];
            array2[i] = array1[i] - array2[i];
            array1[i] = array1[i] - array2[i];
        }

        System.out.println("\nAfter swapping:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }
}

