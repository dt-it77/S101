package Nivell1_Ex3;

class A{
    static {
        System.out.println("Clase inicialitzada, bloc static"); //primer a executar
    }
    {
        System.out.println("Clase instanciada, bloc no static");
    }
    public static void metodeStatic(){
        System.out.println("Test metode static");
    }
    public void metodeNoStatic(){
        System.out.println("Test metode No Static");
    }
}

public class Main {
   
    public static void main(String[] args) throws Exception {

        /* 
            tan si executem el metode estatic A.metodeStatic(); al inici com al final (despres de crear objectes y executar metode no estatic)
            sortira per pantalla "Clase inicialitzada, bloc static", el bloc estatic de la clase A. El boc no estatic sortira quan creem els 
            objectes i es crea una instancia. Despres sortira el missatge del metode executat. 
        */
        //A.metodeStatic();

        A objA1 = new A();
        objA1.metodeNoStatic();
        
        A objA2 = new A();
        objA2.metodeNoStatic();

        A.metodeStatic();

    }
}
