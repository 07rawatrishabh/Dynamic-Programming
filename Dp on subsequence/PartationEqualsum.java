
//SpaceOptimization
public class PartationEqualsum {
    
    public static boolean is_sum_present(int a[],int target){
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
       return(pre[target]);
    }
    public static void main(String[] args) {
        int a[]={2,3,3,3,4,5};
        int sum=0;
        for(int i:a){
            sum+=i;
        }
      if(sum%2==1){
        System.out.println(false);
      }
      else{
        sum/=2;
        System.out.println(is_sum_present(a,sum));

      }
    }
}
