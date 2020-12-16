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

    public void removeGroupMember(int k) {
        this.members.remove(k);
    }

    public MusicBand(String name, int year){
    this.name = name;
    this.year = year;
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
                '}';
    }


}
