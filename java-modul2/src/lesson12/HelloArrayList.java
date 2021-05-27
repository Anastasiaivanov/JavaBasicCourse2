package lesson12;

import java.util.ArrayList;

public class HelloArrayList {
    public static void main(String[] args) {
        String[] array = new String[10];
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list1);
        int n = array.length;
        ;
        n = list1.size();
        System.out.println(n);
        String hm = "Vasilii";
        array[3] = hm;
        list1.add("Test");
        System.out.println(list1);
        list1.set(0, hm);
        System.out.println(list1);
        list1.add("Element");
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
    }
}
