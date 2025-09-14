import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversedNumber = 0;
        while(number != 0) {
            int lastDigit = number%10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number/10;
        }
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
