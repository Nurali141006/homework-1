package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Warrior;
import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.character.Archer;

public class CharacterFactory {

    public static Character createCharacter(String type, String name) {
        return switch (type.toLowerCase()) {
            case "warrior" -> new Warrior(name);
            case "mage" -> new Mage(name);
            case "archer" -> new Archer(name);
            default -> throw new IllegalArgumentException("Unknown character type: " + type);
        };
    }
}
