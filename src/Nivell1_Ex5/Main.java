package Nivell1_Ex5;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Gat g = new Gat();
        g.corre();
        g.corre("nord");
        g.corre("sud", 1);
        g.corre("est",2,3);
    }
}
