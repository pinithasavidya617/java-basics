package Day9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class fuelPassQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<String> fuelQueue = new ArrayDeque<>();

        while (true) {

            System.out.println("Fuel Queue");

            System.out.println("Press 1 to Add a Vehicle");
            System.out.println("Press 2 to add Vehicle to the start of the queue");
            System.out.println("Press 3 to View Vehicle");

            String choice = sc.nextLine();
            String vehicleNum;

            switch (choice) {
                case "1":

                    System.out.println("Enter vehicle number : ");
                    vehicleNum = sc.next();
                    fuelQueue.offer(vehicleNum);

                    break;

                case "2":

                    System.out.println("Enter vehicle number : ");
                    vehicleNum = sc.next();
                    fuelQueue.offerFirst(vehicleNum);
                    break;

                case "3":

                    System.out.println(fuelQueue);
            }
        }
    }
}