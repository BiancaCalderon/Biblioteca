package Model;

public class Revista extends Biblioteca {
    private int num;
    private int year;

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




    public Revista(String Titulo, String Autor, String Materia, int ejemplares, boolean estado, int year, int num){
        super(Titulo, Autor, Materia, ejemplares, estado);
        this.year = year;
        this.num = num;
    }


}
