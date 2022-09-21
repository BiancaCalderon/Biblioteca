package Model;

public class Libro extends Documento{
    public int ID;
    public String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCeje() {
        return ceje;
    }

    public void setCeje(int ceje) {
        this.ceje = ceje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String autor;
    public String editorial;
    public String materia;
    public int ceje; //Cantidad de ejemplares

    public Libro(int ID, String name, String autor, String editorial, String materia, int ceje, boolean estado) {
        this.ID = ID;
        this.name = name;
        this.autor = autor;
        this.editorial = editorial;
        this.materia = materia;
        this.ceje = ceje;
        this.estado = estado;
    }

    public boolean estado;





    }

