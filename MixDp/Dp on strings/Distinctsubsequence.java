/* recurrsion
public class Distinctsubsequence {
    public static int f(String s1,String s2,int i,int j){
        if(j<0)return 1;
        if(i<0)return 0;
        if(s1.charAt(i)==s2.charAt(j)){
            return f(s1,s2,i-1,j-1)+f(s1,s2,i-1,j);
        }
        return f(s1,s2,i-1,j);
    }
    public static void main(String[] args) {
        String s1="babgbag";
        String s2="bag";

        System.out.println(f(s1,s2,s1.length()-1,s2.length()-1));
    }
}
*/



/*  Memoization
import java.util.*;
public class Distinctsubsequence {
    public static int f(String s1,String s2,int i,int j,int dp[][]){
        if(j<0)return 1;
        if(i<0)return 0;
       else  if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else if(s1.charAt(i)==s2.charAt(j)){
            int x=f(s1,s2,i-1,j-1,dp) ;
            int y=f(s1,s2,i-1,j,dp);
            return x+y;
        }
        else
        return dp[i][j]=f(s1,s2,i-1,j,dp);
    }
    public static void main(String[] args) {
        String s1="babgbag";
        String s2="bag";
        int dp[][]=new int[s1.length()][s2.length()];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        System.out.println(f(s1,s2,s1.length()-1,s2.length()-1,dp));
    }
}
*/


/*Tabulation 
public class Distinctsubsequence {
      
    public static void main(String[] args) {
        String s1="babgbag";
        String s2="bag";
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<s1.length()+1;i++){
          dp[i][0]=1;
        }

        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                  dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[s1.length()][s2.length()]);
    }
}
*/


/*SpaceOptimization 

public class Distinctsubsequence {
      
    public static void main(String[] args) {
        String s1="babgbag";
        String s2="bag";
        int pre[]=new int[s2.length()+1];
        pre[0]=1;

        for(int i=1;i<s1.length()+1;i++){
            int curr[]=new int[s2.length()+1];
            curr[0]=1;
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                  curr[j]=pre[j]+pre[j-1];
                }
                else{
                    curr[j]=pre[j];
                }
            }
            pre=curr;
        }
        System.out.println(pre[s2.length()]);
    }
}
*/


/*UltimateSpaceOptimization 
public class Distinctsubsequence {
      
    public static void main(String[] args) {
        String s1="babgbag";
        String s2="bag";
        int pre[]=new int[s2.length()+1];

        for(int i=1;i<s1.length()+1;i++){
            pre[0]=1;
            for(int j=s2.length();j>=1;j--){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                  pre[j]=pre[j]+pre[j-1];
                }
                else{
                    pre[j]=pre[j];
                }
            }
        }
        System.out.println(pre[s2.length()]);
    }
}
*/