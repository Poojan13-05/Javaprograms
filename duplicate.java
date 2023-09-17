import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int k=0;k< arr.length;k++){
            arr[k]=in.nextInt();
        }
        for (int i=0;i< arr.length;i++){
            for (int j=i+1; j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i] + "at index" + j);

                }
            }
        }
    }
}
