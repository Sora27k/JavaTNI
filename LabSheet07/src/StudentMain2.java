import java.util.Scanner;

public class StudentMain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] st = new Student[10];

        for (int i = 0 ; i<st.length ; i++){

            st[i] = new Student();

            System.out.print("Enter Student Name: ");
            st[i].name = scanner.nextLine();

            System.out.print("Enter Student ID: ");
            st[i].id = scanner.nextLine();

            System.out.print("Enter Homework score: ");
            //int homework_score = scanner.nextInt();
            st[i].doHomework(scanner.nextInt()); //ถ้าไม่มีแแปลงค่าอะไร มีแค่รับมาส่งต่อ

            System.out.print("Enter Exam score: ");
            st[i].takeExam(scanner.nextInt());

        }

        for(Student s : st){
            System.out.println();
            s.showStatus();
        }

    }
}
