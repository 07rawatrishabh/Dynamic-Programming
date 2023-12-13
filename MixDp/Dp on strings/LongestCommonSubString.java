/*Tabulation
public class LongestCommonSubString {
    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="pqarsbct";
        int dp[][]=new int[s1.length()+1][s2.length()+1]; 
         int ans=0;
         for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }
                else{
                     dp[i][j]=0;
                }
            }
         }
 System.out.println(ans);



    }
}
*/


/*SpaceOptimization 
public class LongestCommonSubString {
    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="pqarsbct";
        int pre[]=new int[s2.length()+1]; 
         int ans=0;
         for(int i=1;i<s1.length()+1;i++){
             int curr[]=new int[s2.length()+1]; 
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]=1+pre[j-1];
                    ans=Math.max(ans,curr[j]);
                }
                else{
                     curr[j]=0;
                }
            }
            pre=curr;
         }
 System.out.println(ans);



    }
}
*/


/*UltimatSpaceOptimization 
public class LongestCommonSubString {
    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="pqarfghsbct";
        int pre[]=new int[s2.length()+1]; 
         int ans=0;
         for(int i=1;i<s1.length()+1;i++){
            for(int j=s2.length();j>0;j--){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    pre[j]=1+pre[j-1];
                    ans=Math.max(ans,pre[j]);
                }
                else{
                     pre[j]=0;
                }
            }
            
         }
 System.out.println(ans);



    }
}
*/