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
public class ActividadAplicacion4_11 {
    public static void main(String[] args) {
        Scanner PEDIR_AL_USUARIO = new Scanner(System.in);
        
        System.out.print("Ingresa el radio de la esfera: ");
        double radio = PEDIR_AL_USUARIO.nextDouble();
        
        superficie(radio);
        volumen(radio);
    }
    static void superficie(double radio) {
        final double PI = 3.14;
        int operacion = (int)(4*PI*Math.pow(radio, 2));
        System.out.println(operacion);
    }
    static void volumen(double radio) {
        final double PI = 3.14;
        double operacion = (double)(4*PI)/3 * (double)(Math.pow(radio, 3));
        System.out.println(operacion);
    }
}
