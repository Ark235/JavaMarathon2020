package day5;

import day5.transport.Car;

public class Task1 {
    public static void main(String[] args) {

    Car car1 = new Car();

    car1.setProdYear(car1.getProdYear());
    car1.setCarColor(car1.getCarColor());
    car1.setCarModel(car1.getCarModel());

        System.out.println("Год выпуска авто: " + car1.getProdYear());
        System.out.println("Цвет авто: " + car1.getCarColor());
        System.out.println("Модель авто: " + car1.getCarModel());
    }
}

