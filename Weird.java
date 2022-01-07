import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Weird {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0) //odd
        {
            System.out.println("Weird");
        }
        else if(N >=2&&N<=5)  //even and 2 to 5 range
        {
            System.out.println("Not Weird");
        }
        else if(N>=6 && N <= 20)  //even and 6 to 20 range 
        {    
            System.out.println("Weird");
        }
        else if(N>=20) //even and N>20
        {
            System.out.println("Not Weird");
        }
        scanner.close();

    }
}
