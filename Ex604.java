import java.util.Scanner;

public class Ex604 {
    public static Scanner scanner = new Scanner(System.in);
    public static int input_lenght() {

        System.out.print("How many number to input: ");
        int lenght = scanner.nextInt();
        while (lenght < 1){
            System.out.print("How many number to input: ");
            lenght = scanner.nextInt();
        }
        return lenght;
    }


    public static int[] input_arry(int length){
        int[] numbers = new int[length];
        for (int i = 0;i < numbers.length;i++){
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();

        }
        return numbers;
    }
    public static int count(int[] numbers){
        int count = 0;
        for (int num : numbers){
            if (num % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int lenght = input_lenght();
        int[] numbers = input_arry(input_lenght());

        System.out.print("There are "+ count(numbers));
    }
}
