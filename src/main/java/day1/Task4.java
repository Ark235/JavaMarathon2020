package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        int step = 4;
        while(year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year = year + step;
        }
    }
}
