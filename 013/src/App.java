import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        int tamanho = sc.nextInt();
        int [][] vetor = new int [tamanho][tamanho];


        for (int rep1=0; rep1<tamanho; rep1++){
            for (int rep2=0; rep2<tamanho; rep2++){
                vetor [rep1][rep2] = sc.nextInt();
            }
        }
        
        int soma=0;

        for (int rep1=0; rep1<tamanho; rep1++){
            for (int rep2=rep1+1; rep2<tamanho; rep2++){
                soma+=vetor[rep1][rep2];
            }
        }

        System.out.println(soma);
        sc.close();

    }
}
