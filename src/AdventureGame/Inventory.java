package AdventureGame;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean food;
    private boolean water;
    private boolean firewood;

    public Inventory() {
        this.weapon = new Weapon("Yumruk", -1 ,0 ,0);
        this.armor = new Armor("Paçavra", -1, 0, 0);
        this.food = false;
        this.firewood = false;
        this.water = false;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
}
