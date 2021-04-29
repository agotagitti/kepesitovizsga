package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int countAttacks;

    public HeavyCavalry() {
            setHitPoints(150);
            setDamage(20);
            setArmor(true);
            countAttacks = 0;
    }

    @Override
    public int doDamage() {
        if (countAttacks == 0) {
            countAttacks++;
            return getDamage() * 3;
        } else {
            return getDamage();
        }
    }



}
