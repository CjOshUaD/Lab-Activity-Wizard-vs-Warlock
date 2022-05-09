public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    // ATTACK SPELLS
    public void thunderBlast(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName
                        + " with thunderBlast (Damage - 25)");
        int damagePoints = 25;
        super.manaPoints -= 50;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void shockWave(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName + " with shockwave (Damage - 50)");
        int damgePoints = 25;
        super.manaPoints -= 75;
        damageTarget(enemyCharacter, damagePoints);

    }

    // Recovery Spells
    public void recovery(Character character) {
        System.out.println(super.characterName + " heals with recover (Heal - 25, Mana - 50)\n");
        int healPoints = 25;
        super.manaPoints += 50;
        healTarget(character, healPoints);
    }

}
