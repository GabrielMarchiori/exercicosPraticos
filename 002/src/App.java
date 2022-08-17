import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int quantidadeDeNumeros = sc.nextInt();
        int[] vet = new int [quantidadeDeNumeros];
        int quantidadePares=0;
        
        for (int repeticao = 0; repeticao < quantidadeDeNumeros; repeticao++){
            vet[repeticao] = sc.nextInt();    
        }

        for (int repeticao = 0; repeticao < quantidadeDeNumeros; repeticao++){

            if (vet[repeticao] % 2 == 0){
                System.out.printf("%d ", vet[repeticao]);
                quantidadePares+=1;
            }
        }

        System.out.println("");
        System.out.println(quantidadePares);
        sc.close();

    }
}
