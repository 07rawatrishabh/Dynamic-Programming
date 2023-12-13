
/* 
public class Count_PairofSubset_withGiven_diffrence {
    public static void main(String[] args) {
        int diffrence= 2;
        int a[]={1,2,2,3};

        int sum=0;
        for(int i:a){
            sum+=i;
        }
       
        if((sum-diffrence)<0||(sum-diffrence)%2==1){
            System.out.println(-1);
        }
      else{

        int target=(sum-diffrence)/2;
        int dp[][]=new int[a.length][target+1];
        for(int i=0;i<a.length;i++){
           dp[i][0]=1;
        }
        dp[0][a[0]]=1;
       for(int i=1;i<a.length;i++){
           for(int j=1;j<=target;j++){
               int np= dp[i-1][j];
               int p=0;
               if(j>=a[i]){
                   p=dp[i-1][j-a[i]];
               }
               dp[i][j]=p+np;
           }
       }
       System.out.println(dp[a.length-1][target]);
    }
}
}
*/

/*Space Optimization 
public class Count_PairofSubset_withGiven_diffrence {
    public static void main(String[] args) {
        int diffrence= 2;
        int a[]={1,2,2,3};

        int sum=0;
        for(int i:a){
            sum+=i;
        }
       
        if((sum-diffrence)<0||(sum-diffrence)%2==1){
            System.out.println(-1);
        }
      else{

        int target=(sum-diffrence)/2;
        int pre[]=new int[target+1];
    
        pre[0]=1;
        pre[a[0]]=1;
       for(int i=1;i<a.length;i++){
         int curr[]=new int[target+1];
         curr[0]=1;
           for(int j=1;j<=target;j++){
               int np= pre[j];
               int p=0;
               if(j>=a[i]){
                   p=pre[j-a[i]];
               }
               curr[j]=p+np;
           }
           pre=curr;
       }
       System.out.println(pre[target]);
    }
}
}
*/