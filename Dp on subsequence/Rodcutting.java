

/*Reccursion
 public class Rodcutting {
    public static int f(int a[],int i,int len){
       if(i==0){
            return a[0]*len;
       }
       else{
        int np=f(a,i-1,len);
        int p=Integer.MIN_VALUE;
        if(len>=i+1){
            p=a[i]+f(a,i,len-(i+1));
        }
        return Math.max(p,np);
       }   
    }
    public static void main(String[] args) {
        int a[]={2,5,7,8,10};
        System.out.println(f(a,a.length-1,a.length));
    }
}
 */


/* Memoization
import java.util.*;
 public class Rodcutting {
    public static int f(int a[],int i,int len,int dp[][]){
       if(i==0){
            return a[0]*len;
       }
       if(dp[i][len]!=-1){
        return dp[i][len];
       }
       else{
        int np=f(a,i-1,len,dp);
        int p=Integer.MIN_VALUE;
        if(len>=i+1){
            p=a[i]+f(a,i,len-(i+1),dp);
        }
        return Math.max(p,np);
       }   
    }
    public static void main(String[] args) {
        int a[]={2,5,7,8,10};
        int dp[][]=new int[a.length][a.length+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        System.out.println(f(a,a.length-1,a.length,dp));
    }
}
*/


/*Tabulation
 
public class Rodcutting {
    
    public static void main(String[] args) {
        int a[]={2,5,7,8,10};
        int dp[][]=new int[a.length][a.length+1];
        for(int i=0;i<a.length+1;i++){
            dp[0][i]=a[0]*i;
        }
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length+1;j++){
                int np=dp[i-1][j];
                int p=Integer.MIN_VALUE;
                if(j>=i+1)
                p=a[i]+dp[i][j-(i+1)];
                dp[i][j]=Math.max(p,np);
            }
        }
        System.out.println(dp[a.length-1][a.length]);
    }
}

 */


/*Space Optimization 
public class Rodcutting {
    
    public static void main(String[] args) {
        int a[]={2,5,7,8,10};
        int pre[]=new int[a.length+1];
        for(int i=0;i<a.length+1;i++){
            pre[i]=a[0]*i;
        }
        for(int i=1;i<a.length;i++){
            int curr[]=new int[a.length+1];
            for(int j=0;j<a.length+1;j++){
                int np=pre[j];
                int p=Integer.MIN_VALUE;
                if(j>=i+1)
                p=a[i]+curr[j-(i+1)];
                curr[j]=Math.max(p,np);
            }
            pre=curr;
        }
        System.out.println(pre[a.length]);
    }
}
*/


/*Ultimate Spaceoptimization 
public class Rodcutting {
    
    public static void main(String[] args) {
        int a[]={2,5,7,8,10};
        int pre[]=new int[a.length+1];
        for(int i=0;i<a.length+1;i++){
            pre[i]=a[0]*i;
        }
        for(int i=1;i<a.length;i++){
           // int curr[]=new int[a.length+1];
            for(int j=0;j<a.length+1;j++){
                int np=pre[j];
                int p=Integer.MIN_VALUE;
                if(j>=i+1)
                p=a[i]+pre[j-(i+1)];
                pre[j]=Math.max(p,np);
            }
            //pre=curr;
        }
        System.out.println(pre[a.length]);
    }
}
*/
