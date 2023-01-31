class Solution {
    public int tribonacci(int n) {
        int memo[] = new int[n+1];
        if(n==0||n==1)
        {
            return n;
        }
        if(n==2){
            return 1;
        }
        memo[1]=1;
        memo[2]=1;
        for(int i = 3;i<=n;i++)
        {
            memo[i] = memo[i-3]+memo[i-2]+memo[i-1];
        }
        return memo[n];
    }
}
