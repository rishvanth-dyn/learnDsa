package learning; 						@Rishvanth M

public class palindrome {
    public static void main(String args[]){
        String str = "abba";
        System.out.println(ispalindrome(str));
    }
    public static boolean ispalindrome(String str){
        if(str == null || str.length() ==0 ){
            str = str.toLowerCase();
            for (int i =0;i<str.length() -1/2;i++){
                char start = str.charAt(i);
                char end =  str.charAt(str.length() -1 -i);
                if(start != end){
                    return false;
                }
            }
        }
      return true
    }
}
