import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        String cleaned = StringUtilities.cleanString(input);
        String reversed = StringUtilities.reverse(input);

        boolean isPalindrome = cleaned.equals(reversed);

        int vowelCount = StringUtilities.vowelCount(input);

        System.out.println("Original input: " + input);
        System.out.println("Reverse is: " + reversed);
        System.out.println("Is it a palindrome?: " + (isPalindrome ? "Of course it's a palindrome! it's reverse is the same" : "The reverse is different, so it's not a palindrome."));
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}