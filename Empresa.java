
import java.util.HashSet;
import java.util.Set;

public class Empresa {
  String nombre;
  private Empleado[] empleados;
  private int numEmpleados=0;
    HashSet<Cliente> clientes=new HashSet<Cliente>();

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados=new Empleado[4];
    }
    public void contratar(String nombre,int sueldo){
       empleados[numEmpleados]=new Empleado(nombre, sueldo);
       numEmpleados++;
       
    }
    public void mostrarempleados(){
        System.out.println("\t\t lista de empleados");
        for(int i=0;i<numEmpleados;i++){
            System.out.println(empleados[i]);
        }
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
