package vn.edu.techkids.models;

/**
 * Created by nhoxkem96 on 07/05/2016.
 */
public class GameObjectWithHP extends GameObject {

    private int hp;

    public GameObjectWithHP(int x, int y, int width, int height, int hp) {
        super(x, y, width, height);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void increaseHP(int delte){
        this.hp += delte;
    }

    public void increaseHP(){
        increaseHP(1);
    }

    public void decreaseHP(int delte){
        this.hp -= delte;
    }

    public void decreaseHP(){
        decreaseHP(1);
    }
}
