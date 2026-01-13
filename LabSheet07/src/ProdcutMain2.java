import java.util.Scanner;

public class ProdcutMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini shop");
        System.out.println("--------------------------------");
        System.out.println("Pres [1] to buy pen");
        System.out.println("Pres [2] to buy Notebook");

        System.out.println("Enter a number");




    }
}
