package grill_of_java.exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
    public static void recDemo(int i){
        while(i!=0){
            i++;
            recDemo(i);
        }
    }
    public static void main(String[] args) {
        //recDemo(1);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=0;

        try{
            int i=Integer.parseInt(br.readLine());
            int k=10/i;
            System.out.println("The final value of answer :"+k);
        }
        catch (IOException e){
            System.out.println("Input/Output Exception occured here ");
        }
        catch (ArithmeticException e){
            System.out.println("Divided by 0 is not allowed! ");
        }

    }
}
