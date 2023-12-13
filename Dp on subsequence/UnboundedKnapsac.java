

/*Reccursion
public class UnboundedKnapsac {

    public static int f(int wt[],int val[],int i,int capacity){
        if(i==0){
           return (capacity/wt[0])*val[0];
        }
        else{
            int np=f(wt,val,i-1,capacity);
            int p=Integer.MIN_VALUE;
            if(wt[i]<=capacity){
                p=val[i]+f(wt,val,i,capacity-wt[i]);
            }
            return Math.max(p,np);
        }
    }
    public static void main(String[] args) {
        int wt[]={3,2,4};
        int val[]={66,40,80};
        int capacity=7;
        System.out.println(f(wt,val,val.length-1,capacity));
    }
}
*/


/* Memoization
import java.util.Arrays;

public class UnboundedKnapsac {

    public static int f(int wt[],int val[],int i,int capacity,int dp[][]){
        if(i==0){
           return (capacity/wt[0])*val[0];
        }
        if(dp[i][capacity]!=-1){
            return dp[i][capacity];
        }
        else{
            int np=f(wt,val,i-1,capacity,dp);
            int p=Integer.MIN_VALUE;
            if(wt[i]<=capacity){
                p=val[i]+f(wt,val,i,capacity-wt[i],dp);
            }
            return dp[i][capacity]=Math.max(p,np);
        }
    }
    public static void main(String[] args) {
        int wt[]={3,2,4};
        int val[]={66,40,80};
        int capacity=7;
          int dp[][]=new int[wt.length][capacity+1];
        for(int []x:dp){
           Arrays.fill(x,-1);
        }
        
        System.out.println(f(wt,val,val.length-1,capacity,dp));
    }
}
*/


/*Tabulation 
public class UnboundedKnapsac {

    public static void main(String[] args) {
        int wt[]={3,2,4};
        int val[]={50,40,80};
        int capacity=7;
        int dp[][]=new int[wt.length][capacity+1];
        for(int i=0;i<capacity+1;i++){ 
            dp[0][i]=(i/wt[0])*val[0];
        }
        for(int i=1;i<wt.length;i++){
            for(int j=0;j<capacity+1;j++){
                int np=dp[i-1][j];
                int p=0;
                if(j>=wt[i]){
                    p=val[i]+ dp[i][j-wt[i]];
                }
                dp[i][j]=Math.max(p,np);
            }
        }
        
        System.out.println(dp[val.length-1][capacity]);
    }
}
*/


/*Space Optimization 
public class UnboundedKnapsac {

    public static void main(String[] args) {
        int wt[]={3,2,4};
        int val[]={50,40,80};
        int capacity=7;
        int pre[]=new int[capacity+1];
        for(int i=0;i<capacity+1;i++){ 
            pre[i]=(i/wt[0])*val[0];
        }
        for(int i=1;i<wt.length;i++){
            int curr[]=new int[capacity+1];
            for(int j=0;j<capacity+1;j++){
                int np=pre[j];
                int p=0;
                if(j>=wt[i]){
                    p=val[i]+ curr[j-wt[i]];
                }
                curr[j]=Math.max(p,np);
            }
            pre=curr;
        }
        
        System.out.println(pre[capacity]);
    }
}
*/


/*Ultimate SpaceOptimization 
public class UnboundedKnapsac {

    public static void main(String[] args) {
        int wt[]={3,2,4};
        int val[]={50,40,80};
        int capacity=7;
        int pre[]=new int[capacity+1];
        for(int i=0;i<capacity+1;i++){ 
            pre[i]=(i/wt[0])*val[0];
        }
        for(int i=1;i<wt.length;i++){
            for(int j=0;j<capacity+1;j++){
                int np=pre[j];
                int p=0;
                if(j>=wt[i]){
                    p=val[i]+ pre[j-wt[i]];
                }
                pre[j]=Math.max(p,np);
            }
            
        }
        
        System.out.println(pre[capacity]);
    }
}
*/



