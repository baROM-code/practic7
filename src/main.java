public class main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Васька", 7);
        cats[1] = new Cat("Пушок", 3);
        cats[2] = new Cat("Рыжый", 5);
        cats[3] = new Cat("Тимка", 2);
        cats[4] = new Cat("Барсик", 6);
        Plate plate = new Plate(13);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].infoCatFill();
        }
        plate.info();
        plate.incFood(7);
        plate.info();
    }
}
