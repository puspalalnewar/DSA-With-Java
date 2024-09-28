public class maxProfit2 {

    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                count += profit;
                buyPrice = prices[i];
            } else {
                buyPrice = prices[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /*
         * Input: prices = [7,1,5,3,6,4]
         * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit =
         * 5-1 = 4.
         * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 =
         * 3.
         * Total profit is 4 + 3 = 7.
         * Output: 7
         */

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));

    }
}
