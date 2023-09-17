import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(" Enter the salary  :");
        int salary= in.nextInt();
        System.out.println("The salary is : "+salary);
        if(salary>10000){
            salary=salary+2000;
       } else {
            salary=salary+1000;
        }

        System.out.println("The updated salary is " +salary);
    }
}
