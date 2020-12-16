package day11.task2;

public class Paladin extends Hero implements interfaceHealer {

    @Override
    public void healHimself() {
        health += 25;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
        if (hero.health > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }
    }

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}