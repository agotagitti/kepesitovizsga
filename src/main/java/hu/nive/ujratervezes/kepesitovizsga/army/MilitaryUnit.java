package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damage;
    protected boolean armor;

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        if (isArmor()) {
            hitPoints -= (damage / 2);
        }
        hitPoints -= damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isArmor() {
        return armor;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }
}
