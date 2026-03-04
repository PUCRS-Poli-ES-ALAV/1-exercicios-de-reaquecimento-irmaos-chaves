public class exec2 {
    public static void main(String[] args) {
        System.out.println(soma2NatNumbs(4, 5));
    }

    public static int soma2NatNumbs(int a, int b){
        if (b <=0) {
            return a;
        }
        return soma2NatNumbs(a+1, b-1);

    }
}
