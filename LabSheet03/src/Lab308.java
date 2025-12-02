import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number to input: ");

        int amount = scanner.nextInt();
        int max = 0;
        int min = 0;
        int even = 0;
        int odd = 0;
        int number = 0;

        for (int i=1;i <= amount;i++) {
            System.out.print("Enter number" + i + " : ");
             number = scanner.nextInt();

            if (number > max){
                max = number;
            }
            else if (number < min){
                min = number;
            }
            if (number % 2 == 0){
                even += 1;
            }
            if (number % 2 != 0){
                odd += 1;
            }
        }


        System.out.println("\nMaximum = "+max);
        System.out.println("Minimum = "+min);
        System.out.println("Even number = "+even);
        System.out.println("Odd number = "+odd);

        }


    }

