public class ShorestSuperSequence {
    public static void main(String[] args) {
        String s1= "Rishabh";
        String s2="Rishi";
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
            sb.append(s1.charAt(i-1));
            i--;
          }
          else{
            sb.append(s2.charAt(j-1));
            j--;
          }
      }
      while(i>0){
      sb.append(s1.charAt(i-1));
      i--;
      }
       while(j>0){
      sb.append(s2.charAt(j-1));
      j--;
      }
      System.out.println(sb.reverse());
      
    }
}
