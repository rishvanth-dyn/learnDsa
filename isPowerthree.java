package learning;

public class isPowerthree {
    public static void main(String[] args){
        int n =27;
        System.out.println(ispower(n));
    }
    public static boolean ispower(int n){
        if(n<=0){
            return false;
        }
        if(n==1) {
            return true;
        }
        if(n % 3 != 0){
            return false;
        }
        return ispower(n/3);
    }
}
