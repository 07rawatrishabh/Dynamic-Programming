import java.util.*;
// Printing of Larget Divisble subset 
public class LargestDivisibleSubset {
   public static void main(String[] args) {
    int a[]={9,8,7,3,2,4,1,5,8,2};
    Arrays.sort(a);
   int dp[]=new int[a.length];
   int map[]=new int[a.length];
   Arrays.fill(dp,1);
   int ind=1;
   int max=1;
    for(int i=1;i<a.length;i++){
        map[i]=i;
        for(int j=0;j<i;j++){
        if(a[i]%a[j]==0&&dp[i]<1+dp[j]){
            map[i]=j;
            dp[i]=1+dp[j];
            if(dp[i]>max){
                ind=i;
                max=dp[i];
              }
        }
        }
    }

   ArrayList<Integer>ans=new ArrayList<>();
    ans.add(a[ind]);

    while(ind!=map[ind]){
        ind=map[ind];
         ans.add(a[ind]);
    }
    System.out.println();
    System.out.println(ans);
   } 
}
