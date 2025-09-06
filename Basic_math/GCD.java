import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        // gcd(a, b) = gcd(a % b, b)

        while(num1 > 0 && num2 > 0) {
            if(num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }

        if(num1 == 0) {
            System.out.println("GCD is: " + num2);
        } else {
            System.out.println("GCD is: " + num1);
        }
    }
}


// another methos to solve GCD

// for(int i=Math.min(num1, num2); i>=1; i--) {
//     if(num1 % i == 0 && num2 % i == 0) {
//         gcd = i;
//         break;
//     }
// }
// System.out.println("GCD of "+ num1 + " and " + num2 + " is: " + gcd);
