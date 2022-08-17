import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int tamanhoDoVetor = sc.nextInt();
        double[] vet = new double [tamanhoDoVetor];
        
        double media=0;

        for (int repeticao=0; repeticao<tamanhoDoVetor; repeticao++){
            vet[repeticao] = sc.nextDouble();
            media+=vet[repeticao]; 
        }

        media/=tamanhoDoVetor;
        System.out.println(media);

        for(int repeticao=0; repeticao<tamanhoDoVetor; repeticao++){
            if (vet[repeticao]<media){
                System.out.println(vet[repeticao]);
            }

        }

        sc.close();

    }
}
