
// import java.util.*;

// public class RemoveDuplicatesSet {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 2, 3, 4, 4, 5, 1, 6};

// Set<Integer> uniqueNumbers = new HashSet<>();
// for(int num : numbers){
//     uniqueNumbers.add(num);
// }

//         System.out.println("Unique elements: " + uniqueNumbers);
//     }
// }
// import java.util.*;

// public class RemoveDuplicatesSet {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int temp = arr[0];
//         for (int j = 1; j < n; j++) {
//             arr[j-1] = arr[j];
//         }
//         arr[n - 1] = temp;
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]);
//         }
//     }
// }
import java.util.*;

public class RemoveDuplicatesSet {
    public static void RotateArray(int n, int[] arr, int d) {
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int j = 0; j < d; j++) {
            arr[n - d + j] = temp[j];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RotateArray(n, arr, d);
    }
}