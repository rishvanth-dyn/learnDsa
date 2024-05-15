package learing;

public class floor {
        public static void main(String[] args){
            int[] arr={1,2,3,4,5,8,9,11,13,18,23};
            int target=10;
            int answer= findFloor(arr,target);
            System.out.print(answer);
        }
        //Returns the Index of greatest number <= target
        static int findFloor(int[] arr, int target){
            int start=0;
            int end=arr.length-1;

            while(start <= end){

                int mid = start + (end - start)/ 2;

                if(target < arr[mid]){
                    end=mid -1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            return end;
        }
    }

