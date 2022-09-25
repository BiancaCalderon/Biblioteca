package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Clientes {
    private int ID;
    private String Name;
    private String Direccion;
    private int Prestamos; //Hasta 5 préstamos
    private String fechap;
    private String fechad;
    private ArrayList<Libro> librosPrestados = new ArrayList<Libro>();
    private ArrayList<Articulo> articuloPrestado = new ArrayList<Articulo>();
    private ArrayList<Revista> revistaPrestados = new ArrayList<Revista>();
    private HashMap<String,HashMap<String, Integer>> loansSubject = new HashMap<String,HashMap<String, Integer>>();

    public Clientes(int ID, String Name, String Direccion, int Prestamos, String fechap) {
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public boolean cantidadPrestamos(){
        if(Prestamos == 5){
            return  false;
        }else{
            return true;
        }
    }

    public void setFechad(){

    }


    public void setLoansSubjects(String type, String subject, int amount){
        HashMap<String, Integer> loanSubject = new HashMap<String, Integer>();
        if(loansSubject.containsKey(type)){
            loanSubject = loansSubject.get(type);
            int amountLoans = loanSubject.get(subject);
            amountLoans += amount;
            loanSubject.put(subject,amountLoans);
            loansSubject.put(type,loanSubject);
        }else{
            loanSubject.put(subject, amount);
            loansSubject.put(type, loanSubject);
        }
    }

    public void getLoansSubjects(){
        for (String type: loansSubject.keySet()
             ) {
            HashMap<String,Integer> subjectsByCategory = loansSubject.get(type);
            System.out.println("Para " + type+" , hay esta cantidad de categorias prestadas");
            for (String subject: subjectsByCategory.keySet()
                 ) {
                System.out.println(subject + "cantidad de: "+ subjectsByCategory.values());
            }

        }
    }
}

