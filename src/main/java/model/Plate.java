package model;/*
 * Created by David Karchikyan on 04.10.2021
 */

public class Plate {

    private Eat eat;

    public Plate(Eat eat) {
        this.eat = eat;
    }

    public Eat getEat() {
        return eat;
    }

    public void addEat(Eat eat) {
        this.eat = eat;
    }

    public boolean isPlateEmpty() {
        return this.eat.getCount() < 1;
    }
}