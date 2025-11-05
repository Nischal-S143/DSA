public class BinomialCoefficient {

    public static int Factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static int Bino_Coeffi(int n , int r){
        int nFact = Factorial(n);
        int rFact = Factorial(r);
        int nrFact = Factorial(n-r);
        int biCo = nFact/(rFact*nrFact);
        return biCo;
    }

    public static void main(String[] args) {
        int n = 6;
        int r =4;
        System.out.println(Bino_Coeffi(n, r));
    }
}
