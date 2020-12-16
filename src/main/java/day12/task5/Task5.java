package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("Андрей Макаревич", 30);
        MusicArtist artist2 = new MusicArtist("Владимир Шахрин", 28);

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(artist1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(artist2);

        MusicBand mb1 = new MusicBand("Машина времени", 1980, members1);
        MusicBand mb2 = new MusicBand("Чайф", 1985, members2);

        mb1.printMembers();
        System.out.println();
        mb2.printMembers();
        System.out.println();

        MusicBand.transferMembers(mb1,mb2);

        mb1.printMembers();
        System.out.println();
        mb2.printMembers();
        System.out.println();
    }
}
