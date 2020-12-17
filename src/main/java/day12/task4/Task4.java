package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Андрей Макаревич");
        MusicBand mb1 = new MusicBand("Машина времени", 1985, members1);


        mb1.printMembers();

        List<String> members2 = new ArrayList<>();
        members2.add("Freddie Mercury");
        MusicBand mb2 = new MusicBand("Queen", 1980, members2);

        mb2.printMembers();

        MusicBand.transferMembers(mb1,mb2);

        mb1.printMembers();

        mb2.printMembers();

    }
}
