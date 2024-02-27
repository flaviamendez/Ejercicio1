package mates;
import java.util.ArrayList;

public class Funciones {
    // Ejercicio 1 suma

    public static int suma(int n)
    {
        int acumulado = 0;
        for(int i = 1; i<=n; i++)
        {
            acumulado += i;
        }
        return acumulado;
    }


    // Ejercicio 2 Factorial

    public static int factorial(int n) {
        int acumulador = 1;
        for (int i = 1; i <= n; i++) {
            acumulador *= i;
        }
        return acumulador;
    }


    
    // Ejercicio 3 exponente (forma iterativa)
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }


    // Ejercicio 4 suma lista
    public static int sumaLista(ArrayList<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    // Ejercicio 5 media aritmética de una lista
    public static double mediaAritm(ArrayList<Integer> lista) {
        int suma = sumaLista(lista); // suma de todos los elementos de la lista
        return (double) suma / lista.size(); // divido la suma de los elementos entre el tamaño de la lista.
    }

    // Ejercicio 6 desviación típica de una lista
    public static double desviacionTipica(ArrayList<Integer> lista) {
        double a = mediaAritm(lista);
        double raizCuadrada = 0;
        for (int num : lista) {
            raizCuadrada += Math.pow(num - a, 2);
        }
        return Math.sqrt(raizCuadrada / lista.size());

    }


    // Ejercicio 7 La suma de los primeros números pares hasta n asumiendo n ≥ 2.
    public static int sumaPares(int n) {
        // Caso base
        if (n == 2) {
            return 2;
        }
        else if (n % 2 == 0) {
            int suma = 0;
            for (int i = 2; i <= n; i += 2) {
                suma += i;
            }
            return suma;
        } else {
            int suma = 0;
            for (int i = 1; i <= n; i += 2) {
                suma += i;
            }
            return suma;
        }
    }
    

    // Ejercicio 8 suma de los elementos pares de una lista de enteros.
    public static int sumaParLista(ArrayList<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        return suma;
    }

    // Ejercicio 9 Dada una lista de números naturales mayores o iguales que 2
    // obtiene otra lista con los números pares de la lista inicial, en el mismo 
    //orden y respetando los números repetidos

    public static ArrayList<Integer> listaPares(ArrayList<Integer> lista)
    {
            ArrayList<Integer> par = new ArrayList<>();
            for (int num : lista){
                if (num % 2 == 0){
                    par.add(num);
                }
            }
            return par;

    }



}
