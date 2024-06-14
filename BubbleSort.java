package learning;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {4,5,6,2,1,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void bubbleSort(int[] arr){
       for(int i =0;i < arr.length-1;i++){
           for(int j=1;j < arr.length-i;j++){
               if(arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] =arr[j-1];
                   arr[j-1]=temp;
               }
           }
       }
    }
}
