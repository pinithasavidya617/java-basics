package Day9.HashMapImplementations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AttendanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map < String, Student > studentMap = new HashMap<>();

        // student add without terminal using
        studentMap.put("1" , new Student("kamal"));
        studentMap.put("2" , new Student("ajith"));
        studentMap.put("3" , new Student("anura"));

        studentMap.get("1").attendance.add(true);
        studentMap.get("1").attendance.add(true);
        studentMap.get("1").attendance.add(true);
        studentMap.get("1").attendance.add(false);

        studentMap.get("2").attendance.add(true);
        studentMap.get("2").attendance.add(false);

        while (true) {

            System.out.println("Student attendance system");

            System.out.println("Press 1 to Add Student");
            System.out.println("Press 2 to mark Attendance");
            System.out.println("Press 3 to get Attendance");
            System.out.println("Press 4 to get 2 more days absent student");

            String choice = sc.nextLine();

            switch (choice) {

                case "1":

                    System.out.println("Enter Student ID : ");
                    String studentID = sc.next();

                    if (studentMap.containsKey(studentID)) {
                        System.out.println("Student is already registered - ID " + studentID);

                    } else {
                        System.out.println("Enter student name : ");
                        String name = sc.next();
                        studentMap.put(studentID, new Student(name));    // create student using Student object

                    }
                    break;

                case "2":
                    System.out.println("Marking attendance for th day..... ");
                    for (Map.Entry<String , Student> entry : studentMap.entrySet()){

                        System.out.println(" " + entry.getKey() + " " + "is Present y/n ");
                        boolean isPresent = sc.next().equals("y");
                        entry.getValue().attendance.add(isPresent);

                    }
                    break;

                case "3":

                    System.out.println("Get student attendance in ID : ");
                    String stID = sc.next();
                    Student s =studentMap.get(stID);

                    if (s != null) {
                        for (boolean attendance : s.attendance) {

                            if (attendance) {
                                System.out.println("present");

                            }else {
                                System.out.println("absent");
                            }
                        }
                    }else {
                        System.out.println("Student id not found");
                    }
                    break;

                case "4":

                    System.out.println("Student follow up !");

                    for (Student std : studentMap.values()) {
                        int count = 0;

                        for (boolean atd : std.attendance) {
                            if ( ! atd) {
                                count ++ ;
                            }
                        }
                        if (count > 2) {
                            System.out.println("please follow up on - " + std.name);
                        }
                    }
                    break;
            }
        }
    }
}