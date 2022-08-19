import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = sc.nextInt();
        String[] produto = new String[tamanhoVetor];
        double[] valorCompra = new double[tamanhoVetor];
        double[] valorVenda = new double[tamanhoVetor];
        double lucro=0;
        double totalCompra=0, totalVenda=0;
        int abaixo=0, entre=0, acima=0;

        for (int repeticao=0; repeticao<tamanhoVetor; repeticao++){
            produto[repeticao] = sc.next();
            valorCompra[repeticao]=sc.nextDouble();
            valorVenda[repeticao]=sc.nextDouble();
            totalCompra+=valorCompra[repeticao];
            totalVenda+=valorVenda[repeticao];
            lucro = lucro + (valorVenda[repeticao] - valorCompra[repeticao]);
        }

        for (int repeticao=0; repeticao<tamanhoVetor; repeticao++){            
            if (valorVenda[repeticao]-valorCompra[repeticao]<valorCompra[repeticao]*0.10){
                abaixo++;
            }
            else if(valorVenda[repeticao]-valorCompra[repeticao]<valorCompra[repeticao]*0.20){
                entre++;
            }
            else{
                acima++;
            }

        }

        System.out.println("Lucro abaixo de 10%:" + abaixo);
        System.out.println("Lucro entre 10% e 20%: " + entre);
        System.out.println("Lucro acima de 20%: " + acima);
        System.out.println("Valor total de compra: "+totalCompra);
        System.out.println("Valor total de venda: "+totalVenda);
        System.out.printf("Lucro total: %.2f%n",lucro);

        sc.close();

    }
}