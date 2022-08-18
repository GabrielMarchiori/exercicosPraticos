import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int tamanhoDoVetor = sc.nextInt();
        String[] nomeAlunos = new String[tamanhoDoVetor];
        double[] notaPrimeiroSemest = new double[tamanhoDoVetor];
        double[] notaSegundoSemest = new double[tamanhoDoVetor];
        double media;  

        for (int repeticao=0; repeticao<tamanhoDoVetor; repeticao++){
            nomeAlunos[repeticao]=sc.next();
            notaPrimeiroSemest[repeticao]=sc.nextDouble();
            notaSegundoSemest [repeticao]=sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int repeticao=0; repeticao<tamanhoDoVetor; repeticao++){
            media = (notaPrimeiroSemest[repeticao] + notaSegundoSemest[repeticao]) / 2;
            if (media>=6){
                System.out.println(nomeAlunos[repeticao]);
            }
        }

        sc.close();

    }
}
