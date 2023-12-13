


/*Recursion 
public class Griduniquepaths {
    public static int f(int a[][],int i,int j ){
    if(i==0&&j==0){
        return 1;
    }
    else if(i<0||j<0){
        return 0;
    }
    else{
        return (f(a,i-1,j)+f(a,i,j-1));
    }
    }
    public static void main(String[] args) {
        int a[][]={{0,0},{0,0}};
        System.out.println(f(a,a.length-1,a[0].length-1));
    }
}
*/

/*Memoization 
public class Griduniquepaths {
    public static int f(int a[][],int i,int j ,int dp[][]){
    if(i==0&&j==0){
        return 1;
    }
    else if(i<0||j<0){
        return 0;
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    else{
         return dp[i][j]=(f(a,i-1,j,dp)+f(a,i,j-1,dp));
    }
    }
    public static void main(String[] args) {
        int a[][]={{0,0,0},{0,0,0},{0,0,0}};
        int dp[][]=new int[a.length][a[0].length];
        for(int ag[]:dp){
            Arrays.fill(ag,-1);
        }
        System.out.println(f(a,a.length-1,a[0].length-1,dp));
    }
}
*/

/*Tabulation 
public class Griduniquepaths {
    public static void main(String[] args) {
        int a[][]={{0,0,0},{0,0,0},{0,0,0}};
        int dp[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            dp[i][0]=1;
        }
         for(int i=0;i<a[0].length;i++){
            dp[0][i]=1;
        }

        for(int k=1;k<a.length;k++){
            for(int j=1;j<a[0].length;j++){
                
                int u= ((k-1))>=0?dp[k-1][j]:0;
                int l=  ((j-1)>=0)?dp[k][j-1]:0;
                //dp[k][j]=(dp[k-1][j]+dp[k][j-1]);
                dp[k][j]=u+l;
            }
        }
        System.out.println(dp[2][2]);
    }
}
*/

/*SpaceOptimization 
public class Griduniquepaths {
    public static void main(String[] args) {
        int a[][]={{0,0,0},{0,0,0},{0,0,0}};
        int dp[]=new int[a[0].length];
        for(int i=0;i<dp.length;i++){
            dp[i]=1;
        }

        for(int k=1;k<a.length;k++){
            for(int j=1;j<a[0].length;j++){
                 dp[j]= dp[j]+dp[j-1];
            }
        }
        System.out.println(dp[2]);
    }
}
*/