package busqueda;

import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) {
        //EJECUCION
        Scanner obx = new Scanner(System.in);
        int x,y;
        System.out.print("Introduzca número de elementos del array: ");
        x = obx.nextInt();
        System.out.print("Introduzca número del que queremos averiguar el índice: ");
        y = obx.nextInt();
        int[] numeros = new int[x];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
            
        }
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, y, 0, numeros.length - 1);
        System.out.println("El indice del valor"+" '"+y+"'"+" es: " + indice);
    }
        //METODO
    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
