import java.util.Scanner;

public class Ex303 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1");
        int Num1 = scanner.nextInt();
        System.out.print("Enter num2");
        int Num2 = scanner.nextInt();
        System.out.print("Enter num3");
        int Num3 = scanner.nextInt();

        // condition ? True : FALSE

        System.out.print(Num1 == Num2&&Num2==Num3? "All number are the same." :"All numbers are not the same");
        System.out.println("All number are " + (Num1 == Num2&&Num2==Num3 ? " the same." :"not the same"));
            //
            //  if (Num1 == Num2&&Num2==Num3){
            //     System.out.print("All number are the same.");
//
            //  }else {
            //       System.out.print("All numbers are not the same");
            //   }
            //
    }
}
