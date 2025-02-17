package ARRAYLIST;
import java.util.ArrayList;
public class arrayListBasicOperation {
    public static void main(String args[]){
        ArrayList<Integer> arrayListSample = new ArrayList<>();
        arrayListSample.add(10);
        arrayListSample.add(20);
        arrayListSample.add(30);
        arrayListSample.add(3,40);
        arrayListSample.add(4,50);
        System.out.println(arrayListSample);
        System.out.println(arrayListSample.get(3));
        System.out.println(arrayListSample.remove(4));
        System.out.println(arrayListSample.contains(50));
        System.out.println(arrayListSample);
    }
}
