
import java.util.*;
public class NumPalindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = n;
    int rev = 0;
    while(n!=0){
        int rem = n % 10 ;
        rev = rev*10 + rem;
        n = n/10;
    }
    if(c==rev){
        System.out.println("Number is Palindrome");
    }
    else{
        System.out.println("Number is not Palindrome");
    }
    }
}

