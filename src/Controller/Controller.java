package Controller;

import Model.Biblioteca;
import Model.Clientes;
import UI.View;

import java.io.IOException;

public class Controller {
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
        boolean next_step = false;
        int selection = 1;
        int options = 0;
        while (selection != options){
            new ProcessBuilder("cmd","/c","´cls").inheritIO().start().waitFor();
            options = view.options();
            selection = view.selection(options);
            switch (selection){
                case 1:
                    // Ingresar libro
                    System.out.println("Eligió la opción 1");
                    break;
                case 2:
                    System.out.println("Eligió la opción 2");
                    break;
                case 3:
                    System.out.println("Eligió la opción 3");
                    break;
                case 4:
                    System.out.println("Eligió la opción 4");
                    holdScreen(4000);
                    break;
                case 5:
                    System.out.println("Eligió la opción 5");
                    break;
                case 6:
                    System.out.println("Eligió la opción 6");
                    if(costumerInfo == null){
                        System.out.println("No ha seleccionado un cliente existe, debe hacerlo");
                        continue;
                    }else{

                    }
                    break;
                default:
                    // Salir
                    view.end_sys();
                    break;
            }
        }
    }

    private void loansToCostumer(){
        int amountCostumers = library.showCostumers();
        costumerInfo = library.selectionCostumer(amountCostumers);
        if(costumer == null){
            System.out.println("No existe el cliente");
        }else{
            System.out.println("El cliente si existe");
        }
    }

    /*
     *
     */
    private void holdScreen(int amountTime){
        try {
            Thread.sleep(amountTime);
        }catch (Exception e){
            System.out.println("Failed to hold the screen");
        }
    }


}
