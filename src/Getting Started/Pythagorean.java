package Getting/*
 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
 2. Take as input three numbers a, b and c.
 3. Print true if they can form a pythagorean triplet and false otherwise.
 I/P-> 5 3 4
 O/P-> true
 */
import java.util.*;

public class Pythagorean{

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter three numbers :-");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int temp_a = a;
            int temp_b = b;
            int temp_c = c;
            int temp1 = 0, temp2 = 0;
            if (b > a) {
                temp1 = a;
                a = b;
                b = temp1;
            }
            if (c > a) {
                temp2 = a;
                a = c;
                c = temp2;
            }
            if (a * a == ((b * b) + (c * c))) {
                System.out.println("true");
            } else {
                System.out.println(+temp_a + "," + temp_b + "," + temp_c + " are not a pythagorean trio");
            }
        }
    }
