// Not Optimized

// import  java.util.*;
// public class AllDivisers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1 ; i <= n ; i++){
//             if(n%i==0){
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


// Optimized

import java.util.*;
public class AllDivisers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> divisers = new ArrayList<>();
        for(int i = 1 ; i*i <= n; i++){
            if(n%i==0){
                divisers.add(i);
                if(i!=(n/i)){
                    divisers.add(n/i);
                }
            }
        }
        Collections.sort(divisers);

        for(int d : divisers){
            System.out.println(d);
        }
    }
}