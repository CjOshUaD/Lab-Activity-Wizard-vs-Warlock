public class Character {
    public String characterName = "Ether";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    Character(String name) {
        characterName = name;

    }

    public void damageTarget(Character enemyCharacter, int damagePoints) {
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Enemy character Hp left= " + enemyCharacter.healthPoints + " mana left "
                + enemyCharacter.manaPoints + "\n");

        if (enemyCharacter.healthPoints <= 0) {
            System.out.println(enemyCharacter.characterName + " is  now deafeated!\n");

        }
    }

    public void healTarget(Character character, int healPoints) {
        character.healthPoints += healPoints;
        System.out.println(characterName + " hp added is " + healPoints + " and mana added " + manaPoints + "\n");
    }

    public void displayDetails(Character enemyCharacter) {
        level += 10;
        System.out.println(
                characterName + " is level up to " + level + " hp left " + enemyCharacter.healthPoints + " Mana left "
                        + enemyCharacter.manaPoints);

    }

}
