package taller11;
import java.util.Scanner;
public class CalculoPlantillaPredio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nKilowatio, precioKilowatio, valorInmueble;
        String nombre, cedula;
        int numeroProceso;
        System.out.println("Ingrese su nombre y cedula: ");
        nombre=scanner.next();
        cedula=scanner.next();
        System.out.println("Numero del proceso: ");
        numeroProceso=scanner.nextInt();
        switch (numeroProceso){
            case 1:
                System.out.println("Ingrese el precio y numero de Kilovatios: ");
                precioKilowatio=scanner.nextDouble();
                nKilowatio=scanner.nextDouble();
                planilladeluz(nombre, cedula, precioKilowatio, nKilowatio);
                break;
            case 2:
                System.out.println("Ingrese el precio del inmueble");
                valorInmueble=scanner.nextDouble();
                planilladeluz(nombre, cedula, valorInmueble);
                break;
        }
    }
    
    public static void planilladeluz(String nombre, String cedula, double precioKilowatio, double nKilowatio) {
        double calcular;
        calcular=(nKilowatio*precioKilowatio);
        System.out.println("Cliente "+nombre+" con cedula "+cedula+" debe calcelar el valor de $"+calcular);
    }
    
    public static void planilladeluz(String nombre, String cedula, double valorInmueble) {
        double calcular;
        calcular=(valorInmueble*0.02);
        System.out.println("Cliente "+nombre+" con cedula "+cedula+" tiene un inmueble valorado en "+valorInmueble+" y tiene que pagar un predio "+calcular);
    }
}
/*
Ingrese su nombre y cedula: 
Anthony
190087000-5
Numero del proceso: 
1
Ingrese el precio y numero de Kilovatios: 
10
800
Cliente Anthony con cedula 190087000-5 debe calcelar el valor de $8000.0
*/