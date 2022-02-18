package Nivell1_Ex4;

public class Vehicle {
    
    private final static String CAMP_STATIC_FINAL = "--->camp static final"; //te que ser inicializatada aqui, en el moment que es crea.
    private final String CAMP_FINAL; //te que ser inicialitzat en el constructor o en el moment que delcarem la variable
    private String CAMP_STRING; //pot ser inicialitzada a qualsevol punt

    public Vehicle(){
        CAMP_FINAL = "-->camp final"; //en aquet cas la inicialitzem en el constructor
        //CAMP_STRING = "camp string"; 
        System.out.println("Inicialitza constructor... valor CAMP_FINAL: " + CAMP_FINAL);
    }
    public void iniciar(){
        System.out.println("Executem metode iniciar...");
    } 
    public static void parar(){
        System.out.println("Executem metode static parar... ");
    }   
    public void accelerar(){
        CAMP_STRING = "GO GO GO!!";
        System.out.println("Executem metode accelerar... " +CAMP_STRING);
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
