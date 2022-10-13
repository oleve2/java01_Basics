package Task10_polymorphism.weapons;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Pistol - Bang Bang!");
    }
}