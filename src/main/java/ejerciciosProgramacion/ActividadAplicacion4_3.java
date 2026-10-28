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
public class ActividadAplicacion4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el radio:");
        double radio = sc.nextDouble();
        System.out.println("Ingresa la altura:");
        double altura = sc.nextDouble();
        
        area(radio, altura);
        volumen(radio, altura);
    }
    static void area(double radio, double altura) {
        final double PI = 3.14;
        
        int operacionArea = (int)(PI*(Math.pow(radio, 2)))*(int)(altura+radio);
        
        System.out.println("El area es: " + operacionArea);
    }
    
    static void volumen(double radio, double altura) {
        final double PI = 3.14;
        
        int operacionVolumen = (int)(PI*(Math.pow(radio, 2)))*(int) altura;
        
        System.out.println("El volumen es: " + operacionVolumen);
    }
}
