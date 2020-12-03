package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
    int[] numbers = new int[100];

    Random randomizer = new Random();

    for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomizer.nextInt(10000);
    }

    int largestNum = numbers[0];
    int lesserNum = numbers[0];
    int count0 = 0;
    int count0Sum = 0;

    for (int num : numbers) {
        if (num < lesserNum) {
            lesserNum = num;
        }
        if (num > largestNum) {
            largestNum = num;
        }
        if (num % 10 == 0) {
            count0++;
            count0Sum += num;
        }
    }

    System.out.println("Наибольший элемент массива: " + largestNum);
    System.out.println("Наименьший элемент массива: " + lesserNum);
    System.out.println("Количество элементов, оканчивающихся на 0: " + count0);
    System.out.println("Сумма элементов массива, оканчивающихся на 0: " + count0Sum);

    }
}
