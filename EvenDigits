package learning;		

public class EvenDigits {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println("The number of Even digits present in an array  " +findnumbers(nums));
        }
       public static int findnumbers(int[] nums) {
           int count = 0;

           for (int num : nums) {
               if(even(num)) {
                   count++;
               }

           } return count;
       }
    public static boolean even(int num){
        int numberOfDigits =finddigits(num);
        if(numberOfDigits % 2==0){
            return true;
        }return false;

    }
    public static int finddigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;

            num = num / 10;

        }
        return count;
    }
}
