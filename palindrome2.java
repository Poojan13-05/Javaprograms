import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the string");
        String a= in.next();
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                i++;
                j--;
                System.out.println("not a palindrome");
            }
            else
                System.out.println("it is a palindrome");

        }

    }
}
