package entidades;

public enum SenioridadeColaborador {
    JUNIOR("Junior"),
    PLENO("Pleno"),
    SENIOR("Senior");

    private String nome;

    SenioridadeColaborador(String nome) {
        this.nome = nome;
    }
}
