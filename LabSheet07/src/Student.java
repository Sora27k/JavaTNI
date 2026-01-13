public class Student {

    //attributes
    public String name;
    public String id;
    public int score = 0;

    //method
    public void doHomework(int point){
        score += point; //score = score + point;
        System.out.println(name + " did homework " + point + " points");
    }

    public void takeExam(int point){
        score += point;
        System.out.println(name + " took exam " + point + " points");
    }

    public  String getResult(){
        if (score >= 50){
            return "pass";
        }
        return "fail";
    }
    public void showStatus(){
        System.out.println("Name : " + name);
        System.out.println("Name : " + id);
        System.out.println("Name : " + score);
        System.out.println("Name : " + getResult());
        System.out.println("-----------------");
    }
}
