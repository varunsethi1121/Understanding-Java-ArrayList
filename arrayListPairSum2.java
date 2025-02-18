package ARRAYLIST;

import java.util.ArrayList;
//GIVEN ARRAY LIST WILL BE SORTED AND ROTATED AROUND PIVOT
public class arrayListPairSum2 {
    public static void main(String args[]) {
        ArrayList<Integer> sampleArrayList = new ArrayList<>();
        sampleArrayList.add(6);
        sampleArrayList.add(8);
        sampleArrayList.add(9);
        sampleArrayList.add(10);
        sampleArrayList.add(11);
        sampleArrayList.add(15);

        int pivotPoint = -1;
        for(int i=0;i<sampleArrayList.size();i++){
            if(sampleArrayList.get(i) > sampleArrayList.get(i+1)){
                pivotPoint = i;
                break;
            }
        }
        int leftPointer = pivotPoint+1;
        int rightPointer = pivotPoint;
        boolean result = false;
        int target = 16;
        // int target1 = 140;
        while(leftPointer < rightPointer){
            if(sampleArrayList.get(leftPointer) + sampleArrayList.get(rightPointer) == target){
                System.out.print("FOUND");
                result = true;
                break;
            }else if(sampleArrayList.get(leftPointer) + sampleArrayList.get(rightPointer) < target){
                leftPointer = (leftPointer+1) % sampleArrayList.size();
            }else{
                rightPointer = (sampleArrayList.size()+rightPointer-1) % sampleArrayList.size();
            }
        }
        if(!result){
            System.out.print("NOT FOUND");
        }
    }
}
