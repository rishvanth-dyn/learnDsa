package learing;				
public class findNthRoot {
    public static void main(String[] args){
        int n =3;
        int m =27;
        System.out.println(NthRoot(n,m));
    }
    public static int NthRoot(int n, int m) {
        int start=1;
        int end=m;

        while(start<=end){

            int mid=(start+end)/2;

            if(Math.pow(mid,n)==m){
                return mid;
            }
            else if(Math.pow(mid,n)<m){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
