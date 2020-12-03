package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double result;

        for (int i = 0; i < 5; i++) {
            double value1 = input.nextDouble();
            double value2 = input.nextDouble();

            if (value2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            result = value1 / value2;
            System.out.println(result);
        }
        input.close();
    }
}
