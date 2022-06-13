public class Cliente{
    private String nombre;
    Empresa empresa;
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    @Override
    public String toString() {
        return "Cliente [empresa=" + empresa + ", nombre=" + nombre + "]"+"\n";
    }
  
    
    
    
    
}