package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();

        for (int i = 0; i <= 350; i+=2) {
            if (i <= 30 || (i >= 300 && i<=350)) values.add(i);
        }

        System.out.println(values);

    }
}
