package Relacionamento_entre_classes;

import java.io.Flushable;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("Popó", "brasileiro", 51, 44, 4, 2, 1.7f, 80);
        Lutador l2 = new Lutador("Bambam", "brasileiro", 38, 0, 1, 0, 1.95f, 110);

        l1.apresentar();
    }
}
