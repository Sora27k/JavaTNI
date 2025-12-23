import java.util.Scanner;

public class Lab602 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String[] movies = {"Me Before You", "Titanic", "Before Sunrise", "The Holiday", "A Walk to Remember"};
        float[] raitng = {4.2f, 4.9f, 4.4f, 3.7f, 4.3f};

        System.out.print("Enter a movie title: ");
        String titles = scanner.nextLine();

        int index = 0;
        int count = 0;

        for (int i = 0; i < movies.length; i++) {
            if (titles.equalsIgnoreCase(movies[i])) {

                index++;
                count++;
                break;
            }

        }
        if (count != 1) {
            System.out.println("Cannot found this movie title...");

        } else {
            System.out.println("The rating score of " + movies[index] + " is " + raitng[index]);
            System.out.println("This movie is ranked number " + find_rank(raitng,movies,index));
        }






    }
    public static int find_rank(float[] raitng,String[] movie,int index){
        double rank = raitng[index];
        int ranked = 1;
        for (int i = 0; i<= movie.length-1;i++){
            if (raitng[i]>rank){
                ranked++;
            }
        }
        return ranked;
    }
}