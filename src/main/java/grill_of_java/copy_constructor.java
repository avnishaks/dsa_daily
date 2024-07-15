package grill_of_java;

public class copy_constructor {
    String name;
    int age;
    copy_constructor(){

    }
    copy_constructor(copy_constructor cp){
        name=cp.name;
        age=cp.age;
    }
    public static void main(String[] args) {
        copy_constructor cp=new copy_constructor();
        cp.name="Avnish";
        cp.age=20;
        copy_constructor cp1=new copy_constructor(cp);
        System.out.println("The value for the copy constructor is "+cp1.name+"  "+cp1.age);
    }
}
