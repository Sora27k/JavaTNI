import javax.swing.*;

public class FirstWindowForm {
    private JPanel winform;
    private  JFrame jFrame;

    public  FirstWindowForm(){
        jFrame = new JFrame();
        jFrame.setContentPane(winform);
        jFrame.setTitle("My First Window");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300,200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new FirstWindowForm();
    }
}
