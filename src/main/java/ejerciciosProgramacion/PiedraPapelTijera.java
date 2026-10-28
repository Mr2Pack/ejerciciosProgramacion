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
public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner PEDIR_AL_USUARIO = new Scanner(System.in);
        /*
        r = piedra (Stone-Rock)
        p = papel
        s = tijera (Scissor)
        
        jugadaUsuario()
        resolverJugada()
        */
        
        System.out.println("Introduce r(piedra), p (papel), o s(tijera):");
        char opcionSolicitada = PEDIR_AL_USUARIO.next().charAt(0);
        
        jugadaUsuario(opcionSolicitada);
        
        char jugadaU = jugadaUsuario(opcionSolicitada);
        char jugadaM = jugadaMaquina(' ');
        
        resolverJugada(jugadaU, jugadaM);
    }
    
    static char jugadaMaquina(char opcion) {
        int numeroAleatorio = (int)(Math.random()*3) + 1;
        
        switch(numeroAleatorio) {
            /*if(numeroAleatorio == 1) {
                opcion = 'r';
            } else if(numeroAleatorio == 2) {
                opcion = 'p';
               } else {
                opcion = 's';
            }
            */
            case 1 -> {
                opcion = 'r';
            }
            case 2 -> {
                opcion = 'p';
            }
            case 3 -> {
                opcion = 's';
            }
        }
        return opcion;
    }
    static char jugadaUsuario(char opcionSolicitada) {
        return opcionSolicitada;
    }
    static char resolverJugada(char jugadaM, char jugadaU) {
        if(jugadaM == jugadaU) {
            System.out.println("Has empatado.");
            return 'E';
        }
        if ((jugadaU == 'r' && jugadaM == 's') ||
            (jugadaU == 'p' && jugadaM == 'r') ||
            (jugadaU == 's' && jugadaM == 'p')) {
            System.out.println("Has ganado.");
            return 'V';
        } else {
            System.out.println("Has perdido.");
            return 'D';
        }
    }
}