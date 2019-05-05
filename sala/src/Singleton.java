public class Singleton {

    private static Singleton path = null;


    private static final String s = "D:\\anul2\\semestrul 2\\sala_fitness\\PaoLab_better\\sala\\apeluri_functii.txt";

    // private constructor restricted to this class itself
    private Singleton() {

    }

    // static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (path == null)
            path = new Singleton();

        return path;
    }

    public String getPath(){return s;}
}
