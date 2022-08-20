import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        double[][] matriz = new double[tamanho][tamanho];

        double positivos=0;

        for(int rep1=0; rep1<tamanho; rep1++){
            for (int rep2=0; rep2<tamanho; rep2++){
                matriz[rep1][rep2]=sc.nextDouble();
                if(matriz[rep1][rep2]>0){
                    positivos+=matriz[rep1][rep2];
                }
            }
        }
        
        int escolhaLinha=sc.nextInt();
        int escolhaColuna=sc.nextInt();
        System.out.println("SOMA DOS POSITIVOS: "+positivos);

        System.out.printf("LINHA ESCOLHIDA: ");

        for (int rep1=0;rep1<tamanho; rep1++){
            System.out.printf("%.1f ", matriz[escolhaLinha][rep1]);
        }

        System.out.println();
        System.out.printf("COLUNA ESCOLHIDA: ");

        for (int rep1=0;rep1<tamanho; rep1++){
            System.out.printf("%.1f ", matriz[rep1][escolhaColuna]);
        }
        
        System.out.println();
        System.out.printf("DIAGONAL PRINCIPAL: ");


        for (int rep1=0;rep1<tamanho; rep1++){
            System.out.printf("%.1f ", matriz[rep1][rep1]);
        }

        for(int rep1=0; rep1<tamanho; rep1++){
            for (int rep2=0; rep2<tamanho; rep2++){
                if(matriz[rep1][rep2]<0){
                    matriz[rep1][rep2]=Math.abs(matriz[rep1][rep2])*Math.abs(matriz[rep1][rep2]);
                }
            }
        }

        System.out.println("MATRIZ ALTERADA:");


        for(int rep1=0; rep1<tamanho; rep1++){
            for (int rep2=0; rep2<tamanho; rep2++){
                System.out.printf("%.1f ", matriz[rep1][rep2]);
            }
            System.out.println();
        }

        sc.close();
        


    }
}
