package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");
        Character warrior = CharacterFactory.createCharacter("warrior", "Loki");
        Character mage = CharacterFactory.createCharacter("mage", "Avrora");
        Character archer = CharacterFactory.createCharacter("archer", "Yumi");
        EquipmentFactory medievalSet = new MedievalEquipmentFactory();
        EquipmentFactory magicSet = new MagicEquipmentFactory();
        EquipmentFactory rangerSet = new RangerEquipmentFactory();
        warrior.equipWeapon(medievalSet.createWeapon());
        warrior.equipArmor(medievalSet.createArmor());
        mage.equipWeapon(magicSet.createWeapon());
        mage.equipArmor(magicSet.createArmor());
        archer.equipWeapon(rangerSet.createWeapon());
        archer.equipArmor(rangerSet.createArmor());
        System.out.println();
        displayCharacterInfo(warrior);
        System.out.println();
        displayCharacterInfo(mage);
        System.out.println();
        displayCharacterInfo(archer);

        System.out.println("\n=== Demo Complete ===");
    }

    private static void displayCharacterInfo(Character character) {
        character.displayStats();
        character.useSpecialAbility();
        character.displayEquipment();
    }
}
