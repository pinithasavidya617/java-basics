package Day8.SupportTicket;


public class SupportTicket implements Comparable<SupportTicket> {

    int ticketId;
    String customerName;
    String customerIssue;
    int priority;

    SupportTicket (int ticketId, String customerName, String customerIssue, int priority) {

        this.ticketId = ticketId;
        this.customerName = customerName;
        this.customerIssue = customerIssue;
        this.priority = priority;

    }

    @Override
    public int compareTo(SupportTicket o) {
        return Integer.compare(this.priority , o.priority);
    }

    String priorityLabel() {

        return switch (this.priority) {
            case 1 -> "Critical";
            case 2 -> "High";
            case 3 -> "Medium";
            case 4 -> "Low";
            default -> "Unknown";
        };
    }

    @Override
    public String toString() {
        return "support Ticket NO - " + ticketId + " "
                + "Customer Name - " + this.customerName + " "
                + "Customer Priority " + priorityLabel();
    }
}