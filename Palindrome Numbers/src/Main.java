import java.util.Scanner;

public class Main {
    static void isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber)
            System.out.println(number+" Palindrome number ");
        else
            System.out.println(number+" is not a Palindrome number ");
    }

    public static void main(String args[]) {
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        k = scanner.nextInt();
        isPalindrome(k);
    }
}
