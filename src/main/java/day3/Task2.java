package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value1;
        double value2;
        double wrongValue2 = 0;
        double result;

        while (wrongValue2 == 0) {
            value1 = input.nextDouble();
            value2 = input.nextDouble();
            result = value1 / value2;
            if (value2 == wrongValue2) {
                break;
            } else System.out.println(result);
        }
    }
}