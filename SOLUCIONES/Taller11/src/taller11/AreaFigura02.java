package taller11;
import java.util.Scanner;
public class AreaFigura02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int figura;
        double l, b, a;
        System.out.println("Ingrese el numero del proceso: (1-3)");
        figura=scanner.nextInt();
        switch (figura){
            case 1:
                System.out.println("Ingrese el lado del cuadrado: ");
                l=scanner.nextDouble();
                System.out.println("---Area del Cuadrado---");
                calcularAreaCuadrado(l);
                break;
            case 2:
                System.out.println("Ingrese la base y la altura del triangulo: ");
                b=scanner.nextDouble();
                a=scanner.nextDouble();
                System.out.println("---Area del Triangulo---");
                calcularAreaTriangulo(b, a);
                break;
            case 3:
                System.out.println("Ingrese la base y la altura del rectangulo: ");
                b=scanner.nextDouble();
                a=scanner.nextDouble();
                System.out.println("---Area del Rectangulo---");
                calcularAreaRectangulo(b, a);
                break;
            case 4:
                System.out.println("El numero ingresado no corresponde a un proceso");
                break;
        }
    }

    public static void calcularAreaCuadrado(double l) {
        double area;
        area=Math.pow(l, 2);
        System.out.println("Area: "+area);
    }
    public static void calcularAreaTriangulo(double b, double a) {
        double area;
        area=(b*a)/2;
        System.out.println("Area: "+area);
    }
    public static void calcularAreaRectangulo(double b, double a) {
        double area;
        area=b*a;
        System.out.println("Area: "+area);
    }
}
/*
Ingrese el numero del proceso: (1-3)
2
Ingrese la base y la altura del triangulo: 
6
7
---Area del Triangulo---
Area: 21.0
*/