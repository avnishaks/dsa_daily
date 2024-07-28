package DSA_quick_reacap.dp_3_knapsack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapSack {
    static class Items{
        double ratio;
        double weights, values , idx;
        Items(int weights,int values,int idx){
            this.weights=weights;
            this.values=values;
            this.idx=idx;
            this.ratio=  ((double)values/(double)weights);
        }
    }
    public static int solve(int[] values, int[] weights, int capacity){
        double totalValue=0d;
        Items [] isValue=new Items[values.length];
        for(int i=0;i<values.length;i++){
            isValue[i]=new Items(weights[i],values[i],i);
        }
        Arrays.sort(isValue, new Comparator<Items>() {
            @Override
            public int compare(Items o1, Items o2) {
                if(o1.ratio>=o2.ratio){
                    return -1;
                }
                return 1;
            }
        });

        for(Items x:isValue){
            int currWeight=(int)x.weights;
            int currValue=(int)x.values;
            if(capacity-currWeight>=0){
                capacity-=currWeight;
                totalValue+=currValue;
            }
            else{
                double fractions = (double) capacity /(double) currWeight;
                totalValue+=currValue*fractions;
//                capacity=(int) (capacity- currWeight*fractions);
                break;
            }
        }
        totalValue *= 1000;
        return (int)(totalValue / 10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] values=new int[size];
        for(int i=0;i<size;i++){
            values[i]=sc.nextInt();
        }
        int [] weight=new int[size];
        for(int i=0;i<size;i++){
            weight[i]=sc.nextInt();
        }
        int capacity=sc.nextInt();

        System.out.println("maximum total value that we can fit in the knapsack : "+solve(values,weight,capacity));
    }
}
