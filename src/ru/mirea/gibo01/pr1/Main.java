package ru.mirea.gibo01.pr1;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] array1 = new Integer[]{5, 3, 1, 9, 15};
        // Находим максимальный элемент массива, предварительно выводим все элементы массива в консоль
        int maxNumber = 5;

        System.out.printf("1.Элементы массива: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < array1.length; i++) {
            if (maxNumber <= array1[i]) {
                maxNumber = array1[i];
            }
        }
        System.out.println("\t");
        System.out.println("2.Максимальный элемент массива: " + maxNumber);

        //Находим минимальный элемент массива
        int minNumber = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < array1[0]) {
                minNumber = array1[i];
            }
        }
        System.out.printf("3.Минимальный элемент массива: " + minNumber + "\n");

        //Находим сумму элементов массива
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println("4.Сумма элементов массива: " + sum);
        //Находим среднее арифметическое чисел массива
        int average = 0;
        for (int i = 0; i < array1.length; i++) {
            average = sum / array1.length;
        }
        System.out.println("5.Среднее арифметическое массива: " + average);
        //Произведем сортировку массива по возрастанию
        System.out.println("6.Массив, отсортированный по возрастанию: ");
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\t");
        //Произведем сортировку массива по убыванию
        System.out.println("7.Массив, отсортированный по убыванию:");
        Arrays.sort(array1, Collections.reverseOrder());
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}


