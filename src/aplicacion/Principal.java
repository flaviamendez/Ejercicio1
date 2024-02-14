package aplicacion;

import java.util.ArrayList;

import mates.*;

public class Principal{

    public static void main(String[] args) {
        ArrayList<Integer> listaP = new ArrayList<>();
        listaP.add(1);
        listaP.add(2);
        listaP.add(3);
        listaP.add(4);

        ArrayList<Integer> lista1 = new ArrayList<>();
        listaP.add(3);
        listaP.add(6);
        listaP.add(1);
        listaP.add(4);
        ArrayList<Integer> lista2 = new ArrayList<>();
        listaP.add(1);
        listaP.add(5);
        listaP.add(9);
        listaP.add(7);
        

        System.out.println("1. Suma: " + Funciones.suma(5));
        System.out.println("2. Factorial: " + Funciones.factorial(5));
        System.out.println("3. Potencia: " + Funciones.potencia(2, 3));
        System.out.println("4. Suma de lista: " + Funciones.sumaLista(lista1));
        System.out.println("5. Media: " + Funciones.mediaAritm(listaP));
        System.out.println("6. Desviación típica: " + Funciones.desviacionTipica(lista2));
        System.out.println("7. Suma de pares: " + Funciones.sumaPares(9));
        System.out.println("8. La lista de números pares es " + Funciones.listaPares(listaP));
        System.out.println("9. Suma par lista " + Funciones.sumaParLista(lista2));
        System.out.println("10. Lista de pares: " + Funciones.listaDeSoloPar(19));
        System.out.println("11 El producto escalar de los vectores " + Funciones.productoEscalar ( lista1, lista2 ));
        System.out.println("12.Elemento de fibonacci del número 23 " + Funciones.Fibo(23));
        System.out.println("13 Cociente de fibonacci del los números 16 y 12 " + Funciones.cocienteFibo());
        System.out.println("14La razon aurea es " + Funciones.razonAurea());


    }
}
