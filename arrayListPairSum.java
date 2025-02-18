package ARRAYLIST;

import java.util.*;
//GIVEN ARRAY LIST WILL BE SORTED INITIALLY
public class arrayListPairSum {
    public static void main(String args[]) {
        ArrayList<Integer> sampleArrayList = new ArrayList<>();
        sampleArrayList.add(10);
        sampleArrayList.add(20);
        sampleArrayList.add(30);
        sampleArrayList.add(40);
        sampleArrayList.add(50);
        sampleArrayList.add(60);

        int target1 = 140;
        int leftPointer = 0;
        int rightPointer = sampleArrayList.size() - 1;
        boolean pairFound = false;

        while (leftPointer < rightPointer) {
            if (sampleArrayList.get(leftPointer) + sampleArrayList.get(rightPointer) == target1) {
                System.out.println("FOUND: Pair is (" + sampleArrayList.get(leftPointer) + ", " + sampleArrayList.get(rightPointer) + ")");
                pairFound = true;
                break;
            } else if (sampleArrayList.get(leftPointer) + sampleArrayList.get(rightPointer) > target1) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }

        if (!pairFound) {
            System.out.println("NOT FOUND: No pair sums up to " + target1);
        }
    }
}