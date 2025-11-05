import java.util.*;
public class PalindromicNum {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int r = 1; r <= n-i ; r++){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1; j--){
                System.out.print(j);
            }
            for(int k = 2 ; k <= i ;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}