package Model;

public class Revista extends Propiedades {
    private int num;
    private int year;


    public Revista(String Titulo,String Materia, int ID, int ejemplares, boolean estado, int year, int num){
        super(Titulo, Materia, ID, ejemplares, estado);
        this.year = year;
        this.num = num;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
