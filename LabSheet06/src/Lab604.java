import java.util.Scanner;

public class Lab604 {
    static void main(String[] args) {
        int[] numbers = {43, 13, 52, 17, 61, 29, 94, 36};
        display_array(numbers);
        System.out.println();
        int index = input_index(numbers);



        System.out.println("The number at index " + index + " is " + numbers[index]);

        if (index > 0) {
            System.out.println("The number before index " + index + " is " + numbers[index - 1]);
        } else {
            System.out.println("The number before index " + index + " is Out of rage!!!");
        }


        if (index < numbers.length - 1) {
            System.out.println("The number after index " + index + " is " + numbers[index + 1]);
        } else {
            System.out.println("The number before index " + index + " is Out of rage!!!");

        }

    }
    public static void display_array(int[] numbers){
        System.out.println("List of numbers in array: ");
        for (int _numbers : numbers){
            System.out.println(_numbers + " ");
        }
    }
    public static int input_index(int[] numbers){
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index: ");
        index = scanner.nextInt();
        while(!check_index(numbers,index)){
            System.out.println("Invalid index!!! Enter, again: ");
            index = scanner.nextInt();
        }
        return index;


    }
    public static boolean check_index(int[] numbers,int index){
        return index >= 0 && index > numbers.length;
    }
}
