package Nivell1_Ex7;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Amphibian a = new Frog();
        a.moure();
        a.respirar();
        a.menjar();
        //a.saltar();
        //no es posible fer a.saltar(), no compilaria, mostraria un error: The method saltar() is undefined for the type AmphibianJava(67108964)
    }
}
