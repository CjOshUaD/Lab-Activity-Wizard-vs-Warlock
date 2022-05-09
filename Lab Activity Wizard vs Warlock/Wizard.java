public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    // Attack Spells
    public void windBlade(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName + " with windBlade (Damage - 25)");
        int damagePoints = 25;
        super.manaPoints -= 50;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void hurricane(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName + " with hurricane (Damage - 50)");
        int damagePoints = 50;
        super.manaPoints -= 75;
        damageTarget(enemyCharacter, damagePoints);
    }

    // Recovery/Heal Spell
    public void recover(Character character) {
        System.out.println(super.characterName + " heals with recover (Heal - 25, Mana - 50)");
        int healpoints = 25;
        super.manaPoints += 50;
        healTarget(character, healpoints);
    }
}
