import java.util.Scanner;

public class Client extends Persoana {

    private String tipMembru;

    public Client() {
        tipMembru=null;
    }

    public Client(String nume, String email, String nrtel, int varsta ,String tipMembru) {
        super(nume,email,nrtel,varsta);
        this.tipMembru = tipMembru;
    }

    public String getTipMembru() {
        return tipMembru;
    }

    public void setTipMembru(String tipMembru) {
        this.tipMembru = tipMembru;
    }

    public void adaugaClient()
    {   super.adaugaPersoana();
        System.out.println("Ce tip de client e?");
        Scanner cin=new Scanner(System.in);
        String s=cin.nextLine();
        this.tipMembru=s;
    }

    public void afisareClient()
    {
        super.afisarePersoana();
        System.out.println("Client :"+this.tipMembru);
    }
}
