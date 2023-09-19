import java.util.Scanner;

public class oop1 {
    public static void main(String[] args) {

        userinput();

    }

      static void userinput(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= in.nextInt();
        System.out.println("Enter the second number");
        int b= in.nextInt();
        System.out.println("Enter the operator");
        char c=in.next().charAt(0);
        double result;
        switch (c){
            case'+':
                result=a+b;
                System.out.println(result);
                break;
            case '-':
                result=a-b;
                System.out.println(result);
                break;
            case '*':
                result=a*b;
                System.out.println(result);
                break;
            case '/':
                result=a/b;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid input");

        }
    }



}
