public class Cat {
    private String name;
    private int appetite;
    private boolean fill;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fill = false; // поле сытость
    }
    public void eat(Plate pl) {
        if (pl.isEnoughFood(appetite)) {
            pl.decFood(appetite);
            fill = true;
        }
    }
    public void infoCatFill() {
        System.out.print("Кот " + name);
        if (fill) System.out.println(" не голоден");
           else  System.out.println(" хочет есть");
    }
    // Расширить задачу: Метод сон для котов. После сна кот голоден.
    public void sleep(){
        fill = false;
    }



}
