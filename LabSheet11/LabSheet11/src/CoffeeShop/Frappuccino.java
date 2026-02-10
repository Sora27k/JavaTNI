package CoffeeShop;

public class Frappuccino extends Drink{
    private boolean whipped;

    public Frappuccino(String size,boolean whipped){
        super("Frappuccino",40,size);
    }


    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (whipped ? 15:0) + getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n"+ (whipped ? "Add whiooed 15 Baht" : "") +
                "\nTotal price = " + calculateFinalPrice() + " Baht";
    }
}
