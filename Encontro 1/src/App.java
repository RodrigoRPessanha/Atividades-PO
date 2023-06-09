public class App {
    public static void main(String[] args){
        int[][] A = {
                    {2, 2, 2, 2, 2},
                    {1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1}
                };

        System.out.println(questao1A(A));
        System.out.println(questao1B(A));
        System.out.println(questao1C(A));
        System.out.println(questao1D(A));
        System.out.println(questao1E(A));
        System.out.println(questao1F(A));
        System.out.println(questao1G(A));
        System.out.println(questao1H(A,5));
        
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
    public static int questao1I(int[][] A) {
        int resultado = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                resultado += A[i][j];
            }
            
        }
        return resultado;
    }
}
