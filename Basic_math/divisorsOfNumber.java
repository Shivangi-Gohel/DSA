import java.util.*;

public class divisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                if(number/i != i) {
                    divisors.add(number/i);
                }
            }
        }
        Collections.sort(divisors);
        System.out.println(divisors);
    }
}
