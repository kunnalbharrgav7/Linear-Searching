package DSA;

public class LinearSearchMinimum {
    public static void main(String[] args) {
        int[] arr = {25,30,35,24,2,68,75,56};
        System.out.println(Minimum(arr));
    }

    public static int Minimum(int arr[]) {
        int result = arr[0];
        for(int index = 0; index < arr.length; index++){
            if(arr[index] < result){
            result = arr[index];
            }    
        }
        return result;
    }
}
