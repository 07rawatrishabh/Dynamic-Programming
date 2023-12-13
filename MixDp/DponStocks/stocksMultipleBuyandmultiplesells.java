public class stocksMultipleBuyandmultiplesells{
public static class pair{
    int x;
    boolean t;
    public pair(int y,boolean s){
        x=y;
        t=s;
    }
}
    public static int f(int a[],int i,boolean flag){
        if(i==a.length){
            return 0;
        }
        int p=0;
        if(flag){
        p=Math.max(-a[i]+f(a,i+1,false),f(a,i+1,true));
        }
        else{
        p=Math.max(a[i]+f(a,i+1,true),f(a,i+1,false));
        }
     return p;
    }
    public static void main(String[] args) {
        int price[]={7,2,1,5,7,9,2,3};
      
       System.out.println(f(price,0,true));
    }
}
