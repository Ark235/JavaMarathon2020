package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane plane1 = new Airplane("Sukhoi", 2020, 50, 100);

    plane1.info();

    plane1.setYear(2019);
    plane1.setLength(60);
    plane1.fillUp(100);
    plane1.fillUp(30);

    plane1.info();
    }
}
