
import java.util.HashSet;

public class Empresa {
  String nombre;
  HashSet<Empleado> empleados=new HashSet<Empleado>();
    HashSet<Cliente> clientes=new HashSet<Cliente>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }
    public void contratar(Empleado empleado){
        empleados.add(empleado);
        empleado.setEmpresa(this);
    }
    public void mostrarempleados(){
        System.out.println("\t\t lista de empleados");
        System.out.println(empleados.toString());
    }
    public void agregarClientes(Cliente cliente){
        clientes.add(cliente);
        cliente.setEmpresa(this);
    }
    public void mostrarClientes(){
        System.out.println("\t\t lista de clientes");
        System.out.println(clientes.toString());
    }
    @Override
    public String toString() {
        return "[" + nombre + "]";
    }

        
}
