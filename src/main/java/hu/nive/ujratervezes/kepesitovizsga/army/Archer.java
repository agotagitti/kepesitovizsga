package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        setHitPoints(50);
        setDamage(20);
        setArmor(false);
    }

    @Override
    public int doDamage() {
        return this.damage;
    }


}
