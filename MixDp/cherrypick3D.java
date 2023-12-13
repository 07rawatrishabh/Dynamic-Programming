
/*Recurssion 
public class cherrypick3D {
    public static int f(int a[][],int r,int c1,int c2,int dp[][][]){
        if(c1<0||c2<0||c1>=a[0].length||c2>=a[0].length){
            return (int)(-1e8);
        }
        if(r==a.length-1){
            if(c1!=c2){
                return a[r][c1]+a[r][c2];
              }
            else{
                 return a[r][c1];
                }
         }
        
         int max=(int)(-1e8);
        
         int val=0;
                  if(c1==c2){
                  val=a[r][c1];
            }
            else{
                 val=a[r][c1]+a[r][c2];
            }
           
         
         for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){

            max=Math.max(max,(val+f(a,r+1,c1+i,c2+j)));

            }
         }
     
return max;
    }
    public static void main(String[] args) {
        int a[][]={{2,3,1,2},{3,4,2,2},{5,6,3,5}};
       
        System.out.println(f(a,0,0,(a[0].length-1)));
    }
}
*/

/*Memoization 
public class cherrypick3D {
    public static int f(int a[][],int r,int c1,int c2,int dp[][][]){
        if(c1<0||c2<0||c1>=a[0].length||c2>=a[0].length){
            return (int)(-1e8);
        }
        if(r==a.length-1){
            if(c1!=c2){
                return a[r][c1]+a[r][c2];
              }
            else{
                 return a[r][c1];
                }
         }
         if(dp[r][c1][c2]!=0){
            return dp[r][c1][c2];
         }
         
         int max=(int)(-1e8);
        
         int val=0;
                  if(c1==c2){
                  val=a[r][c1];
            }
            else{
                 val=a[r][c1]+a[r][c2];
            }
           
         
         for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){

            max=Math.max(max,(val+f(a,r+1,c1+i,c2+j,dp)));

            }
         }
     
return dp[r][c1][c2]= max;
    }
    public static void main(String[] args) {
        int a[][]={{2,3,1,2},{3,4,2,2},{5,6,3,5}};
        int dp[][][]=new int[a.length][a[0].length][a[0].length];
        System.out.println(f(a,0,0,(a[0].length-1),dp));
    }
}
*/

/*Tabulation 
public class cherrypick3D {
    
    public static void main(String[] args) {
        int a[][]={{2,3,1,2},{3,4,2,2},{5,6,3,5}};
        int dp[][][]=new int[a.length][a[0].length][a[0].length];
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j){
                    dp[a.length-1][i][j]=a[a.length-1][i];
                }
                else
                    dp[a.length-1][i][j]=a[a.length-1][i]+a[a.length-1][j];
            }
        }                   


        for(int i=a.length-2;i>=0;i--){
            for(int c1=0;c1<a[0].length;c1++){
                for(int c2=0;c2<a[0].length;c2++){
                    int max=(int)(-1e8);
                    int val=0;
                    if(c1==c2){
                         val=a[i][c1];
                    }
                   else{
                        val=a[i][c1]+a[i][c2];
                     }
                     for(int k=-1;k<=1;k++){
                       for(int j=-1;j<=1;j++){
                            
                        if(c1+k>=0&&c2+j>=0&&c1+k<a[0].length&&c2+j<a[0].length){
                             max=Math.max(max,(val+dp[i+1][c1+k][c2+j]));
                         }
                        else{
                            max=Math.max(max,((int)(-1e8)));
                         }
                     }

                    }
                    dp[i][c1][c2]=max;

                }
            }
        }
        System.out.println(dp[0][0][a[0].length-1]);
    }
}

*/
