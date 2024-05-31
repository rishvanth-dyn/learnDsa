package kunalK;

public class buyTwoChocolate {
    public static void main(String[] args){
        int[] prices ={3,2,3};
        int money=3;
        System.out.println(buyChoco(prices,money));
    }
    public static int buyChoco(int[] prices, int money) {
        int ans = Integer.MAX_VALUE;
        int moneyLeft;
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                if (i != j) {
                    int sum = prices[i] + prices[j];
                    ans = Math.min(ans, sum);
                }
            }
        }

        moneyLeft = money - ans;
        if (moneyLeft >= 0) {
            return moneyLeft;
        } else {
            return money;
        }
    }
}
