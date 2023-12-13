/*Recurrsion +Memoization  
 import java.util.*;
public class PalindromePartationing {
    public static boolean is(String S,int s,int e){
        if(s==e){
            return true;
        }
        while(s<e){
            if(S.charAt(s)!=S.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
 
 
    public static int f(String s,int i,int dp[]){
    
  if(i==s.length()){
    return 0;
  }
  if(dp[i]!=-1){
    
    return dp[i];
  }
  int ans=Integer.MAX_VALUE;
  for(int j=i;j<s.length();j++){
     if(is(s,i,j)){
        ans=Math.min(ans,1+f(s,j+1,dp));
     }
  }

return dp[i]=ans;

  }  
    
    public static void main(String[] args) {
    String a="abacabba";
    int dp[]=new int[a.length()];
    Arrays.fill(dp,-1);
    System.out.println(f(a,0,dp)-1);

 }   
}
 */


/*Tabulation 
public class PalindromePartationing {
    public static boolean is(String S,int s,int e){
        if(s==e){
            return true;
        }
        while(s<e){
            if(S.charAt(s)!=S.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
 
 
      
    
    public static void main(String[] args) {
    String a="abacabba";
    int dp[]=new int[a.length()+1];
    for(int i=a.length()-1;i>=0;i--){

        int ans=(int)(1e9);
        for(int j=i;j<a.length();j++){
           if(is(a,i,j)){
            ans=Math.min(ans,1+dp[j+1]);
           }
        }
        dp[i]=ans;
    }
    System.out.println(dp[0]-1);

 }   
} 
*/
