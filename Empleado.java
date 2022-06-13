public class Empleado {
    private String nombre;
    private int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]"+"\n";
    }
    

    
}
