/***POO
 * Bianca Calderón
 * Herencia-Ejercicio de Estudio Individual
 */
package UI;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import Model.*;

import javax.swing.*;

public class View {

    public void welcome() {
        System.out.println("Bienvenido");
    }

    public void end_sys() {
        System.out.println("FIN");
    }

    public int options() {
        String[] options = {"Insertar Libro", "Cantidad de documentos", "Realizar Préstamo", "Realizar Devolución", "Préstamos según tipo por cliente", "Cantidad de revistas según la materia", "Ejemplares disponibles de libro/artículo", "Salir"};
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        return options.length;
    }

    public int selection(int options) {
        boolean next_step = false;
        int selection = 0;
        do {
            try {
                selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
                if (selection < 0 || selection > options) {
                    System.out.println("DEBE INGRESAR UNA OPCION VALIDA");
                } else {
                    next_step = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("DEBE INGRESAR UN VALOR NUMERICO");
            }
        } while (!next_step);
        return selection;
    }
}




