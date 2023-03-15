import javax.swing.JOptionPane;
public class Arreglo_Problema {
    public static void main(String[] args) {
        double calif[] =  new double[6];
        int contador = 0;
        System.out.println("Ingrese las 6 calificaciones");
        for (int i = 0; i < calif.length; i++) {
            calif[i]= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la calificacion" +(i+1)));
        }
        System.out.println("Calificaciones aprobatorias: ");
        for (int i = 0; i <calif.length ; i++) {
            if (calif[i] >= 6){
                System.out.println(calif[i]);
                contador ++;
            }
        }
        System.out.println("Total de calificaciones aprobadas: " + contador);
        if(contador >= 3){
            JOptionPane.showMessageDialog(null, "Puede reprobar el anio!");
        }
    }
}
