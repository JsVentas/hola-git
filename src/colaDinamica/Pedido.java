
package colaDinamica;


class Pedido {

    private String descripcion;
    private float precio;
    
    public Pedido(){
        descripcion=" ";
        precio=0;
    }
    public Pedido(String des, int pre){
        descripcion=des;
        precio=pre;
    }
    void leer() {
        EntradaSalida.mostrarMensaje("Ingrese la descripcion: ");
        setDescripcion(EntradaSalida.leerString());
        EntradaSalida.mostrarMensaje("Ingrese el precio: ");
        setPrecio(EntradaSalida.leerFloat());
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return " --> " + descripcion + " - " + precio ;
    }
    
}
