public class SwapNums {

    public static void Swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.print(b);
    }
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        Swap(a, b);
    }
}