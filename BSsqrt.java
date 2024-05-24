package learing;

public class BSsqrt {
    public static void main(String[] args){
        int x = 4;
        System.out.println(mySqrt(x));
    }
        public static int mySqrt(int x) {
            int start =2;
            int end =x/2;
            if(x<2){
                return x;
            }
            while(start<=end){
                int mid = start + (end -start)/2;
                if(mid*mid == x){
                    return mid;
                }
                else if((long)mid*mid >x){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }return end;
        }
    }
