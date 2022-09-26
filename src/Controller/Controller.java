package Controller;

import Model.Biblioteca;
import Model.Clientes;
import Model.Libro;
import UI.View;

import java.util.Scanner;

import java.io.IOException;

public class Controller {
    Biblioteca biblioteca;
    Biblioteca materias;
    Clientes subject;
    Biblioteca prestamos;
    Biblioteca devoluciones;
    Clientes loans;
    Clientes prestado;
    private static Scanner scan = new Scanner(System.in);
    private View view;
    private Clientes costumer;
    private Clientes costumerInfo;
    private Biblioteca library;
    public Controller(){
        view = new View();
        library = new Biblioteca();
        costumerInfo = null;
    }
    public void start() throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        boolean next_step = false;
        int selection = 1;
        int options = 0;
        while (selection != options){
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            options = view.options();
            selection = view.selection(options);
            switch (selection) {
                case 1:
                    // Ingresar libro
                    System.out.println("Eligió la opción 1");
                    System.out.println("Agregar libro nuevo: ");
                    IntroducirLibro();


                    break;
                case 2://Devolver título según ID
                    System.out.println("Eligió la opción 2");
                    System.out.println("ID (6 dígitos): ");
                    Integer.parseInt(scan.nextLine());
                    Biblioteca biblioteca = new Biblioteca(); //"Instancia" Recuperado de: https://youtu.be/njcwL6k_nps
                    biblioteca.libroEncontrado();
                    biblioteca.revistaEncontrado();
                    biblioteca.articuloEncontrado();


                    break;
                case 3://Cantidad según materia dada
                    System.out.println("Eligió la opción 3");
                    System.out.println("Materias: Ciencias, Matematicas, Sociales");
                    Clientes subject = new Clientes();
                    subject.setLoansSubjects();


                    break;
                case 4:
                    System.out.println("Eligió la opción 4");
                    Clientes prestado = new Clientes();
                    prestado.cantidadPrestamos();
                    break;
                case 5:
                    System.out.println("Eligió la opción 5");
                    if (costumerInfo == null) {
                        System.out.println("No ha seleccionado un cliente existe, debe hacerlo");
                        continue;
                    } else {

                    }

                    break;
                case 6:
                    System.out.println("Eligió la opción 6");
                    Biblioteca prestamos = new Biblioteca();
                    prestamos.showCostumers();
                    loansToCostumer();
                    holdScreen(4000);
                    break;

                case 7:
                    System.out.println("Eligió la opción 7");
                    System.out.println("Cantidad por Materia: ");
                    Biblioteca materias = new Biblioteca();
                    materias.Materia();
                    break;

                case 8:
                    System.out.println("Eligió la opción 8");
                    Clientes loans = new Clientes();
                    loans.getLoansSubjects();

                    break;

                default://
                    // Salir
                    view.end_sys();
                    break;
            }
        }
    }

    /**
     *
     */
    private void loansToCostumer(){
        int amountCostumers = library.showCostumers();
        costumerInfo = library.selectionCostumer(amountCostumers);
        if(costumer == null){
            System.out.println("No existe el cliente");
        }else{
            System.out.println("El cliente si existe");
        }
    }

    /**
     *
     * @param amountTime
     */
    private void holdScreen(int amountTime){
        try {
            Thread.sleep(amountTime);
        }catch (Exception e){
            System.out.println("Failed to hold the screen");
        }
    }

    /**
     * Para llamar a todos los valores en un solo método
     */
    private static void IntroducirLibro() {
        Scanner input = new Scanner(System.in);

        System.out.println("Titulo: ");
        String Titulo = scan.nextLine();

        System.out.println("Materia: ");
        String Materia = scan.nextLine();

        System.out.println("ID (6 dígitos): ");
        int ID = Integer.parseInt(scan.nextLine());

        System.out.println("Cantidad de ejemplares: ");
        int ejemplares = Integer.parseInt(scan.nextLine());

        System.out.println("Estado del libro: ");
        boolean Estado = scan.nextBoolean();

        System.out.println("Autor: ");
        String Autor = scan.nextLine();

        System.out.println("Editorial: ");
        String Editorial = scan.nextLine();

    }
}
