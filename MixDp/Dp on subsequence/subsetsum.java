
/*Recurssion 
public class subsetsum {
    public static Boolean f(int a[],int i,int s){
        if(s==0){
            return true;
        }
        if(i==a.length){
            return false;
        }
        else{
            boolean p=false;
            if(s-a[i]>=0){
                p=f(a,i+1,s-a[i]);
            }
              if(p){
                return true;
            }
            boolean np= f(a,i+1,s);
            return (p||np);
        }
    }
    public static void main(String[] args) {
       int a[]={8,4,6,1,5}; 
       System.out.println(f(a,0,21));
    }
}
*/

 
/*Memoization 
public class subsetsum {
    public static Boolean f(int a[],int i,int s,int dp[][]){
        if(s==0){
            return true;
        }
        if(i==a.length){
            return false;
        }
        if(dp[i][s]!=-1){
            if(dp[i][s]==1){
                return true;
            }
            else
            return false;
        }
        else{
            boolean p=false;
            if(s-a[i]>=0){
                p=f(a,i+1,s-a[i],dp);
            }
            boolean np= f(a,i+1,s,dp);
         
             if(p||np){
                dp[i][s]=1;
             }
             else
                dp[i][s]=0;
             return (p||np);
        }
    }
    public static void main(String[] args) {
        int target=220;
       int a[]={8,4,6,1,5,9,8,7,3,2,4,1,5,8,2}; 
       int dp[][]=new int[a.length][target+1];
       for(int k[]:dp){
        Arrays.fill(k,-1);
       }
       System.out.println(f(a,0,target,dp));
    }
}
*/


/*Tabulation 
public class subsetsum {
 
    public static void main(String[] args) {
        int target=64;
       int a[]={8,7,3,4,223,45,3,42,64}; 
       boolean dp[][]=new boolean[a.length][target+1];
       for(int i=0;i<a.length;i++){
        dp[i][0]=true;
       }
       dp[0][a[0]]=true;
       for(int i=1;i<a.length;i++){
        for(int j=1;j<=target;j++){
            boolean nt=dp[i-1][j];
            boolean t=false;
            if(j-a[i]>=0){
              t=dp[i-1][j-a[i]];
            }
            dp[i][j]=(t||nt);
        }
       }
       System.out.println(dp[a.length-1][target]);
    }
}
*/


/*spaceOptimizatin 
public class subsetsum {
 
    public static void main(String[] args) {
        int target=64;
       int a[]={8,7,3,4,223,45,3,42,64}; 
       boolean curr[]=new boolean[target+1];
       boolean pre[]=new boolean[target+1];
       pre[0]=curr[0]=true;
       pre[a[0]]=true;
       for(int i=1;i<a.length;i++){
        pre[0]=curr[0]=true;
        for(int j=1;j<=target;j++){
            boolean nt=pre[j];
            boolean t=false;
            if(j-a[i]>=0){
              t=pre[j-a[i]];
            }
            curr[j]=(t||nt);
        }
        pre=curr;
       }
       System.out.println(pre[target]);
    }
}
*/

