public final class DiaDosNamorados extends CartaoWeb{

    // Métodos
    @Override
    public void showMenssage() {
        System.out.println("Feliz do dos namorados, " + this.destinatario + "!");
    }

    // Construtor
    public DiaDosNamorados(String destinatario) {
        this.destinatario = destinatario;
    }
}
