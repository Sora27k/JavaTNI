import javax.swing.JOptionPane;

public class TicketUsed {
    public static String show_movie_list(Ticket... tickets) {
        String list = "";
        for (Ticket t : tickets) {
            list += t.getTicket_id() + ": " + t.getMovie().toString() + "\n";
        }
        return list;
    }


    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[]{
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };


        int confirm = JOptionPane.showConfirmDialog(null,
                "Do you want to book or use a ticket?", "Ticket",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            while (true) {
                String id = JOptionPane.showInputDialog(null,
                        show_movie_list(tickets) + "\nEnter a ticket id for booking:");

                if (id == null) break;

                boolean found = false;
                for (Ticket t : tickets) {
                    if (t.getTicket_id().equalsIgnoreCase(id)) {
                        found = true;
                        String listmenu = JOptionPane.showInputDialog(null,
                                "Movie: " + t.getMovie().getTitle() +
                                        "\nPress 1 to book a ticket" +
                                        "\nPress 2 to use ticket" +
                                        "\nPress 3 to see a ticket info");

                        if (listmenu == null) break;

                        if (listmenu.equals("1")) {
                            JOptionPane.showMessageDialog(null, t.bookTicket() + "\n" + t.toString());
                        } else if (listmenu.equals("2")) {
                            JOptionPane.showMessageDialog(null, t.useTicket() + "\n" + t.toString());
                        } else if (listmenu.equals("3")) {
                            JOptionPane.showMessageDialog(null, t.toString());
                        }
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Ticket ID not found!");
                }
                confirm = JOptionPane.showConfirmDialog(null,
                        "Do you want to book or use other tickets?",
                        "Ticket System",
                        JOptionPane.YES_NO_OPTION);

                if (confirm != JOptionPane.YES_OPTION) {
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Thank you!!!");
    }
}