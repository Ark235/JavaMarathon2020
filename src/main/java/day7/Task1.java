package day7;

public class Task1 {
    public static void main(String[] args) {
    Airplane airplane1 = new Airplane("boeing", 1980, 90, 500);
    Airplane airplane2 = new Airplane("sukhoy", 2020, 100, 400);

    Airplane.compareAirplanes(airplane1, airplane2);
    }
}