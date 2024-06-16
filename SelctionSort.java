package learning;

import java.util.Arrays;

public class SelctionSort {
    public static void main(String[] args) {
        int[] arr={4,5,6,2,1,3};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int max = getMax(arr,0, end);
            swap(arr, max, end);
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMax(int[] arr,int start,int end) {
        int max = start;
        for (int i=0;i<=end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }return max;
    }
}
