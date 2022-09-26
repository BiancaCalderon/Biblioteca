package Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Biblioteca {

    private static ArrayList<Libro> Lib = new ArrayList<Libro>();
    private ArrayList<Revista> Rev = new ArrayList<Revista>();
    private ArrayList<Articulo> Art = new ArrayList<Articulo>();
    private ArrayList<Clientes> clientela = new ArrayList<Clientes>();

    private ArrayList<String> typeMaterias = new ArrayList<>();
    private String titulo;

    public Clientes Biblioteca() {
        this.clientela = new ArrayList<Clientes>();
        this.Lib = new ArrayList<Libro>();
        this.Rev = new ArrayList<Revista>();
        this.Art = new ArrayList<Articulo>();
        this.typeMaterias = new ArrayList<String>();


        Libro libro = new Libro("Fire Rainbow", "Ciencias", 188994, 2, true, "Julio Verne", "Pearson");
        Libro libro1 = new Libro("Nature", "Ciencias", 123456, 150, true, "Charles Darwin", "Santillana");
        Libro libro2 = new Libro("Infinity", "Matematicas", 156378, 65, false, "David Pérez", "SaintJack");
        Libro libro3 = new Libro("World History", "Sociales", 194760, 78, true, "Maylin Cajaraville", "Pearson");
        Libro libro4 = new Libro("Gravity", "Ciencias", 147108, 20, true, "Sandra Bullock", "Alfonso Cuarón");
        Libro libro5 = new Libro("Life of Pi", "Matematicas", 149732, 314, true, "William Jones", "Duolingo");

        Lib.add(libro);
        Lib.add(libro1);
        Lib.add(libro2);
        Lib.add(libro3);
        Lib.add(libro4);
        Lib.add(libro5);

        for (int i = 1; i < Lib.size(); i++) {
            System.out.println(Lib.get(i));
            //
            Revista revista = new Revista("Free Gumball", "Ciencias", 574982, 89, true, 2012, 8);
            Revista revista1 = new Revista("Mathern Tips", "Matematicas", 585491, 5, true, 2022, 2);
            Revista revista2 = new Revista("GTimes", "Sociales", 545623, 1, true, 2008, 6);

            Rev.add(revista);
            Rev.add(revista1);
            Rev.add(revista2);
            //
            Articulo articulo = new Articulo("Mischief", "Ciencias", 645902, 67, false, "Science School");
            Articulo articulo1 = new Articulo("Hitman", "Sociales", 694375, 12, false, "UTC");
            Articulo articulo2 = new Articulo("The Reign of Gauss", "Matematicas", 612054, 3, true, "Scholar");

            Art.add(articulo);
            Art.add(articulo1);
            Art.add(articulo2);
            //
            Clientes cliente = new Clientes(12345, "John", "zona 5", 4, "20 ABRIL", "Pendiente");
            Clientes cliente1 = new Clientes(56789, "Samuel", "zona 11", 0, "15 ENERO", "2 FEBRERO");
            Clientes cliente2 = new Clientes(95843, "David", "zona 1", 5, "24 MAYO", "Pendiente");
            Clientes cliente3 = new Clientes(93458, "Sara", "zona 4", 2, "12 AGOSTO", "25 AGOSTO");
            Clientes cliente4 = new Clientes(34567, "Gabriel", "zona 7", 3, "7 ABRIL", "Pendiente");
            Clientes cliente5 = new Clientes(54373, "Kate", "zona 11", 1, "27 FEBRERO", "Pendiente");

            clientela.add(cliente);
            clientela.add(cliente1);
            clientela.add(cliente2);
            clientela.add(cliente3);
            clientela.add(cliente4);
            clientela.add(cliente5);
            //
            return cliente;
        }

        /**
         * @param ID Buscar si el ID conincide en los documentos libro
         * @return
         */
        public boolean libroEncontrado ( int ID){
            for (int i = 0; i < Lib.size(); i++) {
                if (Lib.get(i).getID() == ID) {
                    System.out.println("El titulo es:" + titulo);
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        }
        /**
         *
         * @param ID
         * Buscar si el ID conincide en los documentos revista
         * @return
         */
        public boolean revistaEncontrado ( int ID){
            for (int i = 0; i < Rev.size(); i++) {
                if (Rev.get(i).getID() == ID) {
                    System.out.println("El titulo es:" + titulo);
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        }

        /**
         * @param ID Buscar si el ID conincide en los documentos articulo
         * @return
         */
        public boolean articuloEncontrado ( int ID){
            for (int i = 0; i < Art.size(); i++) {
                if (Art.get(i).getID() == ID) {
                    System.out.println("El titulo es:" + titulo);
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        }


    }

    public void libroEncontrado() {
    }

    public void revistaEncontrado() {
    }

    public void articuloEncontrado() {
    }

    public int showCostumers() {
        if (clientela.isEmpty()) {
            System.out.println("No hay clientes en registro");
        } else {
            for (int i = 0; i < clientela.size(); i++) {
                System.out.println((i + 1) + ". " + clientela.get(i));
            }
        }
        return clientela.size();
    }

    public void Materia() {
        HashMap<String, Integer> cantidades = new HashMap<String, Integer>();
        cantidades.put("Ciencias", 1);
        typeMaterias.add("Ciencias");
        cantidades.get(typeMaterias.get(-1));
        cantidades.put("Ciencias", cantidades.get("Ciencias") - 1);

        cantidades.put("Matematicas", 1);
        typeMaterias.add("Matematicas");
        cantidades.get(typeMaterias.get(-1));
        cantidades.put("Matematicas", cantidades.get("Matematicas") - 1);

        cantidades.put("Sociales", 1);
        typeMaterias.add("Sociales");
        cantidades.get(typeMaterias.get(-1));
        cantidades.put("Sociales", cantidades.get("Sociales") - 1);
    }

    public Clientes selectionCostumer(int amountCostumers) {
        boolean next_step = false;
        Clientes costumer = null;
        int options = 0;
        if (options == 0) {
            return costumer;
        } else {
            do {
                try {
                    int selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
                    if (selection < 0 || selection > options) {
                        System.out.println("DEBE INGRESAR UNA OPCION VALIDA");
                    } else {
                        costumer = clientela.get(selection - 1);
                        next_step = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("DEBE INGRESAR VALOR NUMERICO");
                }
            } while (!next_step);
        }
        return costumer;
    }
}



