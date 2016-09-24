package colaDinamica;

public class Nodo {//inicio clase Nodo

    //declaracion de atributos
    private Object elem; //dato
    private Nodo ps;//puntero
    
    //constructor de la clase Nodo
    public Nodo(Object elem){
        this.elem=elem;
        this.ps=null;
    }

    //definicion del metodo setElem(Object e) 
    //carga el valor recibido en elem
    void setElem(Object e) {
        elem = e;
    }

    //definicion del metodo setPs(Nodo n) 
    //carga el valor recibido en ps
    void setPs(Nodo n) {
        ps = n;
    }

    //definicion del metodo getElem()
    //retorna un dato de tipo Object con el valor de elem
    Object getElem() {
        return elem;
    }

    //definicion del metodo getPs()
    //retorna un dato de tipo Nodo con el valor de ps
    Nodo getPs() {
        return ps;
    }
}//fin clase Nodo
