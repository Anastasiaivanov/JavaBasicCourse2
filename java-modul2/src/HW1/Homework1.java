package HW1;

public class Homework1 {
    public static void main(String[] args) {
        /* Create methods for arrays[] with primitive dataTypes:
         int, double, byte, char, long
         print, create, add element, delete element, update element */
        int sizeArr = 5;
        int index = 3;
        int[] intArr = new int[sizeArr];
        createArray(intArr);
        printArray(intArr);
        printArray(addElement(intArr, 0));
        printArray(deleteElement(intArr, index));
        printArray(updateElement(intArr, index, 0));

        double[] doubleArr = new double[sizeArr];
        createArray(doubleArr);
        printArray(doubleArr);
        printArray(addElement(doubleArr, 3.14));
        printArray(deleteElement(doubleArr, index));
        printArray(updateElement(doubleArr, index, 3.14));

        //мои силы иссякли
        /*byte[] byteArr = new byte[sizeArr];
        char[] charArr = new char[sizeArr];
        long[] longArr = new long[sizeArr];*/
    }

    public static int[] updateElement(int[] arr, int index, int digit) {
        /*int[] intArr2 = new int[arr.length];
        for (int i = 0; i < index; i++) {
            intArr2[i] = arr[i];*/
        arr[index] = digit;
        return arr;
    }

    public static double[] updateElement(double[] arr, int index, double digit) {
        /*int[] intArr2 = new int[arr.length];
        for (int i = 0; i < index; i++) {
            intArr2[i] = arr[i];*/
        arr[index] = digit;
        return arr;
    }

    public static int[] deleteElement(int[] arr, int index) {
        int[] intArr2 = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            intArr2[i] = arr[i];
        }
        for (int i = index; i < arr.length - 1; i++) {
            intArr2[i] = arr[i + 1];
        }
        return intArr2;
    }

    public static double[] deleteElement(double[] arr, int index) {
        double[] doubleArr2 = new double[arr.length - 1];
        for (int i = 0; i < index; i++) {
            doubleArr2[i] = arr[i];
        }
        for (int i = index; i < arr.length - 1; i++) {
            doubleArr2[i] = arr[i + 1];
        }
        return doubleArr2;
    }

    public static int[] addElement(int[] arr, int digit) {
        int[] intArr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            intArr2[i] = arr[i];
        }
        intArr2[arr.length] = digit;
        return intArr2;
    }

    public static double[] addElement(double[] arr, double digit) {
        double[] doubleArr2 = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            doubleArr2[i] = arr[i];
        }
        doubleArr2[arr.length] = digit;
        return doubleArr2;
    }


    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void createArray(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * 10);
        }
    }

    public static void createArray(double[] doubleArr) {
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = (int) (Math.random() * 10);
        }
    }
}
