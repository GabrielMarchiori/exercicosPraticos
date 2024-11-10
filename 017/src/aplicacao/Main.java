package aplicacao;

import entidades.Colaborador;
import entidades.ContratoHoras;
import entidades.Departamento;
import entidades.SenioridadeColaborador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entre com o nome do Departamento: ");
        String dep = sc.nextLine();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Entre com os dados do colaborador:\n");
        System.out.printf("Nome: ");
        String nome = sc.nextLine();
        System.out.printf("Level: ");
        String senioridade = sc.nextLine();
        System.out.printf("Base Salarial: ");
        Double baseSalarial = sc.nextDouble();
        sc.nextLine();

        SenioridadeColaborador.valueOf(senioridade);
        Colaborador colaborador = new Colaborador(nome, SenioridadeColaborador.valueOf(senioridade), baseSalarial, new Departamento(dep));
        System.out.printf("Quantos contratos quer adicionar para esse trabalhador? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Entre com o contrato #%d:\n", i);
            System.out.printf("Data (DD/MM/YYYY): ");
            String dataString = sc.nextLine();
            Date dataContrato = formatoData.parse(dataString);
            System.out.printf("Valor por hora: ");
            Double valorHora = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Duracao (horas): ");
            Integer duracaoHora = sc.nextInt();
            sc.nextLine();
            ContratoHoras contrato = new ContratoHoras(dataContrato, valorHora, duracaoHora);
            colaborador.adcContrato(contrato);
        }

        System.out.printf("Entre com o mes e com o ano para calcular o salario (MM/YYYY): ");
        String data = sc.nextLine();

        String[] partes = data.split("/");

        int mes = Integer.parseInt(partes[0]);
        int ano = Integer.parseInt(partes[1]);

        System.out.printf("Nome: ", colaborador.getNome());
        System.out.printf("Departamento", colaborador.getDepartamento().getNome());
        System.out.println("Salario de" +data + ": " + String.format("%.2f", colaborador.salarioTotal(ano, mes)));

        sc.close();
    }

}