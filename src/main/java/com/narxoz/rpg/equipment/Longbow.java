package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {
    private int damage = 30;
    private String weaponType = "Bow";

    @Override
    public int getDamage() { return damage; }

    @Override
    public String getWeaponInfo() {
        return "Longbow (Ranger) - High range attack";
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }
}
