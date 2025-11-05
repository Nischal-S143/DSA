import java.util.*;

public class ButterFlyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int p = 1; p <= 2 * (n - i); p++) {
                System.out.print(" ");
            }
            for (int r = 1; r <= i; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int o = 1; o <= i; o++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
