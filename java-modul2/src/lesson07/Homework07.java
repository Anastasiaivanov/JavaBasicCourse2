package lesson07;

import java.util.Arrays;

public class Homework07 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 1, 4};
        System.out.println(Arrays.toString(fix34(arr1)));
        int[] arr2 = new int[]{1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.toString(fix34(arr2))); // → [1, 3, 4, 1, 1, 3, 4]
        int[] arr3 = new int[]{3, 2, 2, 4};
        System.out.println(Arrays.toString(fix34(arr3))); // → [3, 4, 2, 2]
    }

    private static int[] fix34(int[] output) {
        for (int i = 0; i < output.length; i++) {
            if (output[i] == 3) {
                int indexLast3 = output[i];
                for (int j = indexLast3; j < output.length; j++) {
                    if (output[j] == 4) {
                        int temp = output[j];
                        output[j] = output[i + 1];
                        output[i + 1] = temp;
                    }
                }
                indexLast3++;
            }
        }
        return output;
    }
}
