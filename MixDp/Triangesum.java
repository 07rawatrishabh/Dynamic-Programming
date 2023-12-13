

/*Recursion 
public class Triangesum {
    public static int f(int a[][],int r,int c){
        if(r==a.length-1){
            return a[r][c];
        }
        int down =a[r][c]+f(a,r+1,c);
        int digonal=a[r][c]+f(a,r+1,c+1);
        return Math.min(down, digonal);
    }
    public static void main(String[] args) {
        int a[][]={{1,0,0,0},{2,3,0,0},{4,5,6,0},{7,8,9,10}};
        System.out.println(f(a,0,0));
    }
}
*/

/*Memoization 
public class Triangesum {
    public static int f(int a[][],int r,int c,int dp[][]){
        if(r==a.length-1){
            return a[r][c];
        }
         if(dp[r][c]!=-1){
            return dp[r][c];
        }
       
        int down =a[r][c]+f(a,r+1,c,dp);
        int digonal=a[r][c]+f(a,r+1,c+1,dp);
        return dp[r][c]=Math.min(down, digonal);
    }
    public static void main(String[] args) {
        int a[][]={{1,0,0,0,0},{2,3,0,0,0},{4,5,6,0,0},{7,8,9,10,0},{11,12,13,14,15}};
        int dp[][]=new int[a.length][a[0].length];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        System.out.println(f(a,0,0,dp));
    }
}
*/

/*Tabulation 
public class Triangesum {
   
    public static void main(String[] args) {
        int a[][]={{1,0,0,0,0},{2,3,0,0,0},{4,5,6,0,0},{7,8,9,10,0},{11,12,13,14,15}};
        int dp[][]=new int[a.length][a[0].length];
        
        for(int i=0;i<a[0].length;i++){
            dp[a.length-1][i]=a[a.length-1][i];
        }
        for(int i=a.length-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                dp[i][j]=Math.min(a[i][j]+dp[i+1][j],a[i][j]+dp[i+1][j+1]);
            }
        }
        System.out.println(dp[0][0]);
    }
} */

/*SpaceOPtimization 
public class Triangesum {
   
    public static void main(String[] args) {
        int a[][]={{1,0,0,0,0},{2,1,0,0,0},{4,5,14,0,0},{7,8,1,11,0},{11,12,13,14,1}};
        int nx[]=new int[a[0].length];
        int curr[]=new int[a[0].length];
        for(int i=0;i<a[0].length;i++){
            nx[i]=a[a.length-1][i];
        }
        for(int i=a.length-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                curr[j]=Math.min(a[i][j]+nx[j],a[i][j]+nx[j+1]);
            }
            nx=curr;
        }
        System.out.println(curr[0]);
    }
} 
*/