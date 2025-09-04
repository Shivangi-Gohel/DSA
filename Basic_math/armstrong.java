import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int temp1 = number;
        int count = 0;
        int ans = 0;

        while(temp>0) {
            count++;
            temp = temp/10;
        }
        while(temp1>0) {
            int lastDigit = temp1%10;
            ans = (int) (ans + Math.pow(lastDigit, count));
            temp1 = temp1/10;
        }
        if(number == ans) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("It is not an armstrong number");
        }
    }
}
