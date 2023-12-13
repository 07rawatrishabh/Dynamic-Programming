/*import java.util.Arrays;

public class LongestBitonicSubsequence {
    public static void main(String[] args) {
        int a[]={1,11,2,10,4,5,2,1};
        int dp1[]=new int[a.length];
        int dp2[]=new int[a.length];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for(int i=1;i<a.length;i++){
            for(int j=0;j<=i-1;j++){
                if(a[i]>a[j]&&((dp1[j]+1)>dp1[i])){
                 dp1[i]=1+dp1[j];
                }
            }
        }

       for(int i=a.length-2;i>=0;i--){
            for(int j=a.length-1;j>=i+1;j--){
                if(a[i]>a[j]&&((dp2[j]+1)>dp2[i])){
                 dp2[i]=1+dp2[j];
                }
            }
          }
    int ans=0;
    for(int i=0;i<a.length;i++){
        ans=Math.max(ans,dp1[i]+dp2[i]);
    }

  for(int i:dp1){
    System.out.print(i+" ");
  }
  System.out.println();
    for(int i:dp2){
    System.out.print(i+" ");
  }
  System.out.println();


    System.out.println(ans);
    }
}
*/

