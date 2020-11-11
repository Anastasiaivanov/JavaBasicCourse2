package lesson07;

import java.util.Arrays;

public class Ex19Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(1, 6)));
        System.out.println(Arrays.toString(fizzBuzz(1, 8)));
        System.out.println(Arrays.toString(fizzBuzz(1, 11))); // → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

        System.out.println(Arrays.toString(fizzArray3(5, 10)));
        System.out.println(Arrays.toString(fizzArray3(11, 18)));
        System.out.println(Arrays.toString(fizzArray3(1, 3)));// → [1, 2]

        System.out.println(maxSpan(1, 2, 1, 1, 3));
        System.out.println(maxSpan(1, 4, 2, 1, 4, 1, 4));
        System.out.println(maxSpan(1, 4, 2, 1, 4, 4, 4));

        System.out.println(canBalance(1, 1, 1, 2, 1)); // → true
        System.out.println(canBalance(2, 1, 1, 2, 1)); // → false
        System.out.println(canBalance(10, 10)); // → true

        System.out.println(Arrays.toString(seriesUp(3)));// → [1, 1, 2, 1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4)));// → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2)));// → [1, 1, 2]
    }

    private static int[] seriesUp(int n) {
        int[] output = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                output[index] = j + 1;
                index++;
            }
        }
        return output;
    }

    private static boolean canBalance(int... args) {
        int sum = 0;
        for (int element : args) {
            sum += element;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int temp = 0;
        for (int i = 0; i < args.length; i++) {
            if (temp < sum / 2) {
                temp += args[i];
            } else {
                break;
            }
        }
        return temp == sum / 2;
    }


    private static int maxSpan(int... args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            int j = args.length - 1;
            while (args[i] != args[j]) {
                j--;
            }
            int span = j + 1 - i;
            if (span > result) {
                result = span;
            }
        }
        return result;
    }

    private static int[] fizzArray3(int a, int b) {
        int[] output = new int[b - a];
        for (int i = 0; i < output.length; i++) {
            output[i] = a + i;
        }
        return output;
    }

    private static String[] fizzBuzz(int a, int b) {
        String[] output = new String[b - a];
        int[] arr = new int[b - a];
        for (int i = a; i < b; i++) {
            arr[i - a] = i;
        }
        for (int i = 0; i < output.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                output[i] = "FizzBuzz";
            } else if (arr[i] % 3 == 0) {
                output[i] = "Fizz";
            } else if (arr[i] % 5 == 0) {
                output[i] = "Buzz";
            } else {
                output[i] = "" + arr[i];
            }
        }
        return output;
    }
}
