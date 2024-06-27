package learning;

public class numberOfsteps {
    public static void main(String[] args){
        int num = 8;
        int count =0;
        System.out.println(NumberOfSteps(num,count));

    }
    public static int NumberOfSteps(int num,int count) {
        if(num == 0){
            return count;
        }
        return (num%2==0)?NumberOfSteps(num/2,count+1):NumberOfSteps(num-1,count+1);
    }
}
