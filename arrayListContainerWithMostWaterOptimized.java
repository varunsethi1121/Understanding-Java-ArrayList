package ARRAYLIST;
import java.util.*;
public class arrayListContainerWithMostWaterOptimized {
    public static void main(String args[]) {
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

        int maximumWater = maxArea(heightArrayList);
        System.out.print("Maximum water that can be stored is: " + maximumWater);
    }

    public static int maxArea(ArrayList<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int maxArea = 0;

        while (left < right) {
            int currentHeight = Math.min(height.get(left), height.get(right));
            int currentWidth = right - left;
            int currentArea = currentHeight * currentWidth;
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}