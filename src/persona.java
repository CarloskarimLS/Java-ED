public class persona {
    private String nombre;
    private int edad;

    public persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //GETTERS
    public String devuelveNombre(){
        return nombre;
    }
    public int devuelveEdad(){
        return edad;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre+ "- Edad: " + edad;
    }
}
