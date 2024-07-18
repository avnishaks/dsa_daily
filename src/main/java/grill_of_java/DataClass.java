package grill_of_java;

import java.util.ArrayList;
import java.util.List;

/*
Type of data in java
1. primitive type : char , int , float , boolean
2. object type : 
 */
public class DataClass {
    public static void main(String[] args) {
//        DClass dClass=new DClass();
        List<AClass> list=new ArrayList<>();
        list.add(new AClass());
        list.add(new BClass());
        list.add(new CClass());
        list.add(new DClass());
        for(int i=0;i<list.size();i++){
            System.out.println("At poisition : "+i+" value is : "+list.get(i).doSomething());
        }
    }
}
