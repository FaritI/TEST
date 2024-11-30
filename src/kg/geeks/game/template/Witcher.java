package kg.geeks.game.template;

public class Witcher extends Hero {
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.TO_RESURRECT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() <= 0) return;
        for (Hero hero : heroes) {
            if (hero.getHealth() <= 0) {
                System.out.println("Witcher оживляет героя и жертвует собой.");
                hero.setHealth(this.getHealth());
                this.setHealth(0);
                break;
            }
        }
    }
}
