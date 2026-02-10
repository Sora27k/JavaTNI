package CoffeeShop;

public class Espreso extends Drink {
    private int shot = 0;

    public Espreso(String size){
        super("Espresso",35,size);
    }

    public void addShot(int shot){
        this.shot = shot;
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (shot*15) + getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" + (shot == 0 ? "" : "Added " + shot + "shot") +
                "\nTotal price = " + calculateFinalPrice() + "Baht";
    }
}
