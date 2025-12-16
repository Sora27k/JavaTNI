import javax.swing.*;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.Normalizer;

public class Lab501 {
    public static double cal_bmi(double weight,double height){
        double Finalheight = height/100;
        return weight / (Finalheight*Finalheight);
    }
    public static  String check_bmi(double bmi){
        if (bmi>30){
            return "Obese";
        }
        if (bmi>=25 || bmi <= 29.9){
            return "Overweight";
        }
        if (bmi>=18.5 || bmi <= 24.9){
            return "Healthy Weight";
        }
        return "Underweight";
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        while (true){
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to check your BMI",
                    "Check BMI",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"END PROGRAM!!!");
                break;
            }
            else {
                double weight = Double.parseDouble(JOptionPane.showInputDialog(("Enter your weight(kg.)")));
                double height = Double.parseDouble(JOptionPane.showInputDialog(("Enter your height(cm.)")));
                JOptionPane.showMessageDialog(null,"Your BMI = " + df.format(cal_bmi(weight,height))
                        + "\nYour BMI result = " + check_bmi(cal_bmi(weight,height)));
            }
        }


    }
}
