package Arrays;

// DP problem series - 6 problem on DP on Stocks -
// Best time to buy and sell stock

// array = [7, 1, 5, 3, 6, 4] --- // n = 6
// Maximize the profit by buying and selling the stock at most once

// Approach 1: If your are buying on X day, you'll buy on minimum price day from
// 0 to X-1
// Approach 2: If you are selling on X day, you'll sell on maximum price day
// from X to n-1

class besttime_to_buyStock {

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;

        // Explore all possible ways to buy and sell stock
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 10, 1, 3, 6, 9, 2 };
        System.out.println(maxProfit(prices));
    }
}