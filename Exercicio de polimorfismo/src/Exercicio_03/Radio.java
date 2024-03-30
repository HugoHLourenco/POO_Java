package Exercicio_03;

public class Radio extends Produto{

    // Atributos
    private String estacao, banda;

    // Métodos
    public void escutar(){
        System.out.println("Ouindo a estação: " + this.estacao +
                "\nE a banda: " + this.banda);
    }

    // Getters e Setters
    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
}
