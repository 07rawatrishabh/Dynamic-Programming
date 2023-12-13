
//import java.util.*;

/*recursion
public class zeroOneKnapsac {
    public static int f(int wt[],int val[],int i,int capacity){
        if(i==0){
            if(wt[0]<=capacity){
                return val[0];
            }
            return 0;
        }
        else{
            int np=f(wt,val,i-1,capacity);
            int p=Integer.MIN_VALUE;
            if(wt[i]<=capacity){
                p=val[i]+f(wt,val,i-1,capacity-wt[i]);
            }
            return Math.max(p,np);
        }
    }
    public static void main(String[] args) {
        int wt[]={3,2,5};
        int val[]={30,40,60};
        int capacity=6;
        System.out.println(f(wt,val,val.length-1,capacity));
    }
}

 */


 /*Memoization 
 public class zeroOneKnapsac {
    public static int f(int wt[],int val[],int i,int capacity,int dp[][]){
        if(i==0){
            if(wt[0]<=capacity){
                return val[0];
            }
            return 0;
        }
        if(dp[i][capacity]!=-1){
            return dp[i][capacity];
        }
        else{
            int np=f(wt,val,i-1,capacity,dp);
            int p=Integer.MIN_VALUE;
            if(wt[i]<=capacity){
                p=val[i]+f(wt,val,i-1,capacity-wt[i],dp);
            }
            return dp[i][capacity]=Math.max(p,np);
        }
    }
    public static void main(String[] args) {
        int wt[]={3,2,5};
        int val[]={30,40,60};
        int capacity=6;
        int dp[][]=new int[wt.length][capacity+1];
        for(int []x:dp){
           Arrays.fill(x,-1);
        }
        
        
        System.out.println(f(wt,val,val.length-1,capacity,dp));
    }
}
*/


/*Tabulation 
 public class zeroOneKnapsac {
 
    public static void main(String[] args) {
        int wt[]={3,2,5,7};
        int val[]={30,40,60,100};
        int capacity=9;
        int dp[][]=new int[wt.length][capacity+1];
       
       for(int i=wt[0];i<capacity+1;i++){
          dp[0][i]=val[0];
       }
      
       for(int i=1;i<wt.length;i++){
        for(int j=1;j<capacity+1;j++){
            int np=dp[i-1][j];
            int p=Integer.MAX_VALUE;
            if(wt[i]<=j){
                p=val[i]+dp[i-1][j-wt[i]];
            }
           dp[i][j]=Math.max(p,np);
        }
       }

     System.out.println(dp[val.length-1][capacity]);
    }
}
*/


/*SpaceOptimization 
public class zeroOneKnapsac {
 
    public static void main(String[] args){

        int wt[]={3,2,5,7};
        int val[]={30,40,60,100};
        int capacity=9;
        int pre[]=new int[capacity+1];
       

       for(int i=wt[0];i<capacity+1;i++){
          pre[i]=val[0];
       }

       for(int i=1;i<wt.length;i++){
        int curr[]=new int[capacity+1];
        for(int j=1;j<capacity+1;j++){
            int np=pre[j];
            int p=Integer.MIN_VALUE;
            if(wt[i]<=j){
                p=val[i]+pre[j-wt[i]];
            }
           curr[j]=Math.max(p,np); 
        }
        pre=curr;
       }

     System.out.println(pre[capacity]);
    

 }
}
*/


/*UltraOptimization
public class zeroOneKnapsac {
 
    public static void main(String[] args){

        int wt[]={3,2,5,7};
        int val[]={30,40,60,100};
        int capacity=5;
        int pre[]=new int[capacity+1];
       

       for(int i=wt[0];i<capacity+1;i++){
          pre[i]=val[0];
       }

       for(int i=1;i<wt.length;i++){
        for(int j=capacity;j>0;j--){
            int np=pre[j];
            int p=Integer.MIN_VALUE;
            if(wt[i]<=j){
                p=val[i]+pre[j-wt[i]];
            }
           pre[j]=Math.max(p,np); 
        }
        
       }

     System.out.println(pre[capacity]);
    

 }
}
*/





