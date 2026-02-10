package CoffeeShop;

public abstract class Drink {
    private String drinkName;
    private double basePrice;
    private String size;

    public Drink(String drinkName,double basePrice,String size){
        this.basePrice =  basePrice;
        this.drinkName = drinkName;
        this.size =  size;
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public double getSizeExtra() {
        if (size.equalsIgnoreCase("S")){
            return 0;
        }
        if (size.equalsIgnoreCase("M")){
            return 10;
        }
        if (size.equalsIgnoreCase("L")){
            return 15;
        }return -1;
    }

    public abstract double calculateFinalPrice();

    public String toString(){
        return  "Your order: " + drinkName + " (Size: " + size.toUpperCase() + ")";
    }

}
