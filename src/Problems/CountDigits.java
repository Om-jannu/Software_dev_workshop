 /**
    1. You've to count the number of digits in a number.
    2. Take as input "n", the number for which the digits has to be counted.
    3. Print the digits in that number.
 */
 package Problems;
import java.util.*;


public class CountDigits{

public static void main(String[] args) {
  // write your code here
    Scanner sc = new Scanner(System.in);
    int count=0;
    System.out.println("Enter series of numbers : ");
    int n = sc.nextInt();
    while(n!=0){
        n=n/10;
        count++;
    }
    System.out.println("number of digits in "+n +" is "+count);
 }
}
