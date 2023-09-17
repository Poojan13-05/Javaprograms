public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 0; row <5 ; row++) {
            for (int s = 0; s <=n-row+1 ; s++) {
                System.out.print(" ");

            }
            for (int col = 1; col <= row+1; col++) {

                System.out.print(col);

            }
            for (int col = row; col >=1 ; col--) {

                System.out.print(col);
            }

            System.out.println();

        }
    }
}
