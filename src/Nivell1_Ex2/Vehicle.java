package Nivell1_Ex2;

public class Vehicle {
    public Vehicle(){
        System.out.println("Inicialitza constructor...");
    }
    public void iniciar(){
        System.out.println("Executem metode iniciar...");
    } 
    public static void parar(){
        System.out.println("Executem metode static parar...");
    }   
    public void accelerar(){
        System.out.println("Executem metode accelerar...");
    }       
    public static void main(String[] args) throws Exception {
        //el metode static podem invocar sense crear l'bjecte de la clase (objVechicle)
        //parar();
        
        //Creem objecte clase vehicle
        Vehicle objVehicle = new Vehicle();
        //executem metode
        objVehicle.iniciar();
        //el no ser static nececitem crear primer l'objecte
        objVehicle.accelerar();

        //el metode static podem invocar sense crear l'bjecte de la clase (objVechicle)
        parar();
    }
}
