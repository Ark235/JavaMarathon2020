package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random randomizer = new Random();

        int[] numbers = new int[100];
        int[] sums = new int[numbers.length];
        int[] ind = new int[numbers.length];

        int sumCounter;
        int indResult = 0;
        int largestSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomizer.nextInt(10000);
        }

        for (int i = 1; i < numbers.length - 1; i++) {
            sumCounter = numbers[i-1] + numbers[i] + numbers[i+1];
            sums[i-1] = sumCounter;
            ind[i-1] = i - 1;
            sumCounter = 0;
            if (sums[i-1] > largestSum) {
                largestSum = sums[i-1];
                indResult = ind[i-1];
            }
        }

        System.out.println("Массив: " + Arrays.toString(numbers) + " ");
        System.out.println();
        System.out.println("Массив сумм троек: " + Arrays.toString(sums));
        System.out.println();
        System.out.println("Наибольшая сумма троек: " + largestSum);
        System.out.println();
        System.out.println("Индекс первого элемента тройки: " + indResult);





//        System.out.println(sum);
    }
}
