
//*Recurrsion + Memoization 
public class ParationArrayForMaximumSum {

    public static int f(int a[],int ind,int k,int dp[]){
        if(ind==a.length){
            return 0;
        }
        if(dp[ind]!=0){
            System.out.println("HELLO");
            return dp[ind];
        }
        else{
            
            int max=-1;
            int ans=-1;
            for(int i=ind;i<Math.min(ind+k,a.length);i++){
                max=Math.max(max,a[i]);
                int sum = (i-ind+1)*max+f(a,i+1,k,dp);
                ans=Math.max(ans,sum);
            }
            return dp[ind] =ans;
        }
    }
    public static void main(String[] args) {
        int a[]={1,15,7,9,2,5,10};
        int dp[]=new int[a.length];
        System.out.println(f(a,0,3,dp));
    }
}
/*/





/*Tabulation 
public class ParationArrayForMaximumSum {
    public static void main(String[] args) {
        int a[]={1,15,7,9,2,5,10};
        int dp[]=new int[a.length+1];
        int k=3;
       
         for(int index=a.length-1;index>=0;index--){
            int len=0;
            int max=-1;
            int ans=-1;
            int ind=index;
            for(int i=ind;i<Math.min(ind+k,a.length);i++){
                max=Math.max(max,a[i]);
                len++;
                int sum = len*max+dp[i+1];
                ans=Math.max(ans,sum);
            }
            dp[ind] =ans;
        }
        System.out.println(dp[0]);


    }
}
*/



