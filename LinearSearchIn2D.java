package DSA;

import java.util.Arrays;

public class LinearSearchIn2D {
    public static void main(String[] args) {
       int[][] arr = {
        {2,7,64,83},
        {9,45,37,55,26},
        {5,19,73}
       };
       int target = 37;
       int[] result = SearchIn2d(arr, target);
       System.out.println(Arrays.toString(result));
    }

    public static int[] SearchIn2d(int[][] arr, int target){
        if (arr.length == 0 ) {
            return new int[] {-1 , -1};            
        }
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col < arr[row].length; col++)
            if (arr[row][col] == target) {
                return new int[] {row , col};
            }
        }
    return new int[] {-1 , -1};
    } 
}
