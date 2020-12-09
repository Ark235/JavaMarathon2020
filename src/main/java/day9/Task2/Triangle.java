package day9.Task2;

public class Triangle extends Figure {
    private double sideOneLength;
    private double sideTwoLength;
    private double sideThreeLength;

    public Triangle(int sideOneLength, int sideTwoLength, int sideThreeLength, String color) {
        super(color);
        this.sideOneLength = sideOneLength;
        this.sideTwoLength = sideTwoLength;
        this.sideThreeLength = sideThreeLength;
    }

    public double area() {
        double p = (sideOneLength + sideTwoLength + sideThreeLength) / 2;
        return Math.sqrt(p * (p - sideOneLength) * (p - sideTwoLength) * (p - sideThreeLength));
    }

    public double perimeter() {
        return sideOneLength + sideTwoLength + sideThreeLength;
    }
}
