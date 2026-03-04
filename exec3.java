public class exec3 {
    public static void main(String[] args) {
        System.out.println(somaFracao(1, 5, 0));
    }

    public static double somaFracao(int aux,int n, double acc){
        if (aux > n) {
            return acc;
        }
        acc = acc + (1.0/aux);
        return somaFracao(aux+1, n, acc);
    }
}
