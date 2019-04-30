import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Clasa {

    private String nume;
    private Angajat profesor;
    private int numarLocuri;
    private ArrayList<Client> cursanti;
    private String sala;
    private String program;

    public Clasa(String nume, Angajat profesor, int numarLocuri, ArrayList<Client> cursanti, String sala, String program) {
        this.nume = nume;
        this.profesor = profesor;
        this.numarLocuri = numarLocuri;
        this.cursanti = cursanti;
        this.sala = sala;
        this.program = program;
    }

    public Clasa() {
        nume=null;
        profesor=null;
        cursanti=null;
        sala=null;
        program=null;
        numarLocuri=0;
    }






    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public ArrayList<Client> getCursanti() {
        return cursanti;
    }

    public void setCursanti(ArrayList<Client> cursanti) {
        this.cursanti = cursanti;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public Angajat getProfesor() {
        return profesor;
    }

    public void setProfesor(Angajat profesor) {
        this.profesor = profesor;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void adaugareClasa(Angajat a) {
//        private String nume;
//        private Angajat profesor;
//        private int numarLocuri;
//        private Client [] cursanti;
//        private String sala;
//        private String program
        Scanner cin = new Scanner(System.in);
        System.out.println("Ce clasa vrei sa adaugi?");
        String c;
        c = cin.nextLine();
        this.nume = c;

        this.profesor = a;

        System.out.println("Cate locuri disponibile sunt?");
        int x;
        x = cin.nextInt();
        this.numarLocuri = x;
        c=cin.nextLine();

        System.out.println("Unde se tine clasa?");
        c = cin.nextLine();
        this.sala = c;

        System.out.println("Cand se tine clasa?");
        c = cin.nextLine();
        this.program = c;
    }

    public void rezervareLoc(Client c)
    {
        if(cursanti==null)
           cursanti = new ArrayList<Client>();
        if(cursanti.size() < numarLocuri)
        {
                cursanti.add(c);
                System.out.println(c.getNume()+" a rezervat un loc la clasa "+ this.nume);}
        else
                System.out.println("Nu mai sunt locuri la acest curs");




    }
    public void afisClasa()
    {


        System.out.println("clasa: "+this.nume);
        System.out.println("prof: "+this.profesor.getNume());
        System.out.println("locuri libere: "+this.numarLocuri);
        System.out.println("unde: "+this.sala);
        System.out.println("cand : "+this.program);
    }









}
