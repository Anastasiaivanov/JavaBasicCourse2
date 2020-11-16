package lesson09;

import java.time.LocalDateTime;

public class TryAndCatch {
    public static void main(String[] args) {
        testArr();
        tryArithmetic();
        tryParse();
    }

    private static void tryParse() {
        try {
            String s1 = "2020";
            String s2 = "2020год";
            int output1 = Integer.parseInt(s1);
            int output2 = Integer.parseInt(s2);
            System.out.println("try");
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Catch" + numberFormatException.toString());
        } finally {
            System.out.println("Working after");
        }
        System.out.println("Next step of the programme " + LocalDateTime.now());
    }

    private static void testArr() {
        int[] array = new int[5];
        try {
            int element = array[5];
            System.out.println("Print me smth");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Catched" + exception.toString());
        }
        System.out.println("Programme is done");
    }

    private static void tryArithmetic() {
        try {
            int a = 5 / 0;
            System.out.println("Part of the programme is with mistake");
        } catch (ArithmeticException ex) {
            System.out.println("Illegal exception" + ex.toString());
        } finally {
            System.out.println("Please see the problem");
        }
        System.out.println("Doing next step the programme");
    }
}
