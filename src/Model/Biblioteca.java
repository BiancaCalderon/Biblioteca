package Model;

import javax.swing.*;
import java.util.ArrayList;


public class Biblioteca {
    protected String Titulo;
    protected String Autor;
    protected String Materia;
    protected int ejemplares; //Cantidad de ejemplares
    protected boolean estado; //true = disponible

    public ArrayList <Libro> Lib = new ArrayList<Libro>();
    public ArrayList <Revista> Rev = new ArrayList<Revista>();
    public ArrayList <Articulo> Art= new ArrayList<Articulo>();
    private ArrayList<Clientes> clientela= new ArrayList<Clientes>();

    public boolean libroEncontrado(int ID){
        for(int i = 0; i < Lib.size(); i++){
            if(Lib.get(i).getID() == ID){
                return  true;
            }else {
                continue;
            }
        }
        return  false;
    }

    public Libro libroEncontrado1(int ID){
        for(int i = 0; i < Lib.size(); i++){
            if(Lib.get(i).getID() == ID){

                return Lib.get(i);
            }else {
                continue;
            }
        }

        return null;
    }

    public int showCostumers(){
        if(clientela.isEmpty() ){
            System.out.println("No hay clientes en registro");
        }else{
            for (int i = 0; i < clientela.size(); i++){
                System.out.println((i+1) + ". "+clientela.get(i));
            }
        }
        return  clientela.size();
    }

    public Clientes selectionCostumer(int options){
        boolean next_step = false;
        Clientes costumer = null;
        if(options == 0){
            return costumer;
        }else{
            do{
                try {
                    int selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opcioens"));
                    if(selection < 0 || selection > options){
                        System.out.println("DEBE INGRESAR UNA OPCION VALIDA");
                    }else{
                        costumer = clientela.get(selection-1);
                        next_step = true;
                    }
                }catch (NumberFormatException e){
                    System.out.println("DEBE INGRESAR VALOR NUMERICO");
                }
            }while (!next_step);
        }
        return costumer;
    }



}
