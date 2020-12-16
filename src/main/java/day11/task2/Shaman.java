package day11.task2;

public class Shaman extends Hero implements interfaceMagicAttack,interfaceHealer {

    private int magicAtt;

    @Override
    public void magicalAttack(Hero hero) {
        double damageMag = magicAtt * (1 - hero.magicDef);
        hero.health -= damageMag;
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
    }

    @Override
    public void healHimself() {
        health += 50;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }
    }

    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }
}
