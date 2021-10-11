package model;/*
 * Created by David Karchikyan on 04.10.2021
 */

public class Eat {

    private String name;
    private int count;

    public Eat(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void decreaseCount() {
        if (count < 1) {
            System.out.println("Еда закончилась");
            return;
        }
        this.count--;
    }
}