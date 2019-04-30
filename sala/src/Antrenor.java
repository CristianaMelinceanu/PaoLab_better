public class Antrenor extends Persoana {

    private int tarifOra;

    public Antrenor() {

        tarifOra=0;
    }

    public Antrenor(String nume, String email, String numarTelefon, int varsta,int salariuSala,int tarifOra) {
        super(nume, email, numarTelefon, varsta);

        this.tarifOra=tarifOra;
    }


    public int getTarifOra() {
        return tarifOra;
    }

    public void setTarifOra(int tarifOra) {
        this.tarifOra = tarifOra;
    }
}
