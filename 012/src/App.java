import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int tamanho=sc.nextInt();
        int[][] matriz = new int [tamanho][tamanho];

        for(int rep1=0; rep1<tamanho; rep1++){
            for(int rep2=0; rep2<tamanho; rep2++){
                matriz[rep1][rep2]=sc.nextInt();
            }
        }
        
        for(int rep1=0; rep1<tamanho; rep1++){
            int maior=0;
            for (int rep2=0; rep2<tamanho; rep2++){
                if(maior<matriz[rep1][rep2]){
                    maior=matriz[rep1][rep2];
                }
            }
            System.out.println(maior);
        }

        sc.close();

    }
}
