package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;


    public void setProducer(String prod) {
        producer = prod;
    }
    public void setYear(int year1) {
        year = year1;
    }
    public void setLength(int length1) {
        length = length1;
    }
    public void setWeight(int weight1) {
        weight = weight1;
    }
    public void setFuel(int fuel1) {
        fuel = fuel1;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int fillUp(int n) {
        fuel = fuel + n;
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year
                            + ", длина: " + length + ", вес: " + weight
                            + ", количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
    if (airplane1.length > airplane2.length) {
        System.out.println("Первый самолет длиннее");
    } else if (airplane1.length < airplane2.length) {
        System.out.println("Второй самолет длиннее");
    } else System.out.println("Длины самолетов равны");
    }
}
