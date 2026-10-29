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
public class NotasExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contadorSuspensos = 0, contadorAprobados = 0;
        
        System.out.println("¿Cuántas notas quieres introducir?");
        int numNotas = sc.nextInt();
        
        for(int i = 1; i <= numNotas; i++) {
            System.out.println("Ingresa la nota:");
            int notaSolicitada = sc.nextInt();
            
            if(notaSolicitada < 5) {
                ++contadorSuspensos;
            } else if(notaSolicitada >= 5) {
                ++contadorAprobados;
            } else {
                System.out.println();
            }
        }
        System.out.println("Aprobados:" + " " + contadorAprobados);
        System.out.println("Suspensos:" + " " + contadorSuspensos);
    }
}
