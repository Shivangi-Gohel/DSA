import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int reversedNumber = 0;
        while(temp > 0) {
            int lastDigit = temp % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            temp = temp/10;
        }
        if(number == reversedNumber) {
            System.out.println("It's a pallindrom number");
        } else {
            System.out.println("It's not a pallindrom number");
        }
    }
}
