import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        System.out.println("Enter the count number");
        int y= in.nextInt();
        int count=0;

        while (n>0){
            int rem=n%10;
            if (rem==y){
                count++;
            }
            n=n/10;

        }
        System.out.println("The counts are:" + count);
    }

}
