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
public class ActividadAplicacion4_12 {
    public static void main(String[] args) {
        Scanner PEDIR_AL_USUARIO = new Scanner(System.in);
        
        System.out.print("x1: ");
        double x1 = PEDIR_AL_USUARIO.nextDouble();
        System.out.print("y1: ");
        double y1 = PEDIR_AL_USUARIO.nextDouble();
        System.out.print("x2: ");
        double x2 = PEDIR_AL_USUARIO.nextDouble();
        System.out.print("y2: ");
        double y2 = PEDIR_AL_USUARIO.nextDouble();
        
        distancia(x1, y1, x2, y2);
    }
    static double distancia(double x1, double y1, double x2, double y2) {
        double mayor, menor, mayor2, menor2, resta1, resta2,cuadrado1, cuadrado2;
        if(x1 > x2) {
            resta1 = x1 - x2;
            cuadrado1 = (double)(Math.pow(resta1, 2));
            System.out.println(cuadrado1);
        } else {
            mayor = x2;
            menor = x1;
            resta1 = mayor - menor;
            cuadrado1 = (double)(Math.pow(resta1, 2));
            System.out.println(cuadrado1);
        }
        
        if(y1 > y2) {
            resta2 = y1 - y2;
            cuadrado2 = (double)(Math.pow(resta2, 2));
            System.out.println(cuadrado2);
        } else {
            mayor2 = y2;
            menor2 = y1;
            resta2 = mayor2 - menor2;
            cuadrado2 = (double)(Math.pow(resta2, 2));
            System.out.println(cuadrado2);
        }
        
        double operacion = (Math.sqrt(cuadrado1+cuadrado2));
        return operacion;
    }
}
