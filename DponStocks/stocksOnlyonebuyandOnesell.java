public class stocksOnlyonebuyandOnesell {

        public static void main(String[] args) {
            int price[]={7,2,1,5,7,9,2,3};
            int min=price[0];
            int maxprofit=Integer.MIN_VALUE;
            for(int i=1;i<price.length;i++){
                if(price[i]>min){
                    maxprofit=Math.max(maxprofit,price[i]-min);
                }
                else if(price[i]<min){
                  min=price[i];
                }
            }
            System.out.println(maxprofit);
        }
    }
    
