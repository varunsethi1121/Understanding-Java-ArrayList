package ARRAYLIST;
import java.util.*;
public class arrayListContainerWithMostWater {
    public static void main(String args[]){
        ArrayList<Integer> heightArrayList = new ArrayList<>();
        heightArrayList.add(1);
        heightArrayList.add(8);
        heightArrayList.add(6);
        heightArrayList.add(2);
        heightArrayList.add(5);
        heightArrayList.add(4);
        heightArrayList.add(8);
        heightArrayList.add(3);
        heightArrayList.add(7);
        int maximumWater = 0;
        for(int i=0;i<heightArrayList.size();i++){
            for(int j=i+1;j<heightArrayList.size();j++){
                int currentWater = Math.min(heightArrayList.get(i), heightArrayList.get(j)) * (j-i);
                maximumWater = Math.max(currentWater , maximumWater);
            }
        }
        System.out.print("Maximum water that can be stored is: " + maximumWater);
    }
}
