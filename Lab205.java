import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {

        int minutes = Integer.parseInt(JOptionPane.showInputDialog("Input minutes: "));
        int timehours = minutes/60;
        int timeminutes = minutes%60;

        JOptionPane.showMessageDialog(null,
                minutes + " minutes is "+ timehours+" hour "+timeminutes+" minute");
    }
}
