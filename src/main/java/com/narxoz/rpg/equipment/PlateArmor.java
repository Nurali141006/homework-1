package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense = 40;
    private String armorType = "Plate";

    @Override
    public int getDefense() { return defense; }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Heavy armor providing high defense";
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
    }
}
