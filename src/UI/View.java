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

    public void welcome(){
        System.out.println("Bienvenido");
    }

    public void end_sys(){
        System.out.println("FIN");
    }

    public int options(){
        String[] options = {"Insertar Libro","Salir"};
        for(int i = 0; i<options.length;i++){
            System.out.println((i+1) + ". " + options[i]);
        }
        return  options.length;
    }

    public int selection(int options){
        boolean next_step = false;
        int selection = 0;
        do {
            try {
                selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opcioens"));
                if(selection < 0 || selection > options){
                    System.out.println("DEBE INGRESAR UNA OPCION VALIDA");
                }else{
                    next_step = true;
                }
            }catch (NumberFormatException e){
                System.out.println("DEBE INGRESAR UN VALOR NUMERICO");
            }
        }while (!next_step);
        return  selection;
    }
    public static void main(String[] args) {

        System.out.println("Biblioteca");
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        //ArrayList
//        Libro libro = new Libro();
//        Biblioteca revista = new Revista();
//        Biblioteca articulo = new Articulo();

        HashMap<String, Integer> cantidades = new HashMap<String, Integer>();
        cantidades.put("Ciencias", 1);
        ArrayList<String> tyoeMaterias = new ArrayList<String>();
        tyoeMaterias.add("Ciencias");

        Clientes cliente = new Clientes(123456, "Jhon", "zona 5",4, "20 ABRIL"  );
        ArrayList<Clientes> clientela = new ArrayList<Clientes>();
        clientela.add(cliente);




        cantidades.get(tyoeMaterias.get(1 menos 1));

        cantidades.put("Ciencias", cantidades.get("Ciencias") menos 1);


        while (!salir) {

            System.out.println();
            System.out.println("Titulo según ID");
            System.out.println("Cantidad de documentos"); //según una materia dada
            System.out.println("Realizar Préstamo");
            System.out.println("Realizar Devolución");
            System.out.println("Préstamos según tipo por cliente");
            System.out.println("Cantidad de revistas según la materia");
            System.out.println("Ejemplares disponibles de libro/artículo");

            try {
                System.out.println("Elija una opción");
                opcion = in.nextInt();

                if (opcion == 1) {
                    System.out.println("Eligió la opción 1");

                } else if (opcion == 2) {
                    System.out.println("Eligió la opción 2");

                } else if (opcion == 3) {
                    System.out.println("Eligió la opción 3");

                } else if (opcion == 4) {
                    System.out.println("Eligió la opción 4");

                } else if (opcion == 5) {
                    System.out.println("Eligió la opción 5");

                } else if (opcion == 6) {
                    System.out.println("Eligió la opción 6");
                    for(int i = 0; i < clientela.size(); i++){
                        System.out.println((i+1) + ". " + clientela.get(i).getID()+"¡¡¡¡¡¡¡¡"+clientela.get(i).getID());
                    }
                    Clientes clienteInfo = clientela.get(3 - 1);


                } else if (opcion == 7) {
                    System.out.println("Eligió la opción 7");

                } else if (opcion == 8) {
                    System.out.println("Eligió la opción 8");
                    System.out.println("Feliz día! ");
                    salir = true;
                    break;
                }
            } finally {

            }

        }

    }
}
