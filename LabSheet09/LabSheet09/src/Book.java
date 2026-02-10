public class Book {
    private String title;
    private  String category;
    private double price;
    private int discount_percent;
    private Author author;

    public Book(String title,String category,double price,Author author){
        this.title = title;
        this.category = category;
        this.price = price;
        this.author = author;
        this.discount_percent = 0;
    }
    public Book(){
        this("","",0.0,null);
    }
    public Author getAuthor(){
        return this.author;
    }
    public  String getTitle(){
        return this.title;
    }
    public void setDiscount_percent(int percent){
        this.discount_percent = percent;
    }

    public int getDiscount_percent() {
        return discount_percent;
    }

    public boolean isDiscontAvailable(){
        return this.price>500;
    }
    public double calculateDiscountPrice(){
        return  this.price - (this.price * this.discount_percent / 100.00);
    }
    public  String showBoolInfo(){
        return "Title: " + this.title +
                "\nCategory: " + this.category +
                "\nPrice: " + this.price + (isDiscontAvailable() ? " (" + calculateDiscountPrice() + " )" : "") +
                "\nAuthor: " + this.author.showAuthorInfo();
    }
}
