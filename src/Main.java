import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int miArreglo[] = {1,4,5,20,100};
        System.out.println(miArreglo[2]);
        System.out.println("---Busqueda de un numero---");
        for (int i = 0; i < miArreglo.length; i++) {
            if (miArreglo[i]==20){
                System.out.println("El 20 se encuentra dentro del arreglo, en la posicion: "+ i);
            }else{
                System.out.println("No se encuentra");
            }
        }

        //Arreglo de objetos
        System.out.println("-------------------------------");
        //persona arrayPersonas[] = new persona[5];
        //arrayPersonas[0] = new persona("Carlos", 22);
        persona arrayPersonas[] = {new persona("Brenda", 42), new persona("Carlos",23),
                                    new persona("Luna", 15), new persona("Juan", 34),
                                    new persona("Luis", 23), new persona("Adrian", 23)};

        System.out.println("La edad mayor del arreglo es: "+EdadMayor.personaMayor(arrayPersonas));
        System.out.println("Los datos del arreglo son: ");
        for (int i = 0; i < arrayPersonas.length; i++) {
            System.out.println("Datos de la persona: " + arrayPersonas[i].toString());
        }

        //Scanner
        System.out.println("-------------------------------");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String nom = scan.next();
        scan.close();

        System.out.println(a);
        System.out.println(nom);


    }

}