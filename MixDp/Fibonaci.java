


/* recurrsion
public class Fibonaci {
    public static int f(int n){
        if(n<=1){
            return n;
        }
        else{
            return f(n-1)+f(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(f(5));
    }
}*/


/* Memoization
public class Fibonaci {
    public static int f(int n,int dp[]){
        if(n<=1){
            return n;
        }
        else if(dp[n]!=-1){
            return dp[n];
        }
        else{
            return dp[n]=f(n-1,dp)+f(n-2,dp);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(5,dp));
    }
}
*/


/* tabulation
public class Fibonaci {
    
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n ]);
    }
}
*/


/*space optimization 
public class Fibonaci {
   
    public static void main(String[] args) {
        int n=7;

        int pre2=0;
        int pre1=1;
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=pre2+pre1;
            pre2=pre1;
            pre1=curr;
        }
        System.out.println(pre1);
    }
}
*/