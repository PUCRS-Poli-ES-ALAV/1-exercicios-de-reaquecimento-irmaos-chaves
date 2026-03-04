public class exec1{
    public static void main(String [] args){
        
        System.out.println(mult2NatNumbs(10, 5, 0));
    }

    public static int mult2NatNumbs(int a, int b, int acc){
        if (b <= 0) {
            return acc;
        }
    
        return mult2NatNumbs(a, b-1, acc+= a);
    }
}