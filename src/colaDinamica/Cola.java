package colaDinamica;

public abstract class Cola {//inicio interfaz Cola

    //declaracion de metodos abstractos de la interfaz Cola
    public abstract int size();

    public abstract boolean colaVacia();

    public abstract void poner(Object o);

    public abstract Object quitar();

    public abstract Object frente();

    @Override
    public abstract boolean equals(Object k);

    //redefinicion del metodo toString()
    @Override
    public String toString(){
        return ("Los elementos de la cola son: ");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
}//fin interfaz Cola