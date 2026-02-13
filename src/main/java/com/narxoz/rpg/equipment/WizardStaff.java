package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {
    private int damage = 20;
    private int manaBoost = 30;
    private String weaponType = "Staff";

    @Override
    public int getDamage() { return damage; }
    public int getManaBoost() { return manaBoost; }

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic) - Increases spell power";
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage + ", Mana Boost: " + manaBoost);
        System.out.println("Type: " + weaponType);
    }
}
