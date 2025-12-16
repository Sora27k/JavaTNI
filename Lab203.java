import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product id     : ");
        String productid = scanner.next();

        scanner.nextLine();
        System.out.print("Enter product name   : ");
        String productname = scanner.nextLine();

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.print("Enter product item   : ");
        int productitem = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter price per piece: ");
        double prodcutprice = Double.parseDouble( scanner.nextLine());

        double total = productitem * prodcutprice;

        System.out.println("\n-------------------------------------");
        System.out.println("Product name     : " + productname +"(" + productid + ")");
        System.out.println("Prodcut item       : " + productitem + "("+ prodcutprice +"baht/piece)");
        System.out.println("Total price        : " + frm.format(total) + " baht");
    }
}
