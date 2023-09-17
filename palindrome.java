
    import java.util.Scanner;
    public class palindrome {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            if(isPalindrome(inputString)) {
                System.out.println(inputString + " is a palindrome");
            }
            else {
                System.out.println(inputString + " is not a palindrome");
            }
        }

        public static boolean isPalindrome(String str) {
            int i = 0;
            int j = str.length() - 1;

            while(i < j) {
                if(str.charAt(i) != str.charAt(j))
                    return false;

                i++;
                j--;
            }

            return true;

}
    }

