package learning;

public class firstAndLast {
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] ans = SearchInRange(nums,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] SearchInRange(int[] nums,int target){
        int[] ans={-1,-1};
        ans[0]=Search(nums,target,true);
        ans[1]=Search(nums,target,false);
        return ans;
    }
    public static int Search(int[] nums,int target,boolean findFirstIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start <= end){

            int mid = start + (end - start)/ 2;

            if(target < nums[mid]){
                end=mid -1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }
            else{
                ans = mid;
                if(findFirstIndex){
                    end=mid-1;
                }
                else {
                   start=mid+1;
                }
            }
        }
        return ans;
    }
}
