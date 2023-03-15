public class EdadMayor {
    public static int personaMayor(persona[] person){
        int mayor;
        mayor = person[0].devuelveEdad();
        int i=1;
        while (i<person.length){
            if(person[i].devuelveEdad()>mayor){
                mayor = person[i].devuelveEdad();
            }
            i ++;
        }
        return mayor;
    }
}
