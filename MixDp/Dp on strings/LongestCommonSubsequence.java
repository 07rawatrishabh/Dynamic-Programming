/*Reccursion 
public class LongestCommonSubsequence {
    public static int f(String s1,String s2,int i,int j){
        if(i<0||j<0){
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+f(s1,s2,i-1,j-1);
        }
        else{
            
            int f=f(s1,s2,i-1,j);

            int s=f(s1,s2,i,j-1);
            return Math.max(f,s);
        }
    }
    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="pqabcrstd";
        System.out.println(f(s1,s2,s1.length()-1,s2.length()-1));
    }
}
*/


/*Memoization 
import java.util.*;
public class LongestCommonSubsequence {
    public static int f(String s1,String s2,int i,int j,int dp[][]){
        if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+f(s1,s2,i-1,j-1,dp);
        }
        else{
            
            int f=f(s1,s2,i-1,j,dp);

            int s=f(s1,s2,i,j-1,dp);
            return dp[i][j]=Math.max(f,s);
        }
    }
    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="pqabcrstd";
        int dp[][]=new int[s1.length()][s2.length()];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        System.out.println(f(s1,s2,s1.length()-1,s2.length()-1,dp));
    }
}
*/


/*Tabulation
public class LongestCommonSubsequence {
    
    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="pqabcrstd";
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        
    
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                  if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                   }
                   else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                   }
            }
        }
      System.out.println(dp[s1.length()][s2.length()]);
    }}
*/


/*Space Optimization 
public class LongestCommonSubsequence {
    
    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="pqabcrstd";
        int pre[]=new int[s2.length()+1];
        
    
        for(int i=1;i<=s1.length();i++){
            int curr[]=new int[s2.length()+1];
            for(int j=1;j<=s2.length();j++){
                  if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]=1+pre[j-1];
                   }
                   else{
                    curr[j]=Math.max(pre[j],curr[j-1]);
                   }
            }
            pre=curr;
        }
      System.out.println(pre[s2.length()]);
    }}
    
*/


//////////////////////////////////////////////////////////////////////////////////////////////////////////
//Printing of Common Subsequence
//
public class LongestCommonSubsequence {
    
        public static void main(String[] args) {
        String s1="abcdfegh";
        String s2="pqabcrstd";
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        
    
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                  if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                   }
                   else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                   }
            }
        }
      int i=s1.length();
      int j=s2.length();
      StringBuilder sb=new StringBuilder("");
      while(i>0&&j>0){
           if(s1.charAt(i-1)==s2.charAt(j-1)){
            sb.append(s1.charAt(i-1));
            i--;
            j--;
          }
          
          else if(dp[i-1][j]>dp[i][j-1]){
            i--;
          }
          else{
            j--;
          }
      }
      System.out.println(sb.reverse());
    }
    }




