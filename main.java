public class main {
    public static void main(String[] args) {
     Empresa empresa=new Empresa("UNAH");
     empresa.agregarClientes(new Cliente("Leo"));
     empresa.agregarClientes(new Cliente("juan"));
     empresa.contratar(new Empleado("teto", 1500));
     empresa.mostrarClientes();
     empresa.mostrarempleados();
    }
}
