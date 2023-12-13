

/*recursion 
public class frogjump {
    public static int f(int a[],int i){
       if(i==0){
        return 0;
       }
       if(i==1){
        return Math.abs(a[0]-a[1]);
       }
       else if(i<0){
        return Integer.MAX_VALUE;
       }
       else{
        int x=Math.abs(a[i]-a[i-1])+f(a,i-1);
        int y=Math.abs(a[i]-a[i-2])+f(a,i-2);
        return Math.min(x,y);
       }
    }
    public static void main(String[] args) {
        int a[]={30,10,60,10,60,50};
        System.out.println(f(a,5));
    }
}
*/


/*Memoization 
public class frogjump {
    public static int f(int a[],int i,int dp[]){
       if(i==0){
        return 0;
       }
       if(i==1){
        return Math.abs(a[0]-a[1]);
       }
       else if(i<0){
        return Integer.MAX_VALUE;
       }
       if(dp[i]!=-1){
        return dp[i];
       }
       else{
        int x=Math.abs(a[i]-a[i-1])+f(a,i-1,dp);
        int y=Math.abs(a[i]-a[i-2])+f(a,i-2,dp);
        return dp[i]=Math.min(x,y);
       }
    }
    public static void main(String[] args) {
        int a[]={30,10,60,10,60,50};
        int dp[]=new int[a.length+1];
        Arrays.fill(dp,-1);
        System.out.println(f(a,5,dp));
    }
}
*/


/* Tabulation
public class frogjump {
   
    public static void main(String[] args) {
        int a[]={30,10,60,10,60,50};
        int dp[]=new int[a.length];
        dp[0]=0;
        dp[1]=Math.abs(a[0]-a[1]);
        for(int i=2;i<a.length;i++){
            dp[i]=Math.min( Math.abs(a[i]-a[i-1])+dp[i-1] ,  Math.abs(a[i]-a[i-2])+dp[i-2] );
        }
        System.out.println(dp[a.length-1]);
    }
}
*/


/* Space optimization
public class frogjump {
   
    public static void main(String[] args) {
        int a[]={30,10,60,10,60,50};
        int pre2=0;
        int pre1=Math.abs(a[0]-a[1]);
        int curr=0;
        for(int i=2;i<a.length;i++){
            curr=Math.min( Math.abs(a[i]-a[i-1])+pre1 ,  Math.abs(a[i]-a[i-2])+pre2 );
            pre2=pre1;
            pre1=curr;
        }
        System.out.println(curr);
    }
}
*/