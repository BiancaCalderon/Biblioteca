package Model;

public class Articulo extends Propiedades {
    public String arbitro;

    public Articulo(String Titulo, String Materia, int ID, int ejemplares, boolean estado, String arbitro) {
        super(Titulo, Materia, ID, ejemplares, estado);
        this.arbitro = arbitro;

    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }
}
