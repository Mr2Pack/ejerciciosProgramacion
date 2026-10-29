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
public class ActividadAplicacion4_13 {
    public static void main(String[] args) {
        Scanner PEDIR_AL_USUARIO = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numSolicitado = PEDIR_AL_USUARIO.nextInt();
        
        numPares(numSolicitado);
    }
    static void numPares(int numSolicitado) {
        for(int i = 1; i<= numSolicitado; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
