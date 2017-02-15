/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg02;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class Tarea02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAMA DE SERIE NUMERICA
        int valorInferior, valorSuperior;
        valorInferior = pedirValorInferior();
        valorSuperior = pedirValorSuperior();
        imprimirSerie(valorInferior, valorSuperior);
    }
    
    public static int pedirValorInferior(){
            int valorInferior;
            System.out.println("Ingresa el numero que sera el valor inferior:");
            Scanner entradaValorInferior = new Scanner(System.in);
            valorInferior = entradaValorInferior.nextInt();
            return valorInferior;
}
    
    public static int pedirValorSuperior(){
        int valorSuperior;
        System.out.println("Introduce el numero que sera el valor superior:");
        Scanner entradaValorSuperior = new Scanner(System.in);
        valorSuperior = entradaValorSuperior.nextInt();
        return valorSuperior;
    }
    
    public static void imprimirSerie(int valorInferior, int valorSuperior){
        int contador;
        contador = valorInferior;
        do {
            if (contador %2 == 0 & contador %5 == 0){
                System.out.println(contador + " - NUMERO PAR Y DIVISIBLE ENTRE 5");
            } else {
                if (contador %2 == 0){
                    System.out.println(contador + " - NUMERO PAR");
                } else {
                    if (contador %3 == 0){
                        System.out.println(contador + " - NUMERO DIVISIBLE ENTRE 3");
                    } else {
                        if (contador %5 == 0){
                            System.out.println(contador + " - NUMERO DIVISIBLE ENTRE 5");
                        } else {
                            
                        }
                    }
                }
            }
            contador++;
        } while (contador < (valorSuperior + 1));
    }
    
}
