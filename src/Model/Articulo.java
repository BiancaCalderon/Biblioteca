package Model;

public class Articulo extends Libro {
    public String arbitro;

    public Articulo(int ID, String name, String autor, String editorial, String materia, int ceje, boolean estado, String arbitro) {
        super(ID, name, autor, editorial, materia, ceje, estado);
        this.arbitro = arbitro;

    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }
}
