public class BOOK {
    private String title;
    private int totalBook;
    private int availableBook;

    public BOOK(String title,int totalBook){
        this.title = title;
        this.totalBook = totalBook;
        this.availableBook = 0;
    }
    public BOOK(String title){
        this.title = title;
        this.totalBook = 0;
        this.availableBook = 0;
    }

    public BOOK(){
        this.title = "";
        this.totalBook = 0;
        this.availableBook = 0;
    }

    public String getTitle(){
        return this.title;
    }

    public int getTotalBook(){
        return this.totalBook;
    }

    public int getAvaliblebook(){
        return this.availableBook;
    }

    public void brrowBook(){
            if(this.availableBook>0){
                this.availableBook -= 1;
            }
    }

    public void returnBook(){
        if (this.availableBook<this.totalBook){
            this.availableBook +=1;
        }

    }

}
