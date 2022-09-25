package Model;


public class Libro {

    private int ID;
    private String Titulo;
    private String Autor;
    private String Editorial;
    public String name;
    public String editorial;
    public String materia;


    public Libro(int ID, String Titulo, String Autor, String editorial, String Materia, int ejemplares, boolean estado) {

        this.ID = ID;
        this.editorial = editorial;

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return this.Autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getMateria() {
        return materia;
    }

    public int getCeje() {
        return this.ejemplares;
    }

    public boolean isEstado() {
        return this.estado;
    }



    public boolean estado; //si boolean = true está disponible





    }

