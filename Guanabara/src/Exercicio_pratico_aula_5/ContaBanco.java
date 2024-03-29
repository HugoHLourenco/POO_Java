package Exercicio_pratico_aula_5;

public class ContaBanco {
    public float numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private float saldo;

    public ContaBanco() {
    }

    public ContaBanco(float numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = false;
        this.saldo = 0;
    }

    public float getNumConta() {
        return numConta;
    }

    public void setNumConta(float numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  "\nResumo da transação:" +
                "\nConta de " + this.dono +
                "\nnumConta=" + numConta +
                "\ntipo='" + tipo + '\'' +
                "\nstatus='" + status + '\'' +
                "\nsaldo= R$" + saldo +
                "\n______________________________________________________________________________";
    }

    public void abrirConta(){
        if(this.status == false){
            this.status = true;
            System.out.println("A conta foi aberta");
        } else {
            System.out.println("A conta já está aberta!!");
        }
    }

    public void fecharConta(){
        if(this.status == true){
            this.status = false;
            System.out.println("A conta foi fechada");
        } else {
            System.out.println("A conta já está fechada!!");
        }
    }

    public void depositar(float deposito){
        if(this.status == true){
            this.saldo += deposito;
        } else {
            System.out.println("A CONTA ESTÁ FECHADA!!! \n" +
                    "ABRA ELA PRIMEIRO!!!");
        }
    }

    public void sacar(float saque){
        if(this.status == true){
            if(saque < this.saldo){
                this.saldo -= saque;
            } else {
                System.out.println("SALDO INDISPONÍVEL!!!");
            }
        } else {
            System.out.println("A CONTA ESTÁ FECHADA!!! \n" +
                    "ABRA ELA PRIMEIRO!!!");
        }
    }

    public void pagarMensal(float valor){
        this.saldo -= valor;
    }
}
