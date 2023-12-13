

/*recursion 
public class NinjaTraining {
    public static int  f(int m[][],int i,int l){
       if(i==0){
        int mx=0;
        for(int j=0;j<3;j++){
            if(j!=l){
                mx=Math.max(mx,m[0][j]);
            }
        }
        return mx;
       }
       else{
        int mx=0;
        for(int j=0;j<3;j++){
            if(j!=l){
                mx=Math.max(mx,(m[i][j])+f(m,i-1,j));   
            }
        }
        return mx;
       }
    }
    public static void main(String[] args) {
        int m[][]={{2,1,3},{3,4,6},{10,1,6},{8,3,7}};
          System.out.println(f(m,m.length-1,3));
       
    }
}
*/

/* Memoization 
public class NinjaTraining {
    public static int  f(int m[][],int i,int l,int dp[][]){
        if(dp[i][l]!=-1){
            return dp[i][l];
        }
       if(i==0){
        int mx=0;
        for(int j=0;j<3;j++){
            if(j!=l){
                mx=Math.max(mx,m[0][j]);
            }
        }
        return mx;
       }
       else{
        int mx=0;
        for(int j=0;j<3;j++){
            if(j!=l){
                mx=Math.max(mx,(m[i][j])+f(m,i-1,j,dp));   
            }
        }
        return dp[i][l]=mx;
       }
    }
    public static void main(String[] args) {
        int m[][]={{2,1,3},{3,4,6},{10,1,6},{8,3,7}};
        int dp[][]=new int[m.length][4];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
          System.out.println(f(m,m.length-1,3,dp));
       
    }
}
*/

public class NinjaTraining {
    public static int  f(int m[][],int i,int l){
       if(i==0){
        int mx=0;
        for(int j=0;j<3;j++){
            if(j!=l){
                mx=Math.max(mx,m[0][j]);
            }
        }
        return mx;
       }
       else{
        int mx=0;
        for(int j=0;j<3;j++){
            if(j!=l){
                mx=Math.max(mx,(m[i][j])+f(m,i-1,j));   
            }
        }
        return mx;
       }
    }
    public static void main(String[] args) {
        int m[][]={{2,1,3},{3,4,6},{10,1,6},{8,3,7}};
        int dp[][]=new int[m.length][4];
        dp[0][0]=Math.max(m[0][1],m[0][2]);
        dp[0][1]=Math.max(m[0][0],m[0][2]);
        dp[0][2]=Math.max(m[0][0],m[0][2]);
        dp[0][3]=Math.max(m[0][1],Math.max(m[0][0],m[0][2]));
        System.out.println(f(m,m.length-1,3));
       
    }
}

/*Point to be remembered if max function while giving value like max(x,y+z)  pleze rap y+z like (y+z)=> max(x,(y+z)*/