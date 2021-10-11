import model.Cat;
import model.Eat;
import model.Plate;
import service.CatService;

public class Api {

    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 0);
        CatService catService = new CatService(cat);
        Plate plate = new Plate(new Eat("Milk", 6));
        catService.eat(plate.getEat());
        System.out.println(plate.getEat().getName());
        System.out.println(cat.getSatiety());
        if (cat.getSatiety() < 10) {
            plate.addEat(new Eat("Meat", 4));
            catService.eat(plate.getEat());
        }
        System.out.println(plate.getEat().getName());
        System.out.println(cat.getSatiety());

    }
}