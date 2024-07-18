package grill_of_java;

public class CClass extends BClass {
    CClass(){
        System.out.println("CClass constructor is called ! ");
    }

    CClass(String name){
        System.out.println("Name of the CClass is "+name);
    }

    public String doSomething(){
        return "C is doing something";
    }

}
