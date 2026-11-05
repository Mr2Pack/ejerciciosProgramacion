/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosProgramacion;

/**
 *
 * @author s23oa
 */
import java.util.Scanner;
public class Actividad12Ficha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============================");
        System.out.println("MENÚ DE ARREGLOS");
        System.out.println("=============================");
        System.out.println("a. Mostrar valores.");
        System.out.println("b. Ingresar valores.");
        System.out.println("c. Salir.");
        System.out.println("=============================");
        System.out.println("Ingresa una opción:");
        char opcionSolicitada = sc.next().charAt(0);
        
        int [] valores = new int[10];
        /* Mientras no introduzca la letra c, el bucle debe continuar. ! es
        negación, así que, a y b pasan.*/
        while(opcionSolicitada != 'c') {
            switch(opcionSolicitada) {
                case 'a' -> {
                    for (int i = 0; i < valores.length; i++) {
                        System.out.println(valores[i]);
                    }
                }
                case 'b' -> {
                    System.out.println("Ingresa un valor:");
                    int valorSolicitado = sc.nextInt();
                    System.out.println("¿En qué posición lo quieres ingresar?");
                    int valorPosicion = sc.nextInt();
                    
                    for(int i = 0; i < valores.length; i++) {
                        valores[valorPosicion] = valorSolicitado;
                    }
                }
                case 'c' -> {
                }
                default -> {
                    System.out.println("Se produjo un error inesperado.");
                }
            }
            System.out.println("Ingresa una opción:");
            opcionSolicitada = sc.next().charAt(0);
        }
    }
}
