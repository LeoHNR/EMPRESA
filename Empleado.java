public class Empleado {
    private String nombre;
    private int sueldo;
    Empresa empresa;
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.setEmpresa(empresa);
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    @Override
    public String toString() {
        return "Empleado [empresa=" + empresa + ", nombre=" + nombre + ", sueldo=" + sueldo + "]"+"\n";
    }
    

    
}
