package Design_Pattern.DP_1_Introduction_Singleton;

public class EagerLoading {
    // can't able passed any argument in object
    private static EagerLoading dbInstance=new EagerLoading();
    String url;
    String username;
    String password;

    private EagerLoading(){

    }

    public static EagerLoading getInstance(){
        return dbInstance;
    }

    public static void main(String[] args) {

        System.out.println("Eager Loading , Object initialized at the start of the program : "+EagerLoading.getInstance());

        /*
        Issues with the Eager Loading :-
        1. App Start up time increased
        2. Create an object when not needed
        3. Can not pass variable argument

         */
    }
}
