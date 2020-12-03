package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        input.close();

        int[] numbers = new int[arraySize];
        int moreThan8 = 0;
        int equals1 = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        Random randomizer = new Random();

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = randomizer.nextInt(10);
        }

        for (int number : numbers) {
            if (number > 8) {
                moreThan8++;
            }
            if (number == 1) {
                equals1++;
            }
            if (number % 2 == 0 && number != 0) {
                even++;
            }
            if (number % 2 != 0) {
                odd++;
            }
            sum += number;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + moreThan8);
        System.out.println("Количество чисел равных 1: " + equals1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
