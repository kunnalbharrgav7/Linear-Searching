package DSA;

public class LinearSearchMaximum {
    public static void main(String[] args) {
        int[] arr = {20,71,8,64,119,33};
        System.out.println(Maximum(arr));
    }

    public static int Maximum(int[] arr ){
        // if (arr.length == 0) {
        //     return -1;
        // }
        int maximum = arr[0];
        for(int index = 0; index < arr.length; index++){
            if (arr[index] > maximum) {
                maximum = arr[index];
            }
        }
        return maximum;
    }
}
