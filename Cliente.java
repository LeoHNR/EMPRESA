public class Cliente {
    //Atributos
    private String nombre;

    //Construtor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public void mostrar(){
        System.out.println("Nombre del cliente: "+nombre);
    }
    
}
