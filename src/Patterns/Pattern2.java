package Patterns;

/*
 I/P-> 5
 O/P->
 *****
 ****
 ***
 **
 *

*/
import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
        // write ur code here
          for (int i = 0;i<=n;i++){
              for (int j=n;j>=i;j--){
                  System.out.print("*");
                  }
                  System.out.print("\n");
              }
          }
    }