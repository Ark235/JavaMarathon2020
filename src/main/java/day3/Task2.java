package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value1;
        double value2;
        double result;

        while (true) {
            value1 = input.nextDouble();
            value2 = input.nextDouble();
            if (value2 == 0) {
                break;
            } else {
                result = value1 / value2;
                System.out.println(result);
            }
        }
        input.close();
    }
}