package day6;

public class Car {
    private static int year;
    private String carColor;
    private String carModel;

    public void setYear(int year1) {
        year = year1;
    }
    public int getYear() { return year; }

    public void setCarColor(String color) {
        carColor = color;
    }
    public String getCarColor() {
        return carColor;
    }

    public void setCarModel(String model) {
        carModel = model;
    }
    public String getCarModel() {
        return carModel;
    }

    public int yearDifference(int inputYear) {
        return Math.abs(year - inputYear);
    }

    public void info() {
        System.out.println("Это автомобиль");
    }
}
