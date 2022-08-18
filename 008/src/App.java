import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor=sc.nextInt();
        double[] altura=new double[tamanhoVetor];
        char[] sexo=new char[tamanhoVetor];
        int quantidadeMulheres=0, quantidadeHomens=0;
        

        for(int repeticao=0; repeticao<tamanhoVetor; repeticao++){
            altura[repeticao] = sc.nextDouble();
            sexo[repeticao] = sc.next().charAt(0);
        }

        double menorAltura=0, maiorAltura=0, mediaF=0;
        menorAltura = altura[0];

        for(int repeticao=0; repeticao<tamanhoVetor; repeticao++){
            if(altura[repeticao]<menorAltura){
                menorAltura=altura[repeticao];
            }
            if(altura[repeticao]>maiorAltura){
                maiorAltura=altura[repeticao];
            }
            if(sexo[repeticao]=='F'){
                mediaF+=altura[repeticao];
                quantidadeMulheres++;
            }
            if(sexo[repeticao]=='M'){
                quantidadeHomens++;
            }
        }

        mediaF/=quantidadeMulheres;

        System.out.println("Menor altura = "+menorAltura);
        System.out.println("Maior altura = "+maiorAltura);
        System.out.printf("Media das alturas da mulheres = %.2f%n", mediaF);
        System.out.println("Numero de homens = "+quantidadeHomens);

        sc.close();

    }
}
