public class MinimumnumberOfInsertionTomakeStringPalindrome {
    public static void main(String[] args) {
        String s1="abcdafgh";
        String s2= new StringBuilder(s1).reverse().toString();
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
      System.out.println(" Minumum number of Insertion"+ " "+(s1.length()- pre[s2.length()]));
        
    }
}
