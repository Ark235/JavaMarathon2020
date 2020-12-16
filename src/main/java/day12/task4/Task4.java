package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Машина времени", 1985);
        mb1.addGroupMember("Андрей Макаревич");

        mb1.printMembers();

        MusicBand mb2 = new MusicBand("Queen", 1980);
        mb2.addGroupMember("Freddie Mercury");

        mb2.printMembers();

        MusicBand.transferMembers(mb1,mb2);

        mb1.printMembers();

        mb2.printMembers();

    }
}
