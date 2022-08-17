import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int tamanhoDoVetor = sc.nextInt();
        int[] vet = new int [tamanhoDoVetor];
        double media=0;
        int contagemDePares=0;

        for (int repeticao=0; repeticao<tamanhoDoVetor; repeticao++){
            vet[repeticao] = sc.nextInt();
            if (vet[repeticao]%2==0){
                media = media + vet[repeticao];
                contagemDePares++;
            }
        }

        media/=contagemDePares;

        System.out.println(media);
        sc.close();

    }
}
