package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {

    private int magicAtt;

    @Override
    public void magicalAttack(Hero hero) {
        double damageMag = magicAtt * (1 - hero.magicDef);
        hero.health -= damageMag;
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
    }

    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        physDef = 0;
        magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Magician{health=" + health + "}";
    }
}
