import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        
        int linhas=sc.nextInt();
        int colunas=sc.nextInt();
        int[][] matrizA = new int [linhas][colunas];
        int[][] matrizB = new int [linhas][colunas];
        int[][] matrizC = new int [linhas][colunas];

        for(int rep1=0; rep1<linhas; rep1++){
            for(int rep2=0; rep2<colunas; rep2++){
                matrizA[rep1][rep2] = sc.nextInt();
            }
        }

        for(int rep1=0; rep1<linhas; rep1++){
            for(int rep2=0; rep2<colunas; rep2++){
                matrizB[rep1][rep2] = sc.nextInt();
            }
        }

        for(int rep1=0; rep1<linhas; rep1++){
            for(int rep2=0; rep2<colunas; rep2++){
                matrizC[rep1][rep2] = matrizA[rep1][rep2] + matrizB[rep1][rep2];
            }
        }

        for(int rep1=0; rep1<linhas; rep1++){
            for(int rep2=0; rep2<colunas; rep2++){
                System.out.printf("%d ", matrizC[rep1][rep2]);
            }
            System.out.println();
        }

        sc.close();

    }
}
