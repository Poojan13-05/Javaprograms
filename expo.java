import java.util.Scanner;

public class expo {
    public static void main(String[] args) {
        expon s1=new expon();
        s1.expo();
    }
}
class expon{
    Scanner in=new Scanner(System.in);
    int p,b,result=1;
    void expo(){
        System.out.println("Enter the base");
        int b = in.nextInt();
        System.out.println("Enter the power");
        int p= in.nextInt();
        for (int i = 0; i <p ; i++) {
            result=result*b;

        }
        System.out.println("The answer is "+result);

    }
}
