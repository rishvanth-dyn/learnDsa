package learning;

public class findDuplicate {
    public static void main(String[] args){
        int[] nums ={1,3,4,2,2};
        System.out.println(findduplicate(nums));
    }
    public static int findduplicate(int[] nums) {
        int i =0;
        while(i<nums.length)
        {
            if(nums[i] != nums[nums[i]-1])
                swap(nums, i, nums[i]-1);
            else
                i++;
        }
        return nums[nums.length-1];
    }
    public static void swap(int[] nums, int first, int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second] =temp;
    }
}
