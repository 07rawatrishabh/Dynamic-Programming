
/*Reccursion
 public class NuberofWaysCoinChange {

    public static int f(int a[],int i,int target){
        if(i==0){
            if(target%a[0]==0)
                return 1;
                else
                return 0;
        }
        else{
            int np=f(a,i-1,target);
            int p=0;
            if(target>=a[i]){
                p=f(a,i,target-a[i]);
            }
            return p+np;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int target=8;
        System.out.println(f(a,a.length-1,target));
    }
}

 */



 /*Memization
 import java.util.*;
public class NuberofWaysCoinChange {

    public static int f(int a[],int i,int target,int dp[][]){
        if(i==0){
            if(target%a[0]==0)
                return 1;
                return 0;
        }
        if(dp[i][target]!=-1)
        return dp[i][target];
        else{
            int np=f(a,i-1,target,dp);
            int p=0;
            if(target>=a[i]){
                p=f(a,i,target-a[i],dp);
            }
            return dp[i][target]= p+np;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int target=8;
        int dp[][]=new int[a.length][target+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        System.out.println(f(a,a.length-1,target,dp));
    }
}
  */



/*Tabulation 
public class NuberofWaysCoinChange {

  
    public static void main(String[] args) {
        int a[]={1,2,3};
        int target=8;
        int dp[][]=new int[a.length][target+1];
    for(int i=0;i<target+1;i++){
     if(i%a[0]==0)
        dp[0][i]=1;
    }

    for(int i=1;i<a.length;i++){
        for(int j=0;j<target+1;j++){
            int np=dp[i-1][j];
            int p=0;
            if(j>=a[i]){
                p=dp[i][j-a[i]];
            }
            dp[i][j]=p+np;
        }
    }
System.out.println(dp[a.length-1][target]);

    }
}
*/



/*SpaceOptimization 
public class NuberofWaysCoinChange {

  
    public static void main(String[] args) {
        int a[]={1,2,3};
        int target=8;
        int pre[]=new int[target+1];
    for(int i=0;i<target+1;i++){
     if(i%a[0]==0)
        pre[i]=1;
    }

    for(int i=1;i<a.length;i++){
        int curr[]=new int[target+1];
        for(int j=0;j<target+1;j++){
            int np=pre[j];
            int p=0;
            if(j>=a[i]){
                p=curr[j-a[i]];
            }
            curr[j]=p+np;
        }
        pre=curr;
    }
System.out.println(pre[target]);

    }
}
*/

