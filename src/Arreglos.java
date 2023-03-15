//6 CALIFICACIONES DE UN ALUMNO Y MOSTRAREMOS LAS CALIFICACIONES APROBADAS Y TAMBIEN CUANTAS APROBO

public class Arreglos {


    public static void main(String[] args) {
        double califiaciones[] = {5, 6, 7,3, 10, 5.99};
        System.out.println("--CALIFICAICONES--");

        int no_aprobadas = 0;
        int contador = 0;
        for (int i = 0; i < califiaciones.length; i++) {
            contador ++;
            if (califiaciones[i] > 5){
                System.out.println("CAlIFICACION: " + contador + " APROBADA CON: " + califiaciones[i]);
                 no_aprobadas++;
            }
        }
        System.out.println("No de calificaciones aprobadas: " + no_aprobadas);
    }



}
