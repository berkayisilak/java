package AdventureGame;

public class Snake extends Obstacle{
    private int randomDamage;
    public Snake() {
        super("yılan", 4, ((int)(Math.random() * 4) + 3), 12, 0);
    }

    public int randomDamage() {
        return 1;
    }
}
