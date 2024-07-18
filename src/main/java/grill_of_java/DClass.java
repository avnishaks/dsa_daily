package grill_of_java;

public class DClass extends CClass {
    DClass(){
        super("Avnish");
        System.out.println("DClass constructor is called ! ");
    }

    public String doSomething(){
        return "D is doing something";
    }
}
