package Day9.HashMapImplementations;

import java.util.ArrayList;
import java.util.List;


public class Student {

    String name;
    List<Boolean> attendance;

    Student(String name) {
        this.name = name;
        this.attendance = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name + " " + attendance;
    }
}