package Problems;/*
    1. You've to display the digits of a number in reverse.
    2. Take as input "n", the number for which digits have to be display in reverse.
    3. Print the digits of the number line-wise, but in reverse order.
 */
import java.beans.PropertyEditorManager;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
       // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter series of numbers : ");
        int n = sc.nextInt();
        int rem = 0;

        while(n>0){
                rem = rem*10 + n%10;
                n = n/10;
        }
        System.out.println(rem);
    }
}
