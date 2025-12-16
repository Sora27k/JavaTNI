import javax.swing.*;

public class Ex301 {
    public static void main(String[] args) {
        double total_price = Double.parseDouble(JOptionPane.showInputDialog("Error total price"));

        int coupon = JOptionPane.showConfirmDialog(null,
                "Do you have coupon?",
                "Coupon",
                JOptionPane.YES_NO_OPTION);
        //int coupon = JOptionPane.showConfirmDialog(null,
               // "Do you have coupon");

        if(coupon == JOptionPane.YES_OPTION) {
        int disscount_coupon = Integer.parseInt(JOptionPane.showInputDialog("How many discount(%)"));
        double disscount = total_price * disscount_coupon / 100;
        double pay = total_price - disscount;
        JOptionPane.showMessageDialog(null,
                "You get disscount" + disscount + "baht.\n"+
                "Total price is "+pay + "baht.");
        }
        else{
            if (total_price >= 1500){
                double discount = total_price * 10 /100;
                double pay = total_price - discount;
                JOptionPane.showMessageDialog(null,
                        "You get disscount 10 ("+discount+")\n"+
                "Total price is " + pay + "baht.");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Total price " + total_price + " baht");
            }
        }
    }
}
