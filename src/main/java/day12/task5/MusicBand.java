package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public List<MusicArtist> addGroupMember(MusicArtist musicArtist) {
        this.members.add(musicArtist);
        return members;
    }

    public void removeGroupMember(int k) {
        this.members.remove(k);
    }

    public MusicBand(String name, int year, List<MusicArtist> members){
    this.name = name;
    this.year = year;
    this.members = members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (int i = 0; i<musicBand1.members.size(); i = i) {
            musicBand2.addGroupMember(musicBand1.members.get(i));
            musicBand1.removeGroupMember(i);
        }
    }

    public void printMembers() {
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
