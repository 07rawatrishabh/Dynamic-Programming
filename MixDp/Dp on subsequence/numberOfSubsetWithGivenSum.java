

/* Recurrsion
public class numberOfSubsetWithGivenSum {
    public static int f(int a[],int i,int sum){
        if(sum==0){
          return 1;
      }
      if(i==0){
          if(sum==a[0]){
              return 1;
          }
          else 
            return 0;
      }
    
      else
      {
          int p=f(a,i-1,sum-a[i]);
          
          int np=f(a,i-1,sum);
          return (p+np);
      }
  }
  public static void main(String[] args) {
    int a[]={1,2,2,3};
    System.out.println(f(a,3,7));
  }
    
}
*/


/*Memoization 
public class numberOfSubsetWithGivenSum {
    public static int f(int a[],int i,int sum,int dp[][]){
        if(sum==0){
          return 1;
      }
      if(i==0){
          if(sum==a[0]){
              return 1;
          }
          else 
            return 0;
      }
      if(dp[i][sum]!=-1){
        return dp[i][sum];
      }
      else
      {
          int p=f(a,i-1,sum-a[i],dp);
          
          int np=f(a,i-1,sum,dp);

        return dp[i][sum]=(p+np);
      }
  }
  public static void main(String[] args) {
    int a[]={1,2,2,3};
    int dp[][]=new int[a.length][8];
    for(int x[]:dp){
        Arrays.fill(x,-1);
    }
    System.out.println(f(a,3,7,dp));
  }
    
}
*/


/*Tabulation 
public class numberOfSubsetWithGivenSum {
   
      
  public static void main(String[] args) {
    int a[]={1,2,2,3};
     int target=3;
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
*/


/*SpaceOptimization 
public class numberOfSubsetWithGivenSum {
   
      
  public static void main(String[] args) {
    int a[]={1,2,2,3};
     int target=3;
     int pre[]=new int[target+1];
     pre[0]=1;
     if(target>=a[0])pre[a[0]]=1;

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
*/