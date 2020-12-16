package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("The Doors", 1965);
        MusicBand mb2 = new MusicBand("The Beatles", 1960);
        MusicBand mb3 = new MusicBand("Машина времени", 1969);
        MusicBand mb4 = new MusicBand("Чайф", 1985);
        MusicBand mb5 = new MusicBand("Князь", 2011);
        MusicBand mb6 = new MusicBand("Brothers of Metal", 2012);
        MusicBand mb7 = new MusicBand("The Killers", 2001);
        MusicBand mb8 = new MusicBand("Daughtry", 2006);
        MusicBand mb9 = new MusicBand("Poets Of The Fall", 2003);
        MusicBand mb10 = new MusicBand("Linkin Park", 1996);

        List<MusicBand> musicBands = new ArrayList<MusicBand>();

        musicBands.add(mb1);
        musicBands.add(mb2);
        musicBands.add(mb3);
        musicBands.add(mb4);
        musicBands.add(mb5);
        musicBands.add(mb6);
        musicBands.add(mb7);
        musicBands.add(mb8);
        musicBands.add(mb9);
        musicBands.add(mb10);

        Collections.shuffle(musicBands);

        groupsAfter2000(musicBands);

        System.out.println("Оригинальный список: ");
        System.out.println();
        System.out.println(musicBands);
        System.out.println();

        System.out.println("Новый список с группами, созданными с 2000 года:");
        System.out.println();
        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        List<MusicBand> after2000List = new ArrayList<>();
        for (MusicBand x : musicBands) {
            if (x.getYear() > 2000) {
                after2000List.add(x);
            }
        }
        return after2000List;
    }
}
