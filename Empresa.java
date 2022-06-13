public class Empresa {
    //atributos
    private String nombreEmpresa;
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int longitud;

    public Empresa(String nombreEmpresa){
        this.nombreEmpresa = nombreEmpresa;
        this.primerNodo = null;
        this.ultimoNodo = null;
    }
    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    public Nodo getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(Nodo ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }


    public void contratar(Object dato){
        if(estaVacia())
            this.primerNodo = this.ultimoNodo = new Nodo(dato);
        else{
            Nodo nvoNodo = new Nodo(dato, primerNodo);
            this.primerNodo = nvoNodo;
        }
        longitud++;
    }

    public void imprimirLista(){
        if(estaVacia())
            System.out.println("La lista " + this.nombreEmpresa + " se encuentra vacia");

        System.out.println("lista empleados de la empresa: " + this.nombreEmpresa);
        
        Nodo tmp = this.primerNodo;
        while(tmp.getSiguienteNodo() != null){
            System.out.print(tmp.getDato() + "\n");
            tmp = tmp.getSiguienteNodo();
        }
        System.out.println(tmp.getDato());
    }

    public Object ObtenerDato(int indice){
        int i = 0;
        int contador = 0;
        Nodo tmp = primerNodo;

        while(contador < indice)
        {

            tmp = tmp.getSiguienteNodo();
            contador ++;

        }
        return tmp.getDato();

    }

    public boolean estaVacia(){
        return (null == this.primerNodo);
    }

    public int getLongitud(){
        return this.longitud;
    }

    public Object getDato(){
        return getDato();
    }

}
