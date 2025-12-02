import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for X coordinate: ");
        int X_value = scanner.nextInt();

        System.out.print("Enter the value for Y coordinate: ");
        int Y_value = scanner.nextInt();

        if (X_value > 0 && Y_value>0){
            System.out.println("The coordinate point (" + X_value+ "," +Y_value+") lies in the First quadrant");
        }
        else if (X_value > 0 && Y_value < 0){
            System.out.println("The coordinate point (" + X_value+ "," +Y_value+") lies in the Fourth quadrant");
        }
        else if (X_value < 0 && Y_value < 0){
            System.out.println("The coordinate point (" + X_value+ "," +Y_value+") lies in the Third quadrant");
        }
        else if (X_value < 0 && Y_value > 0){
            System.out.println("The coordinate point (" + X_value+ "," +Y_value+") lies in the Second quadrant");
        }
        else{
            System.out.println("The coordinate point (" + X_value+ "," +Y_value+") lies in the Origin");
        }
    }
}
