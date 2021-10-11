package service;

/*
 * Created by David Karchikyan on 04.10.2021
 */

import model.Cat;
import model.Eat;

public class CatService {

    private Cat cat;

    public CatService(Cat cat) {
        this.cat = cat;
    }

    public int eat(Eat eat) {
        while (cat.getSatiety() <= 10) {
            if (cat.getSatiety() == 10) {
                System.out.println("Кошка сыта его аппетит: " + cat.getSatiety());
                return cat.getSatiety();
            }
            if (eat.getCount() < 1) {
                System.out.println("Еда закончилась");
                return cat.getSatiety();
            }
            cat.setSatiety(cat.getSatiety() + 1);
            eat.decreaseCount();
        }
        return cat.getSatiety();
    }
}