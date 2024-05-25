package learing;

public class Capacity{
    public static void main(String[] args){
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(weights,days));

    }
    public static int shipWithinDays(int[] weights, int days) {

        int start=0;
        int end=0;
        for(int n: weights)
        {
            if(n>start)
                start=n;
            end+=n;
        }
        while(start<end)
        {
            int mid = start + (end - start)/2;
            int sum=0;
            int peice=1;
            for(int m : weights)
            {
                if(sum+m > mid)
                {
                    sum=m;
                    peice++;
                } else {
                    sum+=m;
                }
            }
            if(peice <= days) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
}
