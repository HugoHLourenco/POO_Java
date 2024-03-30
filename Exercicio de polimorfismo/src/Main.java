public class Main {
    public static void main(String[] args) {
        CartaoWeb[] cartao = new CartaoWeb[4];
        cartao[0] = new DiaDosNamorados("Maria");
        cartao[1] = new Natal("João");
        cartao[2] = new Aniversario("Jorgim");
        cartao[3] = new DiaDosNamorados("Gabriel");

        // For
        for (CartaoWeb carta : cartao) {
            carta.showMenssage();
        }
    }
}