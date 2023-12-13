
/*Recurrsion
public class Minimumcoins {
    public static int f(int a[],int i,int tar){
        if(i==0){
            if(tar%a[i]==0){
                return tar/a[i];
            }
            return Integer.MAX_VALUE;
        }
        else{
            int np=f(a,i-1,tar);
            int p=Integer.MAX_VALUE;
            if(tar>=a[i])
            p=1+f(a,i,tar-a[i]);
            return Math.min(p,np);
        }
    }
    public static void main(String[] args) {
       int a[]={1,2,3};
       int target=8;
        System.out.println(f(a,a.length-1,target));
    }
}
 

 */


 /* Memoization
import java.util.*;
 public class Minimumcoins {
    public static int f(int a[],int i,int tar,int dp[][]){
        if(i==0){
            if(tar%a[i]==0){
                return tar/a[i];
            }
            return Integer.MAX_VALUE;
        }
        if(dp[i][tar]!=-1){
            return dp[i][tar];
        }
        else{
            int np=f(a,i-1,tar,dp);
            int p=Integer.MAX_VALUE;
            if(tar>=a[i])
            p=1+f(a,i,tar-a[i],dp);
            return dp[i][tar]=Math.min(p,np);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int target=8;
        int dp[][]=new int[a.length][target+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        System.out.println(f(a,a.length-1,target,dp));
    }
}
*/



/*Tabulation 
import java.util.*;
 public class Minimumcoins {

    public static void main(String[] args) {
        int a[]={1,2,3};
        int target=8;
        int dp[][]=new int[a.length][target+1];
        for(int i=1;i<target+1;i++){
            if(i%a[0]==0){
                dp[0][i] =i/a[0];
            }
            else{
                dp[0][i]=(int)1e8;
            }
        }
        for(int i=1;i<a.length;i++){
            for(int j=1;j<target+1;j++){
                int np=dp[i-1][j];
                int p=Integer.MAX_VALUE;
                if(j-a[i]>=0){
                    p=1+dp[i][j-a[i]];
                }
                dp[i][j]=Math.min(p,np);
            }
        }

   System.out.println(dp[a.length-1][target]);
        
    }
}
*/



/*space Optimized 
import java.util.*;
 public class Minimumcoins {

    public static void main(String[] args) {
        int a[]={1,2,3};
        int target=8;
        int pre[]=new int[target+1];
        for(int i=1;i<target+1;i++){
            if(i%a[0]==0){
                pre[i] =i/a[0];
            }
            else{
                pre[i]=(int)1e8;
            }
        }
        for(int i=1;i<a.length;i++){
            int curr[]=new int[target+1];
            for(int j=1;j<target+1;j++){
                int np=pre[j];
                int p=Integer.MAX_VALUE;
                if(j-a[i]>=0){
                    p=1+curr[j-a[i]];
                }
                curr[j]=Math.min(p,np);
            }
            pre=curr;
        }

   System.out.println(pre[target]);
        
    }
}
*/




