import java.util.*;
import java.lang.*;

public class Wrapper {
    public  static  void main(String[] args){
        /*
            - Integer
            - String
            - Long
            - Double
         */

        int a = 10;

        System.out.println("String conversion: " + Integer.toString(a));

        // diff b/w ++a & a++
        int b = 10;
        int c = 10;
        int res = 0;

        System.out.println((b++) + res);
        System.out.println(b);

        res = 0;
        System.out.println((++c) + res);
        System.out.println(c);
    }
}
