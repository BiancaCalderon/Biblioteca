package Model;

public class Revista extends Libro {
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

    public int year;
    public int num;

    public Revista(int ID, String name, String autor, String editorial, String materia, int ceje, boolean estado, int _year, int _num){
        super( ID, name, autor, editorial, materia, ceje, estado);
        this.year = year;
        this.num = num;
    }


}
