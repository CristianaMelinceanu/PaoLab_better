import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Client>  clienti=new ArrayList<Client>();
        ArrayList<Clasa> clase=new ArrayList<Clasa>();
        ArrayList<Abonament> abonamente=new ArrayList<Abonament>();
        ArrayList<Angajat> angajati=new ArrayList<Angajat>();
        Servicii_Client s=new Servicii_Client();
        System.out.println("--------------Adaugi client-------------");
        s.addClient(clienti);
        System.out.println("--------------Adaugi angajat-------------");
        s.addAngajat(angajati);
        System.out.println("--------------Adaugi clasa-------------");
        s.addClass(angajati.get(0),clase);
        s.showClasses(clase);
        Client meli = new Client("Meli","cristiana.meli","0724117782",12,"gold");
        s.reserveClass(meli,clase);
//        System.out.println("Hello World!");
//        Client meli = new Client("Meli","cristiana.meli","0724117782",12,"gold");
////        meli.afisareClient();
////        Client razvan = new Client();
////        razvan.adaugaClient();
////        razvan.afisareClient();
//
//        Angajat dani = new Angajat();
//
////        Abonament[] b = new Abonament[2];
//        Clasa[] clase = new Clasa[10];
//        for(int i=0;i<10;i++){
//             clase[i]=new Clasa();}
//        clase[0].adaugareClasa(dani);
//        clase[0].rezervareLoc(meli);
//
////        b[0] = new Abonament();
////        b[1] = new Abonament();
////        b[0].creareAbonament(meli);
////        b[1].creareAbonament(razvan);
////        Abonament c = new Abonament();
////        c.vizualizareAbonament(meli, b);

    }
}