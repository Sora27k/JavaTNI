import javax.swing.*;

public class ReturnBooksTest {
    public static void main(String[] args) {
        BOOK books = new BOOK("Java Programming",5);

        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to borrow/return book?");
        while(true){
        if (confirm == 0){
            int chose = Integer.parseInt(JOptionPane.showInputDialog("Pres 1 to borrow book"+"\nPress 2 return book"));
            if (chose == 1){
                if(books.getAvaliblebook() == 0 ){
                    JOptionPane.showMessageDialog(null,"No books available to borrow");
                    continue;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Borrowed 1 book, available" + books.getAvaliblebook());
                    continue;
                }
            } else if (chose == 2) {
                    if (books.getTotalBook() == books.getAvaliblebook()) {
                    JOptionPane.showMessageDialog(null,"Cannot return! All books are already here.");
                    continue;
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"Returned 1 book, available"+ books.getAvaliblebook()+ " books.");
                    continue;
                }

            } else if (confirm == 1) {
                JOptionPane.showMessageDialog(null,"END PROGRAM");
                break;

            }
        }
        JOptionPane.showMessageDialog(null,"END PROGRAM");
        break;
        }
    }

}

