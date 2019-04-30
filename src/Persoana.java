import java.util.Scanner;

public class Persoana {

    protected String nume;
    protected String email;
    protected String numarTelefon;
    protected int varsta;

    public Persoana() {

        nume=null;
        email=null;
        numarTelefon=null;
        varsta=0;
    }

    public Persoana(String nume, String email, String numarTelefon, int varsta) {
        this.nume = nume;
        this.email = email;
        this.numarTelefon = numarTelefon;
        this.varsta = varsta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }


    public void adaugaPersoana() {
        Scanner cin = new Scanner(System.in);
        String nume;
        System.out.println("Insereaza nume");
        nume = cin.nextLine();
        this.nume=nume;
        String em;
        System.out.println("Insereaza email");
        em = cin.nextLine();
        this.email=em;
        //Scanner cin = new Scanner(System.in);
        String nrtel;
        System.out.println("Insereaza numar de telefon");
        nrtel = cin.nextLine();
        this.numarTelefon=nrtel;
        int v;
        System.out.println("Insereaza varsta");
        v = cin.nextInt();
        this.varsta=v;
    }

    public void afisarePersoana(){

        System.out.println("Nume: "+ this.nume);
        System.out.println("Email: " +this.email);
        System.out.println("Numar de telefon: "+this.numarTelefon);
        System.out.println("Varsta: "+this.varsta);

    }

}
