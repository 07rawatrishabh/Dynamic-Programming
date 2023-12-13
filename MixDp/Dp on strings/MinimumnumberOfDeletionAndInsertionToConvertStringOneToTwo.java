public class MinimumnumberOfDeletionAndInsertionToConvertStringOneToTwo {
    public static void main(String[] args) {
        String s1="Payal";
        String s2="Palak";
        int pre[]=new int[s2.length()+1];
        for(int i=1;i<s1.length()+1;i++){
            int curr[]=new int[s2.length()+1];
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]=1+curr[j-1];
                }
                else{
                    curr[j]=Math.max(curr[j-1], pre[j]);
                }
            }
            pre=curr;
        } 
        System.out.println("Number of  Deletion and Insertion required to make  s1=s2 : "+(s1.length()+s2.length()-2*pre[s2.length()]));
    }
}
