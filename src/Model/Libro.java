package Model;


public class Libro extends Propiedades{
    private String Autor;
    private String editorial;


    public Libro(String Titulo, String Materia, int ID, int ejemplares, boolean estado, String Autor, String editorial) {
        super(Titulo, Materia, ID, ejemplares, estado);
        this.Titulo = Titulo;
        this.Materia = Materia;
        this.ID = ID;
        this.ejemplares = ejemplares;
        this.estado = estado;
        this.Autor= Autor;
        this.editorial = editorial;

    }

    public String getTitulo() {return Titulo;}
    public String getMateria() {
        return Materia;
    }
    public int getID() {
        return ID;
    }

    public int ejemplares () {return ejemplares;}

    public boolean estado() {
        return this.estado;
    } //si boolean = true está disponible

    public String getAutor() {
        return this.Autor;
    }

    public String getEditorial() {
        return editorial;
    }







    }

