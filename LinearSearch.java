package DSA;

// import java.util.*;

// @SuppressWarnings("unused")
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {24,5,97,25,67,84,133,3,91,77,179};
        int target = 91;
        // System.out.println(Search(arr ,target));
        int result = Search(arr, target);
        System.out.println(target + " is found at : " + result + "th Index");
    }    

    public static int Search(int[] arr , int target) {
        if(arr.length == 0){
            return -1;
        }

        for( int index = 0; index < arr.length; index++) {
            int element = arr[index]; 
            if(element == target) {
                return index;
            }
            /*if(arr[index] == target) {
                return index;
            }*/
        }
        return -1;
    }
}