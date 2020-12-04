package day5.transport;

import java.util.Scanner;

public class Car {
    private int prodYear;
    private String carColor;
    private String carModel;

    Scanner inputYear = new Scanner(System.in);
    Scanner inputColor = new Scanner(System.in);
    Scanner inputModel = new Scanner(System.in);

    public void setProdYear(int year) {
        System.out.println("Введите год выпуска авто: ");
        year = inputYear.nextInt();
        if (year == 0 || year < 0 || year < 1980) {
            System.out.println("Неверный год. Начинаем с 1980.");
        } else {
            prodYear = year;
        }
    }
    public int getProdYear() {
        return prodYear;
    }

    public void setCarColor(String color) {
        System.out.println("Введите цвет авто: ");
        color = inputColor.nextLine();
        if (color.isEmpty() || color.length() < 3) {
            System.out.println("Неверный цвет или пустое поле. От 3 символов латиницей или кириллицей.");
        } else {
            carColor = color;
        }
    }
    public String getCarColor() {
        return carColor;
    }

    public void setCarModel(String model) {
        System.out.println("Введите модель авто: ");
        model = inputModel.nextLine();
        if (model.isEmpty() || model.length() < 3) {
            System.out.println("Неверная модель или пустое поле. От 3 символов латиницей или кириллицей.");
        } else {
            carModel = model;
        }
    }
    public String getCarModel() {
        return carModel;
    }
}
