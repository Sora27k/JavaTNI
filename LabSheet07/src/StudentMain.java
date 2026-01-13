public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(); //new Student(); is object

        s1.name = "Malee";
        s1.id = "251310001";

        System.out.println(s1.name);
        System.out.println(s1.id);

        s1.doHomework(10);
        s1.showStatus();

        s1.doHomework(15);
        s1.showStatus();

        s1.takeExam(15);
        s1.showStatus();

        s1.doHomework(5);
        s1.showStatus();

        Student s2 = new Student();
        s2.name = "Tipco";
        s2.id = "251311025";

        s2.doHomework(25);
        s2.takeExam(50);
        s2.showStatus();
    }
}
