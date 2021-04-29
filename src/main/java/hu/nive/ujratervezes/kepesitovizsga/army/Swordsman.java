package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean shield;

    public Swordsman(boolean shield) {
        setHitPoints(100);
        setDamage(20);
        setArmor(armor);
        this.shield = shield;
    }

    @Override
    public void sufferDamage(int damage) {
        if (shield) {
            setHitPoints(getHitPoints());
            shield = false;
        } else {
            setHitPoints(damage);
        }
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }
}
