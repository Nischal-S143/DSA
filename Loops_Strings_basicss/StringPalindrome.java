
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = s.length()-1;
        boolean isPalindrome = true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome?"String is Palindrome":"String is not palindrome");
    }
}
