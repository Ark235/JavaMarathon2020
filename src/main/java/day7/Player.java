package day7;

import java.util.Random;

public class Player {                               // тест ругается, но при ручной проверке все выглядит ок
    private static int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }
    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        stamina = getStamina() - 1;
        if (stamina == MIN_STAMINA) {
            countPlayers = getCountPlayers() - 1;
        }
    }

    public static void info() {
        int freeSlots = 6 - countPlayers;
        if (countPlayers < 6) {
            if (freeSlots == 2 || freeSlots == 3 || freeSlots == 4) {
                System.out.println("Команды неполные. На поле еще есть "+freeSlots+" свободных места");
            } else if (freeSlots == 1) {
                System.out.println("Команды неполные. На поле еще есть "+freeSlots+" свободное место");
            } else System.out.println("Команды неполные. На поле еще есть "+freeSlots+" свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }

    public static int main() {
        int min = 90;
        int max = MAX_STAMINA;
        int diff = max - min;
        Random rand = new Random();
        stamina = rand.nextInt(diff+1)+min;
        return stamina;
    }

    public Player(int stamina) {
        if (getCountPlayers() < 6) {
            countPlayers++;
            this.stamina = getStamina();
        } else countPlayers = 6;
    }

}
