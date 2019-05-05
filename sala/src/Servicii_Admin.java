import Clase_fiinte.Angajat;
import Clase_fiinte.Antrenor;
import Clase_fiinte.Client;
import Clase_obiecte.Abonament;
import Clase_obiecte.Clasa;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Servicii_Admin {


    public Client addClient()
    {
        Client c=new Client();
        Scanner cin = new Scanner(System.in);
        String nume;
        System.out.println("Insereaza nume");
        nume = cin.nextLine();
        c.setNume(nume);
        // fw.write(nume+ "    ");
        String em;
        System.out.println("Insereaza email");
        em = cin.nextLine();
        c.setEmail(em);
        //fw.write(email+ "    ");
        //Scanner cin = new Scanner(System.in);
        String nrtel;
        System.out.println("Insereaza numar de telefon");
        nrtel = cin.nextLine();
        c.setNumarTelefon(nrtel);
        //fw.write(numarTelefon+ "    ");
        int v;
        System.out.println("Insereaza varsta");
        v = cin.nextInt();
        c.setVarsta(v);
        String s;
        System.out.println("Ce tip de client e?");
        cin.nextLine();
        s = cin.nextLine();
        c.setTipMembru(s);
        try{
            FileWriter fw = new FileWriter("D:\\anul2\\semestrul 2\\sala_fitness\\PaoLab_better\\sala\\client.txt",true);
            fw.write(c.toString());
            fw.close();}
        catch(Exception e){ System.out.println(e);}

        try{
            //Date d=new Date();
           //.println(dateFormat.format(date)); //2016/11/16 12:08:43

            FileWriter fv = new FileWriter(Singleton.getInstance().getPath(),true);
            fv.write("addClient , "+ (new Date()).toString() + System.lineSeparator());
            fv.close();
        }
        catch(Exception e){ System.out.println(e);}
        return c;

    }


    public void createAbonament()
    {
        Abonament a=new Abonament();
        Client c=addClient();
        Scanner cin = new Scanner(System.in);
        String tip;
        System.out.println("Clase_obiecte.Abonament silver/platinum/gold? ");
        tip = cin.nextLine();
        a.setTip(tip);
        if (tip.equals("gold"))
            a.setTarif(500);
        else {
            if (tip.equals("silver"))
                a.setTarif(300);
            else {
                if (tip.equals("platinum"))
                    a.setTarif(400);
            }
        }

        Date d=null;
        String ss;
        cin.nextLine();
        System.out.println("De cand sa inceapa abonamentul?");
        ss=cin.nextLine();
        a.setDataInceput(ss);
//        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, ''yy");
//        try {
//            Date da = sdf.parse(ss);
//            a.setDataInceput(da);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            a.setDataInceput(null);
////        }
//        Date dd=null;
        String s;
        cin.nextLine();
        System.out.println("Pana cand sa fie  abonamentul?");
        s=cin.nextLine();
        a.setDataExpirare(s);
//        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM d, ''yy");
//        try {
//            dd = sdf1.parse(s);
//            a.setDataExpirare(dd);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            a.setDataExpirare(null);
//        }
        a.setClientDetinator(c);
        try{
            FileWriter fw = new FileWriter("D:\\anul2\\semestrul 2\\sala_fitness\\PaoLab_better\\sala\\abonamente.txt",true);
            fw.write(a.toString());
            fw.close();}
        catch(Exception e){ System.out.println(e);}
    }

    public void extendAbonament(Abonament a)
    {
        a.extindereAbonament();
    }

    public void showClient()
    {
        String csvFile = "D:\\anul2\\semestrul 2\\sala_fitness\\PaoLab_better\\sala\\client.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = " ,";


        try {

            br = new BufferedReader(new FileReader(csvFile));
            line=br.readLine();
            while ((line = br.readLine()) != null  && !line.equals(" ")) {

                // use comma as separator
                String[] client=line.split(cvsSplitBy);
                String l=client[0];
                System.out.println("nume " + client[0] + " , email " + client[1] + " nr tel "+client[2]+ " varsta " + client[3]+" tip client"+ client[4]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }






    public void showAbonamente()
    {
        String csvFile = "D:\\anul2\\semestrul 2\\sala_fitness\\PaoLab_better\\sala\\abonamente.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";


        try {

            br = new BufferedReader(new FileReader(csvFile));
            line=br.readLine();
            while ((line = br.readLine()) != null  && !line.equals(" ")) {

                // use comma as separator
                String[] abonament=line.split(cvsSplitBy);
                String c=abonament[0];
                String d=abonament[1];
                System.out.println("ABONAMENT: tip " + abonament[0]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    public void addAngajat(ArrayList<Angajat> angajati)
    {
        Angajat a=new Angajat();
        a.adaugaAngajat();
        angajati.add(a);
    }

    public void addClass()
    {
        Clasa cl=new Clasa();
        Antrenor a=new Antrenor();
        Scanner cin = new Scanner(System.in);
        System.out.println("Ce clasa vrei sa adaugi?");
        String c;
        c = cin.nextLine();
        cl.setNume(c);
        cl.setProfesor(a);
        System.out.println("Cate locuri disponibile sunt?");
        int x;
        x = cin.nextInt();
        cl.setNumarLocuri(x);
        c=cin.nextLine();
        System.out.println("Unde se tine clasa?");
        c = cin.nextLine();
        cl.setSala(c);
        System.out.println("Cand se tine clasa?");
        c = cin.nextLine();
        cl.setProgram(c);
        try{
            FileWriter fw = new FileWriter("D:\\anul2\\semestrul 2\\sala_fitness\\PaoLab_better\\sala\\antrenori.txt",true);
            fw.write(cl.toString());
            fw.close();}
        catch(Exception e){ System.out.println(e);}


    }

    public void addAntrenor()
    {
        Antrenor c=new Antrenor();
        Scanner cin = new Scanner(System.in);
        String nume;
        System.out.println("Insereaza nume");
        nume = cin.nextLine();
        c.setNume(nume);
        // fw.write(nume+ "    ");
        String em;
        System.out.println("Insereaza email");
        em = cin.nextLine();
        c.setEmail(em);
        //fw.write(email+ "    ");
        //Scanner cin = new Scanner(System.in);
        String nrtel;
        System.out.println("Insereaza numar de telefon");
        nrtel = cin.nextLine();
        c.setNumarTelefon(nrtel);
        //fw.write(numarTelefon+ "    ");
        int v;
        System.out.println("Insereaza varsta");
        v = cin.nextInt();
        c.setVarsta(v);
        System.out.println("Ce tarif are pe ora?");
        cin.nextLine();
        int s = cin.nextInt();
        c.setTarifOra(s);
        try{
            FileWriter fw = new FileWriter("D:\\anul2\\semestrul 2\\sala_fitness\\PaoLab_better\\sala\\antrenori.txt",true);
            fw.write(c.toString());
            fw.close();}
        catch(Exception e){ System.out.println(e);}


    }


    public void showAntrenori()
    {
        String csvFile = "D:\\anul2\\semestrul 2\\sala_fitness\\PaoLab_better\\sala\\antrenori.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = " ,";


        try {

            br = new BufferedReader(new FileReader(csvFile));
            line=br.readLine();
            while ((line = br.readLine()) != null  && !line.equals(" ")) {

                // use comma as separator
                String[] client=line.split(cvsSplitBy);
                String l=client[0];
                System.out.println("nume " + client[0] + " , email " + client[1] + " nr tel "+client[2]+ " varsta " + client[3]+" tarifOra "+ client[4]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
