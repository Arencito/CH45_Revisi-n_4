package org.generation.clase;

import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Entrada del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase();  // Convertimos a minúsculas para evitar problemas con el input

        // Entrada del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase();  // Convertimos a minúsculas para uniformidad
        
        // Comparar jugadas
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int ganador = 2;  // Por defecto, asume que gana el jugador 2
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1;  // Jugador 1 gana si el jugador 2 eligió tijeras
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;  // Jugador 1 gana si el jugador 2 eligió piedra
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;  // Jugador 1 gana si el jugador 2 eligió papel
                    }
                    break;
                default:
                    System.out.println("Movimiento no válido.");
                    return;  // Terminar el programa si hay un movimiento no válido
            }
            System.out.println("Gana el jugador " + ganador);
        }

        s.close();  // Cerramos el Scanner para liberar recursos
    }
}
