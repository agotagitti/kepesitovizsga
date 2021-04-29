package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> myArmy = new ArrayList<>();

    public int getArmySize() {
        return myArmy.size();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        myArmy.add(militaryUnit);
    }

    public int getArmyDamage() {
        int countDamage = 0;
        for (MilitaryUnit actualUnit : myArmy) {
            countDamage += actualUnit.getDamage();
        }
        return countDamage;
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> lowHitPoint = new ArrayList<>();
        for (MilitaryUnit actualUnit : myArmy) {
            actualUnit.setHitPoints(damage);
            if (actualUnit.getHitPoints() < 25) {
                lowHitPoint.add(actualUnit);
            }
        }
        myArmy.removeAll(lowHitPoint);
    }
}
