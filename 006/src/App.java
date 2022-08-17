import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        int tamanhoVetor = sc.nextInt();
        String[] nome = new String [tamanhoVetor];
        int[] idade = new int [tamanhoVetor];
        int maisVelho=0;
        int posicaoDoMaisVelho=0;

        for (int repeticao=0; repeticao<tamanhoVetor; repeticao++){
            nome[repeticao] = sc.next();
            idade[repeticao] = sc.nextInt();

            if (maisVelho<idade[repeticao]){
                maisVelho = idade[repeticao];
                posicaoDoMaisVelho = repeticao;
            }
        }

        System.out.println("Pessoa mais velha: "+nome[posicaoDoMaisVelho]);
        sc.close();

    }
}
