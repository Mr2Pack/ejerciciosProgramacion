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
public class ActividadAplicacion4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una letra:");
        char letraSolicitada = sc.next().charAt(0);
        
        letra_vocal(letraSolicitada);
    }
    static char letra_vocal(char letraSolicitada) {
        boolean v_f;
        
        char [] almacenarVocales = {'a', 'e', 'i', 'o', 'u'};
        
        for(int i = 0; i < almacenarVocales.length; i++) {
            if(letraSolicitada == almacenarVocales[i]) {
                v_f = true;
                System.out.println("¿Letra encontrada?" + " " + v_f);
            } else {
                v_f = false;
                System.out.println("¿Letra encontrada?" + " " + v_f);
            }
        }
        return letraSolicitada;
    }
}
