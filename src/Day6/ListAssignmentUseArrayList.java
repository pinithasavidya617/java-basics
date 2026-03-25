package Day6;

import java.util.ArrayList;

public class ListAssignmentUseArrayList {

    public static void main(String[] args) {

        int[] array = {4,7,8,10,40,20};

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        //line by line data add

//        for(int i = 0; i < array.length; i ++){
//            arrayList.add(array[i]);
//        }
//        without type line by line method

        System.out.println(arrayList); //print array data list

        int summation = sum(arrayList);
        System.out.println(summation);


    }

    public static int sum(ArrayList<Integer> array){

        int sum = 0 ;

        for(int i =0 ; i < array.size(); i ++){
            sum += array.get(i);
        }
        return sum;
    }
}