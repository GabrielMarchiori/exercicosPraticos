import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int linha=sc.nextInt();
        int colunas=sc.nextInt();

        int[][]soldados=new int[linha][colunas];

        for(int rep1=0; rep1<linha; rep1++){
            for(int rep2=0; rep2<colunas; rep2++){
                soldados[rep1][rep2]=sc.nextInt();
            }
        }

        int giraFila=sc.nextInt();
        giraFila--;
        int[]alteracao=new int[colunas];

        for(int rep1=0; rep1<colunas; rep1++){
            alteracao[rep1]=soldados[giraFila][rep1];
        }

        int alterar=1;

        for(int rep1=0; rep1<colunas; rep1++){
            
            if (alterar>=colunas){
                soldados[giraFila][0]=alteracao[rep1];
            }
            else{
                soldados[giraFila][alterar]=alteracao[rep1];
                alterar++;
            }
        }

        for(int rep1=0; rep1<linha; rep1++){
            for(int rep2=0; rep2<colunas; rep2++){
                System.out.printf("%d ", soldados[rep1][rep2]);
            }
            System.out.println();
        }

        sc.close();
    }
}
