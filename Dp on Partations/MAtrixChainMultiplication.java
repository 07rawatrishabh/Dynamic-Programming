/*Recurrsion 
public class MAtrixChainMultiplication {

    public static int f(int a[],int i,int j){
        if(i==j){
            return 0;
        }
        int m=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int x=a[i]*a[k]*a[j]+f(a,i,k)+f(a,k+1,j);
            m=Math.min(x,m);
        }
        return m;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println(f(a,1,a.length-1));
    }
}
*/


/*Tabulation
 import java.util.Arrays;

public class  LongestBitonicSubsequence  {

    public static int f(int a[],int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int m=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int x=a[i]*a[k]*a[j]+f(a,i,k,dp)+f(a,k+1,j,dp);
            m=Math.min(x,m);
        }
        return dp[i][j]=m;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int dp[][]=new int[a.length][a.length];
        for(int c[]:dp){
            Arrays.fill(c,-1);
        }
        System.out.println(f(a,1,a.length-1,dp));
    }
}

 */



 