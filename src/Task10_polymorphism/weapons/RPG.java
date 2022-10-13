package Task10_polymorphism.weapons;

public class RPG extends Weapon {
    @Override
    public void shot() {
        System.out.println("RPG - Kabooom!");
    }
}