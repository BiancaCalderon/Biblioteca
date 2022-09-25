package Model;

public class Articulo extends Biblioteca {
    public String arbitro;

    public Articulo(String Titulo, String Autor, String Materia, int ejemplares, boolean estado, String arbitro) {
        super(Titulo, Autor, Materia, ejemplares, estado);
        this.arbitro = arbitro;

    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }
}
