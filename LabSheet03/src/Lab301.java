import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        if (number == 0){
            System.out.println("This number is Zero number.");
        }
        else if (number % 2 == 0){
            if (number > 0){
                System.out.println("This number is Even number and Positive number.");
            }
            else{
                System.out.println("This number is Even number and Negative number.");
            }
        }
        else{
            if (number > 0){
                System.out.println("This number is Odd number and Positive number.");
            }
            else{
                System.out.println("This number is Odd number and Negative number.");
            }
        }
    }
}
