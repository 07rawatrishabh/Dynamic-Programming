
/*Tabulation
public class NumberOfSquareMatricesWithAllOnes {
    public static void main(String[] args) {
           int m[][]={{1,0,0,1},{0,1,0,1},{1,1,0,1}};
            int dp[][]=new int[m.length][m[0].length]; 
            int sum=0;
            for(int i=0;i<m.length;i++){
                dp[i][0]=m[i][0];
                sum+=m[i][0];
            }
             for(int i=1;i<m[0].length;i++){
                dp[0][i]=m[0][i];
                sum+=m[0][i];
            }
            for(int i=1;i<m.length;i++){
                for(int j=1;j<m[0].length;j++){
                    if(m[i][j]==0){
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                        sum+=dp[i][j];
                    }
                }
            }
            System.out.println(sum);;
         }
    }
*/



/*SpaceOption
public class NumberOfSquareMatricesWithAllOnes {
    public static void main(String[] args) {
 int m[][]={{1,0,0,1},{0,1,0,1},{1,1,0,1}};
 int pre[]=new int[m[0].length]; 
     //  int curr[]=new int[m[0].length]; 
        int sum=0;
       
        for(int i=0;i<m[0].length;i++){
           pre[i]=m[0][i];
           sum+=pre[i];
       }
       for(int i=1;i<m.length;i++){
          int curr[]=new int[m[0].length]; 
          curr[0]=m[i][0];
          sum+=curr[0];
           for(int j=1;j<m[0].length;j++){
               if(m[i][j]==0){
                   curr[j]=0;
               }
               else{
                   curr[j]=Math.min(pre[j-1],Math.min(pre[j],curr[j-1]))+1;
                   sum+=curr[j];
               }
           }
           pre=curr;
       }
    
       return sum;
    }
}
 */

