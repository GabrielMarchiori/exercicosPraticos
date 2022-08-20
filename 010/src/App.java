import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        int[][] matriz = new int[linhas][colunas];

        for (int repeticao=0; repeticao<linhas; repeticao++){
            for (int repeticao2=0; repeticao2<colunas; repeticao2++){
                matriz[repeticao][repeticao2]=sc.nextInt();
            }
        }
        System.out.println("VALORES NEGATIVOS:");

        for (int repeticao=0; repeticao<linhas; repeticao++){
            for (int repeticao2=0; repeticao2<colunas; repeticao2++){
                if (matriz[repeticao][repeticao2]<0){
                    System.out.println(matriz[repeticao][repeticao2]);
                }
            }
        }

        sc.close();
    }
}
