public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 0; row < n ; row++){
            for (int s = 0; s <= n-row+1; s++) {
                System.out.print(" ");
                
            }
            for (int col = 1; col <=2*row+1 ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
