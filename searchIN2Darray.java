package learning;

import java.util.Arrays;

public class searchIN2Darray {
        public static void main(String[] args){
            int arr[][] ={  {1,2,4},
                            {15,13,16,11,16,79},
                            {12,20,14}};
            int target=14;
            int[] answer=search(arr,target);
            System.out.println(Arrays.toString(answer));
    }
        static int[] search(int[][] arr, int target){
            for(int i=0;i<arr.length;i++){
                for (int j=0;j<arr[i].length;j++){
                    if(arr[i][j]==target){
                        return new int[]{i,j};
                    }
                }
            }return new int[]{-1,-1};
        }
}
