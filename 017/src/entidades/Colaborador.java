package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Colaborador {
    private String nome;
    private SenioridadeColaborador senioridade;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoHoras> contratos = new ArrayList<>();

    public Colaborador(String nome, SenioridadeColaborador senioridade, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.senioridade = senioridade;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SenioridadeColaborador getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(SenioridadeColaborador senioridade) {
        this.senioridade = senioridade;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHoras> getContratos() {
        return contratos;
    }

    public void adcContrato(ContratoHoras contrato){
        contratos.add(contrato);
    }

    public void delContrato(ContratoHoras contrato){
        contratos.remove(contrato);
    }

    public double salarioTotal(int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (ContratoHoras c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }



}
