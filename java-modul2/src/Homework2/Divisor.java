package Homework2;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        //System.out.println(nod(10, 3));
        //System.out.println(nok(10, 8));
        calculatorScan();
    }

    private static void calculatorScan() {
        Scanner input = new Scanner(System.in);
        int userNumber1;
        int userNumber2;
        System.out.println("Please put first number");
        userNumber1= input.nextInt();
        System.out.println("Please put second number");
        userNumber2= input.nextInt();
        input.close();
        System.out.println("NOD these number is " + nod(userNumber1,userNumber2));
        System.out.println("NOK these number is " + nok(userNumber1,userNumber2));
    }

    public static int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    public static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }

}
