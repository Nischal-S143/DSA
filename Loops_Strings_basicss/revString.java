// NOT OPTIMIZED AS IT CREATES THE NEW STRING INTERNALLY AND OLD STRING WAITS FOR GARBAGE

// import java.util.*;
// public class revString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         s = s.toLowerCase();
//         String str = "";
//         for(int i = 0 ; i < s.length() ; i++){
//             char c = s.charAt(i);
//             str = c + str;
//         }
//         System.out.println(str);
//     }
// }

// USING STRINGBUILDER TO CHANGE THE EXISTING STRING 

import java.util.*;
public class revString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
}