package SEARCHING.linearSearch;

public class wealthQuestion {
    public static void main(String[] args) {
        int [][] arr= {
            {1,2,3},{1,2,2},{3,3,3}
        };
        int ans = maxWealth(arr);
        System.out.println(ans);
        
    }   
    static int maxWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int[] row : arr){
            int sum = 0;
            for(int col : row){
                sum+=col;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
