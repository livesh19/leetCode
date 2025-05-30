public class pattern3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            int x = i - 1;
            for (int k = 0; k < (n - i) + 1; k++) {
                System.out.print("*");
            }
            for (int k = 0; k < (n - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
