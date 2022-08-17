import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int valorVetor = sc.nextInt();

        int[] vet1 = new int [valorVetor];
        int[] vet2 = new int [valorVetor];
        int[] vet3 = new int [valorVetor];

        for (int repeticao=0; repeticao < valorVetor; repeticao++){
            vet1[repeticao] = sc.nextInt();
        }

        for (int repeticao=0; repeticao < valorVetor; repeticao++){
            vet2[repeticao] = sc.nextInt();
        }

        for (int repeticao=0; repeticao < valorVetor; repeticao++){
            vet3 [repeticao] = vet1[repeticao] + vet2[repeticao];
            System.out.printf("%d ", vet3[repeticao]);
        }

        sc.close();
        

    }
}
