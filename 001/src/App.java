import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int quantidadeDeNumeros = sc.nextInt();
        double[] vet = new double [quantidadeDeNumeros];
        double maiorNumero=0;
        int posicaoDoMaiorNumero=0;


        for (int repeticao = 0; repeticao < quantidadeDeNumeros; repeticao++){
            vet[repeticao] = sc.nextDouble();
            

            if (vet[repeticao] > maiorNumero){
                maiorNumero = vet[repeticao];
                posicaoDoMaiorNumero = repeticao;
            }
        }

        System.out.println(maiorNumero);
        System.out.println(posicaoDoMaiorNumero);
        sc.close();

    }
}
