

public class LongestCommonPalinDromeSubsequence {
    public static void main(String[] args) {
         String s1="abacdfgdcaba";
        String s2=new StringBuilder(s1).reverse().toString();
       
        int pre[]=new int[s2.length()+1];
        
    
        for(int i=1;i<=s1.length();i++){
            int curr[]=new int[s2.length()+1];
            for(int j=1;j<=s2.length();j++){
                  if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]=1+pre[j-1];
                   }
                   else{
                    //curr[j]=Math.max(pre[j],curr[j-1]);
                     curr[j]=0;
                   }
            }
            pre=curr;
        }
      System.out.println(pre[s2.length()]);
    }}
    
    //  Printing Longest Palindromic subsequence
  /* 
    public class LongestCommonPalinDromeSubsequence {
    public static void main(String[] args) {
         String s1="abxba";
        String s2=new StringBuilder(s1).reverse().toString();
       
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

*/