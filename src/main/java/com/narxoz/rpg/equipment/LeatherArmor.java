package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    private int defense = 25;
    private String armorType = "Leather";

    @Override
    public int getDefense() { return defense; }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Light armor for agility";
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
    }
}
