import javax.swing.*;

public class BorrowBookTest {
    public static void main(String[] args) {
        BOOK book = new BOOK("C3 Programming",5);

        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to borrow books?");
        if (confirm == 0){
            if (book.getAvaliblebook() != 0){
                System.out.println("Borrowed 1 book,available" + book.getTotalBook() + " books.");
            }
            else {
                JOptionPane.showMessageDialog(null,"No books available to borrow...","Warning Message",JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"END PROGRAM");
        }
    }
}
