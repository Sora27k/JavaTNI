import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: " );
        int number1 = scanner.nextByte();

        System.out.print("Enter number2: " );
        int number2 = scanner.nextByte();

        System.out.println("\nSummation     = " +(number1+number2));
        System.out.println("Subtraction   = " +(number1-number2));
        System.out.println("Mutiplication = " +(number1*number2));
        System.out.println("Division      = " +((double)number1/number2));
        System.out.println("Modus         = " +(number1%number2));

    }
}
