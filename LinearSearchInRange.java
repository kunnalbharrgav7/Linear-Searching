package DSA;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {15,4,78,2,6,89,33,57};
        int target = 89;
        int result = InRange(arr, target, 2, 6);
        System.out.println(result);
        // System.out.println(InRange(arr, target, 2, 6));
    }


    public static int InRange(int arr[] , int target , int start , int end){
        if (arr.length == 0) {
            return -1;
        }
        for(int index = start ; index <= end ; index++){
            if(arr[index] == target)
            return index;
        }
        return -1;
    }
    
}
