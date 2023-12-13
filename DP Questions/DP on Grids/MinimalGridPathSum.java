

/*Recursion 
public class MinimalGridPathSum {
    public static int f(int a[][],int i,int j ){
        if(i==0&&j==0){
            return a[0][0];
        }
        else if(i<0||j<0){
            return (Integer.MAX_VALUE-10000);
        }
        else{
            return Math.min((a[i][j]+f(a,i-1,j)),(a[i][j]+f(a,i,j-1)));
        }
        }
    
    public static void main(String[] args) {
        int a[][]={{5,9,6},{11,5,2}};
        System.out.println(f(a,a.length-1,a[0].length-1));
    }
}
*/

/*Memoization 
public class MinimalGridPathSum {
    public static int f(int a[][],int i,int j,int dp[][] ){
        if(i==0&&j==0){
            return a[0][0];
        }
        else if(i<0||j<0){
            return (Integer.MAX_VALUE-10000);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            return dp[i][j] =Math.min((a[i][j]+f(a,i-1,j,dp)),(a[i][j]+f(a,i,j-1,dp)));
        }
        }
    
    public static void main(String[] args) {
        int a[][]={{5,9,6},{11,5,2}};
        int dp[][]=new int[a.length][a[0].length];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        System.out.println(f(a,a.length-1,a[0].length-1,dp));
    }
}
*/

/*Tabulation 
public class MinimalGridPathSum {
    
    public static void main(String[] args) {
        int a[][]={{5,9,6},{11,5,2}};
        int dp[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==0&&j==0){ 
                    dp[i][j]=a[0][0]; 
                    continue;}
                int l= (j-1)>=0?a[i][j]+dp[i][j-1]:a[i][j]+(Integer.MAX_VALUE/2);
                int u= (i-1)>=0?a[i][j]+dp[i-1][j]:a[i][j]+(Integer.MAX_VALUE/2);
                dp[i][j]=Math.min(l,u);
            }
        }
        System.out.println(dp[a.length-1][a[0].length-1]);
    }
}
*/

/*SpaceOptimization 
public class MinimalGridPathSum {
    
    public static void main(String[] args) {
        int a[][]={{5,9,6},{11,5,2}};
        int dp[]=new int [a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==0&&j==0){ 
                    dp[j]=a[0][0]; 
                    continue;}
                int l= (j-1)>=0?a[i][j]+dp[j-1]:a[i][j]+(Integer.MAX_VALUE/2);
                int u= (i-1)>=0?a[i][j]+dp[j]:a[i][j]+(Integer.MAX_VALUE/2);
                dp[j]=Math.min(l,u);
            }
        }
        System.out.println(dp[a[0].length-1]);
    }
}
*/