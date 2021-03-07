public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("В тарелке: " + food + "ед. корма");
    }
    public boolean isEnoughFood(int amount){
        if (food >= amount) return true;
        return false;
    }
    public void incFood(int amount){
        food += amount;
    }
    public void decFood(int amount){
        if (isEnoughFood(amount)) food -= amount;
    }
}
