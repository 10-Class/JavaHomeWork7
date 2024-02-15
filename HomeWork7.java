package homework7;

import java.util.Arrays;
import java.util.Collections;

public class HomeWork7 {
    public static void main(String[] args) {
        /* 1. Напишите функцию которая делает все элементы массива положительными
        public static void makeArrayElementsPositive(int [] a)
        {1,-4, 2, -7, 12} -> {1,4, 2, 7, 12} */
        int[] ArrayElements = {1, -4, 2, -7, 12};
        System.out.println(Arrays.toString(ArrayElements));
        makeArrayElementsPositive(ArrayElements);
        System.out.println(Arrays.toString(ArrayElements));

        /* 2. Напишите функцию которая вернет true если в массиве есть отрицательные элементы
        public static boolean hasNegative(int [] a)
        {1,-4, 2, -7, 12} -> true
        {1,4, 2, 7, 12} -> false */
        int[] ArrayElements2 = {1, 4, 2, 7, 12};
        System.out.println(hasNegative(ArrayElements));
        System.out.println(hasNegative(ArrayElements2));

        /* *3. Напишите функцию которая поменяет порядок элементов массива
        public static void reverse(int [] a)
        {1,3,10,12} -> {12, 10, 3, 1} */
        int[] reversMas = {1, 3, 10, 12};
        System.out.println(Arrays.toString(reversMas));
        reverse(reversMas);
        System.out.println(Arrays.toString(reversMas));


    }//main

    // 1 Сделал как смог.
    public static void makeArrayElementsPositive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = -a[i];
            }
        }

    }

    // 2
    public static boolean hasNegative(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return true;
            }
        }
        return false;
    }

    // 3
    public static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

}
