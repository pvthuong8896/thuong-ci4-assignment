package vn.edu.techkids.models;

/**
 * Created by qhuydtvt on 5/6/2016.
 */
public class EnemyBullet extends GameObject {

    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;
    public static final int DAMAGE_DEFAULT = 1;
    public static final int SLOW_DEFAULT = 1;

    private int slow = SLOW_DEFAULT;

    private int damage = DAMAGE_DEFAULT;

    public EnemyBullet(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public EnemyBullet(int x, int y, int width, int height, int damage)
    {
        this(x, y, width, height);
        this.damage = damage;
    }

    public EnemyBullet(int x, int y, int width, int height, int slow, int damage) {
        super(x, y, width, height);
        this.slow = slow;
        this.damage = damage;
    }

    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
