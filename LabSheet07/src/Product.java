import javax.swing.*;

public class Product {
    public String name;
    public double price = 0;
    public int quantity = 0;

    public void addStock(int amount){
    if(amount > 0){
        System.out.println("Added " + amount + " items to stock");
    }
    }

    public void sell(int amount){
    if(amount <= quantity){
        quantity--;
        System.out.println("Sold " + amount + " items");
    }
    System.out.println("Not enough items in stock...");
    }

    public  void changePrice(double newPrice){
        if(newPrice > 0){
            System.out.println("Change price to " + newPrice);
        }
    }
    public double stockValue(){

        return(price*quantity);
    }
    public void showInfo(){
        System.out.println("Name : " + name);
        System.out.println("Name : " + price + " Baht/Item");
        System.out.println("Name : " + quantity + " Items");
        System.out.println("Name : " + stockValue() + " Baht");
    }
}
