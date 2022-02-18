package Nivell1_Ex1;

public class Vehicle {
    public Vehicle(){
        System.out.println("Inicialitza constructor...");
    }
    public void iniciar(){
        System.out.println("Executem metode iniciar...");
    } 
    public static void main(String[] args) throws Exception {
        //Creem objecte de clase vehicle
        Vehicle objVehicle = new Vehicle();
        //executem metode
        objVehicle.iniciar();
    }
}
