package Nivell1_Ex5;

public class Animal {
    

    public void corre(){
        System.out.println("L'animal corre!");
    }

    public void corre(String direccio){
        System.out.println("L'animal corre en direcció "+direccio+"!");
    }
    
    public void corre(String direccio, double metres){
        System.out.println("L'animal corre en direcció "+direccio+", ha recurregut " + metres + " metres.");
    }


}
