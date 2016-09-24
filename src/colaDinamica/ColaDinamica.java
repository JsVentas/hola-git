package colaDinamica;

//inicio clase ColaDinamica extiende a la clase Cola
public class ColaDinamica extends Cola {
    
    //declaracion de los atributos de la clase
    private Nodo frente;
    private Nodo fondo;
    
    //constructor de la clase ColaDinamica()
    public ColaDinamica() {
        frente = null;
        fondo = null;
    }
    
    //definicion del metodo size()
    //devuelve un entero que indica la cantidad de elementos en la cola
    public int size(){
        int cont=0;
        Nodo aux=frente;
        if(!colaVacia()){
            while(aux!=null){
                cont++;
                aux=aux.getPs();
            }
            return cont;
        }
        else{
            return 0;
        }        
    }
    
    //definicion del metodo colaVacia()
    //devuelve true si frente==null
    public boolean colaVacia(){
        return (frente==null);
    }

    //definicion del metodo poner(Object o)
    //inserta el elemento o en la cola
    public void poner(Object o){
        Nodo aux = new Nodo(o);
        if(colaVacia()){
            frente=aux;
        }
        else{
            fondo.setPs(aux);
        }
        fondo=aux;
    }

    //definicion del metodo quitar()
    //retorna el elemento que ha sido eliminado
    public Object quitar(){        
        if(!colaVacia()){
            Nodo aux=frente;
            frente = frente.getPs();
            return aux.getElem();
        }
        else{
            System.out.println("ERROR: cola vacia");
            return 0;
    }
    }

    //definicion del metodo frente()
    //retorna el valor del frente de la cola
    public  Object frente(){
        return frente.getElem();
    }

    //definicion del metodo equals(Object k)
    //retorna true si el elemento k se encuentra en la cola
    //retorna false si el elemento k NO se encuentra en la cola
    public boolean equals(Object k){
        int b=0;
        Nodo aux=frente;
        if(!colaVacia()){
            while(aux!=null && b==0){
                if(aux.getElem()==k){
                    b=1;
                }
                aux=aux.getPs();
            }            
        }
        else{
            System.out.println("Error: cola vacia");
        }
        if(b==0){
            return false;
        }
        else{
            return true;
        }          
    }
}
//fin clase ColaDinamica