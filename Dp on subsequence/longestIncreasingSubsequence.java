/*Reccursion
 public class longestIncreasingSubsequence {
    public static int f(int a[],int i,int pi){
        if(i==a.length){
            return 0;
        }
        else{
            int t=0;
            int nt=0;
            if(pi==-1||a[i]>a[pi]){
                t=1+f(a,i+1,a[i]);
            }
            nt=f(a,i+1,pi);
            return Math.max(t,nt);
        }
       
    }
    public static void main(String[] args) {
        int[]a={10,9,7,5,3,2,2,1};
        System.out.println(f(a,0,-1));
    }
}


 */

/* Memoization
import java.util.*;
public class longestIncreasingSubsequence {
    public static int f(int a[],int i,int pi,int dp[][]){
        if(i==a.length){
            return 0;
        }
        if(dp[i][pi+1]!=-1){
            return dp[i][pi+1];
        }
        else{
            int t=0;
            int nt=0;
            if(pi==-1||a[i]>a[pi]){
                t=1+f(a,i+1,i,dp);
            }
            nt=f(a,i+1,pi,dp);
            return dp[i][pi+1]=Math.max(t,nt);
        }
       
    }
    public static void main(String[] args) {
        int[]a={9,8,7,3,2,4,1,5,8,2};
        int dp[][]=new int[a.length][a.length+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        System.out.println(f(a,0,-1,dp));
    }
}
*/

/*Algorithm
 import java.util.*;
public class longestIncreasingSubsequence {
    public static void main(String[] args) {
        int[]a={9,8,7,3,2,4,1,5,8,2};
        int dp[]=new int[a.length];
        Arrays.fill(dp,1);
        int max=0;
        for(int i=1;i<a.length;i++){
            for(int j=0;j<=i-1;j++){
                if(a[j]<a[i]){
                    if(dp[i]<1+dp[j]){
                     dp[i]=1+dp[j];
                    }
                   // dp[i]=Math.max(dp[i],1+dp[j]);
                    max=Math.max(max,dp[i]);
                }
            }
        }
        
        System.out.println(max);
    }
}
 */

/* Ultimate Binary Search Approch
import java.util.ArrayList;

public class longestIncreasingSubsequence {

        public static int lowerBound(int a[],int x){
         int i=0;
         int j=a.length-1;
         int ans=-1;
         while(i<=j){
           int m=(i+j)/2;
           if(a[m]>=x){
           j=m-1;
           ans=m;
           }
           else{
               i=m+1;
           }
         }
         return ans;
         }
     
     public static int lowerBound(ArrayList<Integer>a,int x){
         int i=0;
         int j=a.size()-1;
         int ans=-1;
         while(i<=j){
           int m=(i+j)/2;
           if(a.get(m)>=x){
           j=m-1;
           ans=m;
           }
           else{
               i=m+1;
           }
         }
         return ans;
         }
         public static void main(String[] args) {
       int a[]={1,7,8,4,5,6,-1,9};
       ArrayList<Integer>ans=new ArrayList<>();
       ans.add(a[0]);
       int l=1;
       for(int i=1;i<a.length;i++){
        if(a[i]>ans.get(ans.size()-1)){
            ans.add(a[i]);
            l++;
        }
        else{
            int k=lowerBound(ans,a[i]);
            ans.set(k,a[i]);
        }
       }
       System.out.println(l);
      }
   
   
   }
   */

   /*Printing Of LIS 
import java.util.*;
public class longestIncreasingSubsequence {
    public static void main(String[] args) {
        int[]a={9,8,7,3,2,4,1,5,8,2};
        int dp[]=new int[a.length];
        int map[]=new int[a.length];
        Arrays.fill(dp,1);
        int max=1;
        int li=0;
        for(int i=1;i<a.length;i++){
            map[i]=i;
            for(int j=0;j<=i-1;j++){
                if(a[j]<a[i]&&dp[i]<1+dp[j]){
                      dp[i]=1+dp[j];
                      map[i]=j;
                      if(dp[i]>max){
                        li=i;
                        max=dp[i];
                      }
                     
                    }
                   
                }
            }
           
          ArrayList<Integer>ans=new ArrayList<>();
           ans.add(a[li]);
            while(map[li]!=li){
              li=map[li];
              ans.add(a[li]);
            }
            Collections.reverse(ans);
            System.out.println(ans);

      //System.out.println(li);
    }
        }
        
      */  
 