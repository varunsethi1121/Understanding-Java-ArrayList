package ARRAYLIST;
import java.util.*;
public class arrayListMultiDimensionalArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> outterList = new ArrayList<>();
        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(10);
        innerList1.add(20);
        innerList1.add(30);
        outterList.add(innerList1);
        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(40);
        innerList2.add(50);
        innerList2.add(60);
        outterList.add(innerList2);
        for(int i=0;i<outterList.size();i++){
            ArrayList<Integer> currentList = outterList.get(i);
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j) + " ");
            }
            System.out.print(" ");
        }

    }
}
