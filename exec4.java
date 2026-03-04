public class exec4 {
    public static void main(String[] args) {
        String aux = "Maria";
        System.out.println(invertString(0, aux.length()-1, aux));
    }

    public static String invertString(int n,int m, String str){
        if (n >= m) {
            return str;
        }
        char a = str.charAt(n);
        char b = str.charAt(m);
        str = str.substring(n+1, m);
        str = "" + b + str + a;
        return invertString(n+1, m-1, str);
    }
}
