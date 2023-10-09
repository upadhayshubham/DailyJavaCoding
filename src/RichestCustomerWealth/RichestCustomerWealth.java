package RichestCustomerWealth;

public class RichestCustomerWealth {

    public int whoIsTheRichest(int[][] accounts) {
        int maxWealthSoFar = 0;
        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;
            for (int bank : customer) {
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{1,5},{7,3}, {3,5}};
        RichestCustomerWealth customerWealth = new RichestCustomerWealth();
        int res =  customerWealth.whoIsTheRichest(input);
        System.out.printf("Max Wealth = "+res);
    }
}
