import javax.swing.*;

public class BookMain2 {
    public static void main(String[] args) {
    String Author_name = JOptionPane.showInputDialog(null,"Enter author's name:");
    int consent = JOptionPane.showConfirmDialog(null,"Perfer to pubkish your nationality and birthyear?:");

    Author author;

    if (consent == JOptionPane.YES_OPTION){
        String nationality = JOptionPane.showInputDialog("Enter author's nationality:");
        int birthyear = Integer.parseInt(JOptionPane.showInputDialog("Enter author's birthyear: "));
        author = new Author(Author_name,nationality,birthyear);
    }
    else{
        author = new Author(Author_name);

    }

   JOptionPane.showMessageDialog(null,"Author's info:" + author.showAuthorInfo());

    String title = JOptionPane.showInputDialog(null,"Enter book title: ");
    String catagory = JOptionPane.showInputDialog("Enter book category:");
    double price = Double.parseDouble(JOptionPane.showInputDialog("Enter book price:"));

    Book book = new Book(title,catagory,price,author);


    if (book.isDiscontAvailable()){
        book.setDiscount_percent(Integer.parseInt(JOptionPane.showInputDialog("Enter discount (%)")));

    }

    JOptionPane.showMessageDialog(null, book.showBoolInfo());

    }
}
