package Pruebas;

import java.time.LocalDate;
import java.util.*;

public class App {

    //Invertir una cadena
    private void m1InvertirString(String text){
        String[] array =  text.split("");
        StringBuilder newText = new StringBuilder();

        for (int i = array.length ; i > 0 ; i--) {
            newText.append(array[i -1]);
        }
        System.out.println(newText);
    }

    //Invertir cadena con funcionalidades de Java desde 5
    private void m2InvertirString(String text){
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);

    }

    private void m3IsCapidua(int numero){
        String numberText = String.valueOf(numero);
        String reverseText = new StringBuilder(numberText).reverse().toString();
        if(numberText.equals(reverseText)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }

    private void m3CountCharacterTimes(String text){
        int i, lenght, counter[] = new int[256];
        lenght = text.length();
        System.out.println(lenght);
        for (i=0; i<lenght;i++){
            counter[text.charAt(i)] ++;
            System.out.println(counter[text.charAt(i)] +"-" + text.charAt(i));
        }
        for (i=0; i<256; i++){
            if(counter[i] !=0){
                System.out.println((char)i + ": "+counter[i]);
            }
        }
    }

    private void m4RepeatedCharacters(String text){
        int i, lenght, counter[] = new int[256];
        lenght = text.length();
        System.out.println(lenght);
        for (i=0; i<lenght;i++){
            counter[text.charAt(i)] ++;
            System.out.println(counter[text.charAt(i)] +"-" + text.charAt(i));
        }
        for (i=0; i<256; i++){
            if(counter[i] >= 1){
                System.out.println((char)i + ": "+counter[i]);
            }
        }
    }

    private void esMultiplo(int numero){
        if(numero % 2 ==0){
            System.out.println("Es multiplo");
        }else{
            System.out.println("No es multiplo");
        }
    }

    private void m6IsLeapYear(int year){
        Boolean isYear =    LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(isYear);
    }

    public void m7RandomOrderString(String texto){
        String[] array = texto.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }

    public void m8GetOnlyNotDuplicatesList(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }

    public void m9checarSiHayVocal(String text){
        String[] array = text.split("");
        boolean isPresent = false;
        for (String s : array){
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);

    }

    public void m9checarSiHayVocal2(String text){
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);

    }

    public boolean m10Palindromo(String text){
        text.toLowerCase();
        for(int i= 0, j = text.length() -1; i<=j ; i++, j-- ){
            if (text.charAt(i) != text.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public boolean m11Palindromo(String text){
        boolean result = true;
        int lenght = text.length();
        for (int i = 0; i < lenght/2; i++) {
            if(text.charAt(i) != text.charAt(lenght - i -1)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //Instancia
        App app = new App();
        app.m1InvertirString("carloskarim");
        app.m2InvertirString("carloskarim");
        app.m3IsCapidua(12);
        //app.m3CountCharacterTimes("carloskarim");
        app.m4RepeatedCharacters("carloskarim");
        app.esMultiplo(5);
        app.m6IsLeapYear(2000);
        app.m7RandomOrderString("carlos");
        app.m8GetOnlyNotDuplicatesList(Arrays.asList(1,2,3,4,5,6,7,5,9,2));
        app.m9checarSiHayVocal("carlos");
        app.m9checarSiHayVocal2("cs");
        System.out.println(app.m10Palindromo("oso"));

        System.out.println(app.m11Palindromo("oroo"));
    }
}
