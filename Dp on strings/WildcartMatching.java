/*reccursion
 public class WildcartMatching {
   
        public static boolean f(String s1,String s2,int i,int j){
            if(i<0&&j<0){
                return true;
            }
             if(i<0){
                return false;
            }
            if(j<0){
                for(int k=0;k<=i;k++){
                    if(s1.charAt(k)!='*'){
                        return false;
                    }
                }
                return true;
            }
            else{
                if(s1.charAt(i)==s2.charAt(j)||s1.charAt(i)=='_'){
                    return f(s1,s2,i-1,j-1);
                }
                else if(s1.charAt(i)=='*'){
                 return f(s1,s2,i-1,j-1)||f(s1,s2,i,j-1);                     
                }
                else 
                return false;
            }
          
        }
    public static void main(String[] args) {
        String pattern="r*h";
        String string="rishabh";
        System.out.println(f(pattern,string,pattern.length()-1,string.length()-1));
    }
}



 */

 
/* Memoization
 import java.util.*;
 public class WildcartMatching {
   
        public static boolean f(String s1,String s2,int i,int j,int dp[][]){
            if(i<0&&j<0){
                return true;
            }
             if(i<0){
                return false;
            }
            if(j<0){
                for(int k=0;k<=i;k++){
                    if(s1.charAt(k)!='*'){
                        return false;
                    }
                }
                dp[i][j]=1;
                return true;
            }
            if(dp[i][j]!=-1){
                if(i>0)return true;
                return false;
            }
            else{
                if(s1.charAt(i)==s2.charAt(j)||s1.charAt(i)=='_'){
                    boolean x=f(s1,s2,i-1,j-1,dp);
                    dp[i][j]=x?1:0;
                    return x;
                }
                else if(s1.charAt(i)=='*'){
                    boolean y=f(s1,s2,i-1,j-1,dp)||f(s1,s2,i,j-1,dp);
                    dp[i][j]=y?1:0;
                 return y;                   
                }
                else 
                return false;
            }
          
        }
    public static void main(String[] args) {
        String pattern="r_h";
        String string="rishabh";
        int dp[][]=new int[pattern.length()][string.length()];
        for(int x[]:dp)
        Arrays.fill(x,-1);
        System.out.println(f(pattern,string,pattern.length()-1,string.length()-1,dp));
    }
}


*/


/*tabulation
 
 public class WildcartMatching {
   
        
    public static void main(String[] args) {
        String pattern="r_*h";
        String string="rishabh";
        boolean dp[][]=new boolean [pattern.length()+1][string.length()+1];
        dp[0][0]=true;
        for(int i=1;i<=pattern.length();i++){
            if(pattern.charAt(i-1)=='*'){
               dp[i][0]=dp[i-1][0];
            }
        }


        for(int i=1;i<pattern.length()+1;i++){
            for(int j=1;j<string.length()+1;j++){
               if(pattern.charAt(i-1)==string.charAt(j-1)||pattern.charAt(i-1)=='_'){
                dp[i][j]=dp[i-1][j-1];
               }
               else if(pattern.charAt(i-1)=='*'){
                dp[i][j]= dp[i-1][j-1]||dp[i][j-1];
               }
               else{
                dp[i][j]=false;
               }
            }
        }
     System.out.println(dp[pattern.length()][string.length()]);

      
    }
}

 */


/*SpaceOptimmization 
 public class WildcartMatching {
   
        
    public static void main(String[] args) {
        String pattern="r_*h";
        String string="rishabh";
        boolean pre[]=new boolean [ pattern.length()+1];
        pre[0]=true;
        for(int i=1;i<=pattern.length();i++){
            if(pattern.charAt(i-1)=='*'){
               pre[i]=pre[i-1];
            }
        }


        for(int i=1;i<string.length()+1 ;i++){
            boolean curr[]=new boolean [pattern.length()+1];
            curr[0]=false;
            for(int j=1;j<pattern.length()+1;j++){
               if(pattern.charAt(j-1)==string.charAt(i-1)||pattern.charAt(j-1)=='_'){
                curr[j]=pre[j-1];
               }
               else if(pattern.charAt(j-1)=='*'){
                curr[j]= pre[j-1]||pre[j];
               }
               else{
                curr[j]=false;
               }
            }
            pre=curr;
        }
     System.out.println(pre[ pattern.length()]);

      //System.out.println(f(pattern,string,pattern.length()-1,string.length()-1,dp));
    }
}
*/
