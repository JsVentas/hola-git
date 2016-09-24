//Se desea un programa para introducir los pedidos de un restaurante
//de forma que sean atendido en forma en la que van llegando y luego 
//sean mandados a las mesas o para llevar. 

package colaDinamica;

import java.io.*;
import java.util.Scanner;


public class EjercicioCola {

    public static void main(String[] args) {
        ColaDinamica cola; //nueva cola
        cola = new ColaDinamica();
        Scanner leer = new Scanner(System.in); //variable para ingreso por teclado
        int opc;
        Object aux;
do {
            imprimeMenu();//llamada a imprimeMenu();
            opc = EntradaSalida.leerInt();//ingresa opcion

            switch (opc) {//inicio switch(opc)
                case 1://case opc=1 - poner en cola
                    ingresarPedidos(cola);
                    break;

                case 2://case opc=2 - Sacar de cola
                    aux=cola.quitar();
                    EntradaSalida.mostrarMensaje("Se a retirado el pedido"+aux.toString());
                    break;

                case 3: //case opc=3 - Cantidad de pedidos
                    if (!cola.colaVacia()) {
                        EntradaSalida.mostrarMensaje("La pila tiene " + cola.size() + " articulos");
                    } else {
                        EntradaSalida.mostrarMensaje("ERROR: La pila esta vacia");
                    }
                    break;

                case 4://case opc=4 - Determinar cola vacia
                    if (!cola.colaVacia()) {
                        EntradaSalida.mostrarMensaje("La cola NO esta vacia");
                    } else {
                        EntradaSalida.mostrarMensaje("La cola esta vacia");
                    }
                    break;

                case 5://case opc=5 - Imprimir pila
                    imprimeCola(cola);
                    break;

                case 0:
                    break;
            }//fin switch(opc)
        } while (opc != 0);//fin do-while(opc!=0)
    }//fin main
    
    public static void imprimeCola(ColaDinamica cola){
        Object elem;
        if(!cola.colaVacia()){
            int i=0;
            cola.toString();
            while(i<cola.size()){
                elem=cola.quitar();
                cola.poner(elem);
                System.out.print(" "+elem);                
                i++;
            }     
        }       
        else{
            System.out.println("ERROR: Cola vacia");
        }
    }

    private static void ingresarPedidos(ColaDinamica cola) {
        Pedido elem=new Pedido();
        Object aux;
        EntradaSalida.mostrarMensaje("Ingrese el Pedido: ");
                    elem.leer();
                    aux = (Object) elem;
                    cola.poner(aux);
                    EntradaSalida.mostrarMensaje("El articulo " + elem.toString() + " fue apilado");
    }
private static void imprimeMenu() {
        EntradaSalida.mostrarMensaje("\n\n\n*********************");
        EntradaSalida.mostrarMensaje("MENU DE OPCIONES");
        EntradaSalida.mostrarMensaje("*********************");
        EntradaSalida.mostrarMensaje("Opcion 1 - Ingresar pedido");
        EntradaSalida.mostrarMensaje("Opcion 2 - Quitar Pedidos");
        EntradaSalida.mostrarMensaje("Opcion 3 - Cantidad de pedidos");
        EntradaSalida.mostrarMensaje("Opcion 4 - Determinar cola vacia");
        EntradaSalida.mostrarMensaje("Opcion 5 - Imprimir Cola");
        EntradaSalida.mostrarMensaje("Opcion 0 - Salir");
        EntradaSalida.mostrarMensaje("*********************");
        EntradaSalida.mostrarMensaje("Ingrese su opcion: ");
    }
}
