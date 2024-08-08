package Design_Pattern.DP_1_Introduction_Singleton;

public class Singleton {
    String url;
    String userName;
    String passWord;
    private static Singleton dbInstance=null;
    // with help of private keyword , Singleton has power to create object now
    private Singleton(){

    }
    public static Singleton getObjectInstance(){
        if(dbInstance==null){
            dbInstance=new Singleton();
        }
        return dbInstance;
    }
    public static void main(String[] args) {
        /*

        1. Above code is not thread safe , if we have multiple item in pipeline
        and in the end , we are in space of getting instance of object getting created!

        */
        Singleton.getObjectInstance();
        System.out.println("Singleton Design Pattern =>  :  "+Singleton.getObjectInstance());
    }
}
