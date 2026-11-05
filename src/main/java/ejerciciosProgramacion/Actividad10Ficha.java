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
public class Actividad10Ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántas alturas deseas guardar?");
        int numCantidad = sc.nextInt();
        
        double [] altura = new double[numCantidad];
        
        for(int i = 0; i < altura.length; i++) {
            System.out.println("Ingresa las alturas:");
            double alturaSolicitada = sc.nextDouble();
            
            altura[i] = alturaSolicitada;
        }
        
        promedioAltura(numCantidad, altura);
        
    }
    static double [] promedioAltura(int numCantidad, double [] altura) {        
        double suma = 0;
        
        for(int i = 0; i< altura.length; i++) {
            suma += altura[i];
        }
        
        double promedio = suma/numCantidad;
        System.out.println("Promedio:" + " " + promedio);
        
        return altura;
    }
}
