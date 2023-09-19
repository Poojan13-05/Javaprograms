import java.util.Scanner;

public class arraysort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the order:- 1. Asc or 2. Des");
        int order = in.nextInt();
        switch (order) {

            case 1:
                for (int i = 0; i < n; i++) {

                    for (int j = i+1; j < n; j++) {
                        if (arr[i] > arr[j]) {
                            int temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;


                        }
                    }
                }
                        for (int i = 0; i < n; i++) {
                            System.out.println(arr[i]);

                        }
                        break;

                        case 2:
                            for (int i = 0; i < n; i++) {
                                for (int j = i+1; j < n; j++) {
                                    if (arr[i] < arr[j]) {
                                        int temp = arr[j];
                                        arr[j] = arr[i];
                                        arr[i] = temp;

                                    }

                                }


                            }
                            for (int i = 0; i < n; i++) {
                                System.out.println(arr[i]);

                            }
                            break;

                        default:
                            System.out.println("Enter valid input");



        }
    }
}
