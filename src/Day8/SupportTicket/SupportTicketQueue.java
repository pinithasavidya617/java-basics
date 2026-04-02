package Day8.SupportTicket;

import java.util.PriorityQueue;
import java.util.Scanner;


public class SupportTicketQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<SupportTicket> tickets = new PriorityQueue<>();

        while (true) {

            System.out.println("Dialog Priority Queue");

            System.out.println("Press 1 to Add a customer");
            System.out.println("Press 2 to get Highest priority customer");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":

                    System.out.println("User Pressed 1");

                    System.out.println("Enter your ticket id : ");
                    int ticketId = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter your name : ");
                    String customerName = sc.nextLine();

                    System.out.println("Enter your issue : ");
                    String customerIssue = sc.nextLine();

                    System.out.println("Enter your priority : ");
                    int priority = Integer.parseInt(sc.nextLine());


                    SupportTicket customer = new SupportTicket(ticketId ,customerName ,customerIssue , priority);
                    tickets.offer(customer);

                    break;


                case "2":

                    SupportTicket higherPriorityIssue = tickets.poll();

                    if (higherPriorityIssue != null) {
                        System.out.println("Customer Name - " + higherPriorityIssue.customerName + "Points - " + higherPriorityIssue.ticketId);
                    }else {
                        System.out.println("No Customer in queue");
                    }
            }
        }
    }
}