package day4;


import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    int sum = 0;
    int maxSum = 0;
    int resultIndex = 0;
    int[][] numbers = new int[12][8];
    int[] sumCounter = new int[numbers.length];

    Random randomizer = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = randomizer.nextInt(50);
                System.out.print(numbers[i][j] + " ");
                sum += numbers[i][j];
            }
            System.out.println(" // сумма строки " + i + " - " + sum);
            sumCounter[i] = sum;

            if (sumCounter[i] > sumCounter[0]) {
                maxSum = sumCounter[i];
                resultIndex = i;
            }

            sum = 0;
        }

        System.out.println("Наибольшая сумма - " + maxSum);
        System.out.println("Индекс строки с максимальной суммой - " + resultIndex);
    }
}
