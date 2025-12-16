import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("##,00");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.): "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.): "));
        double heightmeter = height/100;
        double bmi = weight / (heightmeter * heightmeter);

        if (bmi < 18.5){
            JOptionPane.showMessageDialog(null,"Your BMI is "+df.format(bmi)+
                    "\nBMI result is  Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9){
            JOptionPane.showMessageDialog(null,"Your BMI is "+df.format(bmi)+
                    "\nBMI result is Healthy weight");
        }
        else if (bmi >= 25 && bmi <= 29.9){
            JOptionPane.showMessageDialog(null,"Your BMI is "+df.format(bmi)+
                    "\nBMI result is  Overweight");
        }
        else {
            JOptionPane.showMessageDialog(null,"Your BMI is "+df.format(bmi)+
                    "\nBMI result is  Overweight");
        }
    }
}
