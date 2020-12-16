package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> auto = new ArrayList<>();
        auto.add("Nissan");
        auto.add("Ford");
        auto.add("KIA");
        auto.add("Hyundai");
        auto.add("Toyota");

        System.out.println(auto);

        auto.add(2,"Geely");
        auto.remove(0);

        System.out.println(auto);

    }
}
