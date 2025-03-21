package Recursion;
//Find if an array is sorted or not
public class SortedArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 6, 4, 5};
        System.out.println(sorted(arr, 0));
    }
    static boolean sorted(int[] arr,int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
