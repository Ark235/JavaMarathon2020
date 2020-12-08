package day7;

import java.util.Random;
import day7.Player;

public class Task2 {
    public static void main(String[] args) {

        Player p1 = new Player(Player.main());
        Player p2 = new Player(Player.main());
        Player p3 = new Player(Player.main());
        Player p4 = new Player(Player.main());
        Player p5 = new Player(Player.main());
        Player p6 = new Player(Player.main());
        Player p7 = new Player(Player.main());

        while (p1.getStamina() > 0) {
            p1.run();
            System.out.println(p1.getStamina());
        }

        Player.info();
        System.out.println(Player.getCountPlayers());
    }
}
