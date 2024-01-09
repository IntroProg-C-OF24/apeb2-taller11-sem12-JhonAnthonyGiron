package taller11;
public class CalculadoraBasica05 {
    public static void main(String[] args) {
        int lim=4;
        int matriz1[][]=new int [lim][lim];
        int matriz2[][]=new int [lim][lim];
        llenarMatriz(matriz1, lim);
        System.out.println("Matriz 1:");
        MostrarMatriz(matriz1, lim);
        llenarMatriz(matriz2, lim);
        System.out.println("Matriz 2:");
        MostrarMatriz(matriz2, lim);
        System.out.println("Suma de matrices:");
        SumaMatrices(matriz1,matriz2,lim);
        System.out.println("Resta de matrices:");
        RestaMatrices(matriz1,matriz2,lim);
        System.out.println("Multiplicacion de matrices:");
        MultiplicacionMatrices(matriz1,matriz2,lim);
    }
    public static void llenarMatriz(int[][] matriz, int lim){
        for (int i = 0; i < lim; i++)
            for (int j = 0; j < lim; j++) 
                matriz[i][j]=(int)(Math.random() * (9 - 0 + 1) + 0);
    }
    public static void MostrarMatriz(int[][] matriz, int lim){
        for (int i = 0; i < lim; i++){
            for (int j = 0; j < lim; j++)
                System.out.printf(matriz[i][j]+" | ");
            System.out.println("");
        }
    }
    public static void SumaMatrices(int[][] matriz1,int[][] matriz2, int lim){
        int suma=0;
        for (int i = 0; i < lim; i++){
            for (int j = 0; j < lim; j++){
                suma=(matriz1[i][j])+(matriz2[i][j]);
                System.out.printf(suma+" | ");
            }
            System.out.println("");
        }
    }
    public static void RestaMatrices(int[][] matriz1,int[][] matriz2, int lim){
        int suma=0;
        for (int i = 0; i < lim; i++){
            for (int j = 0; j < lim; j++){
                suma=(matriz1[i][j])-(matriz2[i][j]);
                System.out.printf(suma+" | ");
            }
            System.out.println("");
        }
    }
    public static void MultiplicacionMatrices(int[][] matriz1,int[][] matriz2, int lim){
        int multiplicacion;
        for (int i = 0; i < lim; i++){
            for (int j = 0; j < lim; j++){
                multiplicacion=0;
                for (int k = 0; k < lim; k++){
                    multiplicacion=multiplicacion+(matriz1[i][k]*matriz2[k][j]);
                }
                System.out.printf(multiplicacion+" | ");
            }
            System.out.println("");
        }
    }
}
/*
Matriz 1:
3 | 1 | 4 | 9 | 
8 | 9 | 6 | 4 | 
9 | 7 | 7 | 6 | 
7 | 9 | 7 | 5 | 
Matriz 2:
7 | 2 | 0 | 2 | 
3 | 3 | 3 | 6 | 
1 | 4 | 0 | 6 | 
2 | 4 | 3 | 4 | 
Suma de matrices:
10 | 3 | 4 | 11 | 
11 | 12 | 9 | 10 | 
10 | 11 | 7 | 12 | 
9 | 13 | 10 | 9 | 
Resta de matrices:
-4 | -1 | 4 | 7 | 
5 | 6 | 3 | -2 | 
8 | 3 | 7 | 0 | 
5 | 5 | 4 | 1 | 
Multiplicacion de matrices:
46 | 61 | 30 | 72 | 
97 | 83 | 39 | 122 | 
103 | 91 | 39 | 126 | 
93 | 89 | 42 | 130 | 
*/
