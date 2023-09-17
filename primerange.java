import java.util.Scanner;

public class primerange {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= in.nextInt();
        System.out.println("Enter the last number");
        int b= in.nextInt();
        int count,total=0;
        for (int i=a;i<=b;i++){
            count=0;
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    count++;
                }


                }
            if (count==2){
                total=total+1;
                System.out.println(i);
            }

        }
        System.out.println("total number of prime numbers"+total);
    }


}
