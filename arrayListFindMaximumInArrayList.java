package ARRAYLIST;
import java.util.*;
public class arrayListFindMaximumInArrayList {
    public static void main(String args[]){
        ArrayList<Integer> arrayListSample = new ArrayList<>();
        arrayListSample.add(10);
        arrayListSample.add(20);
        arrayListSample.add(300);
        arrayListSample.add(40);
        arrayListSample.add(50);
        System.out.println("Entered Array List: " + arrayListSample);
        Integer maxInteger = Integer.MIN_VALUE;
        for(int i=0;i<arrayListSample.size();i++){
            if(arrayListSample.get(i) > maxInteger){
                maxInteger = arrayListSample.get(i);
            }
        }
        System.out.println("Maximum element in the entered Array List is: " + maxInteger);
    }
}
