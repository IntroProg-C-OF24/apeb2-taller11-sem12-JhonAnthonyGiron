package taller11;
public class SumResProMatriz01 {
    public static void main(String[] args) {
        int lim=3;
        double promedioM;
        int matriz[][]=new int [lim][lim];
        llenarMatriz(matriz, lim);
        System.out.println("Matriz");
        MostrarMatriz(matriz, lim);
        System.out.println("Numeros Pares");
        NumerosPares(matriz, lim);
        System.out.println("Numeros Impares");
        NumerosImpares(matriz, lim);
        System.out.println("Promedio de la Matriz");
        promedioM=promedioMatriz(matriz, lim);
        System.out.println(promedioM);
    } 
    public static void llenarMatriz(int[][] matriz, int lim){
        for (int i = 0; i < lim; i++)
            for (int j = 0; j < lim; j++) 
                matriz[i][j]=(int)(Math.random() * (9 - 0 + 1) + 0);
    }
    public static void MostrarMatriz(int[][] matriz, int lim){
        for (int i = 0; i < lim; i++){
            for (int j = 0; j < lim; j++)
                System.out.printf(matriz[i][j]+"  ");
            System.out.println("");
        }
    }
    public static void NumerosPares(int[][] matriz, int lim){
        for (int i = 0; i < lim; i++){
            for (int j = 0; j < lim; j++) 
                if ((matriz[i][j]%2)==0)
                    System.out.printf(matriz[i][j]+"  ");
                else
                    System.out.printf("*  ");
            System.out.println("");
        }   
    }
    public static void NumerosImpares(int[][] matriz, int lim){
        for (int i = 0; i < lim; i++){
            for (int j = 0; j < lim; j++) 
                if ((matriz[i][j]%2)==0)
                    System.out.printf("*  ");
                else
                    System.out.printf(matriz[i][j]+"  ");
            System.out.println("");
        }   
    }
    public static double promedioMatriz(int[][] matriz, int lim){
        double promedio=0;
        for (int i = 0; i < lim; i++)
            for (int j = 0; j < lim; j++) 
                promedio=promedio+matriz[i][j];
        promedio=promedio/(lim*lim);
        return promedio;
    }
}
/*
Matriz
8  4  4  
9  7  5  
1  7  3  
Numeros Pares
8  4  4  
*  *  *  
*  *  *  
Numeros Impares
*  *  *  
9  7  5  
1  7  3  
Promedio de la Matriz
5.333333333333333
*/