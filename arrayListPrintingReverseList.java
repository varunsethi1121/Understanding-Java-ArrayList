package ARRAYLIST;
import java.util.*;
public class arrayListPrintingReverseList {
    public static void main(String args[]){
        ArrayList<Integer> sample1 = new ArrayList<>();
        sample1.add(10);
        sample1.add(20);
        sample1.add(30);
        sample1.add(40);
        sample1.add(50);
        System.out.println("Printing Array List Originally: " + sample1);
        System.out.print("Printing Array List in Reverse Order: ");
        for(int i=0;i<sample1.size();i++){
            System.out.print(sample1.get(sample1.size()-1-i) + " ");
        }
    }
}
