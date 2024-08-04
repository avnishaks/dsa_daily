package grill_of_java.exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionThrows {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int j=10;
        int i=Integer.parseInt(br.readLine());
        int k=j/i;
        System.out.println(k);

    }
}
