package testeInterface.Copiadora;

public class Xerox implements Copiadora {
    @Override
    public void copiar() {
        System.out.println("Copiando pelo Xerox!");
    }
}
