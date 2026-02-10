import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        BOOK books[] = new BOOK[3];

       for(int i = 0; i < books.length;i++){
           String booktitle = JOptionPane.showInputDialog("Enter book title");
           int totalnumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number:"));
           books[i] = new BOOK(booktitle,totalnumber);
       }

       for(BOOK _books : books){
           System.out.println(_books.getTitle() + " has " + _books.getTotalBook() + " books, can borrow " + _books.getAvaliblebook() + " books");
       }

    }

}
