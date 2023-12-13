/*Reccursion 
 public class Editdistance {
    public static int f(String s1,String s2,int i,int j){
        if(i<0){
            return j+1;
        }
         if(j<0){
            return i+1;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return f(s1,s2,i-1,j-1);
        }
        else{
            return Math.min(Math.min(1+f(s1,s2,i-1,j),1+f(s1,s2,i,j-1)),1+f(s1,s2,i-1,j-1));
        }
    }
    public static void main(String[] args) {
        String s1="Rishabh";
        String s2="xyzabc";
       System.out.println(f(s1,s2,s1.length()-1,s2.length()-1));

    }
}

*/


/*Memoization
 public class Editdistance {
    public static int f(String s1,String s2,int i,int j,int dp[][]){
        if(i<0){
            return j+1;
        }
         if(j<0){
            return i+1;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=f(s1,s2,i-1,j-1,dp);
        }
        else{
            return dp[i][j]=Math.min(Math.min(1+f(s1,s2,i-1,j,dp),1+f(s1,s2,i,j-1,dp)),1+f(s1,s2,i-1,j-1,dp));
        }
    }
    public static void main(String[] args) {
        String s1="Rishabh";
        String s2="xyzabc";
        int dp[][]=new int[s1.length()][s2.length()];
        System.out.println(f(s1,s2,s1.length()-1,s2.length()-1,dp));

    }
}

 */

 
 /*Tabulation
  public class Editdistance {
    public static void main(String[] args) {
        String s1="Rishabh";
        String s2="Rishi";
        int dp[][]=new int[s1.length()+1][s2.length()+1];
     
        for(int i=0;i<s1.length()+1;i++)
            dp[i][0]=i;
         for(int i=0;i<s2.length()+1;i++)
            dp[0][i]=i;

            for(int i=1;i<s1.length()+1;i++){
                for(int j=1;j<s2.length()+1;j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }
                    else{
                        dp[i][j]=Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+1);
                    }
                }
            }
        System.out.println(dp[s1.length()][s2.length()]);

    }
}

  */


/*SpaceOptimization
 
  public class Editdistance {
    public static void main(String[] args) {
        String s1="Rishabh";
        String s2="xyxabc";
        int pre[]=new int[s2.length()+1];
         for(int i=0;i<s2.length()+1;i++)
            pre[i]=i;

            for(int i=1;i<s1.length()+1;i++){
                int curr[]=new int[s2.length()+1];
                 curr[0]=i;
                for(int j=1;j<s2.length()+1;j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        curr[j]=pre[j-1];
                    }
                    else{
                        curr[j]=Math.min(Math.min(pre[j]+1,curr[j-1]+1),pre[j-1]+1);
                    }
                }
                pre=curr;
            }
        System.out.println(pre[s2.length()]);

    }
}

 */