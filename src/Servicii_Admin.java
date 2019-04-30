import java.util.ArrayList;

public class Servicii_Admin {


    public void addClient(ArrayList<Client> clienti)
    {
        Client c=new Client();
        c.adaugaClient();
        clienti.add(c);
    }

    public void createAbonament(Client c)
    {
        Abonament a=new Abonament();
        a.creareAbonament(c);
    }
    public void extendAbonament(Abonament a)
    {
        a.extindereAbonament();
    }
    public void showClient(Client c)
    {
        c.afisareClient();
    }



    public void showAbonament(Abonament a)
    {
        a.afisAbonament();
    }



    public void addAngajat(ArrayList<Angajat> angajati)
    {
        Angajat a=new Angajat();
        a.adaugaAngajat();
        angajati.add(a);
    }

    public void addClass(Angajat antrenor, ArrayList<Clasa> clase)
    {
        Clasa c=new Clasa();
        c.adaugareClasa(antrenor);
        clase.add(c);
    }

}
