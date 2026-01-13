import javax.swing.*;
import java.util.Scanner;

public class StudentMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] st = new Student[10];

        for (int i = 0 ; i<st.length ; i++){

            st[i] = new Student();

            st[i].name = JOptionPane.showInputDialog("Enter Student Name:");
            st[i].id = JOptionPane.showInputDialog("Enter Student ID:");

            //int homework_score = Integer.parseInt(
            //        JOptionPane.showInputDialog("Enter homework score:"));
            st[i].doHomework(Integer.parseInt(
                    JOptionPane.showInputDialog("Enter homework score:")));


            st[i].takeExam(Integer.parseInt(
                    JOptionPane.showInputDialog("Enter Exam score: ")));

        }

        for(Student s : st){
            System.out.println();
            s.showStatus();
        }

    }
}
