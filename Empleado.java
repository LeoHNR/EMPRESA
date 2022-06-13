public class Empleado{
    //atributos
    private String nombre;
    private int sueldo;
    //Constructor
    public Empleado(int sueldo, String nombre) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    //Metodos
    public void mostrar(){
        System.out.println("La cantidad de sueldo es: "+ sueldo);
        System.out.println("Nombre: " + nombre);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String toString(){
        return "EMPLEADO: "+nombre + "  SUELDO: "+sueldo;
    }
    
    
}