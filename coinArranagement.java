package learning;
public class coinArranagement {
    public static void main(String[] args){
        int n = 8;
        System.out.println(arrangeCoins(n));
        }
        public static int arrangeCoins(int n) {
            long start = 0;
            long end = n;
            while(start <=end){
                long mid =start +(end - start)/2;
                long ans =mid*(mid +1)/2;
                if(ans<n){
                    start =mid+1;
                }
                else if(ans>n){
                    end = mid -1;
                }
                else{
                    return (int)mid;
                }
            }
            return (int)end;
        }
    }
