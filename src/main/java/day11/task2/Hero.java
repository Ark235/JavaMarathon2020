package day11.task2;

public abstract class Hero implements PhysAttack {

    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;

    int physAtt;
    double physDef;
    double magicDef;
    int health;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
    double damagePhys = physAtt * (1 - hero.physDef);
    hero.health -= damagePhys;
    if (hero.health < MIN_HEALTH) {
        hero.health = MIN_HEALTH;
    }
    }
}
