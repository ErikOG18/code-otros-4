
package com.generation;

import java.util.Scanner;

public class otros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del jugador 1
        Scanner s = new Scanner(System.in);  // Corregido: Se agrega System.in
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Corregido: Cambiado a jugador 2
        String j2 = s.nextLine();
        
        // Comparar las jugadas de los dos jugadores
        if (j1.equals(j2)) {  // Corregido: Usar equals en lugar de ==
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {  // Corregido: Usar equals en lugar de ==
                        g = 1;
                    }
                    break;  // Añadido break para salir del caso

                case "papel":
                    if (j2.equals("piedra")) {  // Corregido: Usar equals en lugar de ==
                        g = 1;
                    }
                    break;  // Añadido break para salir del caso
                  
                case "tijeras":  // Corregido: Cambio de "tijera" a "tijeras" para consistencia
                    if (j2.equals("papel")) {  // Corregido: Usar equals en lugar de ==
                        g = 1;
                    }
                    break;  // Añadido break para salir del caso

                default:
                    System.out.println("Jugada no válida");
                    return;  // Salir del método si la jugada no es válida
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}

