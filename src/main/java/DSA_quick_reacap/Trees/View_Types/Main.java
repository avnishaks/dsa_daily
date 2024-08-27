package DSA_quick_reacap.Trees.View_Types;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<5;i++){
            arrayList.add(0,i);
           // Integer.MAX_VALUE , Integer.MIN_VALUE
        }
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
