public class palindromo {
    public static void main(String[] args) {
        String palabra = "coso";
        System.out.println("La palabra " + palabra + " es palindromo: " + esPalindromo(palabra));

        String primerString = "sos";
        System.out.println(primerCaracterNoRepetido(primerString));

    }
    public static boolean esPalindromo(String palabra){
        palabra.toLowerCase();
        for (int i = 0 , j = palabra.length() -1; i <= j ; i++, j--) {
            if(palabra.charAt(i) != palabra.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static char primerCaracterNoRepetido(String s){
        System.out.println("----------");
        for (int i = 0; i < s.length(); i++) {
            boolean repetido = false;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && (i != j)){
                    repetido = true;
                }
            }
            if(!repetido){
                return s.charAt(i);
            }
        }
        return '-';
    }
}
