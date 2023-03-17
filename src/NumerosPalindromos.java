public class NumerosPalindromos {
    public static void main(String[] args) {
        int num = 1231;
        System.out.println("EL numero: " + num + " es capicua: " + esCapicua(num));
    }
    public static boolean esCapicua(int numero){
        String palabra = String.valueOf(numero);
        for (int i = 0, j= palabra.length()-1; i <= j; i++, j--) {
            if(palabra.charAt(i) != palabra.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
