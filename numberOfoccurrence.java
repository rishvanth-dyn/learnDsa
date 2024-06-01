package learning;											@Rishvanth M

public class numberOfoccurrence {						
    public static void main(String[] args){
        int[] arr ={1, 1, 1, 2, 2, 3, 3};
        int n=7;
        int x=3;
        System.out.println(count(arr,n,x));
    }
        public static int count(int[] arr, int n, int x) {
            int start=search(arr,x,true);
            int end=search(arr,x,false);
            if(start==0 && end==0){
                return 0;
            }
            return end-start+1;

        }
        public static int search(int[] arr,int target,boolean firstElement){
            int start=0;
            int end=arr.length-1;
            int ans=0;

            while(start<=end){

                int mid=(start+end)/2;

                if(arr[mid]<target){
                    start=mid+1;
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    ans=mid;
                    if(firstElement){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
    }
