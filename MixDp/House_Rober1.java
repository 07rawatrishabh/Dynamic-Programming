

/* Recursion
public class House_Rober1 {
    
    public static int f(int a[],int i){
        if(i==0){
            return a[0];
        }
        else if(i<0){
            return 0;
        }
        else{
            int t=a[i]+f(a,i-2);
            int nt=0+f(a,i-1);
            return Math.max(t,nt);
        }
        
    }
    public static void main(String[] args) {
        int a[]={1,25,1,4,9};
        System.out.println(f(a,a.length-1));
    }
}
*/


/*Memoization
public class House_Rober1 {
    
    public static int f(int a[],int i,int dp[]){
        if(i==0){
            return a[0];
        }
        else if(i<0){
            return 0;
        }
        else if(dp[i]!=-1){
            return dp[i];
        }
        else{
            int t=a[i]+f(a,i-2,dp);
            int nt=0+f(a,i-1,dp);
            return dp[i]=Math.max(t,nt);
        }
        
    }
    public static void main(String[] args) {
        int a[]={1,25,1,4,9};
        int dp[]=new int[a.length+1];
        Arrays.fill(dp,-1);
        System.out.println(f(a,a.length-1,dp));
    }
}
*/


/*Tabulation 
public class House_Rober1 {
    
    public static void main(String[] args) {
        int a[]={1,25,1,4,9};
        int dp[]=new int[a.length+1];
        dp[0]=a[0];
        for(int i=1;i<a.length;i++){
            int p=a[i];
            if(i>=2)
            p+=dp[i-2];
            int np=dp[i-1];
            dp[i]=Math.max(p,np);
        }
        System.out.println( dp[a.length-1]);
    }
}
*/


 /*Space optimization 
public class House_Rober1 {
    
    public static void main(String[] args) {
        int a[]={1,25,1,4,9};
        int pre2=0;
        int pre1=a[0];
        int curr=0;
        for(int i=1;i<a.length;i++){
            int p=a[i];
            if(i>=2)
            p+=pre2;
            int np=pre1;
            curr=Math.max(p,np);
            pre2=pre1;
            pre1=curr;
        }
        System.out.println(curr);
    }
}
*/



//--------------------------------------------------------------------------------------------------------------------
/*House Rober 2 -- Circular Colony */

 

public class House_Rober1 {
    
    public static int f(int a[]){

        int dp[]=new int[a.length+1];
        dp[0]=a[0];
        for(int i=1;i<a.length;i++){
            int p=a[i];
            if(i>=2)
            p+=dp[i-2];
            int np=dp[i-1];
            dp[i]=Math.max(p,np);
        }
        return( dp[a.length-1]);

    }


    public static void main(String[] args) {
        int a[]={1,25,1,4,9};
        int b[]=new int[a.length-1];
        int c[]=new int [a.length-1];
        int j=0,k=0;
        for(int i=0;i<a.length;i++){
            if(i!=0){
                b[j++]=a[i];
            }
            if(i!=a.length-1)
              b[k++]=a[i];

        }

        System.out.println(Math.max(f(b),f(c)));
    
    }
}

