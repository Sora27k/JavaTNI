import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer? "));
        double pricecustomer = (double)customer*299*107/100;

        int disscount = Integer.parseInt(JOptionPane.showInputDialog("Price with NET is "+ pricecustomer + " baht."+
                "\nHow much of disscount(%) on you coupon?"));
        DecimalFormat frm = new DecimalFormat("#,###.00");
        double total =  pricecustomer*(100-disscount)/100;

        int paid = Integer.parseInt(JOptionPane.showInputDialog("Total price is " + frm.format(total) +" baht."+
                "\nEnter the amount the customer paid:"));
        double totalpaid = paid-total;

        JOptionPane.showMessageDialog(null,
                "\nTotal price is " + frm.format(total) + " baht."+
                        "\nCustomer paid " + frm.format(paid) + " baht."+
                        "\nGet change " + frm.format(totalpaid) + " baht.");
    }
}
