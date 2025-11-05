//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1
import java.util.*;
public class PallandromicNumDiamond {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= n-i ; j++ ){
                System.out.print(" ");
            }
            for(int k = i ; k>= 1 ; k--){
                System.out.print(k);
            }
            for(int r = 2; r <= i ; r++ ){
                System.out.print(r);
            }
            System.out.println();
        }
        for(int i = 1 ; i<= n-1 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            for(int p = n-i ; p>=1 ;p--){
                System.out.print(p);
            }
            for(int t = 2 ; t<=n-i ; t++){
                System.out.print(t);
            }
            System.out.println();
        }
    }
}

