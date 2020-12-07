package day6;

public class Motorbike {

    private int prodYear;
    private String color;
    private String model;

    public Motorbike(String model, String color, int prodYear) {
        this.prodYear = prodYear;
        this.color = color;
        this.model = model;
    }

    public int getProdYear() {
        return prodYear;
    }
    public String getCarColor() {
        return color;
    }
    public String getCarModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(prodYear - inputYear);
    }

}
