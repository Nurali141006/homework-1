package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {
    private int defense = 15;
    private int manaBoost = 50;
    private String armorType = "Robe";

    @Override
    public int getDefense() { return defense; }
    public int getManaBoost() { return manaBoost; }

    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Magic) - Light armor, boosts mana";
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense + ", Mana Boost: " + manaBoost);
        System.out.println("Type: " + armorType);
    }
}
