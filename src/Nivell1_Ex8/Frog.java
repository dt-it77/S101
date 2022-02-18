package Nivell1_Ex8;

public class Frog extends Amphibian{

    public void saltar(){
        System.out.println("Frog - Saltar");
    }
    @Override
    public void moure(){
        System.out.println("Frog - Moure");
    }
    @Override
    public void respirar(){
        System.out.println("Frog - Respirar");
    }
    @Override
    public void menjar(){
        System.out.println("Frog - Menjar");
    }
}
