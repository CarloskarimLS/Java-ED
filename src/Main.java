public class Main {
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
    }
}