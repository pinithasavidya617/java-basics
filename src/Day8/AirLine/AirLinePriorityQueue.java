package Day8.AirLine;

import java.util.PriorityQueue;
import java.util.Scanner;



public class AirLinePriorityQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<AirLinePassenger> passengers = new PriorityQueue<>();

        while (true) {

            System.out.println("Sri Lanka Air Line Priority Queue");

            System.out.println("Press 1 to Add a passenger");
            System.out.println("Press 2 to get Highest priority passenger");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("User Pressed 1");

                    System.out.println("Enter your name : ");
                    String name = sc.nextLine();

                    System.out.println("Enter your points : ");
                    int points = Integer.parseInt(sc.nextLine());


                    AirLinePassenger passenger = new AirLinePassenger(name , points);
                    passengers.offer(passenger);

                    break;


                case "2":

                    AirLinePassenger higherPriorityPassenger = passengers.poll();

                    if (higherPriorityPassenger != null) {
                        System.out.println("passenger Name - " + higherPriorityPassenger.name + "Points - " + higherPriorityPassenger.loyaltyPoints);
                    }else {
                        System.out.println("No passenger in queue");
                    }
            }
        }

    }
}