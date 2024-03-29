package Exercicio_pratico_aula_5;

public class TestaContaBanco {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco(100, "Corrente", "João da Silva", false, 500);

        conta1.abrirConta();
        conta1.sacar(999999999);
        conta1.fecharConta();

        System.out.println(conta1.toString());
    }
}
