package day5;

import day5.transport.Motorbike;

public class Task2 {
    public static void main(String[] args) {

    Motorbike moto1 = new Motorbike(1980,"red","intruder");

        System.out.println("Год выпуска мотоцикла: " + moto1.getProdYear());
        System.out.println("Цвет мотоцикла: " + moto1.getCarColor());
        System.out.println("Модель мотоцикла: " + moto1.getCarModel());
    }
}
