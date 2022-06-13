public class main {
    public static void main(String[] args) {
        Empresa listaEmpresa=new Empresa("farmacia");
        Empleado nuevoEmpleado=new Empleado(1200, "hector");
        Empleado nuevoEmpleado1=new Empleado(1500, "leonel");
        listaEmpresa.contratar(nuevoEmpleado);
        listaEmpresa.contratar(nuevoEmpleado1);
        listaEmpresa.imprimirLista();
    }
}
