import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
      String name = JOptionPane.showInputDialog("Enter your name: ");
      double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.): "));
      int biogender = JOptionPane.showConfirmDialog(null,
                "Are you biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION);

      if (biogender == JOptionPane.YES_OPTION){
          JOptionPane.showMessageDialog(null,
                  "Hello."+name+
                  "\nIf yout height is " + height+ " cm."+
                  "\nYour weight should be " + (height-100)+"kg.");
      }
        if (biogender == JOptionPane.NO_OPTION){
            int biogenderfemale = JOptionPane.showConfirmDialog(null,
                    "Are you biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION);
            if(biogenderfemale == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "Hello." + name +
                                "\nIf yout height is " + height + " cm."+
                                "\nYour weight should be " + (height - 110) + "kg.");
            }
            else if (biogenderfemale == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"You can use BMI to measure your weight and height");
            }
        }
    }
}
