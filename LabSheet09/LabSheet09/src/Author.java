public class Author {
    private String name;
    private String nationality;
    private int birthyear;

    public Author(String name, String nationality,int birthyear){
        this.name = name;
        this.nationality = nationality;
        this.birthyear = birthyear;

    }

    public Author(String name,String nationality){
        this.name = name;
        this.nationality = nationality;
        birthyear = 0;
    }

    public Author(String name){
        this(name,"",0);
    }
    public Author(){
        this("","",0);
    }
    public String getName(){
        return name;
    }
    public  String showAuthorInfo() {
        if (this.nationality.isEmpty()) { //this.nationality == ""
            return this.name;
        }
        if (this.birthyear == 0)
            return this.name + "(" + this.nationality + ")";
        return this.name + " (" + this.nationality + ", born " + this.birthyear + ")";
    }
}
