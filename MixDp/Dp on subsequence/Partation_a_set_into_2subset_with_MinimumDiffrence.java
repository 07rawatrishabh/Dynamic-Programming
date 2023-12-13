
public class Partation_a_set_into_2subset_with_MinimumDiffrence {
    public static void main(String[] args) {
        int a[]={3,2,7};
        int sum=0;
        for(int i:a){
            sum+=i;
        }
       int target=sum;
       boolean curr[]=new boolean[target+1];
       boolean pre[]=new boolean[target+1];
       pre[0]=curr[0]=true;
       pre[a[0]]=true;
       for(int i=1;i<a.length;i++){
        pre[0]=curr[0]=true;
        for(int j=1;j<=target;j++){
            boolean nt=pre[j];
            boolean t=false;
            if(j-a[i]>=0){
              t=pre[j-a[i]];
            }
            curr[j]=(t||nt);
        }
        pre=curr;
       }
       
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<=sum/2;i++){
        if(pre[i]==true){
            int sn=sum-i;
         ans=Math.min(ans,Math.abs(sn-i));
        }
       }
       System.out.println(ans);



    }
}
