package testeInterface.Digitalizadora;

public class Scanner implements Digitalizadora{
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando pelo Scanner!");
    }
}
