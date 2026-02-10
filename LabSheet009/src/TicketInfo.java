import javax.swing.*;

public class TicketInfo {
    public String select_showtime(Movie movie){
        String showtime = JOptionPane.showInputDialog(null,"Titanic (PG-13 120 mins)"
                +"\nPress 1 to select show time = 13:00"
                +"\nPress 2 to select show time = 14:30"
                +"\nPress 3 to select show time = 15:00"
                +"\nEnter a number:");
        if (showtime.equals("1")){
            return "13.00";
        }
        else if(showtime.equals("2")){
            return "14.30";
        }
        else if(showtime.equals("3")){
            return "15.00";
        }
        return "Error time";
    }

    public String select_seat_number(){
        String row_seat = JOptionPane.showInputDialog(null,"Select seat row[A-G]:");
        String number_seat = JOptionPane.showInputDialog(null,"select seat number [1-12]:");

        return row_seat.toUpperCase() + number_seat;
    }

    public void main() {
        Movie movie = new Movie("Titanic",120,"PG-13");
        String show_time = select_showtime(movie);
        String seat_number = select_seat_number();

        Ticket ticket = new Ticket("T001",movie,show_time,seat_number,240);
        JOptionPane.showMessageDialog(null,ticket.toString());

    }

}
