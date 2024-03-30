package Exercicio_03;

public class Produto {

    // Atributos
    protected int nSerial, volume;
    protected String valor;
    protected boolean testado;

    // Métodos
    public boolean testaUnidade() {
        if (!testado) {
            testado = true;
            if (Math.random() < 0.9) {
                this.valor = "Aprovado";
                return true;
            } else {
                this.valor = "Reprovado";
                return false;
            }
        } else {
            System.out.println("Produto já testado");
            return this.valor.equals("Aprovado");
        }
    }

    public void setaVolume(int vol) {
        this.volume += vol;
    }

    @Override
    public String toString() {
        return "\n O produto de Número serial: " + nSerial +
                "\nVolume: " + volume +
                "\nResultado do teste: " + valor;
    }

    // Construtores
    public Produto() {
    }

    public Produto(int nSerial, int volume) {
        this.nSerial = nSerial;
        this.volume = volume;
        this.valor = "Não testado";
    }

    // Getters e Setters
    public int getnSerial() {
        return nSerial;
    }

    public void setnSerial(int nSerial) {
        this.nSerial = nSerial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
