package _100DaysOfCoding_;

import java.util.Arrays;

public class countSortA {
    public static void countsort(int[] arr) {
        if(arr == null || arr.length <=1){
            return;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
            int[] count = new int[max + 1];
            for (int nuum : arr) {
                count[nuum]++;
            }
            int index = 0;
            for (int i = 0; i <= max; i++) {
                while (count[i] > 0) {
                    arr[index] = i;
                    index++;
                    count[i]--;
                }
            }

        }
    public  static void main(String[] args){
        int[] arr = {6,3,10,9,2};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
