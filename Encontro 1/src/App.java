import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int[][] A = {
                    { 0, 2, 8, 1, 7 },
                    { 1, 5, 8, 2, 2 },
                    { 3, 4, 0, 8, 1 },
                    { 9, 1, 2, 7, 2 },
                    { 3, 0, 1, 0, 4 }
                };
        int[] V = new int[5];
        int[] P = new int[5];
        long[] q2 = new long[50];
        Scanner input = new Scanner(System.in);
        
        System.out.println("------------------Questao 1------------------");
        System.out.println("Letra A: " + questao1A(A));
        System.out.println("Letra B: " + questao1B(A));
        System.out.println("Letra C: " + questao1C(A));
        System.out.println("Letra D: " + questao1D(A));
        System.out.println("Letra E: " + questao1E(A));
        System.out.println("Letra F: " + questao1F(A));
        System.out.println("Letra G: " + questao1G(A));
        System.out.println("Letra H: " + questao1H(A,5));
        System.out.print("Letra I: ");
        questao1I(A,V);
        System.out.println();
        System.out.print("Letra J: ");
        questao1J(A,V);
        System.out.println();
        System.out.println();
        
        System.out.println("------------------Questao 2------------------");
        q2 = questao2Criador(q2);
        questao2Impressor(q2);
        questao2Modificador(q2);
        questao2Impressor(q2);
        System.out.println();
        
        System.out.println("------------------Questao 3------------------");
        System.out.println("Digite um valor para K: ");
        int k = input.nextInt();
        System.out.println(questao3(k));
        System.out.println();

        System.out.println("------------------Questao 4------------------");
        input.nextLine();
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(questao4(x, y));
        
        input.close();
    }

    public static int questao1A(int[][] A) {
        int resultado = 0, soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                soma += A[i][j];
            }
            resultado += soma;
            soma = 0;
        }
        return resultado;
    }
    

    public static int questao1B(int[][] A) {
        int resultado = 0, soma = 0;
        for (int j = 0; j < A[0].length; j++) {
            for (int i = 0; i < A.length; i++) {
            soma += A[i][j];
            }
            resultado += soma;
            soma = 0;
        }
        return resultado;
    }

    public static int questao1C(int[][] A) {
        int resultado = 0, soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i != j) {
                    soma += A[i][j];
                }
            }
            resultado += soma;
            soma = 0;
        }
        return resultado;
    }

    public static int questao1D(int[][] A) {
        int resultado = 0, soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i == j) {
                    soma += A[i][j];
                }
            }
            resultado += soma;
            soma = 0;
        }
        return resultado;
    }

    public static int questao1E(int[][] A) {
        int resultado = 0, soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i < j) {
                    soma += A[i][j];
                }
            }
            resultado += soma;
            soma = 0;
        }
        return resultado;
    }
    
    public static int questao1F(int[][] A) {
        int resultado = 0, soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i > j) {
                    soma += A[i][j];
                }
            }
            resultado += soma;
            soma = 0;
        }
        return resultado;
    }
    public static int questao1G(int[][] A) {
        int resultado = 0, soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i < j) {
                    soma += A[i][j] * A[j][i];
                }
            }
            resultado += soma;
            soma = 0;
        }
        return resultado;
    }
    public static int questao1H(int[][] A, int x) {
        int resultado = 0, soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                soma += x * A[i][j];
            }
            resultado += soma;
            soma = 0;
        }
        return resultado;
    }
    public static void questao1I(int[][] A, int[] V) {
        int soma = 0;
        System.out.print("[ ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                soma += A[j][i];
            }
            V[i] = soma;
            soma = 0;
            System.out.print(V[i] + " ");
        }
        System.out.println("]");
    }
    
    public static void questao1J(int[][] A, int[] P) {
        int produto = 1;
        System.out.print("[ ");
        for (int j = 0; j < A[0].length; j++) {
            for (int i = 0; i < A.length; i++) {
                produto *= A[i][j];
            }
            P[j] = produto;
            produto = 1;
            System.out.print(P[j] + " ");
        }
        System.out.println("]");
    }

    public static long[] questao2Modificador(long[] V) {
        long soma = 0;
        for (int i = 0; i<V.length; i++) {
            for (int j = 0; j<V.length; j++) {
                if (i != j) {
                    soma += V[j];
                }
            }
            V[i] = soma;
            soma = 0;
        }
        return V;
    }

    public static long[] questao2Criador(long[] V) {
        Random rand = new Random();
        for (int i = 0; i < V.length; i++){
            V[i] = rand.nextInt(100) + 1;
        }
        return V;
    }

    public static void questao2Impressor(long[] V) {
        System.out.print("[ ");
        for(int i = 0; i <V.length; i++){
            System.out.print(V[i] + " ");
        }
        System.out.println("]");
    }

    public static int questao3(int k) {
        Scanner input = new Scanner(System.in);
        int[] V = new int[30];
        int n = V.length;

        for (int i = 0; i < n; i++) {
            System.out.println("Numero: " + (i+1));    
            V[i] = input.nextInt();
        }

        int maiorValor = 0, soma = 0;
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j <= i + (k - 1); j++) {
                soma += V[j];
            }
            if (soma > maiorValor) {
                maiorValor = soma;
            }
            soma = 0;
        }
        return maiorValor;
    }

    public static int questao4(int x, int y){
        Scanner input = new Scanner(System.in);
        int[] V1 = new int[40];
        int[] V2 = V1;
        for (int i = 0; i < V1.length; i++) {
            System.out.println("Numero do V1: " + (i+1));    
            V1[i] = input.nextInt();
            System.out.println("Numero do V2: " + (i+1));    
            V2[i] = input.nextInt();
        }
        int soma = 0;
        int produto = 1;

        for (int i = 0; i < V1.length; i++){
            if(i % 2 != 0){
                soma+= x * Math.abs(V1[i]);
            }
        }
        for (int j = 0; j < V2.length; j++){
            if(j % 2 == 0){
                produto *= y * V2[j];
            }
        }
        if (soma <= produto){
            return 1;
        }
        return 0;
    }
}
