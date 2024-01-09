package taller11;
import java.util.Scanner;
public class PromedioCualitativo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N1 , N2 , N3, N4;
        String promedio;
        System.out.println("Ingrese 4 numeros del 1 al 10: ");
        N1=scanner.nextInt();
        N2=scanner.nextInt();
        N3=scanner.nextInt();
        N4=scanner.nextInt();
        promedio=promedioCualitativo(N1, N2, N3, N4);
        System.out.println("El promedio cualitativo es: "+promedio);
    }
    
    public static String promedioCualitativo(double N1,double N2,double N3,double N4) {
        String calculo = null;
        double promedioVar;
        promedioVar=(N1+N2+N3+N4)/4;
        if (promedioVar<5)
            calculo="Regular";
        else
            if (promedioVar<8)
                calculo="Bueno";
            else
                if (promedioVar<9)
                    calculo="Muy bueno";
                else
                    calculo="Sobresaliente";
        
        return calculo;
    }
}
/*
Ingrese 4 numeros del 1 al 10: 
8
7
8
9
El promedio cualitativo es: Muy bueno
*/