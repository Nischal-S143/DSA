import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n;
        int sum = 0;
        int digits = 0;
        int temp = n;
        while(temp!=0){
            digits++;
            temp/=10;
        }
        temp =n;
        while(temp!=0){
            int rem = temp%10;
            sum += Math.pow(rem,digits);
            temp/=10;
        }
        if(sum == n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
 
    }
}
