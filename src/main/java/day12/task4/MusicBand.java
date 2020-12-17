package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addGroupMember(String newMember) {
        this.members.add(newMember);
    }

    public MusicBand(String name, int year, List<String> members){
    this.name = name;
    this.year = year;
    this.members = members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.members.addAll(musicBand1.members);
        musicBand1.members.clear();
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
