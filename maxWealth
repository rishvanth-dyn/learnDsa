package learning;						

public class maxWealth {
    public static void main(String[] args){
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){

        int answer=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            if(sum>answer){
                answer=sum;
        }

        }return answer;
    }
}
