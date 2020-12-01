package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        int a = inputInt.nextInt();
        int b = inputInt.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else while ((a+1) < b) {
            if (a%5 == 0 && a%10 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
