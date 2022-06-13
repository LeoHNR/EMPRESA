public class main {
    public static void main(String[] args) {
     Empresa empresa=new Empresa("UNAH");
     empresa.agregarClientes(new Cliente("Leo"));
     empresa.agregarClientes(new Cliente("juan"));
     empresa.contratar("Pedro", 1200);
     empresa.mostrarClientes();
     empresa.mostrarempleados();
    }
}
