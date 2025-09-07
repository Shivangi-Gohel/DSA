import java.util.*;

public class recursion {
    public static void printName(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("shivangi");
        printName(i + 1, n);
    }

    public static void one_to_N_series(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        one_to_N_series(i + 1, n);
    }

    public static void N_to_one_series(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        N_to_one_series(n - 1);
    }

    public static int sum_of_n_numbers(int i, int n, int sum) {
        if (i > n) {
            return sum;
        }
        sum = sum + i;
        return sum_of_n_numbers(i + 1, n, sum);
    }

    public static int factorial(int n, int fact) {
        if (n == 1) {
            return fact;
        }
        fact = fact * n;
        return factorial(n - 1, fact);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        int temp;
        if (start >= end) {
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        String str = "maddam";

        int ch;

        do {
            System.out.println("1. print name N times");
            System.out.println("2. print 1 to N");
            System.out.println("3. print N to 1");
            System.out.println("4. print sum of first N numbers");
            System.out.println("5. factorial of N number");
            System.out.println("6. reverse an array");
            System.out.println("7. check if palindrome");
            System.out.println("8. nth fibonacci number");
            System.out.println("9. to exit");
            System.out.println("Enter your choice:- ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter n: ");
                    int n = sc.nextInt();
                    printName(1, n);
                    break;

                case 2:
                    System.out.println("Enter n: ");
                    int n1 = sc.nextInt();
                    one_to_N_series(1, n1);
                    break;

                case 3:
                    System.out.println("Enter n: ");
                    int n2 = sc.nextInt();
                    N_to_one_series(n2);
                    break;

                case 4:
                    System.out.println("Enter n: ");
                    int n3 = sc.nextInt();
                    System.out.println(sum_of_n_numbers(1, n3, 0));
                    break;

                case 5:
                    System.out.println("Enter n: ");
                    int n4 = sc.nextInt();
                    System.out.println(factorial(n4, 1));
                    break;

                case 6:
                    reverseArray(arr, 0, arr.length - 1);
                    for (int i : arr) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 7:
                    System.out.println(isPalindrome(str, 0, str.length() - 1));
                    break;

                case 8:
                    System.out.println("Enter n: ");
                    int n5 = sc.nextInt();
                    System.out.println(fibonacci(n5));
                    break;

                case 9:
                    System.out.println("Thank you!...");
                    break;

                default:
                    break;
            }

        } while (ch != 9);
    }
}
