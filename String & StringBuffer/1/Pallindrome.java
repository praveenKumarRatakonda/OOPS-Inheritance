import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        s = in.nextLine();

        if (isPalindrome(s))
            System.out.print("String is Pallindrome!");
        else
            System.out.print("String is not Pallindrome!");
    }

    static boolean isPalindrome(String s) {
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1))
                return false;
        }
        return true;
    }
}